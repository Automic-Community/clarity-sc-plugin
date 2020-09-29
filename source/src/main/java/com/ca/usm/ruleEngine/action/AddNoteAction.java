package com.ca.usm.ruleEngine.action;

import java.rmi.RemoteException;
import java.util.Properties;

import javax.xml.rpc.ServiceException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.automic.constants.Constants;
import com.automic.constants.ExceptionConstants;
import com.automic.exception.AutomicException;
import com.automic.util.CommonUtil;

import usmRequestService.RequestServiceImpl;
import usmRequestService.RequestServiceImplService;
import usmRequestService.RequestServiceImplServiceLocator;

public class AddNoteAction {
	private static final Log log = LogFactory.getLog(AddNoteAction.class);

	private String cascBaseURL;
	private String cascUsername;
	private String cascPassword;
	private Integer requestID;
	private String businessUnit;
	private Properties params;
	private String requestService_address;

	public AddNoteAction(Properties params, Integer requestID) {

		this.params = params;
		this.requestID = requestID;

	}

	public void addNote(String message) throws AutomicException {	    

		RequestServiceImplServiceLocator rsmsl = new RequestServiceImplServiceLocator();
		rsmsl.setRequestServiceEndpointAddress(requestService_address);
		RequestServiceImplService rsm = rsmsl;
		try {
			RequestServiceImpl rs = rsm.getRequestService();
			String sessionID = rs.logIn(cascUsername, cascPassword, businessUnit);
			rs.addRequestNote(sessionID, requestID, message, 1);// 1 : normal,
																// 2: high
																// priority
		} catch (RemoteException e) {
			log.error(String.format(ExceptionConstants.REQUESTID_FORMAT, requestID, String.valueOf(e)));
			throw new AutomicException(e.getMessage());
		} catch (ServiceException e) {
			log.error(String.format(ExceptionConstants.REQUESTID_FORMAT, requestID, String.valueOf(e)));
			throw new AutomicException(e.getMessage());
		}

	}

	public void initializeAndValidateInputParam() throws AutomicException {
		
		cascBaseURL = params.getProperty(Constants.CASC_BASEURL);
		params.remove(Constants.CASC_BASEURL);

		if (!CommonUtil.isNotEmpty(cascBaseURL)) {
			String msg = String.format(ExceptionConstants.ERROR_CASC_BASEURL, requestID, Constants.CASC_BASEURL);
			log.error(String.format(ExceptionConstants.REQUESTID_FORMAT, requestID, msg));
			throw new AutomicException(msg);
		}
		 requestService_address = cascBaseURL+"/usm/services/RequestService";
		 log.error(String.format(ExceptionConstants.REQUESTID_FORMAT, requestID, "CASC RequestService URL: "+requestService_address));

		cascUsername = params.getProperty(Constants.CASC_USERNAME);
		params.remove(Constants.CASC_USERNAME);

		if (!CommonUtil.isNotEmpty(cascUsername)) {
			String msg = String.format(ExceptionConstants.ERROR_CASC_USERNAME, requestID, Constants.CASC_USERNAME);
			log.error(String.format(ExceptionConstants.REQUESTID_FORMAT, requestID, msg));
			throw new AutomicException(msg);
		}

		cascPassword = params.getProperty(Constants.CASC_PASSWORD);
		params.remove(Constants.CASC_PASSWORD);

		if (!CommonUtil.isNotEmpty(cascPassword)) {
			String msg = String.format(ExceptionConstants.ERROR_CASC_PASSWORD, requestID, Constants.CASC_PASSWORD);
			log.error(String.format(ExceptionConstants.REQUESTID_FORMAT, requestID, msg));
			throw new AutomicException(msg);
		}

		businessUnit = params.getProperty(Constants.CASC_BU);
		params.remove(Constants.CASC_BU);
		if (!CommonUtil.isNotEmpty(businessUnit)) {
			String msg = String.format(ExceptionConstants.ERROR_BUSINESS_UNIT, requestID);
			log.error(String.format(ExceptionConstants.REQUESTID_FORMAT, requestID, msg));
			throw new AutomicException(msg);
		}

	}

}
