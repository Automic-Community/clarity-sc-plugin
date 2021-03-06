/**
 * RequestServiceImplServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package usmRequestService;

public class RequestServiceImplServiceLocator extends org.apache.axis.client.Service implements usmRequestService.RequestServiceImplService {

    public RequestServiceImplServiceLocator() {
    }


    public RequestServiceImplServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public RequestServiceImplServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for RequestService
    private java.lang.String RequestService_address; /*"http://10.243.47.45:8089/usm/services/RequestService";*/

    public java.lang.String getRequestServiceAddress() {
        return RequestService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String RequestServiceWSDDServiceName = "RequestService";

    public java.lang.String getRequestServiceWSDDServiceName() {
        return RequestServiceWSDDServiceName;
    }

    public void setRequestServiceWSDDServiceName(java.lang.String name) {
        RequestServiceWSDDServiceName = name;
    }

    public usmRequestService.RequestServiceImpl getRequestService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(RequestService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getRequestService(endpoint);
    }

    public usmRequestService.RequestServiceImpl getRequestService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            usmRequestService.RequestServiceSoapBindingStub _stub = new usmRequestService.RequestServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getRequestServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setRequestServiceEndpointAddress(java.lang.String address) {
        RequestService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (usmRequestService.RequestServiceImpl.class.isAssignableFrom(serviceEndpointInterface)) {
                usmRequestService.RequestServiceSoapBindingStub _stub = new usmRequestService.RequestServiceSoapBindingStub(new java.net.URL(RequestService_address), this);
                _stub.setPortName(getRequestServiceWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("RequestService".equals(inputPortName)) {
            return getRequestService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:usmRequestService", "RequestServiceImplService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:usmRequestService", "RequestService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("RequestService".equals(portName)) {
            setRequestServiceEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
