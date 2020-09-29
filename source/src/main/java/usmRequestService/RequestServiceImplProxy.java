package usmRequestService;

public class RequestServiceImplProxy implements usmRequestService.RequestServiceImpl {
  private String _endpoint = null;
  private usmRequestService.RequestServiceImpl requestServiceImpl = null;
  
  public RequestServiceImplProxy() {
    _initRequestServiceImplProxy();
  }
  
  public RequestServiceImplProxy(String endpoint) {
    _endpoint = endpoint;
    _initRequestServiceImplProxy();
  }
  
  private void _initRequestServiceImplProxy() {
    try {
      requestServiceImpl = (new usmRequestService.RequestServiceImplServiceLocator()).getRequestService();
      if (requestServiceImpl != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)requestServiceImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)requestServiceImpl)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (requestServiceImpl != null)
      ((javax.xml.rpc.Stub)requestServiceImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public usmRequestService.RequestServiceImpl getRequestServiceImpl() {
    if (requestServiceImpl == null)
      _initRequestServiceImplProxy();
    return requestServiceImpl;
  }
  
  public java.lang.String logInToken(java.lang.String artifact) throws java.rmi.RemoteException, usmRequestService.WebServiceException{
    if (requestServiceImpl == null)
      _initRequestServiceImplProxy();
    return requestServiceImpl.logInToken(artifact);
  }
  
  public usmRequestService.SubscriptionDetail getRequestItem(java.lang.String sessionID, int subscriptionDetailID) throws java.rmi.RemoteException, usmRequestService.WebServiceException, usmRequestService.PropertyNotSetException, usmRequestService.InvalidFormatException, usmRequestService.ContentAccessDeniedException, usmRequestService.ItemNotFoundException{
    if (requestServiceImpl == null)
      _initRequestServiceImplProxy();
    return requestServiceImpl.getRequestItem(sessionID, subscriptionDetailID);
  }
  
  public java.lang.String logIn(java.lang.String userID, java.lang.String password, java.lang.String businessunit) throws java.rmi.RemoteException, usmRequestService.WebServiceException{
    if (requestServiceImpl == null)
      _initRequestServiceImplProxy();
    return requestServiceImpl.logIn(userID, password, businessunit);
  }
  
  public void addProcessInstance(java.lang.String sessionID, int requestID, int subscriptionDetailID, java.lang.String processInstanceID) throws java.rmi.RemoteException, usmRequestService.WebServiceException, usmRequestService.PropertyNotSetException, usmRequestService.InvalidFormatException, usmRequestService.ContentAccessDeniedException, usmRequestService.ItemNotFoundException{
    if (requestServiceImpl == null)
      _initRequestServiceImplProxy();
    requestServiceImpl.addProcessInstance(sessionID, requestID, subscriptionDetailID, processInstanceID);
  }
  
  public java.lang.String getSystemFormValue(java.lang.String sessionID, int requestID, java.lang.String formFieldName) throws java.rmi.RemoteException, usmRequestService.WebServiceException, usmRequestService.ContentAccessDeniedException, usmRequestService.ItemNotFoundException{
    if (requestServiceImpl == null)
      _initRequestServiceImplProxy();
    return requestServiceImpl.getSystemFormValue(sessionID, requestID, formFieldName);
  }
  
  public usmRequestService.SubscriptionDetail[] getRequestItemRow(java.lang.String sessionID, int subscriptionDetailID) throws java.rmi.RemoteException, usmRequestService.WebServiceException, usmRequestService.ContentAccessDeniedException, usmRequestService.ItemNotFoundException{
    if (requestServiceImpl == null)
      _initRequestServiceImplProxy();
    return requestServiceImpl.getRequestItemRow(sessionID, subscriptionDetailID);
  }
  
  public void saveRequestItems(java.lang.String sessionID, int requestID, java.lang.String addedOfferings, java.lang.String removedOfferings, java.lang.String addedItems) throws java.rmi.RemoteException, usmRequestService.WebServiceException, usmRequestService.PropertyNotSetException, usmRequestService.InvalidFormatException, usmRequestService.ContentAccessDeniedException, usmRequestService.ItemNotFoundException{
    if (requestServiceImpl == null)
      _initRequestServiceImplProxy();
    requestServiceImpl.saveRequestItems(sessionID, requestID, addedOfferings, removedOfferings, addedItems);
  }
  
  public usmRequestService.Request addRequestWithForm(java.lang.String sessionID, java.lang.String requestData, java.lang.String requestValuesData, java.lang.String requestValuesDataType, java.lang.String addedOfferings, java.lang.String addedItems, java.lang.String formValuesData) throws java.rmi.RemoteException, usmRequestService.WebServiceException, usmRequestService.PropertyNotSetException, usmRequestService.InvalidFormatException, usmRequestService.ContentAccessDeniedException, usmRequestService.ItemNotFoundException{
    if (requestServiceImpl == null)
      _initRequestServiceImplProxy();
    return requestServiceImpl.addRequestWithForm(sessionID, requestData, requestValuesData, requestValuesDataType, addedOfferings, addedItems, formValuesData);
  }
  
  public void unsetProxy(java.lang.String sessionID) throws java.rmi.RemoteException, usmRequestService.WebServiceException, usmRequestService.ContentAccessDeniedException{
    if (requestServiceImpl == null)
      _initRequestServiceImplProxy();
    requestServiceImpl.unsetProxy(sessionID);
  }
  
  public java.lang.String getPendingActionAssigneesByRequestItemID(java.lang.String sessionID, int requestItemID) throws java.rmi.RemoteException, usmRequestService.WebServiceException, usmRequestService.PropertyNotSetException, usmRequestService.InvalidFormatException, usmRequestService.ContentAccessDeniedException, usmRequestService.ItemNotFoundException{
    if (requestServiceImpl == null)
      _initRequestServiceImplProxy();
    return requestServiceImpl.getPendingActionAssigneesByRequestItemID(sessionID, requestItemID);
  }
  
  public void addProcessInstanceToRequestItemOffering(java.lang.String sessionID, int requestID, int subscriptionDetailID, java.lang.String processInstanceID) throws java.rmi.RemoteException, usmRequestService.WebServiceException, usmRequestService.PropertyNotSetException, usmRequestService.InvalidFormatException, usmRequestService.ContentAccessDeniedException, usmRequestService.ItemNotFoundException{
    if (requestServiceImpl == null)
      _initRequestServiceImplProxy();
    requestServiceImpl.addProcessInstanceToRequestItemOffering(sessionID, requestID, subscriptionDetailID, processInstanceID);
  }
  
  public void updateReservationRequestStatusAndId(java.lang.String sessionId, int requestItemId, int status, java.lang.String extReservationId) throws java.rmi.RemoteException, usmRequestService.WebServiceException, usmRequestService.ContentAccessDeniedException, usmRequestService.ItemNotFoundException{
    if (requestServiceImpl == null)
      _initRequestServiceImplProxy();
    requestServiceImpl.updateReservationRequestStatusAndId(sessionId, requestItemId, status, extReservationId);
  }
  
  public void logOut(java.lang.String sessionID) throws java.rmi.RemoteException{
    if (requestServiceImpl == null)
      _initRequestServiceImplProxy();
    requestServiceImpl.logOut(sessionID);
  }
  
  public void setProxy(java.lang.String sessionID, java.lang.String proxyUserId, java.lang.String proxyDomainId) throws java.rmi.RemoteException, usmRequestService.WebServiceException, usmRequestService.ContentAccessDeniedException, usmRequestService.ItemNotFoundException{
    if (requestServiceImpl == null)
      _initRequestServiceImplProxy();
    requestServiceImpl.setProxy(sessionID, proxyUserId, proxyDomainId);
  }
  
  public usmRequestService.Note[] getRequestLevelNotes(java.lang.String sessionID, int requestID) throws java.rmi.RemoteException, usmRequestService.WebServiceException, usmRequestService.PropertyNotSetException, usmRequestService.InvalidFormatException, usmRequestService.ContentAccessDeniedException, usmRequestService.ItemNotFoundException{
    if (requestServiceImpl == null)
      _initRequestServiceImplProxy();
    return requestServiceImpl.getRequestLevelNotes(sessionID, requestID);
  }
  
  public usmRequestService.RequestResourceItem[] getRequestResources(java.lang.String sessionId, int requestItemId) throws java.rmi.RemoteException, usmRequestService.WebServiceException, usmRequestService.ContentAccessDeniedException, usmRequestService.ItemNotFoundException{
    if (requestServiceImpl == null)
      _initRequestServiceImplProxy();
    return requestServiceImpl.getRequestResources(sessionId, requestItemId);
  }
  
  public usmRequestService.Request[] getRequestsByFilter(java.lang.String sessionID, usmRequestService.FilterBean[] filterBeanArr) throws java.rmi.RemoteException, usmRequestService.WebServiceException{
    if (requestServiceImpl == null)
      _initRequestServiceImplProxy();
    return requestServiceImpl.getRequestsByFilter(sessionID, filterBeanArr);
  }
  
  public usmRequestService.TicketRequestItem[] getTicketFromRequestItem(java.lang.String sessionID, java.lang.String persid, java.lang.String refNum, int requestItemID, int requestID) throws java.rmi.RemoteException, usmRequestService.WebServiceException, usmRequestService.PropertyNotSetException, usmRequestService.InvalidFormatException, usmRequestService.ContentAccessDeniedException, usmRequestService.ItemNotFoundException{
    if (requestServiceImpl == null)
      _initRequestServiceImplProxy();
    return requestServiceImpl.getTicketFromRequestItem(sessionID, persid, refNum, requestItemID, requestID);
  }
  
  public usmRequestService.Request[] getRequestsByUserID(java.lang.String sessionID, java.lang.String userID) throws java.rmi.RemoteException, usmRequestService.WebServiceException, usmRequestService.PropertyNotSetException, usmRequestService.InvalidFormatException, usmRequestService.ContentAccessDeniedException, usmRequestService.ItemNotFoundException{
    if (requestServiceImpl == null)
      _initRequestServiceImplProxy();
    return requestServiceImpl.getRequestsByUserID(sessionID, userID);
  }
  
  public int getRequestItemStatus(java.lang.String sessionID, int subscriptionDetailID) throws java.rmi.RemoteException, usmRequestService.WebServiceException, usmRequestService.PropertyNotSetException, usmRequestService.InvalidFormatException, usmRequestService.ContentAccessDeniedException, usmRequestService.ItemNotFoundException{
    if (requestServiceImpl == null)
      _initRequestServiceImplProxy();
    return requestServiceImpl.getRequestItemStatus(sessionID, subscriptionDetailID);
  }
  
  public int getSubscriptionDetailIDForForm(java.lang.String sessionID, java.lang.String formName, int requestID, int offeringID, int groupID) throws java.rmi.RemoteException, usmRequestService.WebServiceException, usmRequestService.PropertyNotSetException, usmRequestService.InvalidFormatException, usmRequestService.ContentAccessDeniedException, usmRequestService.ItemNotFoundException{
    if (requestServiceImpl == null)
      _initRequestServiceImplProxy();
    return requestServiceImpl.getSubscriptionDetailIDForForm(sessionID, formName, requestID, offeringID, groupID);
  }
  
  public usmRequestService.RequestResourceItem addResourceToRequestItem(java.lang.String sessionId, int requestItemId, usmRequestService.RequestResourceItem resourceItem) throws java.rmi.RemoteException, usmRequestService.WebServiceException, usmRequestService.ContentAccessDeniedException, usmRequestService.ItemNotFoundException{
    if (requestServiceImpl == null)
      _initRequestServiceImplProxy();
    return requestServiceImpl.addResourceToRequestItem(sessionId, requestItemId, resourceItem);
  }
  
  public void removeResourceFromRequestItem(java.lang.String sessionId, int requestItemId, java.lang.String resourceItemId) throws java.rmi.RemoteException, usmRequestService.WebServiceException, usmRequestService.ContentAccessDeniedException, usmRequestService.ItemNotFoundException{
    if (requestServiceImpl == null)
      _initRequestServiceImplProxy();
    requestServiceImpl.removeResourceFromRequestItem(sessionId, requestItemId, resourceItemId);
  }
  
  public boolean oblicoreEventHandler(java.lang.String sessionID, java.lang.String eventType, java.lang.Object[] eventData, java.lang.String user, java.util.Calendar date) throws java.rmi.RemoteException, usmRequestService.WebServiceException, usmRequestService.PropertyNotSetException, usmRequestService.InvalidFormatException, usmRequestService.ContentAccessDeniedException, usmRequestService.ItemNotFoundException{
    if (requestServiceImpl == null)
      _initRequestServiceImplProxy();
    return requestServiceImpl.oblicoreEventHandler(sessionID, eventType, eventData, user, date);
  }
  
  public usmRequestService.RequestResourceItem updateRequestResource(java.lang.String sessionId, usmRequestService.RequestResourceItem resourceItem) throws java.rmi.RemoteException, usmRequestService.WebServiceException, usmRequestService.ItemNotFoundException, usmRequestService.ContentAccessDeniedException{
    if (requestServiceImpl == null)
      _initRequestServiceImplProxy();
    return requestServiceImpl.updateRequestResource(sessionId, resourceItem);
  }
  
  public void updateReservationEndDate(java.lang.String sessionId, java.lang.String endDate, java.lang.String reservationId) throws java.rmi.RemoteException, usmRequestService.WebServiceException, usmRequestService.ContentAccessDeniedException, usmRequestService.ItemNotFoundException{
    if (requestServiceImpl == null)
      _initRequestServiceImplProxy();
    requestServiceImpl.updateReservationEndDate(sessionId, endDate, reservationId);
  }
  
  public void addTicketToRequestItem(java.lang.String sessionID, java.lang.String persid, java.lang.String refNum, int requestItemID, int requestID) throws java.rmi.RemoteException, usmRequestService.WebServiceException, usmRequestService.PropertyNotSetException, usmRequestService.InvalidFormatException, usmRequestService.ContentAccessDeniedException, usmRequestService.ItemNotFoundException{
    if (requestServiceImpl == null)
      _initRequestServiceImplProxy();
    requestServiceImpl.addTicketToRequestItem(sessionID, persid, refNum, requestItemID, requestID);
  }
  
  public void addAttachmentLinkToSubscription(java.lang.String sessionId, java.lang.String attachmentId, java.lang.String attachmentFileName, java.lang.String attachmentDesc, java.lang.String attachmentLink, java.lang.String attachmentTimeStamp, int sourceTypeId, java.lang.String sourceObjId, java.lang.String userId) throws java.rmi.RemoteException, usmRequestService.WebServiceException{
    if (requestServiceImpl == null)
      _initRequestServiceImplProxy();
    requestServiceImpl.addAttachmentLinkToSubscription(sessionId, attachmentId, attachmentFileName, attachmentDesc, attachmentLink, attachmentTimeStamp, sourceTypeId, sourceObjId, userId);
  }
  
  public void addProcessInstanceToRequest(java.lang.String sessionID, int requestID, java.lang.String processInstanceID) throws java.rmi.RemoteException, usmRequestService.WebServiceException, usmRequestService.PropertyNotSetException, usmRequestService.InvalidFormatException, usmRequestService.ContentAccessDeniedException, usmRequestService.ItemNotFoundException{
    if (requestServiceImpl == null)
      _initRequestServiceImplProxy();
    requestServiceImpl.addProcessInstanceToRequest(sessionID, requestID, processInstanceID);
  }
  
  public usmRequestService.Request[] getRequestsByAccountID(java.lang.String sessionID, java.lang.String accountID) throws java.rmi.RemoteException, usmRequestService.WebServiceException, usmRequestService.PropertyNotSetException, usmRequestService.InvalidFormatException, usmRequestService.ContentAccessDeniedException, usmRequestService.ItemNotFoundException{
    if (requestServiceImpl == null)
      _initRequestServiceImplProxy();
    return requestServiceImpl.getRequestsByAccountID(sessionID, accountID);
  }
  
  public void updateRequestItemStatus(java.lang.String sessionID, int pendingActionType, int requestItemID, int status) throws java.rmi.RemoteException, usmRequestService.WebServiceException, usmRequestService.PropertyNotSetException, usmRequestService.InvalidFormatException, usmRequestService.ContentAccessDeniedException, usmRequestService.ItemNotFoundException{
    if (requestServiceImpl == null)
      _initRequestServiceImplProxy();
    requestServiceImpl.updateRequestItemStatus(sessionID, pendingActionType, requestItemID, status);
  }
  
  public usmRequestService.Asset[] getAssetUUIDByRequestItemID(java.lang.String sessionID, int subscriptionDetailID) throws java.rmi.RemoteException, usmRequestService.WebServiceException, usmRequestService.PropertyNotSetException, usmRequestService.InvalidFormatException, usmRequestService.ContentAccessDeniedException, usmRequestService.ItemNotFoundException{
    if (requestServiceImpl == null)
      _initRequestServiceImplProxy();
    return requestServiceImpl.getAssetUUIDByRequestItemID(sessionID, subscriptionDetailID);
  }
  
  public usmRequestService.FormElement[] getSystemFormValues(java.lang.String sessionID, int requestID) throws java.rmi.RemoteException, usmRequestService.WebServiceException, usmRequestService.ContentAccessDeniedException, usmRequestService.ItemNotFoundException{
    if (requestServiceImpl == null)
      _initRequestServiceImplProxy();
    return requestServiceImpl.getSystemFormValues(sessionID, requestID);
  }
  
  public void addAttachmentToRequestItemWithPath(java.lang.String sessionID, int requestID, int subscriptionDetailID, java.lang.String attachmentName, java.lang.String attachmentDescription, java.lang.String attachmentPath) throws java.rmi.RemoteException, usmRequestService.WebServiceException, usmRequestService.PropertyNotSetException, usmRequestService.InvalidFormatException, usmRequestService.ContentAccessDeniedException, usmRequestService.ItemNotFoundException{
    if (requestServiceImpl == null)
      _initRequestServiceImplProxy();
    requestServiceImpl.addAttachmentToRequestItemWithPath(sessionID, requestID, subscriptionDetailID, attachmentName, attachmentDescription, attachmentPath);
  }
  
  public usmRequestService.RateItemModel[] getModelUUIDByRequestItemID(java.lang.String sessionID, int requestItemID) throws java.rmi.RemoteException, usmRequestService.WebServiceException, usmRequestService.PropertyNotSetException, usmRequestService.InvalidFormatException, usmRequestService.ContentAccessDeniedException, usmRequestService.ItemNotFoundException{
    if (requestServiceImpl == null)
      _initRequestServiceImplProxy();
    return requestServiceImpl.getModelUUIDByRequestItemID(sessionID, requestItemID);
  }
  
  public usmRequestService.Attachment[] getRequestItemAttachments(java.lang.String sessionID, int subscriptionDetailID) throws java.rmi.RemoteException, usmRequestService.WebServiceException, usmRequestService.PropertyNotSetException, usmRequestService.InvalidFormatException, usmRequestService.ContentAccessDeniedException, usmRequestService.ItemNotFoundException{
    if (requestServiceImpl == null)
      _initRequestServiceImplProxy();
    return requestServiceImpl.getRequestItemAttachments(sessionID, subscriptionDetailID);
  }
  
  public usmRequestService.Attachment[] getRequestLevelAttachments(java.lang.String sessionID, int requestID) throws java.rmi.RemoteException, usmRequestService.WebServiceException, usmRequestService.PropertyNotSetException, usmRequestService.InvalidFormatException, usmRequestService.ContentAccessDeniedException, usmRequestService.ItemNotFoundException{
    if (requestServiceImpl == null)
      _initRequestServiceImplProxy();
    return requestServiceImpl.getRequestLevelAttachments(sessionID, requestID);
  }
  
  public void editRequestAttachmentDetails(java.lang.String sessionID, int requestID, java.lang.String attachmentID, java.lang.String attachmentName, java.lang.String attachmentDescription) throws java.rmi.RemoteException, usmRequestService.WebServiceException, usmRequestService.PropertyNotSetException, usmRequestService.InvalidFormatException, usmRequestService.ContentAccessDeniedException, usmRequestService.ItemNotFoundException{
    if (requestServiceImpl == null)
      _initRequestServiceImplProxy();
    requestServiceImpl.editRequestAttachmentDetails(sessionID, requestID, attachmentID, attachmentName, attachmentDescription);
  }
  
  public int getRequestOfferingStatus(java.lang.String sessionID, int requestID, int offeringID, int groupID) throws java.rmi.RemoteException, usmRequestService.WebServiceException, usmRequestService.PropertyNotSetException, usmRequestService.InvalidFormatException, usmRequestService.ContentAccessDeniedException, usmRequestService.ItemNotFoundException{
    if (requestServiceImpl == null)
      _initRequestServiceImplProxy();
    return requestServiceImpl.getRequestOfferingStatus(sessionID, requestID, offeringID, groupID);
  }
  
  public void unassignModelUUIDFromRateItem(java.lang.String sessionID, int rateItemID, java.lang.String modelUUID) throws java.rmi.RemoteException, usmRequestService.WebServiceException, usmRequestService.ContentAccessDeniedException, usmRequestService.ItemNotFoundException{
    if (requestServiceImpl == null)
      _initRequestServiceImplProxy();
    requestServiceImpl.unassignModelUUIDFromRateItem(sessionID, rateItemID, modelUUID);
  }
  
  public void removeRequestAttachment(java.lang.String sessionID, int requestID, java.lang.String attachmentID) throws java.rmi.RemoteException, usmRequestService.WebServiceException, usmRequestService.PropertyNotSetException, usmRequestService.InvalidFormatException, usmRequestService.ContentAccessDeniedException, usmRequestService.ItemNotFoundException{
    if (requestServiceImpl == null)
      _initRequestServiceImplProxy();
    requestServiceImpl.removeRequestAttachment(sessionID, requestID, attachmentID);
  }
  
  public usmRequestService.RateItemModel[] getModelUUIDByRateItemID(java.lang.String sessionID, int rateItemID) throws java.rmi.RemoteException, usmRequestService.WebServiceException, usmRequestService.PropertyNotSetException, usmRequestService.InvalidFormatException, usmRequestService.ContentAccessDeniedException, usmRequestService.ItemNotFoundException{
    if (requestServiceImpl == null)
      _initRequestServiceImplProxy();
    return requestServiceImpl.getModelUUIDByRateItemID(sessionID, rateItemID);
  }
  
  public java.lang.String[] getPendingActionsForRequest(java.lang.String sessionID, int requestID) throws java.rmi.RemoteException, usmRequestService.WebServiceException, usmRequestService.PropertyNotSetException, usmRequestService.InvalidFormatException, usmRequestService.ContentAccessDeniedException, usmRequestService.ItemNotFoundException{
    if (requestServiceImpl == null)
      _initRequestServiceImplProxy();
    return requestServiceImpl.getPendingActionsForRequest(sessionID, requestID);
  }
  
  public void addWorkflowPendingAction(java.lang.String sessionID, int requestID, int objectType, int objectID, int objectGroupID, java.lang.String workItemID, java.lang.String processInstanceID, java.lang.String userID) throws java.rmi.RemoteException, usmRequestService.WebServiceException, usmRequestService.PropertyNotSetException, usmRequestService.InvalidFormatException, usmRequestService.ContentAccessDeniedException, usmRequestService.ItemNotFoundException{
    if (requestServiceImpl == null)
      _initRequestServiceImplProxy();
    requestServiceImpl.addWorkflowPendingAction(sessionID, requestID, objectType, objectID, objectGroupID, workItemID, processInstanceID, userID);
  }
  
  public void assignAssetUUIDToRequestItem(java.lang.String sessionID, int requestItemID, java.lang.String assetUUID) throws java.rmi.RemoteException, usmRequestService.WebServiceException, usmRequestService.ContentAccessDeniedException, usmRequestService.ItemNotFoundException{
    if (requestServiceImpl == null)
      _initRequestServiceImplProxy();
    requestServiceImpl.assignAssetUUIDToRequestItem(sessionID, requestItemID, assetUUID);
  }
  
  public int assignPolicyBasedPendingActions(java.lang.String sessionID, int requestID, int levelNo, int pendingActionType, int requestItemID, int requestItemStatus, java.lang.String workItemID, java.lang.String processInstanceID) throws java.rmi.RemoteException, usmRequestService.WebServiceException{
    if (requestServiceImpl == null)
      _initRequestServiceImplProxy();
    return requestServiceImpl.assignPolicyBasedPendingActions(sessionID, requestID, levelNo, pendingActionType, requestItemID, requestItemStatus, workItemID, processInstanceID);
  }
  
  public void addProcessInstanceToRequestItem(java.lang.String sessionID, int requestID, int subscriptionDetailID, java.lang.String processInstanceID) throws java.rmi.RemoteException, usmRequestService.WebServiceException, usmRequestService.PropertyNotSetException, usmRequestService.InvalidFormatException, usmRequestService.ContentAccessDeniedException, usmRequestService.ItemNotFoundException{
    if (requestServiceImpl == null)
      _initRequestServiceImplProxy();
    requestServiceImpl.addProcessInstanceToRequestItem(sessionID, requestID, subscriptionDetailID, processInstanceID);
  }
  
  public void addRequestAttachmentWithPath(java.lang.String sessionID, int requestID, java.lang.String attachmentName, java.lang.String attachmentDescription, java.lang.String attachmentPath) throws java.rmi.RemoteException, usmRequestService.WebServiceException, usmRequestService.PropertyNotSetException, usmRequestService.InvalidFormatException, usmRequestService.ContentAccessDeniedException, usmRequestService.ItemNotFoundException{
    if (requestServiceImpl == null)
      _initRequestServiceImplProxy();
    requestServiceImpl.addRequestAttachmentWithPath(sessionID, requestID, attachmentName, attachmentDescription, attachmentPath);
  }
  
  public usmRequestService.Asset[] getAssetUUIDByRequestID(java.lang.String sessionID, int requestID) throws java.rmi.RemoteException, usmRequestService.WebServiceException, usmRequestService.PropertyNotSetException, usmRequestService.InvalidFormatException, usmRequestService.ContentAccessDeniedException, usmRequestService.ItemNotFoundException{
    if (requestServiceImpl == null)
      _initRequestServiceImplProxy();
    return requestServiceImpl.getAssetUUIDByRequestID(sessionID, requestID);
  }
  
  public void addWorkflowPendingActionWithDesc(java.lang.String sessionID, int requestID, int objectType, int objectID, int objectGroupID, java.lang.String workItemID, java.lang.String processInstanceID, java.lang.String userID, java.lang.String description) throws java.rmi.RemoteException, usmRequestService.WebServiceException, usmRequestService.PropertyNotSetException, usmRequestService.InvalidFormatException, usmRequestService.ContentAccessDeniedException, usmRequestService.ItemNotFoundException{
    if (requestServiceImpl == null)
      _initRequestServiceImplProxy();
    requestServiceImpl.addWorkflowPendingActionWithDesc(sessionID, requestID, objectType, objectID, objectGroupID, workItemID, processInstanceID, userID, description);
  }
  
  public void unassignAssetUUIDFromRequestItem(java.lang.String sessionID, int requestItemID, java.lang.String assetUUID) throws java.rmi.RemoteException, usmRequestService.WebServiceException, usmRequestService.ContentAccessDeniedException, usmRequestService.ItemNotFoundException{
    if (requestServiceImpl == null)
      _initRequestServiceImplProxy();
    requestServiceImpl.unassignAssetUUIDFromRequestItem(sessionID, requestItemID, assetUUID);
  }
  
  public void assignModelUUIDToRateItem(java.lang.String sessionID, int rateItemID, java.lang.String modelUUID) throws java.rmi.RemoteException, usmRequestService.WebServiceException, usmRequestService.ContentAccessDeniedException, usmRequestService.ItemNotFoundException{
    if (requestServiceImpl == null)
      _initRequestServiceImplProxy();
    requestServiceImpl.assignModelUUIDToRateItem(sessionID, rateItemID, modelUUID);
  }
  
  public usmRequestService.RequestRelationship[] getRequestRelationships(java.lang.String sessionID, usmRequestService.FilterBean[] filterBeanArr) throws java.rmi.RemoteException, usmRequestService.WebServiceException{
    if (requestServiceImpl == null)
      _initRequestServiceImplProxy();
    return requestServiceImpl.getRequestRelationships(sessionID, filterBeanArr);
  }
  
  public java.lang.String getDefaultUserForRequestActions(java.lang.String sessionID, java.lang.String businessunit) throws java.rmi.RemoteException, usmRequestService.WebServiceException, usmRequestService.PropertyNotSetException, usmRequestService.InvalidFormatException, usmRequestService.ContentAccessDeniedException, usmRequestService.ItemNotFoundException{
    if (requestServiceImpl == null)
      _initRequestServiceImplProxy();
    return requestServiceImpl.getDefaultUserForRequestActions(sessionID, businessunit);
  }
  
  public usmRequestService.Note[] getRequestNotes(java.lang.String sessionID, int requestID) throws java.rmi.RemoteException, usmRequestService.WebServiceException, usmRequestService.PropertyNotSetException, usmRequestService.InvalidFormatException, usmRequestService.ContentAccessDeniedException, usmRequestService.ItemNotFoundException{
    if (requestServiceImpl == null)
      _initRequestServiceImplProxy();
    return requestServiceImpl.getRequestNotes(sessionID, requestID);
  }
  
  public void addRequestNote(java.lang.String sessionID, int requestID, java.lang.String noteText, int noteType) throws java.rmi.RemoteException, usmRequestService.WebServiceException, usmRequestService.PropertyNotSetException, usmRequestService.InvalidFormatException, usmRequestService.ContentAccessDeniedException, usmRequestService.ItemNotFoundException{
    if (requestServiceImpl == null)
      _initRequestServiceImplProxy();
    requestServiceImpl.addRequestNote(sessionID, requestID, noteText, noteType);
  }
  
  public usmRequestService.SubscriptionDetail[] getRequestItems(java.lang.String sessionID, int requestID) throws java.rmi.RemoteException, usmRequestService.WebServiceException, usmRequestService.ContentAccessDeniedException, usmRequestService.ItemNotFoundException{
    if (requestServiceImpl == null)
      _initRequestServiceImplProxy();
    return requestServiceImpl.getRequestItems(sessionID, requestID);
  }
  
  public boolean sendRequestEmail(java.lang.String sessionID, int requestId, boolean includeRequestDetails, java.lang.String emailFromAddress, java.lang.String emailFromName, java.lang.String emailTo, java.lang.String emailCC, java.lang.String emailBCC, java.lang.String emailSubject, java.lang.String emailMessage) throws java.rmi.RemoteException, usmRequestService.WebServiceException, usmRequestService.ItemNotFoundException, usmRequestService.ContentAccessDeniedException{
    if (requestServiceImpl == null)
      _initRequestServiceImplProxy();
    return requestServiceImpl.sendRequestEmail(sessionID, requestId, includeRequestDetails, emailFromAddress, emailFromName, emailTo, emailCC, emailBCC, emailSubject, emailMessage);
  }
  
  public usmRequestService.FormItem saveRequestForm(java.lang.String sessionID, int subscriptionDetailID, java.lang.String formValuesData) throws java.rmi.RemoteException, usmRequestService.WebServiceException, usmRequestService.PropertyNotSetException, usmRequestService.InvalidFormatException, usmRequestService.ContentAccessDeniedException, usmRequestService.ItemNotFoundException{
    if (requestServiceImpl == null)
      _initRequestServiceImplProxy();
    return requestServiceImpl.saveRequestForm(sessionID, subscriptionDetailID, formValuesData);
  }
  
  public void cancelRequest(java.lang.String sessionID, int requestID) throws java.rmi.RemoteException, usmRequestService.WebServiceException, usmRequestService.PropertyNotSetException, usmRequestService.InvalidFormatException, usmRequestService.ContentAccessDeniedException, usmRequestService.ItemNotFoundException{
    if (requestServiceImpl == null)
      _initRequestServiceImplProxy();
    requestServiceImpl.cancelRequest(sessionID, requestID);
  }
  
  public usmRequestService.FormItem getFormRateItemValues(java.lang.String sessionID, int subscriptionDetailID) throws java.rmi.RemoteException, usmRequestService.WebServiceException, usmRequestService.PropertyNotSetException, usmRequestService.InvalidFormatException, usmRequestService.ContentAccessDeniedException, usmRequestService.ItemNotFoundException{
    if (requestServiceImpl == null)
      _initRequestServiceImplProxy();
    return requestServiceImpl.getFormRateItemValues(sessionID, subscriptionDetailID);
  }
  
  public void addRequestItemNote(java.lang.String sessionID, int subscriptionDetailID, java.lang.String noteText, int noteType) throws java.rmi.RemoteException, usmRequestService.WebServiceException, usmRequestService.PropertyNotSetException, usmRequestService.InvalidFormatException, usmRequestService.ContentAccessDeniedException, usmRequestService.ItemNotFoundException{
    if (requestServiceImpl == null)
      _initRequestServiceImplProxy();
    requestServiceImpl.addRequestItemNote(sessionID, subscriptionDetailID, noteText, noteType);
  }
  
  public int getRequestStatus(java.lang.String sessionID, int requestID) throws java.rmi.RemoteException, usmRequestService.WebServiceException, usmRequestService.PropertyNotSetException, usmRequestService.InvalidFormatException, usmRequestService.ContentAccessDeniedException, usmRequestService.ItemNotFoundException{
    if (requestServiceImpl == null)
      _initRequestServiceImplProxy();
    return requestServiceImpl.getRequestStatus(sessionID, requestID);
  }
  
  public void updateRequestStatus(java.lang.String sessionID, int requestID, int status) throws java.rmi.RemoteException, usmRequestService.WebServiceException, usmRequestService.PropertyNotSetException, usmRequestService.InvalidFormatException, usmRequestService.ContentAccessDeniedException, usmRequestService.ItemNotFoundException{
    if (requestServiceImpl == null)
      _initRequestServiceImplProxy();
    requestServiceImpl.updateRequestStatus(sessionID, requestID, status);
  }
  
  public void updateRequestItemRowStatus(java.lang.String sessionID, int subscriptionDetailID, int status) throws java.rmi.RemoteException, usmRequestService.WebServiceException, usmRequestService.PropertyNotSetException, usmRequestService.InvalidFormatException, usmRequestService.ContentAccessDeniedException, usmRequestService.ItemNotFoundException{
    if (requestServiceImpl == null)
      _initRequestServiceImplProxy();
    requestServiceImpl.updateRequestItemRowStatus(sessionID, subscriptionDetailID, status);
  }
  
  public void updateRequestOfferingStatus(java.lang.String sessionID, int requestID, int offeringID, int groupID, int status) throws java.rmi.RemoteException, usmRequestService.WebServiceException, usmRequestService.PropertyNotSetException, usmRequestService.InvalidFormatException, usmRequestService.ContentAccessDeniedException, usmRequestService.ItemNotFoundException{
    if (requestServiceImpl == null)
      _initRequestServiceImplProxy();
    requestServiceImpl.updateRequestOfferingStatus(sessionID, requestID, offeringID, groupID, status);
  }
  
  public java.lang.String getFormRateItemValue(java.lang.String sessionID, int subscriptionDetailID, java.lang.String formRateItemName) throws java.rmi.RemoteException, usmRequestService.WebServiceException, usmRequestService.ContentAccessDeniedException, usmRequestService.ItemNotFoundException{
    if (requestServiceImpl == null)
      _initRequestServiceImplProxy();
    return requestServiceImpl.getFormRateItemValue(sessionID, subscriptionDetailID, formRateItemName);
  }
  
  public java.lang.String getPrimaryServiceDesk(java.lang.String sessionID) throws java.rmi.RemoteException, usmRequestService.WebServiceException, usmRequestService.PropertyNotSetException, usmRequestService.InvalidFormatException, usmRequestService.ContentAccessDeniedException, usmRequestService.ItemNotFoundException{
    if (requestServiceImpl == null)
      _initRequestServiceImplProxy();
    return requestServiceImpl.getPrimaryServiceDesk(sessionID);
  }
  
  public usmRequestService.Note[] getRequestItemNotes(java.lang.String sessionID, int subscriptionDetailID) throws java.rmi.RemoteException, usmRequestService.WebServiceException, usmRequestService.PropertyNotSetException, usmRequestService.InvalidFormatException, usmRequestService.ContentAccessDeniedException, usmRequestService.ItemNotFoundException{
    if (requestServiceImpl == null)
      _initRequestServiceImplProxy();
    return requestServiceImpl.getRequestItemNotes(sessionID, subscriptionDetailID);
  }
  
  public void addRequestOfferingNote(java.lang.String sessionID, int requestID, int offeringID, int groupID, java.lang.String noteText, int noteType) throws java.rmi.RemoteException, usmRequestService.WebServiceException, usmRequestService.PropertyNotSetException, usmRequestService.InvalidFormatException, usmRequestService.ContentAccessDeniedException, usmRequestService.ItemNotFoundException{
    if (requestServiceImpl == null)
      _initRequestServiceImplProxy();
    requestServiceImpl.addRequestOfferingNote(sessionID, requestID, offeringID, groupID, noteText, noteType);
  }
  
  public usmRequestService.Note[] getRequestOfferingNotes(java.lang.String sessionID, int requestID, int offeringID, int groupID) throws java.rmi.RemoteException, usmRequestService.WebServiceException, usmRequestService.PropertyNotSetException, usmRequestService.InvalidFormatException, usmRequestService.ContentAccessDeniedException, usmRequestService.ItemNotFoundException{
    if (requestServiceImpl == null)
      _initRequestServiceImplProxy();
    return requestServiceImpl.getRequestOfferingNotes(sessionID, requestID, offeringID, groupID);
  }
  
  public void submitRequest(java.lang.String sessionID, int requestID) throws java.rmi.RemoteException, usmRequestService.WebServiceException, usmRequestService.PropertyNotSetException, usmRequestService.InvalidFormatException, usmRequestService.ContentAccessDeniedException, usmRequestService.ItemNotFoundException{
    if (requestServiceImpl == null)
      _initRequestServiceImplProxy();
    requestServiceImpl.submitRequest(sessionID, requestID);
  }
  
  public usmRequestService.Request[] getRequests(java.lang.String sessionID) throws java.rmi.RemoteException, usmRequestService.WebServiceException, usmRequestService.PropertyNotSetException, usmRequestService.InvalidFormatException, usmRequestService.ContentAccessDeniedException, usmRequestService.ItemNotFoundException{
    if (requestServiceImpl == null)
      _initRequestServiceImplProxy();
    return requestServiceImpl.getRequests(sessionID);
  }
  
  public void deleteRequests(java.lang.String sessionID, java.lang.String[] requestIDs) throws java.rmi.RemoteException, usmRequestService.WebServiceException, usmRequestService.PropertyNotSetException, usmRequestService.InvalidFormatException, usmRequestService.ContentAccessDeniedException, usmRequestService.ItemNotFoundException{
    if (requestServiceImpl == null)
      _initRequestServiceImplProxy();
    requestServiceImpl.deleteRequests(sessionID, requestIDs);
  }
  
  public usmRequestService.Request saveRequest(java.lang.String sessionID, java.lang.String requestData, java.lang.String requestValuesData, java.lang.String requestValuesDataType, java.lang.String addedOfferings, java.lang.String removedOfferings, java.lang.String addedItems) throws java.rmi.RemoteException, usmRequestService.WebServiceException, usmRequestService.PropertyNotSetException, usmRequestService.InvalidFormatException, usmRequestService.ContentAccessDeniedException, usmRequestService.ItemNotFoundException{
    if (requestServiceImpl == null)
      _initRequestServiceImplProxy();
    return requestServiceImpl.saveRequest(sessionID, requestData, requestValuesData, requestValuesDataType, addedOfferings, removedOfferings, addedItems);
  }
  
  public void saveRequestHeader(java.lang.String sessionID, java.lang.String requestData, java.lang.String requestValuesData, java.lang.String requestValuesDataType) throws java.rmi.RemoteException, usmRequestService.WebServiceException, usmRequestService.PropertyNotSetException, usmRequestService.InvalidFormatException, usmRequestService.ContentAccessDeniedException, usmRequestService.ItemNotFoundException{
    if (requestServiceImpl == null)
      _initRequestServiceImplProxy();
    requestServiceImpl.saveRequestHeader(sessionID, requestData, requestValuesData, requestValuesDataType);
  }
  
  public void takePendingAction(java.lang.String sessionID, int requestID, int objectID, int objectGroupID) throws java.rmi.RemoteException, usmRequestService.WebServiceException, usmRequestService.PropertyNotSetException, com.ca.usm.soap.axisInterfaces.InvalidUserException, usmRequestService.InvalidFormatException, usmRequestService.ContentAccessDeniedException, usmRequestService.ItemNotFoundException{
    if (requestServiceImpl == null)
      _initRequestServiceImplProxy();
    requestServiceImpl.takePendingAction(sessionID, requestID, objectID, objectGroupID);
  }
  
  public usmRequestService.Request[] getPendingActions(java.lang.String sessionID, java.lang.String userID) throws java.rmi.RemoteException, usmRequestService.WebServiceException, usmRequestService.PropertyNotSetException, usmRequestService.InvalidFormatException, usmRequestService.ContentAccessDeniedException, usmRequestService.ItemNotFoundException{
    if (requestServiceImpl == null)
      _initRequestServiceImplProxy();
    return requestServiceImpl.getPendingActions(sessionID, userID);
  }
  
  public usmRequestService.Request getRequestHeader(java.lang.String sessionID, int requestID) throws java.rmi.RemoteException, usmRequestService.WebServiceException, usmRequestService.PropertyNotSetException, usmRequestService.InvalidFormatException, usmRequestService.ContentAccessDeniedException, usmRequestService.ItemNotFoundException{
    if (requestServiceImpl == null)
      _initRequestServiceImplProxy();
    return requestServiceImpl.getRequestHeader(sessionID, requestID);
  }
  
  public java.lang.String assignPendingAction(java.lang.String sessionID, int pendingActionType, int requestItemID, int requestItemStatus, java.lang.String pendingActionUsersOrGroups, java.lang.String pendingActionDescriptions, java.lang.String workItemID, java.lang.String processInstanceID) throws java.rmi.RemoteException, usmRequestService.WebServiceException, usmRequestService.PropertyNotSetException, usmRequestService.InvalidFormatException, usmRequestService.ContentAccessDeniedException, usmRequestService.ItemNotFoundException{
    if (requestServiceImpl == null)
      _initRequestServiceImplProxy();
    return requestServiceImpl.assignPendingAction(sessionID, pendingActionType, requestItemID, requestItemStatus, pendingActionUsersOrGroups, pendingActionDescriptions, workItemID, processInstanceID);
  }
  
  public void returnPendingAction(java.lang.String sessionID, int requestID, int objectID, int objectGroupID) throws java.rmi.RemoteException, usmRequestService.WebServiceException, usmRequestService.PropertyNotSetException, usmRequestService.InvalidFormatException, usmRequestService.ContentAccessDeniedException, usmRequestService.ItemNotFoundException{
    if (requestServiceImpl == null)
      _initRequestServiceImplProxy();
    requestServiceImpl.returnPendingAction(sessionID, requestID, objectID, objectGroupID);
  }
  
  public void transferPendingAction(java.lang.String sessionID, int pendingActionType, int requestItemID, java.lang.String assigneeID) throws java.rmi.RemoteException, usmRequestService.WebServiceException, usmRequestService.PropertyNotSetException, usmRequestService.InvalidFormatException, usmRequestService.ContentAccessDeniedException, usmRequestService.ItemNotFoundException{
    if (requestServiceImpl == null)
      _initRequestServiceImplProxy();
    requestServiceImpl.transferPendingAction(sessionID, pendingActionType, requestItemID, assigneeID);
  }
  
  public void transferPendingActionToUser(java.lang.String sessionID, int requestID, int objectID, int objectGroupID, java.lang.String transferToUserID) throws java.rmi.RemoteException, usmRequestService.WebServiceException, usmRequestService.PropertyNotSetException, usmRequestService.InvalidFormatException, usmRequestService.ContentAccessDeniedException, usmRequestService.ItemNotFoundException{
    if (requestServiceImpl == null)
      _initRequestServiceImplProxy();
    requestServiceImpl.transferPendingActionToUser(sessionID, requestID, objectID, objectGroupID, transferToUserID);
  }
  
  public void transferPendingActionToGroup(java.lang.String sessionID, int requestID, int objectID, int objectGroupID, java.lang.String transferToGroupID) throws java.rmi.RemoteException, usmRequestService.WebServiceException, usmRequestService.PropertyNotSetException, usmRequestService.InvalidFormatException, usmRequestService.ContentAccessDeniedException, usmRequestService.ItemNotFoundException{
    if (requestServiceImpl == null)
      _initRequestServiceImplProxy();
    requestServiceImpl.transferPendingActionToGroup(sessionID, requestID, objectID, objectGroupID, transferToGroupID);
  }
  
  public void delegatePendingActionToUser(java.lang.String sessionID, int requestID, int objectID, int objectGroupID, java.lang.String delegateToUserID) throws java.rmi.RemoteException, usmRequestService.WebServiceException, usmRequestService.PropertyNotSetException, usmRequestService.InvalidFormatException, usmRequestService.ContentAccessDeniedException, usmRequestService.ItemNotFoundException{
    if (requestServiceImpl == null)
      _initRequestServiceImplProxy();
    requestServiceImpl.delegatePendingActionToUser(sessionID, requestID, objectID, objectGroupID, delegateToUserID);
  }
  
  public usmRequestService.Attachment[] getRequestAttachments(java.lang.String sessionID, int requestID) throws java.rmi.RemoteException, usmRequestService.WebServiceException, usmRequestService.PropertyNotSetException, usmRequestService.InvalidFormatException, usmRequestService.ContentAccessDeniedException, usmRequestService.ItemNotFoundException{
    if (requestServiceImpl == null)
      _initRequestServiceImplProxy();
    return requestServiceImpl.getRequestAttachments(sessionID, requestID);
  }
  
  public long getMaxIdleTimeInMilliSeconds() throws java.rmi.RemoteException{
    if (requestServiceImpl == null)
      _initRequestServiceImplProxy();
    return requestServiceImpl.getMaxIdleTimeInMilliSeconds();
  }
  
  
}