/**
 * RequestServiceImplService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package usmRequestService;

public interface RequestServiceImplService extends javax.xml.rpc.Service {
    public java.lang.String getRequestServiceAddress();

    public usmRequestService.RequestServiceImpl getRequestService() throws javax.xml.rpc.ServiceException;

    public usmRequestService.RequestServiceImpl getRequestService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
