package com.automic.constants;

/**
 * Constant class containing messages to describe Exception Scenarios.
 * 
 */
public final class ExceptionConstants {

    // General Errors
    public static final String GENERIC_ERROR_MSG = "System Error [%s]";
    // Certificate errors
    public static final String INVALID_KEYSTORE = "Invalid KeyStore.";
    public static final String SSLCONTEXT_ERROR = "Unable to build secured context.";
    public static final String INVALID_INPUT_PARAMETER = "Invalid value for parameter [%s] : [%s]";
    // input validation error
    public static final String ERROR_SKIPPING_CERT = "Error skipping the certificate validation";
    public static final String ERROR_BASE_URL = "Base URL required. Base URL input must have its property _id as [%s]";
    public static final String ERROR_CLIENT_ID = "Client Id required. Client Id input must have its property _id as [%s]";
    public static final String ERROR_API_VERSION = "API Version required. API Version input must have its property _id as [%s]";
    public static final String INVALID_USERNAME = "Username required. Username input must have its property _id as [%s]";
    public static final String INVALID_DEPARTMENT = "Department required. Department input must have its property _id as [%s]";
    public static final String INVALID_PASSWORD = "Password required. Password input must have its property _id as [%s]";
    public static final String INVALID_WORKFLOW = "Workflow Name required. Workflow Name input must have its property _id as [%]";

    public static final String ERROR_CASC_BASEURL = "CA Service Catalog Base URL required for request ID [%s]. CASC Base URL input must have its property _id as [%s]";
    public static final String ERROR_CASC_USERNAME = "CA Service Catalog username required for request ID [%s]. CASC Username input must have its property _id as [%s]";
    public static final String ERROR_CASC_PASSWORD = "CA Service Catalog password required for request ID [%s]. CASC Password input must have its property _id as [%s]";
    public static final String ERROR_REQUEST_ID = "Request ID required.";
    public static final String ERROR_BUSINESS_UNIT = "Business Unit required for request ID [%s].";
	public static final String ERROR_MESSAGE = "Exception occured: %s";
    public static final String REQUEST_BODY_ERROR = "Exception occured during preparation of request body for request ID [%s]: %s ";
    public static final String REQUESTID_FORMAT = "Request ID[%s]: %s";

    private ExceptionConstants() {
    }

}
