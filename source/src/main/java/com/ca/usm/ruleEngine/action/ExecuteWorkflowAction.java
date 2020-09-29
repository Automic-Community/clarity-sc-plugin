package com.ca.usm.ruleEngine.action;

import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

import javax.ws.rs.core.MediaType;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.automic.constants.Constants;
import com.automic.constants.ExceptionConstants;
import com.automic.constants.MessageConstants;
import com.automic.exception.AutomicException;
import com.automic.util.CommonUtil;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class ExecuteWorkflowAction extends AbstractHttpAction {
	private static final Log log = LogFactory.getLog(ExecuteWorkflowAction.class);


	private Properties params;
	private String workflow;
	private String clientId;
	private String apiVersion;
	private AddNoteAction addNote;

	public ExecuteWorkflowAction(Properties params) {
		super(params);
		this.params = params;

	}

	@Override
	protected void executeSpecific() throws AutomicException {
		preapareAndValidateInputParameters();

		ClientResponse response = null;

		try {

			WebResource webResource = client.resource(url);
			webResource = webResource.path("ae").path("api").path(apiVersion).path(clientId).path("executions");
			
			String msg ="Calling url " + webResource.getURI();
			log.info(String.format(ExceptionConstants.REQUESTID_FORMAT, requestID, msg));
			
			response = webResource.entity(initJsonObject(), MediaType.APPLICATION_JSON).post(ClientResponse.class);
		} catch (Exception e) {
			String msg = e.getMessage();
			
			String errorMSG=String.format(ExceptionConstants.ERROR_MESSAGE, e);
			log.error(String.format(ExceptionConstants.REQUESTID_FORMAT, requestID, errorMSG));
			addNote.addNote("Error : \n" + msg);
			throw new AutomicException(msg);
		}

		// process response
		processResponse(response);

	}

	private void preapareAndValidateInputParameters() throws AutomicException {

		addNote = new AddNoteAction(params, requestID);
		addNote.initializeAndValidateInputParam();

		clientId = params.getProperty(Constants.CLIENT_ID);
		params.remove(Constants.CLIENT_ID);
		if (!CommonUtil.isNotEmpty(clientId)) {
			String msg = String.format(ExceptionConstants.ERROR_CLIENT_ID, Constants.CLIENT_ID);
			log.error(String.format(ExceptionConstants.REQUESTID_FORMAT, requestID, msg));
			throw new AutomicException(msg);
		}

		apiVersion = params.getProperty(Constants.API_VERSION);
		params.remove(Constants.API_VERSION);
		if (!CommonUtil.isNotEmpty(apiVersion)) {
			String msg = String.format(ExceptionConstants.ERROR_API_VERSION, Constants.API_VERSION);
			log.error(String.format(ExceptionConstants.REQUESTID_FORMAT, requestID, msg));
			throw new AutomicException(msg);
		}

		workflow = params.getProperty(Constants.WORKFLOW);
		params.remove(Constants.WORKFLOW);
		if (!CommonUtil.isNotEmpty(workflow)) {
			String msg = String.format(ExceptionConstants.INVALID_WORKFLOW, Constants.WORKFLOW);
			log.error(String.format(ExceptionConstants.REQUESTID_FORMAT, requestID, msg));
			throw new AutomicException(msg);
		}

	}

	private void processResponse(ClientResponse response) throws AutomicException {
		InputStream is = response.getEntityInputStream();
		ObjectMapper mapper = new ObjectMapper();
		JsonNode rootNode;
		try {
			rootNode = mapper.readTree(is);
		} catch (IOException e) {
			String msg=String.format(ExceptionConstants.ERROR_MESSAGE, e);
			log.error(String.format(ExceptionConstants.REQUESTID_FORMAT, requestID, msg));
			throw new AutomicException(String.format(ExceptionConstants.ERROR_MESSAGE, requestID, e.getMessage()));
		}
		JsonNode runIdNode = rootNode.get(Constants.RUN_ID);
		Long runId = runIdNode.asLong();
		String msg=String.format(MessageConstants.MSG_EXECUTED_WORKFLOW_ID, workflow, runId);
		log.info(String.format(ExceptionConstants.REQUESTID_FORMAT, requestID, msg));

	}

	private String initJsonObject() throws AutomicException {
		String jsonString = null;
		ObjectMapper mapper = new ObjectMapper();

		JsonNode jsonObj = mapper.createObjectNode();
		((ObjectNode) jsonObj).put("object_name", workflow);

		JsonNode subJsonObj = mapper.createObjectNode();

		Map<String, String> requestJsonArr = prepareCheckboxRequestVal();
		for (Entry<String, String> entry : requestJsonArr.entrySet()) {
			String key = entry.getKey();
			String chbVal = entry.getValue();
			((ObjectNode) subJsonObj).put(validateAndUpdateVaribaleName(key), chbVal);
		}

		Set<String> keys = params.stringPropertyNames();
		for (String key : keys) {
			String value = params.getProperty(key);
			((ObjectNode) subJsonObj).put(validateAndUpdateVaribaleName(key), value);

		}
		((ObjectNode) jsonObj).set("inputs", subJsonObj);

		try {
			jsonString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(jsonObj);
		} catch (JsonProcessingException e) {
			String msg =String.format(ExceptionConstants.REQUEST_BODY_ERROR, requestID, e);
			log.info(String.format(ExceptionConstants.REQUESTID_FORMAT, requestID, msg));
			throw new AutomicException(String.format(ExceptionConstants.REQUEST_BODY_ERROR, requestID, e.getMessage()));
		}
		String msg=String.format(MessageConstants.MSG_EXECUTION_LOGGIN, jsonString);
		log.info(String.format(ExceptionConstants.REQUESTID_FORMAT, requestID, msg));
		return jsonString;

	}

	private Map<String, String> prepareCheckboxRequestVal() throws AutomicException {
		Map<String, String> map = new HashMap<>();
		Set<String> keys = params.stringPropertyNames();
		for (String key : keys) {
			String value = params.getProperty(key);
			if (key.startsWith(Constants.CHECKBOX_PREFIX)) {
				String varName = key.substring(key.indexOf('_') + 1);
				String chbVal = map.get(varName);
				chbVal = (chbVal == null) ? value : chbVal + ";" + value;
				map.put(varName, chbVal);
				params.remove(key);
			} 
		}
		return map;
	}

	private String validateAndUpdateVaribaleName(String varibaleName) {
		char ch = varibaleName.charAt(varibaleName.length() - 1);
		return (ch != '#') ? varibaleName + '#' : varibaleName;

	}

}