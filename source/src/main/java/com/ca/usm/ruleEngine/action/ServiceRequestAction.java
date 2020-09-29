package com.ca.usm.ruleEngine.action;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.automic.constants.Constants;
import com.automic.constants.ExceptionConstants;
import com.automic.constants.MessageConstants;
import com.automic.util.CommonUtil;
import com.ca.usm.billing.BillingConfig;
import com.ca.usm.domain.tenant.service.TenantHelper;
import com.ca.usm.ruleEngine.IRuleEngine;
import com.ca.usm.system.SpringApplicationContext;
import com.ca.usm.system.configuration.ConfigurationManager;

/*
 * Action class for constructing ServiceRequest to ASO
 */
public class ServiceRequestAction implements IRuleAction {

	private static final Log log = LogFactory.getLog(ServiceRequestAction.class);
	private String requestID;

	public ServiceRequestAction() {
	}

	public void run(Properties params) throws Exception {
		requestID = params.getProperty(Constants.REQUEST_ID);

		String formData = params.getProperty("fufillmentData");
		if (formData == null || formData.isEmpty()) {
			log.info(String.format(ExceptionConstants.REQUESTID_FORMAT, requestID, "Form data is NIL..."));
			return;
		}

		Properties props = prepareFormData(formData);

		Properties defaultAttr = getConfigFormData(props, params);
		props.remove(Constants.AE_CONFIG_FORM);
		if (defaultAttr == null) {
			log.info(String.format(ExceptionConstants.REQUESTID_FORMAT, requestID,
					"Unable to retrive configuration form data..."));
			return;
		}

		props.putAll(parepareRequestParams(params));
		props.putAll(defaultAttr);
		String aeRequestID = props.getProperty(Constants.AE_REQUEST_ID_VAR);
		paramaterLogging(props, aeRequestID);
		log.info(String.format(ExceptionConstants.REQUESTID_FORMAT, requestID,
				MessageConstants.MSG_CALLING_WORKFLOW_ID));
		new ExecuteWorkflowAction(props).execute();

	}

	private Properties getConfigFormData(Properties formParams, Properties requestParam) {
		
		ConfigurationManager confManager = SpringApplicationContext.getBean("configManager");
		String requestDomain = requestParam.getProperty("domain");
		String connectionConfigForm = formParams.getProperty(Constants.AE_CONFIG_FORM);
		String msg = "connection config form name :" + connectionConfigForm;
		log.info(String.format(ExceptionConstants.REQUESTID_FORMAT, requestID, msg));

		connectionConfigForm = CommonUtil.isNotEmpty(connectionConfigForm)
				? Constants.CONFIG_FORM_PREFIX + connectionConfigForm
				: Constants.CONFIG_FORM_PREFIX + Constants.DEFAULT_CONFIG_FORM;

		// getting the default/Admin defined attributes
		return getDefaultAttributeValues(confManager, requestDomain, connectionConfigForm);
	}

	/**
	 * Read the configuration and return the default values. If configuration is not
	 * defined, Hard-coded values will be returned.
	 * 
	 * @param domain
	 * @return
	 */
	private Properties getDefaultAttributeValues(ConfigurationManager confManager, String domain,
			String connectionConfigForm) {

		Map<String, Object> contentConfigAttrValues;
		Properties connConfigAttr = null;
		String catalogBU = BillingConfig.getCatalogBusinessUnit(TenantHelper.getTenant(domain), true);
		contentConfigAttrValues = confManager.getCatalogConfigValues(connectionConfigForm, catalogBU);

		// Adding the mandatory parameters to the map;
		if (contentConfigAttrValues == null || contentConfigAttrValues.size() == 0) {
			String msg = "No  Configuration form was added for the domain " + domain;
			log.error(String.format(ExceptionConstants.REQUESTID_FORMAT, requestID, msg));
		} else {
			connConfigAttr = new Properties();
			connConfigAttr.put(Constants.CASC_BU, catalogBU);
			Set<Entry<String, Object>> defaultAttrEntry = contentConfigAttrValues.entrySet();
			for (Entry<String, Object> entry : defaultAttrEntry) {
				String key = entry.getKey();
				String value = String.valueOf(entry.getValue());
				connConfigAttr.put(key, value);
			}
		}
		return connConfigAttr;

	}

	private Properties prepareFormData(String formData) {
		Properties props = new Properties();
		String[] params = formData.split(",");

		for (String param : params) {
			String[] args = param.split("=");
			if (args.length == 2) {
				String fieldVariable = args[0].trim();
				String fieldValue = args[1].trim();
				props.put(fieldVariable, fieldValue);
			}
		}

		return props;

	}

	private void paramaterLogging(Properties props, String requestId) {

		Set<String> keys = props.stringPropertyNames();
		log.info(String.format(ExceptionConstants.REQUESTID_FORMAT, requestId, MessageConstants.MSG_PARAMETER_LOGGIN));
		for (String key : keys) {
			String value = props.getProperty(key);
			if (!(CommonUtil.checkNotEmpty(key) && key.contains("password")))
				log.info(String.format(MessageConstants.MSG_PARAM_LOGGING, requestId, key, value));
			else
				log.info(String.format(MessageConstants.MSG_PARAM_LOGGING, requestId, key, "***************"));
		}

		log.info(String.format(ExceptionConstants.REQUESTID_FORMAT, requestId, "End paramater logging..."));

	}

	private Properties parepareRequestParams(Properties params) {
		Properties props = new Properties();

		String requestId = params.getProperty(Constants.REQUEST_ID);

		props.put(Constants.AE_REQUEST_ID_VAR, requestId);

		if (params.containsKey(Constants.REQ_BY_USER_ID)) {
			props.put("REQ_BY_USER_ID", params.getProperty(Constants.REQ_BY_USER_ID));
		}

		if (params.containsKey(Constants.REQ_FOR_USER_ID)) {
			props.put("REQ_FOR_USER_ID", params.getProperty(Constants.REQ_FOR_USER_ID));
		}

		if (params.containsKey(Constants.FORM_DATA_SD_ROW)) {
			props.put("FORM_DATA_SD_ROW", params.getProperty(Constants.FORM_DATA_SD_ROW));
		}

		return props;

	}

	@Override
	public void setProperty(String arg0, String arg1) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setEngine(IRuleEngine arg0) {
		// TODO Auto-generated method stub

	}

}
