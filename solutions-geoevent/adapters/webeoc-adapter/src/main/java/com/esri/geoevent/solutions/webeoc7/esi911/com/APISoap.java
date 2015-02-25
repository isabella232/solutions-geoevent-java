/**
 * APISoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.esri.geoevent.solutions.webeoc7.esi911.com;

public interface APISoap extends java.rmi.Remote {

    /**
     * Attach a file to a
     * 				WebEOC board entry.
     */
    public void addAttachment(com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials credentials, java.lang.String boardName, java.lang.String inputViewName, java.lang.String attachmentFieldName, int dataId, byte[] attachmentFileData, java.lang.String attachmentFileName) throws java.rmi.RemoteException;

    /**
     * Get a list of the WebEOC positions. Administrator access required
     */
    public java.lang.String[] getPositions(com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials credentials) throws java.rmi.RemoteException;

    /**
     * Get a list of the WebEOC positions for the authenticated user.
     */
    public java.lang.String[] getUserPositions(com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials credentials) throws java.rmi.RemoteException;

    /**
     * Get a list of the WebEOC users that belong to specific position.
     * 				Administrator access required. Raises an exception if the positions
     * 				does not exist.
     */
    public com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCUser[] getUsersByPosition(com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials credentials, java.lang.String positionName) throws java.rmi.RemoteException;

    /**
     * Get the list of positions that a user can fill. Administrator
     * access
     * 				required.
     */
    public java.lang.String[] getPositionsForUser(com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials credentials, java.lang.String userName) throws java.rmi.RemoteException;

    /**
     * Add a user to the database. Administrator access required.
     * An exception
     * 				will be raised if a user already exists with the same username.
     * If a
     * 				color value is supplied, an exception will be raised if the value
     * is
     * 				not a valid color string(6 digit hexadecimal string)
     */
    public void addUser(com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials credentials, com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCUser userToAdd, java.lang.String password) throws java.rmi.RemoteException;

    /**
     * Add a user to a position assignment. Administrator access required.
     * An
     * 				exception will be raised if the user or position does not exist
     */
    public void addUserToPosition(com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials credentials, java.lang.String userName, java.lang.String position) throws java.rmi.RemoteException;

    /**
     * Remove a user from a position assignment. Administrator access
     * required.
     * 				An exception will be raised if the user or position does not exist
     */
    public void removeUserFromPosition(com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials credentials, java.lang.String userName, java.lang.String position) throws java.rmi.RemoteException;

    /**
     * Delete a user from WebEOC. Administrator access required. An
     * exception
     * 				will be raised if the user does not exist or if the user is the
     * same
     * 				user supplied in the credentials. Returns false if the user was
     * 				unable to be deleted due to position member. Returns true if the
     * 				user was deleted
     */
    public boolean deleteUserIfNoPositions(com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials credentials, java.lang.String userName) throws java.rmi.RemoteException;

    /**
     * Delete a user from WebEOC. Administrator access required. An
     * exception
     * 				will be raised if the user does not exist or if the user is the
     * same
     * 				user supplied in the credentials or if the user is not deleteable
     * 				(WebEOC Administrator)
     */
    public void deleteUser(com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials credentials, java.lang.String userName) throws java.rmi.RemoteException;

    /**
     * Get a list of the WebEOC boards. Administrator access required
     */
    public java.lang.String[] getBoardNames(com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials credentials) throws java.rmi.RemoteException;

    /**
     * Get the list of Input views for a specific board. Administrator
     * access
     * 				required
     */
    public java.lang.String[] getInputViews(com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials credentials, java.lang.String boardName) throws java.rmi.RemoteException;

    /**
     * Get the list of Display views for a specific board. Administrator
     * 				access required
     */
    public java.lang.String[] getDisplayViews(com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials credentials, java.lang.String boardName) throws java.rmi.RemoteException;

    /**
     * Get the list of fields for a particular view. Administrator
     * access
     * 				required.
     */
    public java.lang.String[] getViewFields(com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials credentials, java.lang.String boardName, java.lang.String viewName) throws java.rmi.RemoteException;

    /**
     * Add a new entry to
     * 				a WebEOC board.
     */
    public int addData(com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials credentials, java.lang.String boardName, java.lang.String inputViewName, java.lang.String xmlData) throws java.rmi.RemoteException;

    /**
     * Update an existing
     * 				entry in a WebEOC board.
     */
    public int updateData(com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials credentials, java.lang.String boardName, java.lang.String inputViewName, java.lang.String xmlData, int dataId) throws java.rmi.RemoteException;

    /**
     * Batch method for adding/updating entires in a WebEOC board.
     */
    public int[] updateDataBatch(com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials credentials, java.lang.String boardName, java.lang.String inputViewName, java.lang.String xmlData) throws java.rmi.RemoteException;
    public int addRelatedData(com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials credentials, java.lang.String boardName, java.lang.String inputViewName, java.lang.String xmlData, java.lang.String relatedTable, int relatedDataId) throws java.rmi.RemoteException;
    public int updateRelatedData(com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials credentials, java.lang.String boardName, java.lang.String inputViewName, java.lang.String xmlData, java.lang.String relatedTable, int relatedDataId, int dataId) throws java.rmi.RemoteException;
    public java.lang.String getData(com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials credentials, java.lang.String boardName, java.lang.String displayViewName) throws java.rmi.RemoteException;
    public java.lang.String getFilteredData(com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials credentials, java.lang.String boardName, java.lang.String displayViewName, java.lang.String[] viewFilterNames, java.lang.String xmlUserFilter) throws java.rmi.RemoteException;
    public java.lang.String getFilteredDataV2(com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials credentials, java.lang.String boardName, java.lang.String displayViewName, java.lang.String[] viewFilterNames, java.lang.String xmlUserFilter, com.esri.geoevent.solutions.webeoc7.esi911.com.CustomFilter customFilter) throws java.rmi.RemoteException;

    /**
     * Get the board entries that have been added or updated since
     * UpdatedTime
     */
    public java.lang.String getUpdatedData(com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials credentials, java.lang.String boardName, java.lang.String displayViewName, java.util.Calendar updatedTime) throws java.rmi.RemoteException;
    public java.lang.String getDataByDataId(com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials credentials, java.lang.String boardName, java.lang.String displayViewName, int dataId) throws java.rmi.RemoteException;
    public java.lang.String ping(com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials credentials) throws java.rmi.RemoteException;
    public void postStandardData(com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials credentials, java.lang.String xmlStandardData) throws java.rmi.RemoteException;

    /**
     * Get the list of incidents that a specific user has access to.
     */
    public java.lang.String[] getIncidents(com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials credentials) throws java.rmi.RemoteException;

    /**
     * Add an incident to
     * 				WebEOC
     */
    public void addIncident(com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials credentials, java.lang.String incidentName, java.util.Calendar incidentDateTime, boolean _default) throws java.rmi.RemoteException;

    /**
     * Get a DataTable of lists. Administrator access required
     */
    public com.esri.geoevent.solutions.webeoc7.esi911.com.GetListsResponseGetListsResult getLists(com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials credentials) throws java.rmi.RemoteException;

    /**
     * Get a DataTable of items in a WebEOC list. Administrator access
     * 				required
     */
    public com.esri.geoevent.solutions.webeoc7.esi911.com.GetListItemsResponseGetListItemsResult getListItems(com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials credentials, int listId) throws java.rmi.RemoteException;

    /**
     * Get a DataTable of items in a WebEOC list that a specific user
     * has
     * 				access to. Administrator access required
     */
    public com.esri.geoevent.solutions.webeoc7.esi911.com.GetListItemsByListNameResponseGetListItemsByListNameResult getListItemsByListName(com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials credentials, java.lang.String listName) throws java.rmi.RemoteException;

    /**
     * Save a WebEOC list.
     * 				Administrator access required
     */
    public int saveList(com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials credentials, int listId, java.lang.String listName) throws java.rmi.RemoteException;

    /**
     * Delete a WebEOC list. Administrator access required
     */
    public void deleteList(com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials credentials, int listId) throws java.rmi.RemoteException;

    /**
     * Save a WebEOC list item. Administrator access required
     */
    public int saveListItem(com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials credentials, int listId, int listItemId, java.lang.String listItemName, java.lang.String listItemColor) throws java.rmi.RemoteException;

    /**
     * Delete a WebEOC list item. Administrator access required
     */
    public void deleteListItem(com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials credentials, int listItemId) throws java.rmi.RemoteException;
}
