/**
 * RequestServiceSoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package usmRequestService;

public class RequestServiceSoapBindingStub extends org.apache.axis.client.Stub implements usmRequestService.RequestServiceImpl {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[87];
        _initOperationDesc1();
        _initOperationDesc2();
        _initOperationDesc3();
        _initOperationDesc4();
        _initOperationDesc5();
        _initOperationDesc6();
        _initOperationDesc7();
        _initOperationDesc8();
        _initOperationDesc9();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("logInToken");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "artifact"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "logInTokenReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.WebServiceException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "WebServiceException"), 
                      true
                     ));
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getRequestItem");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "subscriptionDetailID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:usmRequestService", "SubscriptionDetail"));
        oper.setReturnClass(usmRequestService.SubscriptionDetail.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getRequestItemReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.WebServiceException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "WebServiceException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.PropertyNotSetException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "PropertyNotSetException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.InvalidFormatException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "InvalidFormatException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.ContentAccessDeniedException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "ContentAccessDeniedException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.ItemNotFoundException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "ItemNotFoundException"), 
                      true
                     ));
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("logIn");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "userID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "password"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "businessunit"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "logInReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.WebServiceException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "WebServiceException"), 
                      true
                     ));
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("addProcessInstance");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "requestID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "subscriptionDetailID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "processInstanceID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.WebServiceException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "WebServiceException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.PropertyNotSetException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "PropertyNotSetException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.InvalidFormatException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "InvalidFormatException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.ContentAccessDeniedException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "ContentAccessDeniedException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.ItemNotFoundException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "ItemNotFoundException"), 
                      true
                     ));
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getSystemFormValue");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "requestID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "formFieldName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getSystemFormValueReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.WebServiceException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "WebServiceException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.ContentAccessDeniedException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "ContentAccessDeniedException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.ItemNotFoundException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "ItemNotFoundException"), 
                      true
                     ));
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getRequestItemRow");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "subscriptionDetailID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:usmRequestService", "ArrayOfSubscriptionDetail"));
        oper.setReturnClass(usmRequestService.SubscriptionDetail[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getRequestItemRowReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.WebServiceException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "WebServiceException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.ContentAccessDeniedException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "ContentAccessDeniedException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.ItemNotFoundException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "ItemNotFoundException"), 
                      true
                     ));
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("saveRequestItems");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "requestID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "addedOfferings"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "removedOfferings"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "addedItems"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.WebServiceException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "WebServiceException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.PropertyNotSetException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "PropertyNotSetException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.InvalidFormatException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "InvalidFormatException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.ContentAccessDeniedException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "ContentAccessDeniedException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.ItemNotFoundException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "ItemNotFoundException"), 
                      true
                     ));
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("addRequestWithForm");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "requestData"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "requestValuesData"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "requestValuesDataType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "addedOfferings"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "addedItems"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "formValuesData"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:usmRequestService", "Request"));
        oper.setReturnClass(usmRequestService.Request.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "addRequestWithFormReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.WebServiceException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "WebServiceException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.PropertyNotSetException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "PropertyNotSetException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.InvalidFormatException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "InvalidFormatException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.ContentAccessDeniedException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "ContentAccessDeniedException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.ItemNotFoundException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "ItemNotFoundException"), 
                      true
                     ));
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("unsetProxy");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.WebServiceException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "WebServiceException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.ContentAccessDeniedException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "ContentAccessDeniedException"), 
                      true
                     ));
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getPendingActionAssigneesByRequestItemID");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "requestItemID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getPendingActionAssigneesByRequestItemIDReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.WebServiceException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "WebServiceException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.PropertyNotSetException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "PropertyNotSetException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.InvalidFormatException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "InvalidFormatException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.ContentAccessDeniedException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "ContentAccessDeniedException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.ItemNotFoundException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "ItemNotFoundException"), 
                      true
                     ));
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("addProcessInstanceToRequestItemOffering");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "requestID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "subscriptionDetailID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "processInstanceID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.WebServiceException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "WebServiceException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.PropertyNotSetException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "PropertyNotSetException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.InvalidFormatException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "InvalidFormatException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.ContentAccessDeniedException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "ContentAccessDeniedException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.ItemNotFoundException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "ItemNotFoundException"), 
                      true
                     ));
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateReservationRequestStatusAndId");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "requestItemId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "status"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "extReservationId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.WebServiceException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "WebServiceException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.ContentAccessDeniedException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "ContentAccessDeniedException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.ItemNotFoundException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "ItemNotFoundException"), 
                      true
                     ));
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("logOut");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setProxy");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "proxyUserId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "proxyDomainId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.WebServiceException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "WebServiceException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.ContentAccessDeniedException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "ContentAccessDeniedException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.ItemNotFoundException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "ItemNotFoundException"), 
                      true
                     ));
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getRequestLevelNotes");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "requestID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:usmRequestService", "ArrayOfNote"));
        oper.setReturnClass(usmRequestService.Note[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getRequestLevelNotesReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.WebServiceException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "WebServiceException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.PropertyNotSetException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "PropertyNotSetException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.InvalidFormatException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "InvalidFormatException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.ContentAccessDeniedException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "ContentAccessDeniedException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.ItemNotFoundException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "ItemNotFoundException"), 
                      true
                     ));
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getRequestResources");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "requestItemId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:usmRequestService", "ArrayOfRequestResourceItem"));
        oper.setReturnClass(usmRequestService.RequestResourceItem[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getRequestResourcesReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.WebServiceException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "WebServiceException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.ContentAccessDeniedException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "ContentAccessDeniedException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.ItemNotFoundException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "ItemNotFoundException"), 
                      true
                     ));
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getRequestsByFilter");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "filterBeanArr"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:usmRequestService", "ArrayOfFilterBean"), usmRequestService.FilterBean[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:usmRequestService", "ArrayOfRequest"));
        oper.setReturnClass(usmRequestService.Request[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getRequestsByFilterReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.WebServiceException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "WebServiceException"), 
                      true
                     ));
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getTicketFromRequestItem");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "persid"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "refNum"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "requestItemID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "requestID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:usmRequestService", "ArrayOfTicketRequestItem"));
        oper.setReturnClass(usmRequestService.TicketRequestItem[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getTicketFromRequestItemReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.WebServiceException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "WebServiceException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.PropertyNotSetException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "PropertyNotSetException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.InvalidFormatException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "InvalidFormatException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.ContentAccessDeniedException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "ContentAccessDeniedException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.ItemNotFoundException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "ItemNotFoundException"), 
                      true
                     ));
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getRequestsByUserID");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "userID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:usmRequestService", "ArrayOfRequest"));
        oper.setReturnClass(usmRequestService.Request[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getRequestsByUserIDReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.WebServiceException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "WebServiceException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.PropertyNotSetException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "PropertyNotSetException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.InvalidFormatException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "InvalidFormatException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.ContentAccessDeniedException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "ContentAccessDeniedException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.ItemNotFoundException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "ItemNotFoundException"), 
                      true
                     ));
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getRequestItemStatus");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "subscriptionDetailID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getRequestItemStatusReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.WebServiceException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "WebServiceException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.PropertyNotSetException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "PropertyNotSetException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.InvalidFormatException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "InvalidFormatException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.ContentAccessDeniedException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "ContentAccessDeniedException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.ItemNotFoundException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "ItemNotFoundException"), 
                      true
                     ));
        _operations[19] = oper;

    }

    private static void _initOperationDesc3(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getSubscriptionDetailIDForForm");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "formName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "requestID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "offeringID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "groupID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getSubscriptionDetailIDForFormReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.WebServiceException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "WebServiceException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.PropertyNotSetException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "PropertyNotSetException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.InvalidFormatException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "InvalidFormatException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.ContentAccessDeniedException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "ContentAccessDeniedException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.ItemNotFoundException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "ItemNotFoundException"), 
                      true
                     ));
        _operations[20] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("addResourceToRequestItem");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "requestItemId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "resourceItem"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:usmRequestService", "RequestResourceItem"), usmRequestService.RequestResourceItem.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:usmRequestService", "RequestResourceItem"));
        oper.setReturnClass(usmRequestService.RequestResourceItem.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "addResourceToRequestItemReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.WebServiceException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "WebServiceException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.ContentAccessDeniedException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "ContentAccessDeniedException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.ItemNotFoundException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "ItemNotFoundException"), 
                      true
                     ));
        _operations[21] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("removeResourceFromRequestItem");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "requestItemId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "resourceItemId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.WebServiceException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "WebServiceException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.ContentAccessDeniedException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "ContentAccessDeniedException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.ItemNotFoundException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "ItemNotFoundException"), 
                      true
                     ));
        _operations[22] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("oblicoreEventHandler");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "eventType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "eventData"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:usmRequestService", "ArrayOf_xsd_anyType"), java.lang.Object[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "date"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "oblicoreEventHandlerReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.WebServiceException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "WebServiceException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.PropertyNotSetException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "PropertyNotSetException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.InvalidFormatException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "InvalidFormatException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.ContentAccessDeniedException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "ContentAccessDeniedException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.ItemNotFoundException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "ItemNotFoundException"), 
                      true
                     ));
        _operations[23] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateRequestResource");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "resourceItem"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:usmRequestService", "RequestResourceItem"), usmRequestService.RequestResourceItem.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:usmRequestService", "RequestResourceItem"));
        oper.setReturnClass(usmRequestService.RequestResourceItem.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "updateRequestResourceReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.WebServiceException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "WebServiceException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.ItemNotFoundException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "ItemNotFoundException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.ContentAccessDeniedException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "ContentAccessDeniedException"), 
                      true
                     ));
        _operations[24] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateReservationEndDate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "endDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "reservationId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.WebServiceException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "WebServiceException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.ContentAccessDeniedException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "ContentAccessDeniedException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.ItemNotFoundException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "ItemNotFoundException"), 
                      true
                     ));
        _operations[25] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("addTicketToRequestItem");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "persid"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "refNum"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "requestItemID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "requestID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.WebServiceException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "WebServiceException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.PropertyNotSetException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "PropertyNotSetException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.InvalidFormatException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "InvalidFormatException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.ContentAccessDeniedException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "ContentAccessDeniedException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.ItemNotFoundException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "ItemNotFoundException"), 
                      true
                     ));
        _operations[26] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("addAttachmentLinkToSubscription");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "attachmentId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "attachmentFileName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "attachmentDesc"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "attachmentLink"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "attachmentTimeStamp"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sourceTypeId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sourceObjId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "userId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.WebServiceException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "WebServiceException"), 
                      true
                     ));
        _operations[27] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("addProcessInstanceToRequest");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "requestID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "processInstanceID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.WebServiceException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "WebServiceException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.PropertyNotSetException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "PropertyNotSetException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.InvalidFormatException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "InvalidFormatException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.ContentAccessDeniedException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "ContentAccessDeniedException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.ItemNotFoundException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "ItemNotFoundException"), 
                      true
                     ));
        _operations[28] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getRequestsByAccountID");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "accountID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:usmRequestService", "ArrayOfRequest"));
        oper.setReturnClass(usmRequestService.Request[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getRequestsByAccountIDReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.WebServiceException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "WebServiceException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.PropertyNotSetException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "PropertyNotSetException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.InvalidFormatException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "InvalidFormatException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.ContentAccessDeniedException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "ContentAccessDeniedException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.ItemNotFoundException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "ItemNotFoundException"), 
                      true
                     ));
        _operations[29] = oper;

    }

    private static void _initOperationDesc4(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateRequestItemStatus");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "pendingActionType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "requestItemID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "status"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.WebServiceException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "WebServiceException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.PropertyNotSetException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "PropertyNotSetException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.InvalidFormatException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "InvalidFormatException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.ContentAccessDeniedException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "ContentAccessDeniedException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.ItemNotFoundException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "ItemNotFoundException"), 
                      true
                     ));
        _operations[30] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getAssetUUIDByRequestItemID");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "subscriptionDetailID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:usmRequestService", "ArrayOfAsset"));
        oper.setReturnClass(usmRequestService.Asset[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getAssetUUIDByRequestItemIDReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.WebServiceException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "WebServiceException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.PropertyNotSetException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "PropertyNotSetException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.InvalidFormatException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "InvalidFormatException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.ContentAccessDeniedException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "ContentAccessDeniedException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.ItemNotFoundException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "ItemNotFoundException"), 
                      true
                     ));
        _operations[31] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getSystemFormValues");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "requestID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:usmRequestService", "ArrayOfFormElement"));
        oper.setReturnClass(usmRequestService.FormElement[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getSystemFormValuesReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.WebServiceException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "WebServiceException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.ContentAccessDeniedException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "ContentAccessDeniedException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.ItemNotFoundException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "ItemNotFoundException"), 
                      true
                     ));
        _operations[32] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("addAttachmentToRequestItemWithPath");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "requestID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "subscriptionDetailID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "attachmentName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "attachmentDescription"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "attachmentPath"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.WebServiceException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "WebServiceException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.PropertyNotSetException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "PropertyNotSetException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.InvalidFormatException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "InvalidFormatException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.ContentAccessDeniedException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "ContentAccessDeniedException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.ItemNotFoundException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "ItemNotFoundException"), 
                      true
                     ));
        _operations[33] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getModelUUIDByRequestItemID");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "requestItemID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:usmRequestService", "ArrayOfRateItemModel"));
        oper.setReturnClass(usmRequestService.RateItemModel[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getModelUUIDByRequestItemIDReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.WebServiceException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "WebServiceException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.PropertyNotSetException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "PropertyNotSetException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.InvalidFormatException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "InvalidFormatException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.ContentAccessDeniedException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "ContentAccessDeniedException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.ItemNotFoundException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "ItemNotFoundException"), 
                      true
                     ));
        _operations[34] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getRequestItemAttachments");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "subscriptionDetailID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:usmRequestService", "ArrayOfAttachment"));
        oper.setReturnClass(usmRequestService.Attachment[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getRequestItemAttachmentsReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.WebServiceException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "WebServiceException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.PropertyNotSetException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "PropertyNotSetException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.InvalidFormatException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "InvalidFormatException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.ContentAccessDeniedException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "ContentAccessDeniedException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.ItemNotFoundException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "ItemNotFoundException"), 
                      true
                     ));
        _operations[35] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getRequestLevelAttachments");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "requestID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:usmRequestService", "ArrayOfAttachment"));
        oper.setReturnClass(usmRequestService.Attachment[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getRequestLevelAttachmentsReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.WebServiceException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "WebServiceException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.PropertyNotSetException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "PropertyNotSetException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.InvalidFormatException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "InvalidFormatException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.ContentAccessDeniedException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "ContentAccessDeniedException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.ItemNotFoundException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "ItemNotFoundException"), 
                      true
                     ));
        _operations[36] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("editRequestAttachmentDetails");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "requestID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "attachmentID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "attachmentName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "attachmentDescription"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.WebServiceException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "WebServiceException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.PropertyNotSetException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "PropertyNotSetException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.InvalidFormatException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "InvalidFormatException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.ContentAccessDeniedException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "ContentAccessDeniedException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.ItemNotFoundException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "ItemNotFoundException"), 
                      true
                     ));
        _operations[37] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getRequestOfferingStatus");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "requestID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "offeringID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "groupID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getRequestOfferingStatusReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.WebServiceException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "WebServiceException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.PropertyNotSetException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "PropertyNotSetException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.InvalidFormatException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "InvalidFormatException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.ContentAccessDeniedException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "ContentAccessDeniedException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.ItemNotFoundException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "ItemNotFoundException"), 
                      true
                     ));
        _operations[38] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("unassignModelUUIDFromRateItem");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "rateItemID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "modelUUID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.WebServiceException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "WebServiceException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.ContentAccessDeniedException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "ContentAccessDeniedException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.ItemNotFoundException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "ItemNotFoundException"), 
                      true
                     ));
        _operations[39] = oper;

    }

    private static void _initOperationDesc5(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("removeRequestAttachment");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "requestID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "attachmentID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.WebServiceException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "WebServiceException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.PropertyNotSetException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "PropertyNotSetException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.InvalidFormatException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "InvalidFormatException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.ContentAccessDeniedException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "ContentAccessDeniedException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.ItemNotFoundException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "ItemNotFoundException"), 
                      true
                     ));
        _operations[40] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getModelUUIDByRateItemID");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "rateItemID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:usmRequestService", "ArrayOfRateItemModel"));
        oper.setReturnClass(usmRequestService.RateItemModel[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getModelUUIDByRateItemIDReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.WebServiceException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "WebServiceException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.PropertyNotSetException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "PropertyNotSetException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.InvalidFormatException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "InvalidFormatException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.ContentAccessDeniedException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "ContentAccessDeniedException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.ItemNotFoundException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "ItemNotFoundException"), 
                      true
                     ));
        _operations[41] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getPendingActionsForRequest");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "requestID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:usmRequestService", "ArrayOf_xsd_string"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getPendingActionsForRequestReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.WebServiceException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "WebServiceException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.PropertyNotSetException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "PropertyNotSetException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.InvalidFormatException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "InvalidFormatException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.ContentAccessDeniedException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "ContentAccessDeniedException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.ItemNotFoundException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "ItemNotFoundException"), 
                      true
                     ));
        _operations[42] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("addWorkflowPendingAction");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "requestID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "objectType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "objectID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "objectGroupID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "workItemID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "processInstanceID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "userID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.WebServiceException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "WebServiceException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.PropertyNotSetException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "PropertyNotSetException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.InvalidFormatException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "InvalidFormatException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.ContentAccessDeniedException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "ContentAccessDeniedException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.ItemNotFoundException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "ItemNotFoundException"), 
                      true
                     ));
        _operations[43] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("assignAssetUUIDToRequestItem");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "requestItemID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "assetUUID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.WebServiceException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "WebServiceException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.ContentAccessDeniedException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "ContentAccessDeniedException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.ItemNotFoundException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "ItemNotFoundException"), 
                      true
                     ));
        _operations[44] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("assignPolicyBasedPendingActions");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "requestID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "levelNo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "pendingActionType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "requestItemID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "requestItemStatus"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "workItemID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "processInstanceID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "assignPolicyBasedPendingActionsReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.WebServiceException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "WebServiceException"), 
                      true
                     ));
        _operations[45] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("addProcessInstanceToRequestItem");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "requestID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "subscriptionDetailID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "processInstanceID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.WebServiceException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "WebServiceException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.PropertyNotSetException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "PropertyNotSetException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.InvalidFormatException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "InvalidFormatException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.ContentAccessDeniedException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "ContentAccessDeniedException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.ItemNotFoundException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "ItemNotFoundException"), 
                      true
                     ));
        _operations[46] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("addRequestAttachmentWithPath");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "requestID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "attachmentName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "attachmentDescription"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "attachmentPath"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.WebServiceException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "WebServiceException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.PropertyNotSetException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "PropertyNotSetException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.InvalidFormatException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "InvalidFormatException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.ContentAccessDeniedException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "ContentAccessDeniedException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.ItemNotFoundException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "ItemNotFoundException"), 
                      true
                     ));
        _operations[47] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getAssetUUIDByRequestID");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "requestID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:usmRequestService", "ArrayOfAsset"));
        oper.setReturnClass(usmRequestService.Asset[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getAssetUUIDByRequestIDReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.WebServiceException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "WebServiceException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.PropertyNotSetException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "PropertyNotSetException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.InvalidFormatException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "InvalidFormatException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.ContentAccessDeniedException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "ContentAccessDeniedException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.ItemNotFoundException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "ItemNotFoundException"), 
                      true
                     ));
        _operations[48] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("addWorkflowPendingActionWithDesc");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "requestID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "objectType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "objectID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "objectGroupID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "workItemID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "processInstanceID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "userID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "description"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.WebServiceException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "WebServiceException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.PropertyNotSetException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "PropertyNotSetException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.InvalidFormatException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "InvalidFormatException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.ContentAccessDeniedException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "ContentAccessDeniedException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.ItemNotFoundException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "ItemNotFoundException"), 
                      true
                     ));
        _operations[49] = oper;

    }

    private static void _initOperationDesc6(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("unassignAssetUUIDFromRequestItem");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "requestItemID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "assetUUID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.WebServiceException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "WebServiceException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.ContentAccessDeniedException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "ContentAccessDeniedException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.ItemNotFoundException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "ItemNotFoundException"), 
                      true
                     ));
        _operations[50] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("assignModelUUIDToRateItem");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "rateItemID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "modelUUID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.WebServiceException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "WebServiceException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.ContentAccessDeniedException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "ContentAccessDeniedException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.ItemNotFoundException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "ItemNotFoundException"), 
                      true
                     ));
        _operations[51] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getRequestRelationships");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "filterBeanArr"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:usmRequestService", "ArrayOfFilterBean"), usmRequestService.FilterBean[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:usmRequestService", "ArrayOfRequestRelationship"));
        oper.setReturnClass(usmRequestService.RequestRelationship[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getRequestRelationshipsReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.WebServiceException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "WebServiceException"), 
                      true
                     ));
        _operations[52] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getDefaultUserForRequestActions");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "businessunit"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getDefaultUserForRequestActionsReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.WebServiceException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "WebServiceException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.PropertyNotSetException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "PropertyNotSetException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.InvalidFormatException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "InvalidFormatException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.ContentAccessDeniedException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "ContentAccessDeniedException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.ItemNotFoundException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "ItemNotFoundException"), 
                      true
                     ));
        _operations[53] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getRequestNotes");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "requestID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:usmRequestService", "ArrayOfNote"));
        oper.setReturnClass(usmRequestService.Note[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getRequestNotesReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.WebServiceException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "WebServiceException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.PropertyNotSetException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "PropertyNotSetException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.InvalidFormatException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "InvalidFormatException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.ContentAccessDeniedException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "ContentAccessDeniedException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.ItemNotFoundException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "ItemNotFoundException"), 
                      true
                     ));
        _operations[54] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("addRequestNote");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "requestID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "noteText"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "noteType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.WebServiceException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "WebServiceException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.PropertyNotSetException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "PropertyNotSetException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.InvalidFormatException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "InvalidFormatException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.ContentAccessDeniedException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "ContentAccessDeniedException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.ItemNotFoundException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "ItemNotFoundException"), 
                      true
                     ));
        _operations[55] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getRequestItems");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "requestID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:usmRequestService", "ArrayOfSubscriptionDetail"));
        oper.setReturnClass(usmRequestService.SubscriptionDetail[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getRequestItemsReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.WebServiceException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "WebServiceException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.ContentAccessDeniedException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "ContentAccessDeniedException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.ItemNotFoundException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "ItemNotFoundException"), 
                      true
                     ));
        _operations[56] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("sendRequestEmail");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "requestId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "includeRequestDetails"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "emailFromAddress"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "emailFromName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "emailTo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "emailCC"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "emailBCC"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "emailSubject"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "emailMessage"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "sendRequestEmailReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.WebServiceException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "WebServiceException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.ItemNotFoundException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "ItemNotFoundException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.ContentAccessDeniedException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "ContentAccessDeniedException"), 
                      true
                     ));
        _operations[57] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("saveRequestForm");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "subscriptionDetailID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "formValuesData"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:usmRequestService", "FormItem"));
        oper.setReturnClass(usmRequestService.FormItem.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "saveRequestFormReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.WebServiceException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "WebServiceException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.PropertyNotSetException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "PropertyNotSetException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.InvalidFormatException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "InvalidFormatException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.ContentAccessDeniedException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "ContentAccessDeniedException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.ItemNotFoundException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "ItemNotFoundException"), 
                      true
                     ));
        _operations[58] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("cancelRequest");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "requestID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.WebServiceException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "WebServiceException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.PropertyNotSetException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "PropertyNotSetException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.InvalidFormatException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "InvalidFormatException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.ContentAccessDeniedException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "ContentAccessDeniedException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.ItemNotFoundException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "ItemNotFoundException"), 
                      true
                     ));
        _operations[59] = oper;

    }

    private static void _initOperationDesc7(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getFormRateItemValues");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "subscriptionDetailID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:usmRequestService", "FormItem"));
        oper.setReturnClass(usmRequestService.FormItem.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getFormRateItemValuesReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.WebServiceException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "WebServiceException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.PropertyNotSetException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "PropertyNotSetException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.InvalidFormatException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "InvalidFormatException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.ContentAccessDeniedException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "ContentAccessDeniedException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.ItemNotFoundException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "ItemNotFoundException"), 
                      true
                     ));
        _operations[60] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("addRequestItemNote");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "subscriptionDetailID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "noteText"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "noteType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.WebServiceException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "WebServiceException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.PropertyNotSetException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "PropertyNotSetException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.InvalidFormatException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "InvalidFormatException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.ContentAccessDeniedException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "ContentAccessDeniedException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.ItemNotFoundException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "ItemNotFoundException"), 
                      true
                     ));
        _operations[61] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getRequestStatus");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "requestID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getRequestStatusReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.WebServiceException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "WebServiceException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.PropertyNotSetException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "PropertyNotSetException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.InvalidFormatException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "InvalidFormatException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.ContentAccessDeniedException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "ContentAccessDeniedException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.ItemNotFoundException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "ItemNotFoundException"), 
                      true
                     ));
        _operations[62] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateRequestStatus");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "requestID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "status"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.WebServiceException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "WebServiceException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.PropertyNotSetException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "PropertyNotSetException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.InvalidFormatException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "InvalidFormatException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.ContentAccessDeniedException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "ContentAccessDeniedException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.ItemNotFoundException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "ItemNotFoundException"), 
                      true
                     ));
        _operations[63] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateRequestItemRowStatus");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "subscriptionDetailID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "status"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.WebServiceException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "WebServiceException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.PropertyNotSetException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "PropertyNotSetException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.InvalidFormatException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "InvalidFormatException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.ContentAccessDeniedException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "ContentAccessDeniedException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.ItemNotFoundException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "ItemNotFoundException"), 
                      true
                     ));
        _operations[64] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateRequestOfferingStatus");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "requestID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "offeringID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "groupID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "status"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.WebServiceException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "WebServiceException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.PropertyNotSetException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "PropertyNotSetException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.InvalidFormatException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "InvalidFormatException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.ContentAccessDeniedException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "ContentAccessDeniedException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.ItemNotFoundException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "ItemNotFoundException"), 
                      true
                     ));
        _operations[65] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getFormRateItemValue");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "subscriptionDetailID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "formRateItemName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getFormRateItemValueReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.WebServiceException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "WebServiceException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.ContentAccessDeniedException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "ContentAccessDeniedException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.ItemNotFoundException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "ItemNotFoundException"), 
                      true
                     ));
        _operations[66] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getPrimaryServiceDesk");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getPrimaryServiceDeskReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.WebServiceException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "WebServiceException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.PropertyNotSetException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "PropertyNotSetException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.InvalidFormatException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "InvalidFormatException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.ContentAccessDeniedException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "ContentAccessDeniedException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.ItemNotFoundException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "ItemNotFoundException"), 
                      true
                     ));
        _operations[67] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getRequestItemNotes");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "subscriptionDetailID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:usmRequestService", "ArrayOfNote"));
        oper.setReturnClass(usmRequestService.Note[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getRequestItemNotesReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.WebServiceException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "WebServiceException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.PropertyNotSetException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "PropertyNotSetException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.InvalidFormatException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "InvalidFormatException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.ContentAccessDeniedException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "ContentAccessDeniedException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.ItemNotFoundException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "ItemNotFoundException"), 
                      true
                     ));
        _operations[68] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("addRequestOfferingNote");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "requestID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "offeringID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "groupID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "noteText"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "noteType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.WebServiceException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "WebServiceException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.PropertyNotSetException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "PropertyNotSetException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.InvalidFormatException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "InvalidFormatException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.ContentAccessDeniedException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "ContentAccessDeniedException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.ItemNotFoundException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "ItemNotFoundException"), 
                      true
                     ));
        _operations[69] = oper;

    }

    private static void _initOperationDesc8(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getRequestOfferingNotes");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "requestID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "offeringID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "groupID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:usmRequestService", "ArrayOfNote"));
        oper.setReturnClass(usmRequestService.Note[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getRequestOfferingNotesReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.WebServiceException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "WebServiceException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.PropertyNotSetException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "PropertyNotSetException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.InvalidFormatException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "InvalidFormatException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.ContentAccessDeniedException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "ContentAccessDeniedException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.ItemNotFoundException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "ItemNotFoundException"), 
                      true
                     ));
        _operations[70] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("submitRequest");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "requestID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.WebServiceException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "WebServiceException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.PropertyNotSetException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "PropertyNotSetException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.InvalidFormatException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "InvalidFormatException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.ContentAccessDeniedException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "ContentAccessDeniedException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.ItemNotFoundException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "ItemNotFoundException"), 
                      true
                     ));
        _operations[71] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getRequests");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:usmRequestService", "ArrayOfRequest"));
        oper.setReturnClass(usmRequestService.Request[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getRequestsReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.WebServiceException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "WebServiceException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.PropertyNotSetException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "PropertyNotSetException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.InvalidFormatException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "InvalidFormatException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.ContentAccessDeniedException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "ContentAccessDeniedException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.ItemNotFoundException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "ItemNotFoundException"), 
                      true
                     ));
        _operations[72] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("deleteRequests");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "requestIDs"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:usmRequestService", "ArrayOf_xsd_string"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.WebServiceException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "WebServiceException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.PropertyNotSetException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "PropertyNotSetException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.InvalidFormatException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "InvalidFormatException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.ContentAccessDeniedException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "ContentAccessDeniedException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.ItemNotFoundException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "ItemNotFoundException"), 
                      true
                     ));
        _operations[73] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("saveRequest");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "requestData"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "requestValuesData"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "requestValuesDataType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "addedOfferings"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "removedOfferings"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "addedItems"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:usmRequestService", "Request"));
        oper.setReturnClass(usmRequestService.Request.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "saveRequestReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.WebServiceException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "WebServiceException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.PropertyNotSetException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "PropertyNotSetException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.InvalidFormatException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "InvalidFormatException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.ContentAccessDeniedException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "ContentAccessDeniedException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.ItemNotFoundException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "ItemNotFoundException"), 
                      true
                     ));
        _operations[74] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("saveRequestHeader");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "requestData"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "requestValuesData"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "requestValuesDataType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.WebServiceException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "WebServiceException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.PropertyNotSetException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "PropertyNotSetException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.InvalidFormatException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "InvalidFormatException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.ContentAccessDeniedException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "ContentAccessDeniedException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.ItemNotFoundException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "ItemNotFoundException"), 
                      true
                     ));
        _operations[75] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("takePendingAction");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "requestID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "objectID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "objectGroupID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.WebServiceException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "WebServiceException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.PropertyNotSetException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "PropertyNotSetException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "com.ca.usm.soap.axisInterfaces.InvalidUserException",
                      new javax.xml.namespace.QName("http://axisInterfaces.soap.usm.ca.com", "InvalidUserException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.InvalidFormatException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "InvalidFormatException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.ContentAccessDeniedException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "ContentAccessDeniedException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.ItemNotFoundException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "ItemNotFoundException"), 
                      true
                     ));
        _operations[76] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getPendingActions");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "userID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:usmRequestService", "ArrayOfRequest"));
        oper.setReturnClass(usmRequestService.Request[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getPendingActionsReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.WebServiceException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "WebServiceException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.PropertyNotSetException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "PropertyNotSetException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.InvalidFormatException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "InvalidFormatException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.ContentAccessDeniedException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "ContentAccessDeniedException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.ItemNotFoundException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "ItemNotFoundException"), 
                      true
                     ));
        _operations[77] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getRequestHeader");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "requestID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:usmRequestService", "Request"));
        oper.setReturnClass(usmRequestService.Request.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getRequestHeaderReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.WebServiceException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "WebServiceException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.PropertyNotSetException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "PropertyNotSetException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.InvalidFormatException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "InvalidFormatException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.ContentAccessDeniedException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "ContentAccessDeniedException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.ItemNotFoundException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "ItemNotFoundException"), 
                      true
                     ));
        _operations[78] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("assignPendingAction");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "pendingActionType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "requestItemID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "requestItemStatus"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "pendingActionUsersOrGroups"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "pendingActionDescriptions"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "workItemID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "processInstanceID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "assignPendingActionReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.WebServiceException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "WebServiceException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.PropertyNotSetException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "PropertyNotSetException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.InvalidFormatException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "InvalidFormatException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.ContentAccessDeniedException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "ContentAccessDeniedException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.ItemNotFoundException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "ItemNotFoundException"), 
                      true
                     ));
        _operations[79] = oper;

    }

    private static void _initOperationDesc9(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("returnPendingAction");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "requestID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "objectID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "objectGroupID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.WebServiceException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "WebServiceException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.PropertyNotSetException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "PropertyNotSetException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.InvalidFormatException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "InvalidFormatException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.ContentAccessDeniedException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "ContentAccessDeniedException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.ItemNotFoundException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "ItemNotFoundException"), 
                      true
                     ));
        _operations[80] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("transferPendingAction");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "pendingActionType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "requestItemID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "assigneeID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.WebServiceException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "WebServiceException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.PropertyNotSetException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "PropertyNotSetException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.InvalidFormatException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "InvalidFormatException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.ContentAccessDeniedException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "ContentAccessDeniedException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.ItemNotFoundException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "ItemNotFoundException"), 
                      true
                     ));
        _operations[81] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("transferPendingActionToUser");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "requestID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "objectID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "objectGroupID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "transferToUserID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.WebServiceException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "WebServiceException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.PropertyNotSetException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "PropertyNotSetException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.InvalidFormatException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "InvalidFormatException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.ContentAccessDeniedException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "ContentAccessDeniedException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.ItemNotFoundException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "ItemNotFoundException"), 
                      true
                     ));
        _operations[82] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("transferPendingActionToGroup");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "requestID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "objectID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "objectGroupID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "transferToGroupID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.WebServiceException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "WebServiceException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.PropertyNotSetException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "PropertyNotSetException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.InvalidFormatException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "InvalidFormatException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.ContentAccessDeniedException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "ContentAccessDeniedException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.ItemNotFoundException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "ItemNotFoundException"), 
                      true
                     ));
        _operations[83] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("delegatePendingActionToUser");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "requestID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "objectID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "objectGroupID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "delegateToUserID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.WebServiceException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "WebServiceException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.PropertyNotSetException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "PropertyNotSetException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.InvalidFormatException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "InvalidFormatException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.ContentAccessDeniedException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "ContentAccessDeniedException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.ItemNotFoundException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "ItemNotFoundException"), 
                      true
                     ));
        _operations[84] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getRequestAttachments");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "requestID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:usmRequestService", "ArrayOfAttachment"));
        oper.setReturnClass(usmRequestService.Attachment[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getRequestAttachmentsReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.WebServiceException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "WebServiceException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.PropertyNotSetException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "PropertyNotSetException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.InvalidFormatException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "InvalidFormatException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.ContentAccessDeniedException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "ContentAccessDeniedException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:usmRequestService", "fault"),
                      "usmRequestService.ItemNotFoundException",
                      new javax.xml.namespace.QName("urn:usmRequestService", "ItemNotFoundException"), 
                      true
                     ));
        _operations[85] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getMaxIdleTimeInMilliSeconds");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        oper.setReturnClass(long.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getMaxIdleTimeInMilliSecondsReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[86] = oper;

    }

    public RequestServiceSoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public RequestServiceSoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public RequestServiceSoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://axisInterfaces.soap.usm.ca.com", "InvalidUserException");
            cachedSerQNames.add(qName);
            cls = com.ca.usm.soap.axisInterfaces.InvalidUserException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xml.apache.org/xml-soap", "mapItem");
            cachedSerQNames.add(qName);
            cls = org.apache.xml.xml_soap.MapItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:usmRequestService", "ArrayOf_xsd_anyType");
            cachedSerQNames.add(qName);
            cls = java.lang.Object[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:usmRequestService", "ArrayOf_xsd_string");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:usmRequestService", "ArrayOfAsset");
            cachedSerQNames.add(qName);
            cls = usmRequestService.Asset[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:usmRequestService", "Asset");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:usmRequestService", "ArrayOfAttachment");
            cachedSerQNames.add(qName);
            cls = usmRequestService.Attachment[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:usmRequestService", "Attachment");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:usmRequestService", "ArrayOfFilterBean");
            cachedSerQNames.add(qName);
            cls = usmRequestService.FilterBean[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:usmRequestService", "FilterBean");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:usmRequestService", "ArrayOfFormElement");
            cachedSerQNames.add(qName);
            cls = usmRequestService.FormElement[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:usmRequestService", "FormElement");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:usmRequestService", "ArrayOfNote");
            cachedSerQNames.add(qName);
            cls = usmRequestService.Note[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:usmRequestService", "Note");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:usmRequestService", "ArrayOfRateItemModel");
            cachedSerQNames.add(qName);
            cls = usmRequestService.RateItemModel[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:usmRequestService", "RateItemModel");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:usmRequestService", "ArrayOfRequest");
            cachedSerQNames.add(qName);
            cls = usmRequestService.Request[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:usmRequestService", "Request");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:usmRequestService", "ArrayOfRequestRelationship");
            cachedSerQNames.add(qName);
            cls = usmRequestService.RequestRelationship[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:usmRequestService", "RequestRelationship");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:usmRequestService", "ArrayOfRequestResourceItem");
            cachedSerQNames.add(qName);
            cls = usmRequestService.RequestResourceItem[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:usmRequestService", "RequestResourceItem");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:usmRequestService", "ArrayOfSubscriptionDetail");
            cachedSerQNames.add(qName);
            cls = usmRequestService.SubscriptionDetail[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:usmRequestService", "SubscriptionDetail");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:usmRequestService", "ArrayOfTicketRequestItem");
            cachedSerQNames.add(qName);
            cls = usmRequestService.TicketRequestItem[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:usmRequestService", "TicketRequestItem");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:usmRequestService", "Asset");
            cachedSerQNames.add(qName);
            cls = usmRequestService.Asset.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:usmRequestService", "Attachment");
            cachedSerQNames.add(qName);
            cls = usmRequestService.Attachment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:usmRequestService", "ContentAccessDeniedException");
            cachedSerQNames.add(qName);
            cls = usmRequestService.ContentAccessDeniedException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:usmRequestService", "FilterBean");
            cachedSerQNames.add(qName);
            cls = usmRequestService.FilterBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:usmRequestService", "FormElement");
            cachedSerQNames.add(qName);
            cls = usmRequestService.FormElement.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:usmRequestService", "FormItem");
            cachedSerQNames.add(qName);
            cls = usmRequestService.FormItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:usmRequestService", "InvalidFormatException");
            cachedSerQNames.add(qName);
            cls = usmRequestService.InvalidFormatException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:usmRequestService", "ItemNotFoundException");
            cachedSerQNames.add(qName);
            cls = usmRequestService.ItemNotFoundException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:usmRequestService", "Note");
            cachedSerQNames.add(qName);
            cls = usmRequestService.Note.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:usmRequestService", "PropertyNotSetException");
            cachedSerQNames.add(qName);
            cls = usmRequestService.PropertyNotSetException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:usmRequestService", "RateItemModel");
            cachedSerQNames.add(qName);
            cls = usmRequestService.RateItemModel.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:usmRequestService", "Request");
            cachedSerQNames.add(qName);
            cls = usmRequestService.Request.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:usmRequestService", "RequestRelationship");
            cachedSerQNames.add(qName);
            cls = usmRequestService.RequestRelationship.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:usmRequestService", "RequestResourceItem");
            cachedSerQNames.add(qName);
            cls = usmRequestService.RequestResourceItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:usmRequestService", "SubscriptionDetail");
            cachedSerQNames.add(qName);
            cls = usmRequestService.SubscriptionDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:usmRequestService", "TicketRequestItem");
            cachedSerQNames.add(qName);
            cls = usmRequestService.TicketRequestItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:usmRequestService", "WebServiceException");
            cachedSerQNames.add(qName);
            cls = usmRequestService.WebServiceException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
                    _call.setEncodingStyle(org.apache.axis.Constants.URI_SOAP11_ENC);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public java.lang.String logInToken(java.lang.String artifact) throws java.rmi.RemoteException, usmRequestService.WebServiceException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.soap.usm.ca.com", "logInToken"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {artifact});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.WebServiceException) {
              throw (usmRequestService.WebServiceException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public usmRequestService.SubscriptionDetail getRequestItem(java.lang.String sessionID, int subscriptionDetailID) throws java.rmi.RemoteException, usmRequestService.WebServiceException, usmRequestService.PropertyNotSetException, usmRequestService.InvalidFormatException, usmRequestService.ContentAccessDeniedException, usmRequestService.ItemNotFoundException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.soap.usm.ca.com", "getRequestItem"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionID, new java.lang.Integer(subscriptionDetailID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (usmRequestService.SubscriptionDetail) _resp;
            } catch (java.lang.Exception _exception) {
                return (usmRequestService.SubscriptionDetail) org.apache.axis.utils.JavaUtils.convert(_resp, usmRequestService.SubscriptionDetail.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.WebServiceException) {
              throw (usmRequestService.WebServiceException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.PropertyNotSetException) {
              throw (usmRequestService.PropertyNotSetException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.InvalidFormatException) {
              throw (usmRequestService.InvalidFormatException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.ContentAccessDeniedException) {
              throw (usmRequestService.ContentAccessDeniedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.ItemNotFoundException) {
              throw (usmRequestService.ItemNotFoundException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String logIn(java.lang.String userID, java.lang.String password, java.lang.String businessunit) throws java.rmi.RemoteException, usmRequestService.WebServiceException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.soap.usm.ca.com", "logIn"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {userID, password, businessunit});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.WebServiceException) {
              throw (usmRequestService.WebServiceException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void addProcessInstance(java.lang.String sessionID, int requestID, int subscriptionDetailID, java.lang.String processInstanceID) throws java.rmi.RemoteException, usmRequestService.WebServiceException, usmRequestService.PropertyNotSetException, usmRequestService.InvalidFormatException, usmRequestService.ContentAccessDeniedException, usmRequestService.ItemNotFoundException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.soap.usm.ca.com", "addProcessInstance"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionID, new java.lang.Integer(requestID), new java.lang.Integer(subscriptionDetailID), processInstanceID});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.WebServiceException) {
              throw (usmRequestService.WebServiceException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.PropertyNotSetException) {
              throw (usmRequestService.PropertyNotSetException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.InvalidFormatException) {
              throw (usmRequestService.InvalidFormatException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.ContentAccessDeniedException) {
              throw (usmRequestService.ContentAccessDeniedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.ItemNotFoundException) {
              throw (usmRequestService.ItemNotFoundException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String getSystemFormValue(java.lang.String sessionID, int requestID, java.lang.String formFieldName) throws java.rmi.RemoteException, usmRequestService.WebServiceException, usmRequestService.ContentAccessDeniedException, usmRequestService.ItemNotFoundException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.soap.usm.ca.com", "getSystemFormValue"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionID, new java.lang.Integer(requestID), formFieldName});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.WebServiceException) {
              throw (usmRequestService.WebServiceException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.ContentAccessDeniedException) {
              throw (usmRequestService.ContentAccessDeniedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.ItemNotFoundException) {
              throw (usmRequestService.ItemNotFoundException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public usmRequestService.SubscriptionDetail[] getRequestItemRow(java.lang.String sessionID, int subscriptionDetailID) throws java.rmi.RemoteException, usmRequestService.WebServiceException, usmRequestService.ContentAccessDeniedException, usmRequestService.ItemNotFoundException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.soap.usm.ca.com", "getRequestItemRow"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionID, new java.lang.Integer(subscriptionDetailID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (usmRequestService.SubscriptionDetail[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (usmRequestService.SubscriptionDetail[]) org.apache.axis.utils.JavaUtils.convert(_resp, usmRequestService.SubscriptionDetail[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.WebServiceException) {
              throw (usmRequestService.WebServiceException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.ContentAccessDeniedException) {
              throw (usmRequestService.ContentAccessDeniedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.ItemNotFoundException) {
              throw (usmRequestService.ItemNotFoundException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void saveRequestItems(java.lang.String sessionID, int requestID, java.lang.String addedOfferings, java.lang.String removedOfferings, java.lang.String addedItems) throws java.rmi.RemoteException, usmRequestService.WebServiceException, usmRequestService.PropertyNotSetException, usmRequestService.InvalidFormatException, usmRequestService.ContentAccessDeniedException, usmRequestService.ItemNotFoundException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.soap.usm.ca.com", "saveRequestItems"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionID, new java.lang.Integer(requestID), addedOfferings, removedOfferings, addedItems});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.WebServiceException) {
              throw (usmRequestService.WebServiceException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.PropertyNotSetException) {
              throw (usmRequestService.PropertyNotSetException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.InvalidFormatException) {
              throw (usmRequestService.InvalidFormatException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.ContentAccessDeniedException) {
              throw (usmRequestService.ContentAccessDeniedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.ItemNotFoundException) {
              throw (usmRequestService.ItemNotFoundException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public usmRequestService.Request addRequestWithForm(java.lang.String sessionID, java.lang.String requestData, java.lang.String requestValuesData, java.lang.String requestValuesDataType, java.lang.String addedOfferings, java.lang.String addedItems, java.lang.String formValuesData) throws java.rmi.RemoteException, usmRequestService.WebServiceException, usmRequestService.PropertyNotSetException, usmRequestService.InvalidFormatException, usmRequestService.ContentAccessDeniedException, usmRequestService.ItemNotFoundException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.soap.usm.ca.com", "addRequestWithForm"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionID, requestData, requestValuesData, requestValuesDataType, addedOfferings, addedItems, formValuesData});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (usmRequestService.Request) _resp;
            } catch (java.lang.Exception _exception) {
                return (usmRequestService.Request) org.apache.axis.utils.JavaUtils.convert(_resp, usmRequestService.Request.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.WebServiceException) {
              throw (usmRequestService.WebServiceException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.PropertyNotSetException) {
              throw (usmRequestService.PropertyNotSetException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.InvalidFormatException) {
              throw (usmRequestService.InvalidFormatException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.ContentAccessDeniedException) {
              throw (usmRequestService.ContentAccessDeniedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.ItemNotFoundException) {
              throw (usmRequestService.ItemNotFoundException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void unsetProxy(java.lang.String sessionID) throws java.rmi.RemoteException, usmRequestService.WebServiceException, usmRequestService.ContentAccessDeniedException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.soap.usm.ca.com", "unsetProxy"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionID});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.WebServiceException) {
              throw (usmRequestService.WebServiceException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.ContentAccessDeniedException) {
              throw (usmRequestService.ContentAccessDeniedException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String getPendingActionAssigneesByRequestItemID(java.lang.String sessionID, int requestItemID) throws java.rmi.RemoteException, usmRequestService.WebServiceException, usmRequestService.PropertyNotSetException, usmRequestService.InvalidFormatException, usmRequestService.ContentAccessDeniedException, usmRequestService.ItemNotFoundException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.soap.usm.ca.com", "getPendingActionAssigneesByRequestItemID"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionID, new java.lang.Integer(requestItemID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.WebServiceException) {
              throw (usmRequestService.WebServiceException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.PropertyNotSetException) {
              throw (usmRequestService.PropertyNotSetException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.InvalidFormatException) {
              throw (usmRequestService.InvalidFormatException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.ContentAccessDeniedException) {
              throw (usmRequestService.ContentAccessDeniedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.ItemNotFoundException) {
              throw (usmRequestService.ItemNotFoundException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void addProcessInstanceToRequestItemOffering(java.lang.String sessionID, int requestID, int subscriptionDetailID, java.lang.String processInstanceID) throws java.rmi.RemoteException, usmRequestService.WebServiceException, usmRequestService.PropertyNotSetException, usmRequestService.InvalidFormatException, usmRequestService.ContentAccessDeniedException, usmRequestService.ItemNotFoundException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.soap.usm.ca.com", "addProcessInstanceToRequestItemOffering"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionID, new java.lang.Integer(requestID), new java.lang.Integer(subscriptionDetailID), processInstanceID});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.WebServiceException) {
              throw (usmRequestService.WebServiceException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.PropertyNotSetException) {
              throw (usmRequestService.PropertyNotSetException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.InvalidFormatException) {
              throw (usmRequestService.InvalidFormatException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.ContentAccessDeniedException) {
              throw (usmRequestService.ContentAccessDeniedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.ItemNotFoundException) {
              throw (usmRequestService.ItemNotFoundException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void updateReservationRequestStatusAndId(java.lang.String sessionId, int requestItemId, int status, java.lang.String extReservationId) throws java.rmi.RemoteException, usmRequestService.WebServiceException, usmRequestService.ContentAccessDeniedException, usmRequestService.ItemNotFoundException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.soap.usm.ca.com", "updateReservationRequestStatusAndId"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionId, new java.lang.Integer(requestItemId), new java.lang.Integer(status), extReservationId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.WebServiceException) {
              throw (usmRequestService.WebServiceException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.ContentAccessDeniedException) {
              throw (usmRequestService.ContentAccessDeniedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.ItemNotFoundException) {
              throw (usmRequestService.ItemNotFoundException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void logOut(java.lang.String sessionID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.soap.usm.ca.com", "logOut"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionID});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void setProxy(java.lang.String sessionID, java.lang.String proxyUserId, java.lang.String proxyDomainId) throws java.rmi.RemoteException, usmRequestService.WebServiceException, usmRequestService.ContentAccessDeniedException, usmRequestService.ItemNotFoundException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.soap.usm.ca.com", "setProxy"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionID, proxyUserId, proxyDomainId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.WebServiceException) {
              throw (usmRequestService.WebServiceException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.ContentAccessDeniedException) {
              throw (usmRequestService.ContentAccessDeniedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.ItemNotFoundException) {
              throw (usmRequestService.ItemNotFoundException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public usmRequestService.Note[] getRequestLevelNotes(java.lang.String sessionID, int requestID) throws java.rmi.RemoteException, usmRequestService.WebServiceException, usmRequestService.PropertyNotSetException, usmRequestService.InvalidFormatException, usmRequestService.ContentAccessDeniedException, usmRequestService.ItemNotFoundException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.soap.usm.ca.com", "getRequestLevelNotes"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionID, new java.lang.Integer(requestID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (usmRequestService.Note[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (usmRequestService.Note[]) org.apache.axis.utils.JavaUtils.convert(_resp, usmRequestService.Note[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.WebServiceException) {
              throw (usmRequestService.WebServiceException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.PropertyNotSetException) {
              throw (usmRequestService.PropertyNotSetException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.InvalidFormatException) {
              throw (usmRequestService.InvalidFormatException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.ContentAccessDeniedException) {
              throw (usmRequestService.ContentAccessDeniedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.ItemNotFoundException) {
              throw (usmRequestService.ItemNotFoundException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public usmRequestService.RequestResourceItem[] getRequestResources(java.lang.String sessionId, int requestItemId) throws java.rmi.RemoteException, usmRequestService.WebServiceException, usmRequestService.ContentAccessDeniedException, usmRequestService.ItemNotFoundException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.soap.usm.ca.com", "getRequestResources"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionId, new java.lang.Integer(requestItemId)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (usmRequestService.RequestResourceItem[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (usmRequestService.RequestResourceItem[]) org.apache.axis.utils.JavaUtils.convert(_resp, usmRequestService.RequestResourceItem[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.WebServiceException) {
              throw (usmRequestService.WebServiceException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.ContentAccessDeniedException) {
              throw (usmRequestService.ContentAccessDeniedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.ItemNotFoundException) {
              throw (usmRequestService.ItemNotFoundException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public usmRequestService.Request[] getRequestsByFilter(java.lang.String sessionID, usmRequestService.FilterBean[] filterBeanArr) throws java.rmi.RemoteException, usmRequestService.WebServiceException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.soap.usm.ca.com", "getRequestsByFilter"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionID, filterBeanArr});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (usmRequestService.Request[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (usmRequestService.Request[]) org.apache.axis.utils.JavaUtils.convert(_resp, usmRequestService.Request[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.WebServiceException) {
              throw (usmRequestService.WebServiceException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public usmRequestService.TicketRequestItem[] getTicketFromRequestItem(java.lang.String sessionID, java.lang.String persid, java.lang.String refNum, int requestItemID, int requestID) throws java.rmi.RemoteException, usmRequestService.WebServiceException, usmRequestService.PropertyNotSetException, usmRequestService.InvalidFormatException, usmRequestService.ContentAccessDeniedException, usmRequestService.ItemNotFoundException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.soap.usm.ca.com", "getTicketFromRequestItem"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionID, persid, refNum, new java.lang.Integer(requestItemID), new java.lang.Integer(requestID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (usmRequestService.TicketRequestItem[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (usmRequestService.TicketRequestItem[]) org.apache.axis.utils.JavaUtils.convert(_resp, usmRequestService.TicketRequestItem[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.WebServiceException) {
              throw (usmRequestService.WebServiceException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.PropertyNotSetException) {
              throw (usmRequestService.PropertyNotSetException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.InvalidFormatException) {
              throw (usmRequestService.InvalidFormatException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.ContentAccessDeniedException) {
              throw (usmRequestService.ContentAccessDeniedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.ItemNotFoundException) {
              throw (usmRequestService.ItemNotFoundException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public usmRequestService.Request[] getRequestsByUserID(java.lang.String sessionID, java.lang.String userID) throws java.rmi.RemoteException, usmRequestService.WebServiceException, usmRequestService.PropertyNotSetException, usmRequestService.InvalidFormatException, usmRequestService.ContentAccessDeniedException, usmRequestService.ItemNotFoundException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.soap.usm.ca.com", "getRequestsByUserID"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionID, userID});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (usmRequestService.Request[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (usmRequestService.Request[]) org.apache.axis.utils.JavaUtils.convert(_resp, usmRequestService.Request[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.WebServiceException) {
              throw (usmRequestService.WebServiceException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.PropertyNotSetException) {
              throw (usmRequestService.PropertyNotSetException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.InvalidFormatException) {
              throw (usmRequestService.InvalidFormatException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.ContentAccessDeniedException) {
              throw (usmRequestService.ContentAccessDeniedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.ItemNotFoundException) {
              throw (usmRequestService.ItemNotFoundException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public int getRequestItemStatus(java.lang.String sessionID, int subscriptionDetailID) throws java.rmi.RemoteException, usmRequestService.WebServiceException, usmRequestService.PropertyNotSetException, usmRequestService.InvalidFormatException, usmRequestService.ContentAccessDeniedException, usmRequestService.ItemNotFoundException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[19]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.soap.usm.ca.com", "getRequestItemStatus"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionID, new java.lang.Integer(subscriptionDetailID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.WebServiceException) {
              throw (usmRequestService.WebServiceException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.PropertyNotSetException) {
              throw (usmRequestService.PropertyNotSetException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.InvalidFormatException) {
              throw (usmRequestService.InvalidFormatException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.ContentAccessDeniedException) {
              throw (usmRequestService.ContentAccessDeniedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.ItemNotFoundException) {
              throw (usmRequestService.ItemNotFoundException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public int getSubscriptionDetailIDForForm(java.lang.String sessionID, java.lang.String formName, int requestID, int offeringID, int groupID) throws java.rmi.RemoteException, usmRequestService.WebServiceException, usmRequestService.PropertyNotSetException, usmRequestService.InvalidFormatException, usmRequestService.ContentAccessDeniedException, usmRequestService.ItemNotFoundException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[20]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.soap.usm.ca.com", "getSubscriptionDetailIDForForm"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionID, formName, new java.lang.Integer(requestID), new java.lang.Integer(offeringID), new java.lang.Integer(groupID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.WebServiceException) {
              throw (usmRequestService.WebServiceException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.PropertyNotSetException) {
              throw (usmRequestService.PropertyNotSetException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.InvalidFormatException) {
              throw (usmRequestService.InvalidFormatException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.ContentAccessDeniedException) {
              throw (usmRequestService.ContentAccessDeniedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.ItemNotFoundException) {
              throw (usmRequestService.ItemNotFoundException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public usmRequestService.RequestResourceItem addResourceToRequestItem(java.lang.String sessionId, int requestItemId, usmRequestService.RequestResourceItem resourceItem) throws java.rmi.RemoteException, usmRequestService.WebServiceException, usmRequestService.ContentAccessDeniedException, usmRequestService.ItemNotFoundException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[21]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.soap.usm.ca.com", "addResourceToRequestItem"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionId, new java.lang.Integer(requestItemId), resourceItem});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (usmRequestService.RequestResourceItem) _resp;
            } catch (java.lang.Exception _exception) {
                return (usmRequestService.RequestResourceItem) org.apache.axis.utils.JavaUtils.convert(_resp, usmRequestService.RequestResourceItem.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.WebServiceException) {
              throw (usmRequestService.WebServiceException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.ContentAccessDeniedException) {
              throw (usmRequestService.ContentAccessDeniedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.ItemNotFoundException) {
              throw (usmRequestService.ItemNotFoundException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void removeResourceFromRequestItem(java.lang.String sessionId, int requestItemId, java.lang.String resourceItemId) throws java.rmi.RemoteException, usmRequestService.WebServiceException, usmRequestService.ContentAccessDeniedException, usmRequestService.ItemNotFoundException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[22]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.soap.usm.ca.com", "removeResourceFromRequestItem"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionId, new java.lang.Integer(requestItemId), resourceItemId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.WebServiceException) {
              throw (usmRequestService.WebServiceException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.ContentAccessDeniedException) {
              throw (usmRequestService.ContentAccessDeniedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.ItemNotFoundException) {
              throw (usmRequestService.ItemNotFoundException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean oblicoreEventHandler(java.lang.String sessionID, java.lang.String eventType, java.lang.Object[] eventData, java.lang.String user, java.util.Calendar date) throws java.rmi.RemoteException, usmRequestService.WebServiceException, usmRequestService.PropertyNotSetException, usmRequestService.InvalidFormatException, usmRequestService.ContentAccessDeniedException, usmRequestService.ItemNotFoundException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[23]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.soap.usm.ca.com", "oblicoreEventHandler"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionID, eventType, eventData, user, date});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.WebServiceException) {
              throw (usmRequestService.WebServiceException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.PropertyNotSetException) {
              throw (usmRequestService.PropertyNotSetException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.InvalidFormatException) {
              throw (usmRequestService.InvalidFormatException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.ContentAccessDeniedException) {
              throw (usmRequestService.ContentAccessDeniedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.ItemNotFoundException) {
              throw (usmRequestService.ItemNotFoundException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public usmRequestService.RequestResourceItem updateRequestResource(java.lang.String sessionId, usmRequestService.RequestResourceItem resourceItem) throws java.rmi.RemoteException, usmRequestService.WebServiceException, usmRequestService.ItemNotFoundException, usmRequestService.ContentAccessDeniedException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[24]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.soap.usm.ca.com", "updateRequestResource"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionId, resourceItem});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (usmRequestService.RequestResourceItem) _resp;
            } catch (java.lang.Exception _exception) {
                return (usmRequestService.RequestResourceItem) org.apache.axis.utils.JavaUtils.convert(_resp, usmRequestService.RequestResourceItem.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.WebServiceException) {
              throw (usmRequestService.WebServiceException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.ItemNotFoundException) {
              throw (usmRequestService.ItemNotFoundException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.ContentAccessDeniedException) {
              throw (usmRequestService.ContentAccessDeniedException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void updateReservationEndDate(java.lang.String sessionId, java.lang.String endDate, java.lang.String reservationId) throws java.rmi.RemoteException, usmRequestService.WebServiceException, usmRequestService.ContentAccessDeniedException, usmRequestService.ItemNotFoundException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[25]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.soap.usm.ca.com", "updateReservationEndDate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionId, endDate, reservationId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.WebServiceException) {
              throw (usmRequestService.WebServiceException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.ContentAccessDeniedException) {
              throw (usmRequestService.ContentAccessDeniedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.ItemNotFoundException) {
              throw (usmRequestService.ItemNotFoundException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void addTicketToRequestItem(java.lang.String sessionID, java.lang.String persid, java.lang.String refNum, int requestItemID, int requestID) throws java.rmi.RemoteException, usmRequestService.WebServiceException, usmRequestService.PropertyNotSetException, usmRequestService.InvalidFormatException, usmRequestService.ContentAccessDeniedException, usmRequestService.ItemNotFoundException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[26]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.soap.usm.ca.com", "addTicketToRequestItem"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionID, persid, refNum, new java.lang.Integer(requestItemID), new java.lang.Integer(requestID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.WebServiceException) {
              throw (usmRequestService.WebServiceException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.PropertyNotSetException) {
              throw (usmRequestService.PropertyNotSetException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.InvalidFormatException) {
              throw (usmRequestService.InvalidFormatException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.ContentAccessDeniedException) {
              throw (usmRequestService.ContentAccessDeniedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.ItemNotFoundException) {
              throw (usmRequestService.ItemNotFoundException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void addAttachmentLinkToSubscription(java.lang.String sessionId, java.lang.String attachmentId, java.lang.String attachmentFileName, java.lang.String attachmentDesc, java.lang.String attachmentLink, java.lang.String attachmentTimeStamp, int sourceTypeId, java.lang.String sourceObjId, java.lang.String userId) throws java.rmi.RemoteException, usmRequestService.WebServiceException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[27]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.soap.usm.ca.com", "addAttachmentLinkToSubscription"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionId, attachmentId, attachmentFileName, attachmentDesc, attachmentLink, attachmentTimeStamp, new java.lang.Integer(sourceTypeId), sourceObjId, userId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.WebServiceException) {
              throw (usmRequestService.WebServiceException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void addProcessInstanceToRequest(java.lang.String sessionID, int requestID, java.lang.String processInstanceID) throws java.rmi.RemoteException, usmRequestService.WebServiceException, usmRequestService.PropertyNotSetException, usmRequestService.InvalidFormatException, usmRequestService.ContentAccessDeniedException, usmRequestService.ItemNotFoundException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[28]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.soap.usm.ca.com", "addProcessInstanceToRequest"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionID, new java.lang.Integer(requestID), processInstanceID});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.WebServiceException) {
              throw (usmRequestService.WebServiceException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.PropertyNotSetException) {
              throw (usmRequestService.PropertyNotSetException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.InvalidFormatException) {
              throw (usmRequestService.InvalidFormatException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.ContentAccessDeniedException) {
              throw (usmRequestService.ContentAccessDeniedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.ItemNotFoundException) {
              throw (usmRequestService.ItemNotFoundException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public usmRequestService.Request[] getRequestsByAccountID(java.lang.String sessionID, java.lang.String accountID) throws java.rmi.RemoteException, usmRequestService.WebServiceException, usmRequestService.PropertyNotSetException, usmRequestService.InvalidFormatException, usmRequestService.ContentAccessDeniedException, usmRequestService.ItemNotFoundException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[29]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.soap.usm.ca.com", "getRequestsByAccountID"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionID, accountID});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (usmRequestService.Request[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (usmRequestService.Request[]) org.apache.axis.utils.JavaUtils.convert(_resp, usmRequestService.Request[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.WebServiceException) {
              throw (usmRequestService.WebServiceException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.PropertyNotSetException) {
              throw (usmRequestService.PropertyNotSetException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.InvalidFormatException) {
              throw (usmRequestService.InvalidFormatException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.ContentAccessDeniedException) {
              throw (usmRequestService.ContentAccessDeniedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.ItemNotFoundException) {
              throw (usmRequestService.ItemNotFoundException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void updateRequestItemStatus(java.lang.String sessionID, int pendingActionType, int requestItemID, int status) throws java.rmi.RemoteException, usmRequestService.WebServiceException, usmRequestService.PropertyNotSetException, usmRequestService.InvalidFormatException, usmRequestService.ContentAccessDeniedException, usmRequestService.ItemNotFoundException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[30]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.soap.usm.ca.com", "updateRequestItemStatus"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionID, new java.lang.Integer(pendingActionType), new java.lang.Integer(requestItemID), new java.lang.Integer(status)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.WebServiceException) {
              throw (usmRequestService.WebServiceException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.PropertyNotSetException) {
              throw (usmRequestService.PropertyNotSetException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.InvalidFormatException) {
              throw (usmRequestService.InvalidFormatException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.ContentAccessDeniedException) {
              throw (usmRequestService.ContentAccessDeniedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.ItemNotFoundException) {
              throw (usmRequestService.ItemNotFoundException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public usmRequestService.Asset[] getAssetUUIDByRequestItemID(java.lang.String sessionID, int subscriptionDetailID) throws java.rmi.RemoteException, usmRequestService.WebServiceException, usmRequestService.PropertyNotSetException, usmRequestService.InvalidFormatException, usmRequestService.ContentAccessDeniedException, usmRequestService.ItemNotFoundException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[31]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.soap.usm.ca.com", "getAssetUUIDByRequestItemID"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionID, new java.lang.Integer(subscriptionDetailID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (usmRequestService.Asset[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (usmRequestService.Asset[]) org.apache.axis.utils.JavaUtils.convert(_resp, usmRequestService.Asset[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.WebServiceException) {
              throw (usmRequestService.WebServiceException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.PropertyNotSetException) {
              throw (usmRequestService.PropertyNotSetException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.InvalidFormatException) {
              throw (usmRequestService.InvalidFormatException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.ContentAccessDeniedException) {
              throw (usmRequestService.ContentAccessDeniedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.ItemNotFoundException) {
              throw (usmRequestService.ItemNotFoundException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public usmRequestService.FormElement[] getSystemFormValues(java.lang.String sessionID, int requestID) throws java.rmi.RemoteException, usmRequestService.WebServiceException, usmRequestService.ContentAccessDeniedException, usmRequestService.ItemNotFoundException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[32]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.soap.usm.ca.com", "getSystemFormValues"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionID, new java.lang.Integer(requestID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (usmRequestService.FormElement[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (usmRequestService.FormElement[]) org.apache.axis.utils.JavaUtils.convert(_resp, usmRequestService.FormElement[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.WebServiceException) {
              throw (usmRequestService.WebServiceException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.ContentAccessDeniedException) {
              throw (usmRequestService.ContentAccessDeniedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.ItemNotFoundException) {
              throw (usmRequestService.ItemNotFoundException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void addAttachmentToRequestItemWithPath(java.lang.String sessionID, int requestID, int subscriptionDetailID, java.lang.String attachmentName, java.lang.String attachmentDescription, java.lang.String attachmentPath) throws java.rmi.RemoteException, usmRequestService.WebServiceException, usmRequestService.PropertyNotSetException, usmRequestService.InvalidFormatException, usmRequestService.ContentAccessDeniedException, usmRequestService.ItemNotFoundException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[33]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.soap.usm.ca.com", "addAttachmentToRequestItemWithPath"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionID, new java.lang.Integer(requestID), new java.lang.Integer(subscriptionDetailID), attachmentName, attachmentDescription, attachmentPath});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.WebServiceException) {
              throw (usmRequestService.WebServiceException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.PropertyNotSetException) {
              throw (usmRequestService.PropertyNotSetException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.InvalidFormatException) {
              throw (usmRequestService.InvalidFormatException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.ContentAccessDeniedException) {
              throw (usmRequestService.ContentAccessDeniedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.ItemNotFoundException) {
              throw (usmRequestService.ItemNotFoundException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public usmRequestService.RateItemModel[] getModelUUIDByRequestItemID(java.lang.String sessionID, int requestItemID) throws java.rmi.RemoteException, usmRequestService.WebServiceException, usmRequestService.PropertyNotSetException, usmRequestService.InvalidFormatException, usmRequestService.ContentAccessDeniedException, usmRequestService.ItemNotFoundException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[34]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.soap.usm.ca.com", "getModelUUIDByRequestItemID"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionID, new java.lang.Integer(requestItemID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (usmRequestService.RateItemModel[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (usmRequestService.RateItemModel[]) org.apache.axis.utils.JavaUtils.convert(_resp, usmRequestService.RateItemModel[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.WebServiceException) {
              throw (usmRequestService.WebServiceException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.PropertyNotSetException) {
              throw (usmRequestService.PropertyNotSetException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.InvalidFormatException) {
              throw (usmRequestService.InvalidFormatException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.ContentAccessDeniedException) {
              throw (usmRequestService.ContentAccessDeniedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.ItemNotFoundException) {
              throw (usmRequestService.ItemNotFoundException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public usmRequestService.Attachment[] getRequestItemAttachments(java.lang.String sessionID, int subscriptionDetailID) throws java.rmi.RemoteException, usmRequestService.WebServiceException, usmRequestService.PropertyNotSetException, usmRequestService.InvalidFormatException, usmRequestService.ContentAccessDeniedException, usmRequestService.ItemNotFoundException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[35]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.soap.usm.ca.com", "getRequestItemAttachments"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionID, new java.lang.Integer(subscriptionDetailID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (usmRequestService.Attachment[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (usmRequestService.Attachment[]) org.apache.axis.utils.JavaUtils.convert(_resp, usmRequestService.Attachment[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.WebServiceException) {
              throw (usmRequestService.WebServiceException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.PropertyNotSetException) {
              throw (usmRequestService.PropertyNotSetException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.InvalidFormatException) {
              throw (usmRequestService.InvalidFormatException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.ContentAccessDeniedException) {
              throw (usmRequestService.ContentAccessDeniedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.ItemNotFoundException) {
              throw (usmRequestService.ItemNotFoundException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public usmRequestService.Attachment[] getRequestLevelAttachments(java.lang.String sessionID, int requestID) throws java.rmi.RemoteException, usmRequestService.WebServiceException, usmRequestService.PropertyNotSetException, usmRequestService.InvalidFormatException, usmRequestService.ContentAccessDeniedException, usmRequestService.ItemNotFoundException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[36]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.soap.usm.ca.com", "getRequestLevelAttachments"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionID, new java.lang.Integer(requestID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (usmRequestService.Attachment[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (usmRequestService.Attachment[]) org.apache.axis.utils.JavaUtils.convert(_resp, usmRequestService.Attachment[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.WebServiceException) {
              throw (usmRequestService.WebServiceException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.PropertyNotSetException) {
              throw (usmRequestService.PropertyNotSetException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.InvalidFormatException) {
              throw (usmRequestService.InvalidFormatException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.ContentAccessDeniedException) {
              throw (usmRequestService.ContentAccessDeniedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.ItemNotFoundException) {
              throw (usmRequestService.ItemNotFoundException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void editRequestAttachmentDetails(java.lang.String sessionID, int requestID, java.lang.String attachmentID, java.lang.String attachmentName, java.lang.String attachmentDescription) throws java.rmi.RemoteException, usmRequestService.WebServiceException, usmRequestService.PropertyNotSetException, usmRequestService.InvalidFormatException, usmRequestService.ContentAccessDeniedException, usmRequestService.ItemNotFoundException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[37]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.soap.usm.ca.com", "editRequestAttachmentDetails"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionID, new java.lang.Integer(requestID), attachmentID, attachmentName, attachmentDescription});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.WebServiceException) {
              throw (usmRequestService.WebServiceException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.PropertyNotSetException) {
              throw (usmRequestService.PropertyNotSetException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.InvalidFormatException) {
              throw (usmRequestService.InvalidFormatException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.ContentAccessDeniedException) {
              throw (usmRequestService.ContentAccessDeniedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.ItemNotFoundException) {
              throw (usmRequestService.ItemNotFoundException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public int getRequestOfferingStatus(java.lang.String sessionID, int requestID, int offeringID, int groupID) throws java.rmi.RemoteException, usmRequestService.WebServiceException, usmRequestService.PropertyNotSetException, usmRequestService.InvalidFormatException, usmRequestService.ContentAccessDeniedException, usmRequestService.ItemNotFoundException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[38]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.soap.usm.ca.com", "getRequestOfferingStatus"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionID, new java.lang.Integer(requestID), new java.lang.Integer(offeringID), new java.lang.Integer(groupID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.WebServiceException) {
              throw (usmRequestService.WebServiceException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.PropertyNotSetException) {
              throw (usmRequestService.PropertyNotSetException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.InvalidFormatException) {
              throw (usmRequestService.InvalidFormatException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.ContentAccessDeniedException) {
              throw (usmRequestService.ContentAccessDeniedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.ItemNotFoundException) {
              throw (usmRequestService.ItemNotFoundException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void unassignModelUUIDFromRateItem(java.lang.String sessionID, int rateItemID, java.lang.String modelUUID) throws java.rmi.RemoteException, usmRequestService.WebServiceException, usmRequestService.ContentAccessDeniedException, usmRequestService.ItemNotFoundException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[39]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.soap.usm.ca.com", "unassignModelUUIDFromRateItem"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionID, new java.lang.Integer(rateItemID), modelUUID});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.WebServiceException) {
              throw (usmRequestService.WebServiceException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.ContentAccessDeniedException) {
              throw (usmRequestService.ContentAccessDeniedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.ItemNotFoundException) {
              throw (usmRequestService.ItemNotFoundException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void removeRequestAttachment(java.lang.String sessionID, int requestID, java.lang.String attachmentID) throws java.rmi.RemoteException, usmRequestService.WebServiceException, usmRequestService.PropertyNotSetException, usmRequestService.InvalidFormatException, usmRequestService.ContentAccessDeniedException, usmRequestService.ItemNotFoundException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[40]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.soap.usm.ca.com", "removeRequestAttachment"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionID, new java.lang.Integer(requestID), attachmentID});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.WebServiceException) {
              throw (usmRequestService.WebServiceException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.PropertyNotSetException) {
              throw (usmRequestService.PropertyNotSetException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.InvalidFormatException) {
              throw (usmRequestService.InvalidFormatException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.ContentAccessDeniedException) {
              throw (usmRequestService.ContentAccessDeniedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.ItemNotFoundException) {
              throw (usmRequestService.ItemNotFoundException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public usmRequestService.RateItemModel[] getModelUUIDByRateItemID(java.lang.String sessionID, int rateItemID) throws java.rmi.RemoteException, usmRequestService.WebServiceException, usmRequestService.PropertyNotSetException, usmRequestService.InvalidFormatException, usmRequestService.ContentAccessDeniedException, usmRequestService.ItemNotFoundException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[41]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.soap.usm.ca.com", "getModelUUIDByRateItemID"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionID, new java.lang.Integer(rateItemID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (usmRequestService.RateItemModel[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (usmRequestService.RateItemModel[]) org.apache.axis.utils.JavaUtils.convert(_resp, usmRequestService.RateItemModel[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.WebServiceException) {
              throw (usmRequestService.WebServiceException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.PropertyNotSetException) {
              throw (usmRequestService.PropertyNotSetException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.InvalidFormatException) {
              throw (usmRequestService.InvalidFormatException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.ContentAccessDeniedException) {
              throw (usmRequestService.ContentAccessDeniedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.ItemNotFoundException) {
              throw (usmRequestService.ItemNotFoundException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String[] getPendingActionsForRequest(java.lang.String sessionID, int requestID) throws java.rmi.RemoteException, usmRequestService.WebServiceException, usmRequestService.PropertyNotSetException, usmRequestService.InvalidFormatException, usmRequestService.ContentAccessDeniedException, usmRequestService.ItemNotFoundException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[42]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.soap.usm.ca.com", "getPendingActionsForRequest"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionID, new java.lang.Integer(requestID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String[]) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.WebServiceException) {
              throw (usmRequestService.WebServiceException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.PropertyNotSetException) {
              throw (usmRequestService.PropertyNotSetException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.InvalidFormatException) {
              throw (usmRequestService.InvalidFormatException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.ContentAccessDeniedException) {
              throw (usmRequestService.ContentAccessDeniedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.ItemNotFoundException) {
              throw (usmRequestService.ItemNotFoundException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void addWorkflowPendingAction(java.lang.String sessionID, int requestID, int objectType, int objectID, int objectGroupID, java.lang.String workItemID, java.lang.String processInstanceID, java.lang.String userID) throws java.rmi.RemoteException, usmRequestService.WebServiceException, usmRequestService.PropertyNotSetException, usmRequestService.InvalidFormatException, usmRequestService.ContentAccessDeniedException, usmRequestService.ItemNotFoundException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[43]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.soap.usm.ca.com", "addWorkflowPendingAction"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionID, new java.lang.Integer(requestID), new java.lang.Integer(objectType), new java.lang.Integer(objectID), new java.lang.Integer(objectGroupID), workItemID, processInstanceID, userID});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.WebServiceException) {
              throw (usmRequestService.WebServiceException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.PropertyNotSetException) {
              throw (usmRequestService.PropertyNotSetException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.InvalidFormatException) {
              throw (usmRequestService.InvalidFormatException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.ContentAccessDeniedException) {
              throw (usmRequestService.ContentAccessDeniedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.ItemNotFoundException) {
              throw (usmRequestService.ItemNotFoundException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void assignAssetUUIDToRequestItem(java.lang.String sessionID, int requestItemID, java.lang.String assetUUID) throws java.rmi.RemoteException, usmRequestService.WebServiceException, usmRequestService.ContentAccessDeniedException, usmRequestService.ItemNotFoundException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[44]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.soap.usm.ca.com", "assignAssetUUIDToRequestItem"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionID, new java.lang.Integer(requestItemID), assetUUID});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.WebServiceException) {
              throw (usmRequestService.WebServiceException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.ContentAccessDeniedException) {
              throw (usmRequestService.ContentAccessDeniedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.ItemNotFoundException) {
              throw (usmRequestService.ItemNotFoundException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public int assignPolicyBasedPendingActions(java.lang.String sessionID, int requestID, int levelNo, int pendingActionType, int requestItemID, int requestItemStatus, java.lang.String workItemID, java.lang.String processInstanceID) throws java.rmi.RemoteException, usmRequestService.WebServiceException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[45]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.soap.usm.ca.com", "assignPolicyBasedPendingActions"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionID, new java.lang.Integer(requestID), new java.lang.Integer(levelNo), new java.lang.Integer(pendingActionType), new java.lang.Integer(requestItemID), new java.lang.Integer(requestItemStatus), workItemID, processInstanceID});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.WebServiceException) {
              throw (usmRequestService.WebServiceException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void addProcessInstanceToRequestItem(java.lang.String sessionID, int requestID, int subscriptionDetailID, java.lang.String processInstanceID) throws java.rmi.RemoteException, usmRequestService.WebServiceException, usmRequestService.PropertyNotSetException, usmRequestService.InvalidFormatException, usmRequestService.ContentAccessDeniedException, usmRequestService.ItemNotFoundException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[46]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.soap.usm.ca.com", "addProcessInstanceToRequestItem"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionID, new java.lang.Integer(requestID), new java.lang.Integer(subscriptionDetailID), processInstanceID});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.WebServiceException) {
              throw (usmRequestService.WebServiceException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.PropertyNotSetException) {
              throw (usmRequestService.PropertyNotSetException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.InvalidFormatException) {
              throw (usmRequestService.InvalidFormatException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.ContentAccessDeniedException) {
              throw (usmRequestService.ContentAccessDeniedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.ItemNotFoundException) {
              throw (usmRequestService.ItemNotFoundException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void addRequestAttachmentWithPath(java.lang.String sessionID, int requestID, java.lang.String attachmentName, java.lang.String attachmentDescription, java.lang.String attachmentPath) throws java.rmi.RemoteException, usmRequestService.WebServiceException, usmRequestService.PropertyNotSetException, usmRequestService.InvalidFormatException, usmRequestService.ContentAccessDeniedException, usmRequestService.ItemNotFoundException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[47]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.soap.usm.ca.com", "addRequestAttachmentWithPath"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionID, new java.lang.Integer(requestID), attachmentName, attachmentDescription, attachmentPath});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.WebServiceException) {
              throw (usmRequestService.WebServiceException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.PropertyNotSetException) {
              throw (usmRequestService.PropertyNotSetException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.InvalidFormatException) {
              throw (usmRequestService.InvalidFormatException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.ContentAccessDeniedException) {
              throw (usmRequestService.ContentAccessDeniedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.ItemNotFoundException) {
              throw (usmRequestService.ItemNotFoundException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public usmRequestService.Asset[] getAssetUUIDByRequestID(java.lang.String sessionID, int requestID) throws java.rmi.RemoteException, usmRequestService.WebServiceException, usmRequestService.PropertyNotSetException, usmRequestService.InvalidFormatException, usmRequestService.ContentAccessDeniedException, usmRequestService.ItemNotFoundException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[48]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.soap.usm.ca.com", "getAssetUUIDByRequestID"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionID, new java.lang.Integer(requestID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (usmRequestService.Asset[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (usmRequestService.Asset[]) org.apache.axis.utils.JavaUtils.convert(_resp, usmRequestService.Asset[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.WebServiceException) {
              throw (usmRequestService.WebServiceException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.PropertyNotSetException) {
              throw (usmRequestService.PropertyNotSetException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.InvalidFormatException) {
              throw (usmRequestService.InvalidFormatException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.ContentAccessDeniedException) {
              throw (usmRequestService.ContentAccessDeniedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.ItemNotFoundException) {
              throw (usmRequestService.ItemNotFoundException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void addWorkflowPendingActionWithDesc(java.lang.String sessionID, int requestID, int objectType, int objectID, int objectGroupID, java.lang.String workItemID, java.lang.String processInstanceID, java.lang.String userID, java.lang.String description) throws java.rmi.RemoteException, usmRequestService.WebServiceException, usmRequestService.PropertyNotSetException, usmRequestService.InvalidFormatException, usmRequestService.ContentAccessDeniedException, usmRequestService.ItemNotFoundException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[49]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.soap.usm.ca.com", "addWorkflowPendingActionWithDesc"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionID, new java.lang.Integer(requestID), new java.lang.Integer(objectType), new java.lang.Integer(objectID), new java.lang.Integer(objectGroupID), workItemID, processInstanceID, userID, description});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.WebServiceException) {
              throw (usmRequestService.WebServiceException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.PropertyNotSetException) {
              throw (usmRequestService.PropertyNotSetException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.InvalidFormatException) {
              throw (usmRequestService.InvalidFormatException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.ContentAccessDeniedException) {
              throw (usmRequestService.ContentAccessDeniedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.ItemNotFoundException) {
              throw (usmRequestService.ItemNotFoundException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void unassignAssetUUIDFromRequestItem(java.lang.String sessionID, int requestItemID, java.lang.String assetUUID) throws java.rmi.RemoteException, usmRequestService.WebServiceException, usmRequestService.ContentAccessDeniedException, usmRequestService.ItemNotFoundException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[50]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.soap.usm.ca.com", "unassignAssetUUIDFromRequestItem"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionID, new java.lang.Integer(requestItemID), assetUUID});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.WebServiceException) {
              throw (usmRequestService.WebServiceException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.ContentAccessDeniedException) {
              throw (usmRequestService.ContentAccessDeniedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.ItemNotFoundException) {
              throw (usmRequestService.ItemNotFoundException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void assignModelUUIDToRateItem(java.lang.String sessionID, int rateItemID, java.lang.String modelUUID) throws java.rmi.RemoteException, usmRequestService.WebServiceException, usmRequestService.ContentAccessDeniedException, usmRequestService.ItemNotFoundException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[51]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.soap.usm.ca.com", "assignModelUUIDToRateItem"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionID, new java.lang.Integer(rateItemID), modelUUID});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.WebServiceException) {
              throw (usmRequestService.WebServiceException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.ContentAccessDeniedException) {
              throw (usmRequestService.ContentAccessDeniedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.ItemNotFoundException) {
              throw (usmRequestService.ItemNotFoundException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public usmRequestService.RequestRelationship[] getRequestRelationships(java.lang.String sessionID, usmRequestService.FilterBean[] filterBeanArr) throws java.rmi.RemoteException, usmRequestService.WebServiceException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[52]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.soap.usm.ca.com", "getRequestRelationships"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionID, filterBeanArr});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (usmRequestService.RequestRelationship[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (usmRequestService.RequestRelationship[]) org.apache.axis.utils.JavaUtils.convert(_resp, usmRequestService.RequestRelationship[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.WebServiceException) {
              throw (usmRequestService.WebServiceException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String getDefaultUserForRequestActions(java.lang.String sessionID, java.lang.String businessunit) throws java.rmi.RemoteException, usmRequestService.WebServiceException, usmRequestService.PropertyNotSetException, usmRequestService.InvalidFormatException, usmRequestService.ContentAccessDeniedException, usmRequestService.ItemNotFoundException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[53]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.soap.usm.ca.com", "getDefaultUserForRequestActions"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionID, businessunit});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.WebServiceException) {
              throw (usmRequestService.WebServiceException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.PropertyNotSetException) {
              throw (usmRequestService.PropertyNotSetException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.InvalidFormatException) {
              throw (usmRequestService.InvalidFormatException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.ContentAccessDeniedException) {
              throw (usmRequestService.ContentAccessDeniedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.ItemNotFoundException) {
              throw (usmRequestService.ItemNotFoundException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public usmRequestService.Note[] getRequestNotes(java.lang.String sessionID, int requestID) throws java.rmi.RemoteException, usmRequestService.WebServiceException, usmRequestService.PropertyNotSetException, usmRequestService.InvalidFormatException, usmRequestService.ContentAccessDeniedException, usmRequestService.ItemNotFoundException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[54]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.soap.usm.ca.com", "getRequestNotes"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionID, new java.lang.Integer(requestID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (usmRequestService.Note[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (usmRequestService.Note[]) org.apache.axis.utils.JavaUtils.convert(_resp, usmRequestService.Note[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.WebServiceException) {
              throw (usmRequestService.WebServiceException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.PropertyNotSetException) {
              throw (usmRequestService.PropertyNotSetException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.InvalidFormatException) {
              throw (usmRequestService.InvalidFormatException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.ContentAccessDeniedException) {
              throw (usmRequestService.ContentAccessDeniedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.ItemNotFoundException) {
              throw (usmRequestService.ItemNotFoundException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void addRequestNote(java.lang.String sessionID, int requestID, java.lang.String noteText, int noteType) throws java.rmi.RemoteException, usmRequestService.WebServiceException, usmRequestService.PropertyNotSetException, usmRequestService.InvalidFormatException, usmRequestService.ContentAccessDeniedException, usmRequestService.ItemNotFoundException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[55]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.soap.usm.ca.com", "addRequestNote"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionID, new java.lang.Integer(requestID), noteText, new java.lang.Integer(noteType)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.WebServiceException) {
              throw (usmRequestService.WebServiceException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.PropertyNotSetException) {
              throw (usmRequestService.PropertyNotSetException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.InvalidFormatException) {
              throw (usmRequestService.InvalidFormatException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.ContentAccessDeniedException) {
              throw (usmRequestService.ContentAccessDeniedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.ItemNotFoundException) {
              throw (usmRequestService.ItemNotFoundException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public usmRequestService.SubscriptionDetail[] getRequestItems(java.lang.String sessionID, int requestID) throws java.rmi.RemoteException, usmRequestService.WebServiceException, usmRequestService.ContentAccessDeniedException, usmRequestService.ItemNotFoundException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[56]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.soap.usm.ca.com", "getRequestItems"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionID, new java.lang.Integer(requestID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (usmRequestService.SubscriptionDetail[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (usmRequestService.SubscriptionDetail[]) org.apache.axis.utils.JavaUtils.convert(_resp, usmRequestService.SubscriptionDetail[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.WebServiceException) {
              throw (usmRequestService.WebServiceException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.ContentAccessDeniedException) {
              throw (usmRequestService.ContentAccessDeniedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.ItemNotFoundException) {
              throw (usmRequestService.ItemNotFoundException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean sendRequestEmail(java.lang.String sessionID, int requestId, boolean includeRequestDetails, java.lang.String emailFromAddress, java.lang.String emailFromName, java.lang.String emailTo, java.lang.String emailCC, java.lang.String emailBCC, java.lang.String emailSubject, java.lang.String emailMessage) throws java.rmi.RemoteException, usmRequestService.WebServiceException, usmRequestService.ItemNotFoundException, usmRequestService.ContentAccessDeniedException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[57]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.soap.usm.ca.com", "sendRequestEmail"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionID, new java.lang.Integer(requestId), new java.lang.Boolean(includeRequestDetails), emailFromAddress, emailFromName, emailTo, emailCC, emailBCC, emailSubject, emailMessage});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.WebServiceException) {
              throw (usmRequestService.WebServiceException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.ItemNotFoundException) {
              throw (usmRequestService.ItemNotFoundException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.ContentAccessDeniedException) {
              throw (usmRequestService.ContentAccessDeniedException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public usmRequestService.FormItem saveRequestForm(java.lang.String sessionID, int subscriptionDetailID, java.lang.String formValuesData) throws java.rmi.RemoteException, usmRequestService.WebServiceException, usmRequestService.PropertyNotSetException, usmRequestService.InvalidFormatException, usmRequestService.ContentAccessDeniedException, usmRequestService.ItemNotFoundException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[58]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.soap.usm.ca.com", "saveRequestForm"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionID, new java.lang.Integer(subscriptionDetailID), formValuesData});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (usmRequestService.FormItem) _resp;
            } catch (java.lang.Exception _exception) {
                return (usmRequestService.FormItem) org.apache.axis.utils.JavaUtils.convert(_resp, usmRequestService.FormItem.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.WebServiceException) {
              throw (usmRequestService.WebServiceException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.PropertyNotSetException) {
              throw (usmRequestService.PropertyNotSetException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.InvalidFormatException) {
              throw (usmRequestService.InvalidFormatException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.ContentAccessDeniedException) {
              throw (usmRequestService.ContentAccessDeniedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.ItemNotFoundException) {
              throw (usmRequestService.ItemNotFoundException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void cancelRequest(java.lang.String sessionID, int requestID) throws java.rmi.RemoteException, usmRequestService.WebServiceException, usmRequestService.PropertyNotSetException, usmRequestService.InvalidFormatException, usmRequestService.ContentAccessDeniedException, usmRequestService.ItemNotFoundException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[59]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.soap.usm.ca.com", "cancelRequest"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionID, new java.lang.Integer(requestID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.WebServiceException) {
              throw (usmRequestService.WebServiceException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.PropertyNotSetException) {
              throw (usmRequestService.PropertyNotSetException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.InvalidFormatException) {
              throw (usmRequestService.InvalidFormatException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.ContentAccessDeniedException) {
              throw (usmRequestService.ContentAccessDeniedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.ItemNotFoundException) {
              throw (usmRequestService.ItemNotFoundException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public usmRequestService.FormItem getFormRateItemValues(java.lang.String sessionID, int subscriptionDetailID) throws java.rmi.RemoteException, usmRequestService.WebServiceException, usmRequestService.PropertyNotSetException, usmRequestService.InvalidFormatException, usmRequestService.ContentAccessDeniedException, usmRequestService.ItemNotFoundException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[60]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.soap.usm.ca.com", "getFormRateItemValues"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionID, new java.lang.Integer(subscriptionDetailID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (usmRequestService.FormItem) _resp;
            } catch (java.lang.Exception _exception) {
                return (usmRequestService.FormItem) org.apache.axis.utils.JavaUtils.convert(_resp, usmRequestService.FormItem.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.WebServiceException) {
              throw (usmRequestService.WebServiceException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.PropertyNotSetException) {
              throw (usmRequestService.PropertyNotSetException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.InvalidFormatException) {
              throw (usmRequestService.InvalidFormatException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.ContentAccessDeniedException) {
              throw (usmRequestService.ContentAccessDeniedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.ItemNotFoundException) {
              throw (usmRequestService.ItemNotFoundException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void addRequestItemNote(java.lang.String sessionID, int subscriptionDetailID, java.lang.String noteText, int noteType) throws java.rmi.RemoteException, usmRequestService.WebServiceException, usmRequestService.PropertyNotSetException, usmRequestService.InvalidFormatException, usmRequestService.ContentAccessDeniedException, usmRequestService.ItemNotFoundException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[61]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.soap.usm.ca.com", "addRequestItemNote"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionID, new java.lang.Integer(subscriptionDetailID), noteText, new java.lang.Integer(noteType)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.WebServiceException) {
              throw (usmRequestService.WebServiceException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.PropertyNotSetException) {
              throw (usmRequestService.PropertyNotSetException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.InvalidFormatException) {
              throw (usmRequestService.InvalidFormatException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.ContentAccessDeniedException) {
              throw (usmRequestService.ContentAccessDeniedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.ItemNotFoundException) {
              throw (usmRequestService.ItemNotFoundException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public int getRequestStatus(java.lang.String sessionID, int requestID) throws java.rmi.RemoteException, usmRequestService.WebServiceException, usmRequestService.PropertyNotSetException, usmRequestService.InvalidFormatException, usmRequestService.ContentAccessDeniedException, usmRequestService.ItemNotFoundException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[62]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.soap.usm.ca.com", "getRequestStatus"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionID, new java.lang.Integer(requestID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.WebServiceException) {
              throw (usmRequestService.WebServiceException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.PropertyNotSetException) {
              throw (usmRequestService.PropertyNotSetException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.InvalidFormatException) {
              throw (usmRequestService.InvalidFormatException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.ContentAccessDeniedException) {
              throw (usmRequestService.ContentAccessDeniedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.ItemNotFoundException) {
              throw (usmRequestService.ItemNotFoundException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void updateRequestStatus(java.lang.String sessionID, int requestID, int status) throws java.rmi.RemoteException, usmRequestService.WebServiceException, usmRequestService.PropertyNotSetException, usmRequestService.InvalidFormatException, usmRequestService.ContentAccessDeniedException, usmRequestService.ItemNotFoundException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[63]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.soap.usm.ca.com", "updateRequestStatus"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionID, new java.lang.Integer(requestID), new java.lang.Integer(status)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.WebServiceException) {
              throw (usmRequestService.WebServiceException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.PropertyNotSetException) {
              throw (usmRequestService.PropertyNotSetException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.InvalidFormatException) {
              throw (usmRequestService.InvalidFormatException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.ContentAccessDeniedException) {
              throw (usmRequestService.ContentAccessDeniedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.ItemNotFoundException) {
              throw (usmRequestService.ItemNotFoundException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void updateRequestItemRowStatus(java.lang.String sessionID, int subscriptionDetailID, int status) throws java.rmi.RemoteException, usmRequestService.WebServiceException, usmRequestService.PropertyNotSetException, usmRequestService.InvalidFormatException, usmRequestService.ContentAccessDeniedException, usmRequestService.ItemNotFoundException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[64]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.soap.usm.ca.com", "updateRequestItemRowStatus"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionID, new java.lang.Integer(subscriptionDetailID), new java.lang.Integer(status)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.WebServiceException) {
              throw (usmRequestService.WebServiceException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.PropertyNotSetException) {
              throw (usmRequestService.PropertyNotSetException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.InvalidFormatException) {
              throw (usmRequestService.InvalidFormatException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.ContentAccessDeniedException) {
              throw (usmRequestService.ContentAccessDeniedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.ItemNotFoundException) {
              throw (usmRequestService.ItemNotFoundException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void updateRequestOfferingStatus(java.lang.String sessionID, int requestID, int offeringID, int groupID, int status) throws java.rmi.RemoteException, usmRequestService.WebServiceException, usmRequestService.PropertyNotSetException, usmRequestService.InvalidFormatException, usmRequestService.ContentAccessDeniedException, usmRequestService.ItemNotFoundException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[65]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.soap.usm.ca.com", "updateRequestOfferingStatus"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionID, new java.lang.Integer(requestID), new java.lang.Integer(offeringID), new java.lang.Integer(groupID), new java.lang.Integer(status)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.WebServiceException) {
              throw (usmRequestService.WebServiceException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.PropertyNotSetException) {
              throw (usmRequestService.PropertyNotSetException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.InvalidFormatException) {
              throw (usmRequestService.InvalidFormatException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.ContentAccessDeniedException) {
              throw (usmRequestService.ContentAccessDeniedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.ItemNotFoundException) {
              throw (usmRequestService.ItemNotFoundException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String getFormRateItemValue(java.lang.String sessionID, int subscriptionDetailID, java.lang.String formRateItemName) throws java.rmi.RemoteException, usmRequestService.WebServiceException, usmRequestService.ContentAccessDeniedException, usmRequestService.ItemNotFoundException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[66]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.soap.usm.ca.com", "getFormRateItemValue"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionID, new java.lang.Integer(subscriptionDetailID), formRateItemName});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.WebServiceException) {
              throw (usmRequestService.WebServiceException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.ContentAccessDeniedException) {
              throw (usmRequestService.ContentAccessDeniedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.ItemNotFoundException) {
              throw (usmRequestService.ItemNotFoundException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String getPrimaryServiceDesk(java.lang.String sessionID) throws java.rmi.RemoteException, usmRequestService.WebServiceException, usmRequestService.PropertyNotSetException, usmRequestService.InvalidFormatException, usmRequestService.ContentAccessDeniedException, usmRequestService.ItemNotFoundException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[67]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.soap.usm.ca.com", "getPrimaryServiceDesk"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionID});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.WebServiceException) {
              throw (usmRequestService.WebServiceException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.PropertyNotSetException) {
              throw (usmRequestService.PropertyNotSetException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.InvalidFormatException) {
              throw (usmRequestService.InvalidFormatException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.ContentAccessDeniedException) {
              throw (usmRequestService.ContentAccessDeniedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.ItemNotFoundException) {
              throw (usmRequestService.ItemNotFoundException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public usmRequestService.Note[] getRequestItemNotes(java.lang.String sessionID, int subscriptionDetailID) throws java.rmi.RemoteException, usmRequestService.WebServiceException, usmRequestService.PropertyNotSetException, usmRequestService.InvalidFormatException, usmRequestService.ContentAccessDeniedException, usmRequestService.ItemNotFoundException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[68]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.soap.usm.ca.com", "getRequestItemNotes"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionID, new java.lang.Integer(subscriptionDetailID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (usmRequestService.Note[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (usmRequestService.Note[]) org.apache.axis.utils.JavaUtils.convert(_resp, usmRequestService.Note[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.WebServiceException) {
              throw (usmRequestService.WebServiceException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.PropertyNotSetException) {
              throw (usmRequestService.PropertyNotSetException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.InvalidFormatException) {
              throw (usmRequestService.InvalidFormatException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.ContentAccessDeniedException) {
              throw (usmRequestService.ContentAccessDeniedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.ItemNotFoundException) {
              throw (usmRequestService.ItemNotFoundException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void addRequestOfferingNote(java.lang.String sessionID, int requestID, int offeringID, int groupID, java.lang.String noteText, int noteType) throws java.rmi.RemoteException, usmRequestService.WebServiceException, usmRequestService.PropertyNotSetException, usmRequestService.InvalidFormatException, usmRequestService.ContentAccessDeniedException, usmRequestService.ItemNotFoundException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[69]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.soap.usm.ca.com", "addRequestOfferingNote"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionID, new java.lang.Integer(requestID), new java.lang.Integer(offeringID), new java.lang.Integer(groupID), noteText, new java.lang.Integer(noteType)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.WebServiceException) {
              throw (usmRequestService.WebServiceException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.PropertyNotSetException) {
              throw (usmRequestService.PropertyNotSetException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.InvalidFormatException) {
              throw (usmRequestService.InvalidFormatException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.ContentAccessDeniedException) {
              throw (usmRequestService.ContentAccessDeniedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.ItemNotFoundException) {
              throw (usmRequestService.ItemNotFoundException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public usmRequestService.Note[] getRequestOfferingNotes(java.lang.String sessionID, int requestID, int offeringID, int groupID) throws java.rmi.RemoteException, usmRequestService.WebServiceException, usmRequestService.PropertyNotSetException, usmRequestService.InvalidFormatException, usmRequestService.ContentAccessDeniedException, usmRequestService.ItemNotFoundException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[70]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.soap.usm.ca.com", "getRequestOfferingNotes"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionID, new java.lang.Integer(requestID), new java.lang.Integer(offeringID), new java.lang.Integer(groupID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (usmRequestService.Note[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (usmRequestService.Note[]) org.apache.axis.utils.JavaUtils.convert(_resp, usmRequestService.Note[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.WebServiceException) {
              throw (usmRequestService.WebServiceException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.PropertyNotSetException) {
              throw (usmRequestService.PropertyNotSetException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.InvalidFormatException) {
              throw (usmRequestService.InvalidFormatException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.ContentAccessDeniedException) {
              throw (usmRequestService.ContentAccessDeniedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.ItemNotFoundException) {
              throw (usmRequestService.ItemNotFoundException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void submitRequest(java.lang.String sessionID, int requestID) throws java.rmi.RemoteException, usmRequestService.WebServiceException, usmRequestService.PropertyNotSetException, usmRequestService.InvalidFormatException, usmRequestService.ContentAccessDeniedException, usmRequestService.ItemNotFoundException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[71]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.soap.usm.ca.com", "submitRequest"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionID, new java.lang.Integer(requestID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.WebServiceException) {
              throw (usmRequestService.WebServiceException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.PropertyNotSetException) {
              throw (usmRequestService.PropertyNotSetException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.InvalidFormatException) {
              throw (usmRequestService.InvalidFormatException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.ContentAccessDeniedException) {
              throw (usmRequestService.ContentAccessDeniedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.ItemNotFoundException) {
              throw (usmRequestService.ItemNotFoundException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public usmRequestService.Request[] getRequests(java.lang.String sessionID) throws java.rmi.RemoteException, usmRequestService.WebServiceException, usmRequestService.PropertyNotSetException, usmRequestService.InvalidFormatException, usmRequestService.ContentAccessDeniedException, usmRequestService.ItemNotFoundException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[72]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.soap.usm.ca.com", "getRequests"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionID});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (usmRequestService.Request[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (usmRequestService.Request[]) org.apache.axis.utils.JavaUtils.convert(_resp, usmRequestService.Request[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.WebServiceException) {
              throw (usmRequestService.WebServiceException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.PropertyNotSetException) {
              throw (usmRequestService.PropertyNotSetException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.InvalidFormatException) {
              throw (usmRequestService.InvalidFormatException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.ContentAccessDeniedException) {
              throw (usmRequestService.ContentAccessDeniedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.ItemNotFoundException) {
              throw (usmRequestService.ItemNotFoundException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void deleteRequests(java.lang.String sessionID, java.lang.String[] requestIDs) throws java.rmi.RemoteException, usmRequestService.WebServiceException, usmRequestService.PropertyNotSetException, usmRequestService.InvalidFormatException, usmRequestService.ContentAccessDeniedException, usmRequestService.ItemNotFoundException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[73]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.soap.usm.ca.com", "deleteRequests"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionID, requestIDs});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.WebServiceException) {
              throw (usmRequestService.WebServiceException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.PropertyNotSetException) {
              throw (usmRequestService.PropertyNotSetException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.InvalidFormatException) {
              throw (usmRequestService.InvalidFormatException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.ContentAccessDeniedException) {
              throw (usmRequestService.ContentAccessDeniedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.ItemNotFoundException) {
              throw (usmRequestService.ItemNotFoundException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public usmRequestService.Request saveRequest(java.lang.String sessionID, java.lang.String requestData, java.lang.String requestValuesData, java.lang.String requestValuesDataType, java.lang.String addedOfferings, java.lang.String removedOfferings, java.lang.String addedItems) throws java.rmi.RemoteException, usmRequestService.WebServiceException, usmRequestService.PropertyNotSetException, usmRequestService.InvalidFormatException, usmRequestService.ContentAccessDeniedException, usmRequestService.ItemNotFoundException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[74]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.soap.usm.ca.com", "saveRequest"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionID, requestData, requestValuesData, requestValuesDataType, addedOfferings, removedOfferings, addedItems});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (usmRequestService.Request) _resp;
            } catch (java.lang.Exception _exception) {
                return (usmRequestService.Request) org.apache.axis.utils.JavaUtils.convert(_resp, usmRequestService.Request.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.WebServiceException) {
              throw (usmRequestService.WebServiceException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.PropertyNotSetException) {
              throw (usmRequestService.PropertyNotSetException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.InvalidFormatException) {
              throw (usmRequestService.InvalidFormatException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.ContentAccessDeniedException) {
              throw (usmRequestService.ContentAccessDeniedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.ItemNotFoundException) {
              throw (usmRequestService.ItemNotFoundException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void saveRequestHeader(java.lang.String sessionID, java.lang.String requestData, java.lang.String requestValuesData, java.lang.String requestValuesDataType) throws java.rmi.RemoteException, usmRequestService.WebServiceException, usmRequestService.PropertyNotSetException, usmRequestService.InvalidFormatException, usmRequestService.ContentAccessDeniedException, usmRequestService.ItemNotFoundException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[75]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.soap.usm.ca.com", "saveRequestHeader"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionID, requestData, requestValuesData, requestValuesDataType});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.WebServiceException) {
              throw (usmRequestService.WebServiceException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.PropertyNotSetException) {
              throw (usmRequestService.PropertyNotSetException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.InvalidFormatException) {
              throw (usmRequestService.InvalidFormatException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.ContentAccessDeniedException) {
              throw (usmRequestService.ContentAccessDeniedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.ItemNotFoundException) {
              throw (usmRequestService.ItemNotFoundException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void takePendingAction(java.lang.String sessionID, int requestID, int objectID, int objectGroupID) throws java.rmi.RemoteException, usmRequestService.WebServiceException, usmRequestService.PropertyNotSetException, com.ca.usm.soap.axisInterfaces.InvalidUserException, usmRequestService.InvalidFormatException, usmRequestService.ContentAccessDeniedException, usmRequestService.ItemNotFoundException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[76]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.soap.usm.ca.com", "takePendingAction"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionID, new java.lang.Integer(requestID), new java.lang.Integer(objectID), new java.lang.Integer(objectGroupID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.WebServiceException) {
              throw (usmRequestService.WebServiceException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.PropertyNotSetException) {
              throw (usmRequestService.PropertyNotSetException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ca.usm.soap.axisInterfaces.InvalidUserException) {
              throw (com.ca.usm.soap.axisInterfaces.InvalidUserException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.InvalidFormatException) {
              throw (usmRequestService.InvalidFormatException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.ContentAccessDeniedException) {
              throw (usmRequestService.ContentAccessDeniedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.ItemNotFoundException) {
              throw (usmRequestService.ItemNotFoundException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public usmRequestService.Request[] getPendingActions(java.lang.String sessionID, java.lang.String userID) throws java.rmi.RemoteException, usmRequestService.WebServiceException, usmRequestService.PropertyNotSetException, usmRequestService.InvalidFormatException, usmRequestService.ContentAccessDeniedException, usmRequestService.ItemNotFoundException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[77]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.soap.usm.ca.com", "getPendingActions"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionID, userID});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (usmRequestService.Request[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (usmRequestService.Request[]) org.apache.axis.utils.JavaUtils.convert(_resp, usmRequestService.Request[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.WebServiceException) {
              throw (usmRequestService.WebServiceException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.PropertyNotSetException) {
              throw (usmRequestService.PropertyNotSetException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.InvalidFormatException) {
              throw (usmRequestService.InvalidFormatException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.ContentAccessDeniedException) {
              throw (usmRequestService.ContentAccessDeniedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.ItemNotFoundException) {
              throw (usmRequestService.ItemNotFoundException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public usmRequestService.Request getRequestHeader(java.lang.String sessionID, int requestID) throws java.rmi.RemoteException, usmRequestService.WebServiceException, usmRequestService.PropertyNotSetException, usmRequestService.InvalidFormatException, usmRequestService.ContentAccessDeniedException, usmRequestService.ItemNotFoundException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[78]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.soap.usm.ca.com", "getRequestHeader"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionID, new java.lang.Integer(requestID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (usmRequestService.Request) _resp;
            } catch (java.lang.Exception _exception) {
                return (usmRequestService.Request) org.apache.axis.utils.JavaUtils.convert(_resp, usmRequestService.Request.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.WebServiceException) {
              throw (usmRequestService.WebServiceException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.PropertyNotSetException) {
              throw (usmRequestService.PropertyNotSetException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.InvalidFormatException) {
              throw (usmRequestService.InvalidFormatException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.ContentAccessDeniedException) {
              throw (usmRequestService.ContentAccessDeniedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.ItemNotFoundException) {
              throw (usmRequestService.ItemNotFoundException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String assignPendingAction(java.lang.String sessionID, int pendingActionType, int requestItemID, int requestItemStatus, java.lang.String pendingActionUsersOrGroups, java.lang.String pendingActionDescriptions, java.lang.String workItemID, java.lang.String processInstanceID) throws java.rmi.RemoteException, usmRequestService.WebServiceException, usmRequestService.PropertyNotSetException, usmRequestService.InvalidFormatException, usmRequestService.ContentAccessDeniedException, usmRequestService.ItemNotFoundException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[79]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.soap.usm.ca.com", "assignPendingAction"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionID, new java.lang.Integer(pendingActionType), new java.lang.Integer(requestItemID), new java.lang.Integer(requestItemStatus), pendingActionUsersOrGroups, pendingActionDescriptions, workItemID, processInstanceID});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.WebServiceException) {
              throw (usmRequestService.WebServiceException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.PropertyNotSetException) {
              throw (usmRequestService.PropertyNotSetException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.InvalidFormatException) {
              throw (usmRequestService.InvalidFormatException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.ContentAccessDeniedException) {
              throw (usmRequestService.ContentAccessDeniedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.ItemNotFoundException) {
              throw (usmRequestService.ItemNotFoundException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void returnPendingAction(java.lang.String sessionID, int requestID, int objectID, int objectGroupID) throws java.rmi.RemoteException, usmRequestService.WebServiceException, usmRequestService.PropertyNotSetException, usmRequestService.InvalidFormatException, usmRequestService.ContentAccessDeniedException, usmRequestService.ItemNotFoundException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[80]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.soap.usm.ca.com", "returnPendingAction"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionID, new java.lang.Integer(requestID), new java.lang.Integer(objectID), new java.lang.Integer(objectGroupID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.WebServiceException) {
              throw (usmRequestService.WebServiceException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.PropertyNotSetException) {
              throw (usmRequestService.PropertyNotSetException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.InvalidFormatException) {
              throw (usmRequestService.InvalidFormatException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.ContentAccessDeniedException) {
              throw (usmRequestService.ContentAccessDeniedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.ItemNotFoundException) {
              throw (usmRequestService.ItemNotFoundException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void transferPendingAction(java.lang.String sessionID, int pendingActionType, int requestItemID, java.lang.String assigneeID) throws java.rmi.RemoteException, usmRequestService.WebServiceException, usmRequestService.PropertyNotSetException, usmRequestService.InvalidFormatException, usmRequestService.ContentAccessDeniedException, usmRequestService.ItemNotFoundException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[81]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.soap.usm.ca.com", "transferPendingAction"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionID, new java.lang.Integer(pendingActionType), new java.lang.Integer(requestItemID), assigneeID});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.WebServiceException) {
              throw (usmRequestService.WebServiceException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.PropertyNotSetException) {
              throw (usmRequestService.PropertyNotSetException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.InvalidFormatException) {
              throw (usmRequestService.InvalidFormatException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.ContentAccessDeniedException) {
              throw (usmRequestService.ContentAccessDeniedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.ItemNotFoundException) {
              throw (usmRequestService.ItemNotFoundException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void transferPendingActionToUser(java.lang.String sessionID, int requestID, int objectID, int objectGroupID, java.lang.String transferToUserID) throws java.rmi.RemoteException, usmRequestService.WebServiceException, usmRequestService.PropertyNotSetException, usmRequestService.InvalidFormatException, usmRequestService.ContentAccessDeniedException, usmRequestService.ItemNotFoundException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[82]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.soap.usm.ca.com", "transferPendingActionToUser"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionID, new java.lang.Integer(requestID), new java.lang.Integer(objectID), new java.lang.Integer(objectGroupID), transferToUserID});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.WebServiceException) {
              throw (usmRequestService.WebServiceException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.PropertyNotSetException) {
              throw (usmRequestService.PropertyNotSetException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.InvalidFormatException) {
              throw (usmRequestService.InvalidFormatException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.ContentAccessDeniedException) {
              throw (usmRequestService.ContentAccessDeniedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.ItemNotFoundException) {
              throw (usmRequestService.ItemNotFoundException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void transferPendingActionToGroup(java.lang.String sessionID, int requestID, int objectID, int objectGroupID, java.lang.String transferToGroupID) throws java.rmi.RemoteException, usmRequestService.WebServiceException, usmRequestService.PropertyNotSetException, usmRequestService.InvalidFormatException, usmRequestService.ContentAccessDeniedException, usmRequestService.ItemNotFoundException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[83]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.soap.usm.ca.com", "transferPendingActionToGroup"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionID, new java.lang.Integer(requestID), new java.lang.Integer(objectID), new java.lang.Integer(objectGroupID), transferToGroupID});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.WebServiceException) {
              throw (usmRequestService.WebServiceException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.PropertyNotSetException) {
              throw (usmRequestService.PropertyNotSetException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.InvalidFormatException) {
              throw (usmRequestService.InvalidFormatException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.ContentAccessDeniedException) {
              throw (usmRequestService.ContentAccessDeniedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.ItemNotFoundException) {
              throw (usmRequestService.ItemNotFoundException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void delegatePendingActionToUser(java.lang.String sessionID, int requestID, int objectID, int objectGroupID, java.lang.String delegateToUserID) throws java.rmi.RemoteException, usmRequestService.WebServiceException, usmRequestService.PropertyNotSetException, usmRequestService.InvalidFormatException, usmRequestService.ContentAccessDeniedException, usmRequestService.ItemNotFoundException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[84]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.soap.usm.ca.com", "delegatePendingActionToUser"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionID, new java.lang.Integer(requestID), new java.lang.Integer(objectID), new java.lang.Integer(objectGroupID), delegateToUserID});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.WebServiceException) {
              throw (usmRequestService.WebServiceException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.PropertyNotSetException) {
              throw (usmRequestService.PropertyNotSetException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.InvalidFormatException) {
              throw (usmRequestService.InvalidFormatException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.ContentAccessDeniedException) {
              throw (usmRequestService.ContentAccessDeniedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.ItemNotFoundException) {
              throw (usmRequestService.ItemNotFoundException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public usmRequestService.Attachment[] getRequestAttachments(java.lang.String sessionID, int requestID) throws java.rmi.RemoteException, usmRequestService.WebServiceException, usmRequestService.PropertyNotSetException, usmRequestService.InvalidFormatException, usmRequestService.ContentAccessDeniedException, usmRequestService.ItemNotFoundException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[85]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.soap.usm.ca.com", "getRequestAttachments"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionID, new java.lang.Integer(requestID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (usmRequestService.Attachment[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (usmRequestService.Attachment[]) org.apache.axis.utils.JavaUtils.convert(_resp, usmRequestService.Attachment[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.WebServiceException) {
              throw (usmRequestService.WebServiceException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.PropertyNotSetException) {
              throw (usmRequestService.PropertyNotSetException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.InvalidFormatException) {
              throw (usmRequestService.InvalidFormatException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.ContentAccessDeniedException) {
              throw (usmRequestService.ContentAccessDeniedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof usmRequestService.ItemNotFoundException) {
              throw (usmRequestService.ItemNotFoundException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public long getMaxIdleTimeInMilliSeconds() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[86]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.soap.usm.ca.com", "getMaxIdleTimeInMilliSeconds"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Long) _resp).longValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Long) org.apache.axis.utils.JavaUtils.convert(_resp, long.class)).longValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
