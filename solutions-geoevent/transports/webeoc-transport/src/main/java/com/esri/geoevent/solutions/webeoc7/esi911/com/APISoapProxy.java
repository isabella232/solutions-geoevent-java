package com.esri.geoevent.solutions.webeoc7.esi911.com;

public class APISoapProxy implements com.esri.geoevent.solutions.webeoc7.esi911.com.APISoap {
  private String _endpoint = null;
  private com.esri.geoevent.solutions.webeoc7.esi911.com.APISoap aPISoap = null;
  
  public APISoapProxy() {
    _initAPISoapProxy();
  }
  
  public APISoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initAPISoapProxy();
  }
  
  private void _initAPISoapProxy() {
    try {
      aPISoap = (new com.esri.geoevent.solutions.webeoc7.esi911.com.APILocator()).getAPISoap();
      if (aPISoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)aPISoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)aPISoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (aPISoap != null)
      ((javax.xml.rpc.Stub)aPISoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.esri.geoevent.solutions.webeoc7.esi911.com.APISoap getAPISoap() {
    if (aPISoap == null)
      _initAPISoapProxy();
    return aPISoap;
  }
  
  public void addAttachment(com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials credentials, java.lang.String boardName, java.lang.String inputViewName, java.lang.String attachmentFieldName, int dataId, byte[] attachmentFileData, java.lang.String attachmentFileName) throws java.rmi.RemoteException{
    if (aPISoap == null)
      _initAPISoapProxy();
    aPISoap.addAttachment(credentials, boardName, inputViewName, attachmentFieldName, dataId, attachmentFileData, attachmentFileName);
  }
  
  public java.lang.String[] getPositions(com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials credentials) throws java.rmi.RemoteException{
    if (aPISoap == null)
      _initAPISoapProxy();
    return aPISoap.getPositions(credentials);
  }
  
  public java.lang.String[] getUserPositions(com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials credentials) throws java.rmi.RemoteException{
    if (aPISoap == null)
      _initAPISoapProxy();
    return aPISoap.getUserPositions(credentials);
  }
  
  public com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCUser[] getUsersByPosition(com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials credentials, java.lang.String positionName) throws java.rmi.RemoteException{
    if (aPISoap == null)
      _initAPISoapProxy();
    return aPISoap.getUsersByPosition(credentials, positionName);
  }
  
  public java.lang.String[] getPositionsForUser(com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials credentials, java.lang.String userName) throws java.rmi.RemoteException{
    if (aPISoap == null)
      _initAPISoapProxy();
    return aPISoap.getPositionsForUser(credentials, userName);
  }
  
  public void addUser(com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials credentials, com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCUser userToAdd, java.lang.String password) throws java.rmi.RemoteException{
    if (aPISoap == null)
      _initAPISoapProxy();
    aPISoap.addUser(credentials, userToAdd, password);
  }
  
  public void addUserToPosition(com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials credentials, java.lang.String userName, java.lang.String position) throws java.rmi.RemoteException{
    if (aPISoap == null)
      _initAPISoapProxy();
    aPISoap.addUserToPosition(credentials, userName, position);
  }
  
  public void removeUserFromPosition(com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials credentials, java.lang.String userName, java.lang.String position) throws java.rmi.RemoteException{
    if (aPISoap == null)
      _initAPISoapProxy();
    aPISoap.removeUserFromPosition(credentials, userName, position);
  }
  
  public boolean deleteUserIfNoPositions(com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials credentials, java.lang.String userName) throws java.rmi.RemoteException{
    if (aPISoap == null)
      _initAPISoapProxy();
    return aPISoap.deleteUserIfNoPositions(credentials, userName);
  }
  
  public void deleteUser(com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials credentials, java.lang.String userName) throws java.rmi.RemoteException{
    if (aPISoap == null)
      _initAPISoapProxy();
    aPISoap.deleteUser(credentials, userName);
  }
  
  public java.lang.String[] getBoardNames(com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials credentials) throws java.rmi.RemoteException{
    if (aPISoap == null)
      _initAPISoapProxy();
    return aPISoap.getBoardNames(credentials);
  }
  
  public java.lang.String[] getInputViews(com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials credentials, java.lang.String boardName) throws java.rmi.RemoteException{
    if (aPISoap == null)
      _initAPISoapProxy();
    return aPISoap.getInputViews(credentials, boardName);
  }
  
  public java.lang.String[] getDisplayViews(com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials credentials, java.lang.String boardName) throws java.rmi.RemoteException{
    if (aPISoap == null)
      _initAPISoapProxy();
    return aPISoap.getDisplayViews(credentials, boardName);
  }
  
  public java.lang.String[] getViewFields(com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials credentials, java.lang.String boardName, java.lang.String viewName) throws java.rmi.RemoteException{
    if (aPISoap == null)
      _initAPISoapProxy();
    return aPISoap.getViewFields(credentials, boardName, viewName);
  }
  
  public int addData(com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials credentials, java.lang.String boardName, java.lang.String inputViewName, java.lang.String xmlData) throws java.rmi.RemoteException{
    if (aPISoap == null)
      _initAPISoapProxy();
    return aPISoap.addData(credentials, boardName, inputViewName, xmlData);
  }
  
  public int updateData(com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials credentials, java.lang.String boardName, java.lang.String inputViewName, java.lang.String xmlData, int dataId) throws java.rmi.RemoteException{
    if (aPISoap == null)
      _initAPISoapProxy();
    return aPISoap.updateData(credentials, boardName, inputViewName, xmlData, dataId);
  }
  
  public int[] updateDataBatch(com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials credentials, java.lang.String boardName, java.lang.String inputViewName, java.lang.String xmlData) throws java.rmi.RemoteException{
    if (aPISoap == null)
      _initAPISoapProxy();
    return aPISoap.updateDataBatch(credentials, boardName, inputViewName, xmlData);
  }
  
  public int addRelatedData(com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials credentials, java.lang.String boardName, java.lang.String inputViewName, java.lang.String xmlData, java.lang.String relatedTable, int relatedDataId) throws java.rmi.RemoteException{
    if (aPISoap == null)
      _initAPISoapProxy();
    return aPISoap.addRelatedData(credentials, boardName, inputViewName, xmlData, relatedTable, relatedDataId);
  }
  
  public int updateRelatedData(com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials credentials, java.lang.String boardName, java.lang.String inputViewName, java.lang.String xmlData, java.lang.String relatedTable, int relatedDataId, int dataId) throws java.rmi.RemoteException{
    if (aPISoap == null)
      _initAPISoapProxy();
    return aPISoap.updateRelatedData(credentials, boardName, inputViewName, xmlData, relatedTable, relatedDataId, dataId);
  }
  
  public java.lang.String getData(com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials credentials, java.lang.String boardName, java.lang.String displayViewName) throws java.rmi.RemoteException{
    if (aPISoap == null)
      _initAPISoapProxy();
    return aPISoap.getData(credentials, boardName, displayViewName);
  }
  
  public java.lang.String getFilteredData(com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials credentials, java.lang.String boardName, java.lang.String displayViewName, java.lang.String[] viewFilterNames, java.lang.String xmlUserFilter) throws java.rmi.RemoteException{
    if (aPISoap == null)
      _initAPISoapProxy();
    return aPISoap.getFilteredData(credentials, boardName, displayViewName, viewFilterNames, xmlUserFilter);
  }
  
  public java.lang.String getFilteredDataV2(com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials credentials, java.lang.String boardName, java.lang.String displayViewName, java.lang.String[] viewFilterNames, java.lang.String xmlUserFilter, com.esri.geoevent.solutions.webeoc7.esi911.com.CustomFilter customFilter) throws java.rmi.RemoteException{
    if (aPISoap == null)
      _initAPISoapProxy();
    return aPISoap.getFilteredDataV2(credentials, boardName, displayViewName, viewFilterNames, xmlUserFilter, customFilter);
  }
  
  public java.lang.String getUpdatedData(com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials credentials, java.lang.String boardName, java.lang.String displayViewName, java.util.Calendar updatedTime) throws java.rmi.RemoteException{
    if (aPISoap == null)
      _initAPISoapProxy();
    return aPISoap.getUpdatedData(credentials, boardName, displayViewName, updatedTime);
  }
  
  public java.lang.String getDataByDataId(com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials credentials, java.lang.String boardName, java.lang.String displayViewName, int dataId) throws java.rmi.RemoteException{
    if (aPISoap == null)
      _initAPISoapProxy();
    return aPISoap.getDataByDataId(credentials, boardName, displayViewName, dataId);
  }
  
  public java.lang.String ping(com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials credentials) throws java.rmi.RemoteException{
    if (aPISoap == null)
      _initAPISoapProxy();
    return aPISoap.ping(credentials);
  }
  
  public void postStandardData(com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials credentials, java.lang.String xmlStandardData) throws java.rmi.RemoteException{
    if (aPISoap == null)
      _initAPISoapProxy();
    aPISoap.postStandardData(credentials, xmlStandardData);
  }
  
  public java.lang.String[] getIncidents(com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials credentials) throws java.rmi.RemoteException{
    if (aPISoap == null)
      _initAPISoapProxy();
    return aPISoap.getIncidents(credentials);
  }
  
  public void addIncident(com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials credentials, java.lang.String incidentName, java.util.Calendar incidentDateTime, boolean _default) throws java.rmi.RemoteException{
    if (aPISoap == null)
      _initAPISoapProxy();
    aPISoap.addIncident(credentials, incidentName, incidentDateTime, _default);
  }
  
  public com.esri.geoevent.solutions.webeoc7.esi911.com.GetListsResponseGetListsResult getLists(com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials credentials) throws java.rmi.RemoteException{
    if (aPISoap == null)
      _initAPISoapProxy();
    return aPISoap.getLists(credentials);
  }
  
  public com.esri.geoevent.solutions.webeoc7.esi911.com.GetListItemsResponseGetListItemsResult getListItems(com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials credentials, int listId) throws java.rmi.RemoteException{
    if (aPISoap == null)
      _initAPISoapProxy();
    return aPISoap.getListItems(credentials, listId);
  }
  
  public com.esri.geoevent.solutions.webeoc7.esi911.com.GetListItemsByListNameResponseGetListItemsByListNameResult getListItemsByListName(com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials credentials, java.lang.String listName) throws java.rmi.RemoteException{
    if (aPISoap == null)
      _initAPISoapProxy();
    return aPISoap.getListItemsByListName(credentials, listName);
  }
  
  public int saveList(com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials credentials, int listId, java.lang.String listName) throws java.rmi.RemoteException{
    if (aPISoap == null)
      _initAPISoapProxy();
    return aPISoap.saveList(credentials, listId, listName);
  }
  
  public void deleteList(com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials credentials, int listId) throws java.rmi.RemoteException{
    if (aPISoap == null)
      _initAPISoapProxy();
    aPISoap.deleteList(credentials, listId);
  }
  
  public int saveListItem(com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials credentials, int listId, int listItemId, java.lang.String listItemName, java.lang.String listItemColor) throws java.rmi.RemoteException{
    if (aPISoap == null)
      _initAPISoapProxy();
    return aPISoap.saveListItem(credentials, listId, listItemId, listItemName, listItemColor);
  }
  
  public void deleteListItem(com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials credentials, int listItemId) throws java.rmi.RemoteException{
    if (aPISoap == null)
      _initAPISoapProxy();
    aPISoap.deleteListItem(credentials, listItemId);
  }
  
  
}