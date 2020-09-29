/**
 *
 */
package com.ca.usm.ruleEngine.action;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Properties;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.automic.config.HttpClientConfig;
import com.automic.constants.Constants;
import com.automic.constants.ExceptionConstants;
import com.automic.exception.AutomicException;
import com.automic.filter.GenericResponseFilter;
import com.automic.util.CommonUtil;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.filter.HTTPBasicAuthFilter;

/**
 * An abstract action which parses the parameters and further calls the execute
 * method. The implementation of execute method will be provided by the subclass
 * of this class. This class also provides the method to retrieve the arguments
 * which can be used inside execute method.
 */
public abstract class AbstractHttpAction {
	private static final Log log = LogFactory.getLog(GenericResponseFilter.class);
	/**
	 * Service end point
	 */
	private String baseUrl;

	/**
	 * Client
	 */
	protected Client client;
	protected URI url;
	protected Integer requestID;
	private String username;
	private String password;
	private String department;

	public AbstractHttpAction(Properties params) {
		String tmp = params.getProperty(Constants.AE_REQUEST_ID_VAR);
		requestID = Integer.parseInt(tmp);
		username = params.getProperty(Constants.USERNAME);
		department = params.getProperty(Constants.DEPARTMENT);
		password = params.getProperty(Constants.PASSWORD);
		baseUrl = params.getProperty(Constants.BASE_URL);

		params.remove(Constants.USERNAME);
		params.remove(Constants.DEPARTMENT);
		params.remove(Constants.PASSWORD);
		params.remove(Constants.BASE_URL);

	}

	/**
	 * This method initializes the arguments and calls the execute method.
	 * 
	 * @throws AutomicException
	 *             exception while executing an action
	 */
	public final void execute() throws AutomicException {
		try {
			prepareInputParameters();
			String fullUsername = username + "/" + department;
			client = HttpClientConfig.getClient(url.getScheme(), true);
			client.addFilter(new HTTPBasicAuthFilter(fullUsername, this.password));
			client.addFilter(new GenericResponseFilter());

			executeSpecific();
		} finally {
			if (client != null) {
				client.destroy();
			}
		}
	}

	private void prepareInputParameters() throws AutomicException {
		validateInputs();

		try {

			url = new URI(baseUrl);

		} catch (URISyntaxException e) {			
			String msg = String.format(ExceptionConstants.INVALID_INPUT_PARAMETER, "URL", baseUrl);
			log.error(String.format(ExceptionConstants.REQUESTID_FORMAT, requestID, msg));
			log.error(e);
			
			throw new AutomicException(msg);
		}
	}

	private void validateInputs() throws AutomicException {

		if (requestID == null) {
			log.error(String.format(ExceptionConstants.REQUESTID_FORMAT, requestID, ExceptionConstants.ERROR_REQUEST_ID));
			throw new AutomicException(ExceptionConstants.ERROR_REQUEST_ID);
		}

		if (!CommonUtil.isNotEmpty(baseUrl)) {
			String msg = String.format(ExceptionConstants.ERROR_BASE_URL, Constants.BASE_URL);
			log.error(String.format(ExceptionConstants.REQUESTID_FORMAT, requestID, msg));
			throw new AutomicException(msg);
		}

		if (!CommonUtil.isNotEmpty(department)) {
			String msg = String.format(ExceptionConstants.INVALID_DEPARTMENT,Constants.DEPARTMENT);
			log.error(String.format(ExceptionConstants.REQUESTID_FORMAT, requestID, msg));
			throw new AutomicException(msg);
		}

		if (!CommonUtil.isNotEmpty(username)) {
			String msg = String.format(ExceptionConstants.INVALID_USERNAME, Constants.USERNAME);
			log.error(String.format(ExceptionConstants.REQUESTID_FORMAT, requestID, msg));
			throw new AutomicException(msg);
		}
		if (!CommonUtil.isNotEmpty(password)) {
			String msg = String.format(ExceptionConstants.INVALID_PASSWORD, Constants.PASSWORD);
			log.error(String.format(ExceptionConstants.REQUESTID_FORMAT, requestID, msg));
			throw new AutomicException(msg);
		}
	}

	/**
	 * Method to execute the action.
	 * 
	 * @throws AutomicException
	 */
	protected abstract void executeSpecific() throws AutomicException;

}