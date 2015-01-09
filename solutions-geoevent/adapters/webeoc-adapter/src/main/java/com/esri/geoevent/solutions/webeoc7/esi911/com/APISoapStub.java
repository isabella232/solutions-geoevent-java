/**
 * APISoapStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.esri.geoevent.solutions.webeoc7.esi911.com;

public class APISoapStub extends org.apache.axis.client.Stub implements com.esri.geoevent.solutions.webeoc7.esi911.com.APISoap {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[35];
        _initOperationDesc1();
        _initOperationDesc2();
        _initOperationDesc3();
        _initOperationDesc4();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AddAttachment");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "credentials"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "WebEOCCredentials"), com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "BoardName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "InputViewName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "AttachmentFieldName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "DataId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "AttachmentFileData"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"), byte[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "AttachmentFileName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetPositions");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "credentials"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "WebEOCCredentials"), com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "ArrayOfString"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "GetPositionsResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "string"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetUserPositions");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "credentials"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "WebEOCCredentials"), com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "ArrayOfString"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "GetUserPositionsResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "string"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetUsersByPosition");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "credentials"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "WebEOCCredentials"), com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "PositionName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "ArrayOfWebEOCUser"));
        oper.setReturnClass(com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCUser[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "GetUsersByPositionResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "WebEOCUser"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetPositionsForUser");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "credentials"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "WebEOCCredentials"), com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "UserName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "ArrayOfString"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "GetPositionsForUserResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "string"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AddUser");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "credentials"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "WebEOCCredentials"), com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "UserToAdd"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "WebEOCUser"), com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCUser.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "Password"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AddUserToPosition");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "credentials"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "WebEOCCredentials"), com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "UserName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "Position"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("RemoveUserFromPosition");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "credentials"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "WebEOCCredentials"), com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "UserName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "Position"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DeleteUserIfNoPositions");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "credentials"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "WebEOCCredentials"), com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "UserName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "DeleteUserIfNoPositionsResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DeleteUser");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "credentials"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "WebEOCCredentials"), com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "UserName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetBoardNames");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "credentials"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "WebEOCCredentials"), com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "ArrayOfString"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "GetBoardNamesResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "string"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetInputViews");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "credentials"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "WebEOCCredentials"), com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "BoardName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "ArrayOfString"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "GetInputViewsResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "string"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetDisplayViews");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "credentials"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "WebEOCCredentials"), com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "BoardName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "ArrayOfString"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "GetDisplayViewsResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "string"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetViewFields");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "credentials"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "WebEOCCredentials"), com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "BoardName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "ViewName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "ArrayOfString"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "GetViewFieldsResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "string"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AddData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "credentials"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "WebEOCCredentials"), com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "BoardName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "InputViewName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "XmlData"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "AddDataResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UpdateData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "credentials"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "WebEOCCredentials"), com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "BoardName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "InputViewName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "XmlData"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "DataId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "UpdateDataResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UpdateDataBatch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "credentials"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "WebEOCCredentials"), com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "BoardName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "InputViewName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "XmlData"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "ArrayOfInt"));
        oper.setReturnClass(int[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "UpdateDataBatchResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "int"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AddRelatedData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "credentials"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "WebEOCCredentials"), com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "BoardName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "InputViewName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "XmlData"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "RelatedTable"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "RelatedDataId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "AddRelatedDataResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UpdateRelatedData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "credentials"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "WebEOCCredentials"), com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "BoardName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "InputViewName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "XmlData"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "RelatedTable"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "RelatedDataId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "DataId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "UpdateRelatedDataResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "credentials"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "WebEOCCredentials"), com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "BoardName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "DisplayViewName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "GetDataResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[19] = oper;

    }

    private static void _initOperationDesc3(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetFilteredData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "credentials"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "WebEOCCredentials"), com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "BoardName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "DisplayViewName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "ViewFilterNames"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "ArrayOfString"), java.lang.String[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "string"));
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "XmlUserFilter"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "GetFilteredDataResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[20] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetFilteredDataV2");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "credentials"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "WebEOCCredentials"), com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "BoardName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "DisplayViewName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "ViewFilterNames"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "ArrayOfString"), java.lang.String[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "string"));
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "XmlUserFilter"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "CustomFilter"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "CustomFilter"), com.esri.geoevent.solutions.webeoc7.esi911.com.CustomFilter.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "GetFilteredDataV2Result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[21] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetUpdatedData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "credentials"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "WebEOCCredentials"), com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "BoardName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "DisplayViewName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "UpdatedTime"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "GetUpdatedDataResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[22] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetDataByDataId");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "credentials"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "WebEOCCredentials"), com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "BoardName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "DisplayViewName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "DataId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "GetDataByDataIdResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[23] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Ping");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "credentials"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "WebEOCCredentials"), com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "PingResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[24] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("PostStandardData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "credentials"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "WebEOCCredentials"), com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "XmlStandardData"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[25] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetIncidents");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "credentials"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "WebEOCCredentials"), com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "ArrayOfString"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "GetIncidentsResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "string"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[26] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AddIncident");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "credentials"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "WebEOCCredentials"), com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "IncidentName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "IncidentDateTime"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "Default"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[27] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetLists");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "credentials"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "WebEOCCredentials"), com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", ">>GetListsResponse>GetListsResult"));
        oper.setReturnClass(com.esri.geoevent.solutions.webeoc7.esi911.com.GetListsResponseGetListsResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "GetListsResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[28] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetListItems");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "credentials"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "WebEOCCredentials"), com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "listId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", ">>GetListItemsResponse>GetListItemsResult"));
        oper.setReturnClass(com.esri.geoevent.solutions.webeoc7.esi911.com.GetListItemsResponseGetListItemsResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "GetListItemsResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[29] = oper;

    }

    private static void _initOperationDesc4(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetListItemsByListName");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "credentials"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "WebEOCCredentials"), com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "listName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", ">>GetListItemsByListNameResponse>GetListItemsByListNameResult"));
        oper.setReturnClass(com.esri.geoevent.solutions.webeoc7.esi911.com.GetListItemsByListNameResponseGetListItemsByListNameResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "GetListItemsByListNameResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[30] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SaveList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "credentials"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "WebEOCCredentials"), com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "listId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "listName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "SaveListResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[31] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DeleteList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "credentials"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "WebEOCCredentials"), com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "listId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[32] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SaveListItem");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "credentials"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "WebEOCCredentials"), com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "listId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "listItemId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "listItemName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "listItemColor"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "SaveListItemResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[33] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DeleteListItem");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "credentials"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "WebEOCCredentials"), com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "listItemId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[34] = oper;

    }

    public APISoapStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public APISoapStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public APISoapStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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
            qName = new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", ">>GetListItemsByListNameResponse>GetListItemsByListNameResult");
            cachedSerQNames.add(qName);
            cls = com.esri.geoevent.solutions.webeoc7.esi911.com.GetListItemsByListNameResponseGetListItemsByListNameResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", ">>GetListItemsResponse>GetListItemsResult");
            cachedSerQNames.add(qName);
            cls = com.esri.geoevent.solutions.webeoc7.esi911.com.GetListItemsResponseGetListItemsResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", ">>GetListsResponse>GetListsResult");
            cachedSerQNames.add(qName);
            cls = com.esri.geoevent.solutions.webeoc7.esi911.com.GetListsResponseGetListsResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", ">AddAttachment");
            cachedSerQNames.add(qName);
            cls = com.esri.geoevent.solutions.webeoc7.esi911.com.AddAttachment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", ">AddAttachmentResponse");
            cachedSerQNames.add(qName);
            cls = com.esri.geoevent.solutions.webeoc7.esi911.com.AddAttachmentResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", ">AddData");
            cachedSerQNames.add(qName);
            cls = com.esri.geoevent.solutions.webeoc7.esi911.com.AddData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", ">AddDataResponse");
            cachedSerQNames.add(qName);
            cls = com.esri.geoevent.solutions.webeoc7.esi911.com.AddDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", ">AddIncident");
            cachedSerQNames.add(qName);
            cls = com.esri.geoevent.solutions.webeoc7.esi911.com.AddIncident.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", ">AddIncidentResponse");
            cachedSerQNames.add(qName);
            cls = com.esri.geoevent.solutions.webeoc7.esi911.com.AddIncidentResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", ">AddRelatedData");
            cachedSerQNames.add(qName);
            cls = com.esri.geoevent.solutions.webeoc7.esi911.com.AddRelatedData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", ">AddRelatedDataResponse");
            cachedSerQNames.add(qName);
            cls = com.esri.geoevent.solutions.webeoc7.esi911.com.AddRelatedDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", ">AddUser");
            cachedSerQNames.add(qName);
            cls = com.esri.geoevent.solutions.webeoc7.esi911.com.AddUser.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", ">AddUserResponse");
            cachedSerQNames.add(qName);
            cls = com.esri.geoevent.solutions.webeoc7.esi911.com.AddUserResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", ">AddUserToPosition");
            cachedSerQNames.add(qName);
            cls = com.esri.geoevent.solutions.webeoc7.esi911.com.AddUserToPosition.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", ">AddUserToPositionResponse");
            cachedSerQNames.add(qName);
            cls = com.esri.geoevent.solutions.webeoc7.esi911.com.AddUserToPositionResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", ">DeleteList");
            cachedSerQNames.add(qName);
            cls = com.esri.geoevent.solutions.webeoc7.esi911.com.DeleteList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", ">DeleteListItem");
            cachedSerQNames.add(qName);
            cls = com.esri.geoevent.solutions.webeoc7.esi911.com.DeleteListItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", ">DeleteListItemResponse");
            cachedSerQNames.add(qName);
            cls = com.esri.geoevent.solutions.webeoc7.esi911.com.DeleteListItemResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", ">DeleteListResponse");
            cachedSerQNames.add(qName);
            cls = com.esri.geoevent.solutions.webeoc7.esi911.com.DeleteListResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", ">DeleteUser");
            cachedSerQNames.add(qName);
            cls = com.esri.geoevent.solutions.webeoc7.esi911.com.DeleteUser.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", ">DeleteUserIfNoPositions");
            cachedSerQNames.add(qName);
            cls = com.esri.geoevent.solutions.webeoc7.esi911.com.DeleteUserIfNoPositions.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", ">DeleteUserIfNoPositionsResponse");
            cachedSerQNames.add(qName);
            cls = com.esri.geoevent.solutions.webeoc7.esi911.com.DeleteUserIfNoPositionsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", ">DeleteUserResponse");
            cachedSerQNames.add(qName);
            cls = com.esri.geoevent.solutions.webeoc7.esi911.com.DeleteUserResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", ">GetBoardNames");
            cachedSerQNames.add(qName);
            cls = com.esri.geoevent.solutions.webeoc7.esi911.com.GetBoardNames.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", ">GetBoardNamesResponse");
            cachedSerQNames.add(qName);
            cls = com.esri.geoevent.solutions.webeoc7.esi911.com.GetBoardNamesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", ">GetData");
            cachedSerQNames.add(qName);
            cls = com.esri.geoevent.solutions.webeoc7.esi911.com.GetData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", ">GetDataByDataId");
            cachedSerQNames.add(qName);
            cls = com.esri.geoevent.solutions.webeoc7.esi911.com.GetDataByDataId.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", ">GetDataByDataIdResponse");
            cachedSerQNames.add(qName);
            cls = com.esri.geoevent.solutions.webeoc7.esi911.com.GetDataByDataIdResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", ">GetDataResponse");
            cachedSerQNames.add(qName);
            cls = com.esri.geoevent.solutions.webeoc7.esi911.com.GetDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", ">GetDisplayViews");
            cachedSerQNames.add(qName);
            cls = com.esri.geoevent.solutions.webeoc7.esi911.com.GetDisplayViews.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", ">GetDisplayViewsResponse");
            cachedSerQNames.add(qName);
            cls = com.esri.geoevent.solutions.webeoc7.esi911.com.GetDisplayViewsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", ">GetFilteredData");
            cachedSerQNames.add(qName);
            cls = com.esri.geoevent.solutions.webeoc7.esi911.com.GetFilteredData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", ">GetFilteredDataResponse");
            cachedSerQNames.add(qName);
            cls = com.esri.geoevent.solutions.webeoc7.esi911.com.GetFilteredDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", ">GetFilteredDataV2");
            cachedSerQNames.add(qName);
            cls = com.esri.geoevent.solutions.webeoc7.esi911.com.GetFilteredDataV2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", ">GetFilteredDataV2Response");
            cachedSerQNames.add(qName);
            cls = com.esri.geoevent.solutions.webeoc7.esi911.com.GetFilteredDataV2Response.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", ">GetIncidents");
            cachedSerQNames.add(qName);
            cls = com.esri.geoevent.solutions.webeoc7.esi911.com.GetIncidents.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", ">GetIncidentsResponse");
            cachedSerQNames.add(qName);
            cls = com.esri.geoevent.solutions.webeoc7.esi911.com.GetIncidentsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", ">GetInputViews");
            cachedSerQNames.add(qName);
            cls = com.esri.geoevent.solutions.webeoc7.esi911.com.GetInputViews.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", ">GetInputViewsResponse");
            cachedSerQNames.add(qName);
            cls = com.esri.geoevent.solutions.webeoc7.esi911.com.GetInputViewsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", ">GetListItems");
            cachedSerQNames.add(qName);
            cls = com.esri.geoevent.solutions.webeoc7.esi911.com.GetListItems.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", ">GetListItemsByListName");
            cachedSerQNames.add(qName);
            cls = com.esri.geoevent.solutions.webeoc7.esi911.com.GetListItemsByListName.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", ">GetListItemsByListNameResponse");
            cachedSerQNames.add(qName);
            cls = com.esri.geoevent.solutions.webeoc7.esi911.com.GetListItemsByListNameResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", ">GetListItemsResponse");
            cachedSerQNames.add(qName);
            cls = com.esri.geoevent.solutions.webeoc7.esi911.com.GetListItemsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", ">GetLists");
            cachedSerQNames.add(qName);
            cls = com.esri.geoevent.solutions.webeoc7.esi911.com.GetLists.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", ">GetListsResponse");
            cachedSerQNames.add(qName);
            cls = com.esri.geoevent.solutions.webeoc7.esi911.com.GetListsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", ">GetPositions");
            cachedSerQNames.add(qName);
            cls = com.esri.geoevent.solutions.webeoc7.esi911.com.GetPositions.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", ">GetPositionsForUser");
            cachedSerQNames.add(qName);
            cls = com.esri.geoevent.solutions.webeoc7.esi911.com.GetPositionsForUser.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", ">GetPositionsForUserResponse");
            cachedSerQNames.add(qName);
            cls = com.esri.geoevent.solutions.webeoc7.esi911.com.GetPositionsForUserResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", ">GetPositionsResponse");
            cachedSerQNames.add(qName);
            cls = com.esri.geoevent.solutions.webeoc7.esi911.com.GetPositionsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", ">GetUpdatedData");
            cachedSerQNames.add(qName);
            cls = com.esri.geoevent.solutions.webeoc7.esi911.com.GetUpdatedData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", ">GetUpdatedDataResponse");
            cachedSerQNames.add(qName);
            cls = com.esri.geoevent.solutions.webeoc7.esi911.com.GetUpdatedDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", ">GetUserPositions");
            cachedSerQNames.add(qName);
            cls = com.esri.geoevent.solutions.webeoc7.esi911.com.GetUserPositions.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", ">GetUserPositionsResponse");
            cachedSerQNames.add(qName);
            cls = com.esri.geoevent.solutions.webeoc7.esi911.com.GetUserPositionsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", ">GetUsersByPosition");
            cachedSerQNames.add(qName);
            cls = com.esri.geoevent.solutions.webeoc7.esi911.com.GetUsersByPosition.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", ">GetUsersByPositionResponse");
            cachedSerQNames.add(qName);
            cls = com.esri.geoevent.solutions.webeoc7.esi911.com.GetUsersByPositionResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", ">GetViewFields");
            cachedSerQNames.add(qName);
            cls = com.esri.geoevent.solutions.webeoc7.esi911.com.GetViewFields.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", ">GetViewFieldsResponse");
            cachedSerQNames.add(qName);
            cls = com.esri.geoevent.solutions.webeoc7.esi911.com.GetViewFieldsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", ">Ping");
            cachedSerQNames.add(qName);
            cls = com.esri.geoevent.solutions.webeoc7.esi911.com.Ping.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", ">PingResponse");
            cachedSerQNames.add(qName);
            cls = com.esri.geoevent.solutions.webeoc7.esi911.com.PingResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", ">PostStandardData");
            cachedSerQNames.add(qName);
            cls = com.esri.geoevent.solutions.webeoc7.esi911.com.PostStandardData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", ">PostStandardDataResponse");
            cachedSerQNames.add(qName);
            cls = com.esri.geoevent.solutions.webeoc7.esi911.com.PostStandardDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", ">RemoveUserFromPosition");
            cachedSerQNames.add(qName);
            cls = com.esri.geoevent.solutions.webeoc7.esi911.com.RemoveUserFromPosition.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", ">RemoveUserFromPositionResponse");
            cachedSerQNames.add(qName);
            cls = com.esri.geoevent.solutions.webeoc7.esi911.com.RemoveUserFromPositionResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", ">SaveList");
            cachedSerQNames.add(qName);
            cls = com.esri.geoevent.solutions.webeoc7.esi911.com.SaveList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", ">SaveListItem");
            cachedSerQNames.add(qName);
            cls = com.esri.geoevent.solutions.webeoc7.esi911.com.SaveListItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", ">SaveListItemResponse");
            cachedSerQNames.add(qName);
            cls = com.esri.geoevent.solutions.webeoc7.esi911.com.SaveListItemResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", ">SaveListResponse");
            cachedSerQNames.add(qName);
            cls = com.esri.geoevent.solutions.webeoc7.esi911.com.SaveListResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", ">UpdateData");
            cachedSerQNames.add(qName);
            cls = com.esri.geoevent.solutions.webeoc7.esi911.com.UpdateData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", ">UpdateDataBatch");
            cachedSerQNames.add(qName);
            cls = com.esri.geoevent.solutions.webeoc7.esi911.com.UpdateDataBatch.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", ">UpdateDataBatchResponse");
            cachedSerQNames.add(qName);
            cls = com.esri.geoevent.solutions.webeoc7.esi911.com.UpdateDataBatchResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", ">UpdateDataResponse");
            cachedSerQNames.add(qName);
            cls = com.esri.geoevent.solutions.webeoc7.esi911.com.UpdateDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", ">UpdateRelatedData");
            cachedSerQNames.add(qName);
            cls = com.esri.geoevent.solutions.webeoc7.esi911.com.UpdateRelatedData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", ">UpdateRelatedDataResponse");
            cachedSerQNames.add(qName);
            cls = com.esri.geoevent.solutions.webeoc7.esi911.com.UpdateRelatedDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "ArrayOfCustomFilterItem");
            cachedSerQNames.add(qName);
            cls = com.esri.geoevent.solutions.webeoc7.esi911.com.CustomFilterItem[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "CustomFilterItem");
            qName2 = new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "CustomFilterItem");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "ArrayOfInt");
            cachedSerQNames.add(qName);
            cls = int[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int");
            qName2 = new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "int");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "ArrayOfString");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "string");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "ArrayOfWebEOCUser");
            cachedSerQNames.add(qName);
            cls = com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCUser[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "WebEOCUser");
            qName2 = new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "WebEOCUser");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "CustomFilter");
            cachedSerQNames.add(qName);
            cls = com.esri.geoevent.solutions.webeoc7.esi911.com.CustomFilter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "CustomFilterBoolean");
            cachedSerQNames.add(qName);
            cls = com.esri.geoevent.solutions.webeoc7.esi911.com.CustomFilterBoolean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "CustomFilterItem");
            cachedSerQNames.add(qName);
            cls = com.esri.geoevent.solutions.webeoc7.esi911.com.CustomFilterItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "CustomFilterOperator");
            cachedSerQNames.add(qName);
            cls = com.esri.geoevent.solutions.webeoc7.esi911.com.CustomFilterOperator.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "WebEOCCredentials");
            cachedSerQNames.add(qName);
            cls = com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "WebEOCUser");
            cachedSerQNames.add(qName);
            cls = com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCUser.class;
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
                    _call.setEncodingStyle(null);
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

    public void addAttachment(com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials credentials, java.lang.String boardName, java.lang.String inputViewName, java.lang.String attachmentFieldName, int dataId, byte[] attachmentFileData, java.lang.String attachmentFileName) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:com:esi911:webeoc7:api:1.0/AddAttachment");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "AddAttachment"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {credentials, boardName, inputViewName, attachmentFieldName, new java.lang.Integer(dataId), attachmentFileData, attachmentFileName});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String[] getPositions(com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials credentials) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:com:esi911:webeoc7:api:1.0/GetPositions");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "GetPositions"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {credentials});

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
  throw axisFaultException;
}
    }

    public java.lang.String[] getUserPositions(com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials credentials) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:com:esi911:webeoc7:api:1.0/GetUserPositions");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "GetUserPositions"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {credentials});

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
  throw axisFaultException;
}
    }

    public com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCUser[] getUsersByPosition(com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials credentials, java.lang.String positionName) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:com:esi911:webeoc7:api:1.0/GetUsersByPosition");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "GetUsersByPosition"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {credentials, positionName});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCUser[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCUser[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCUser[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String[] getPositionsForUser(com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials credentials, java.lang.String userName) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:com:esi911:webeoc7:api:1.0/GetPositionsForUser");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "GetPositionsForUser"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {credentials, userName});

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
  throw axisFaultException;
}
    }

    public void addUser(com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials credentials, com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCUser userToAdd, java.lang.String password) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:com:esi911:webeoc7:api:1.0/AddUser");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "AddUser"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {credentials, userToAdd, password});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void addUserToPosition(com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials credentials, java.lang.String userName, java.lang.String position) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:com:esi911:webeoc7:api:1.0/AddUserToPosition");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "AddUserToPosition"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {credentials, userName, position});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void removeUserFromPosition(com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials credentials, java.lang.String userName, java.lang.String position) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:com:esi911:webeoc7:api:1.0/RemoveUserFromPosition");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "RemoveUserFromPosition"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {credentials, userName, position});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public boolean deleteUserIfNoPositions(com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials credentials, java.lang.String userName) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:com:esi911:webeoc7:api:1.0/DeleteUserIfNoPositions");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "DeleteUserIfNoPositions"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {credentials, userName});

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
  throw axisFaultException;
}
    }

    public void deleteUser(com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials credentials, java.lang.String userName) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:com:esi911:webeoc7:api:1.0/DeleteUser");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "DeleteUser"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {credentials, userName});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String[] getBoardNames(com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials credentials) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:com:esi911:webeoc7:api:1.0/GetBoardNames");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "GetBoardNames"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {credentials});

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
  throw axisFaultException;
}
    }

    public java.lang.String[] getInputViews(com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials credentials, java.lang.String boardName) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:com:esi911:webeoc7:api:1.0/GetInputViews");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "GetInputViews"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {credentials, boardName});

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
  throw axisFaultException;
}
    }

    public java.lang.String[] getDisplayViews(com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials credentials, java.lang.String boardName) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:com:esi911:webeoc7:api:1.0/GetDisplayViews");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "GetDisplayViews"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {credentials, boardName});

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
  throw axisFaultException;
}
    }

    public java.lang.String[] getViewFields(com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials credentials, java.lang.String boardName, java.lang.String viewName) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:com:esi911:webeoc7:api:1.0/GetViewFields");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "GetViewFields"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {credentials, boardName, viewName});

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
  throw axisFaultException;
}
    }

    public int addData(com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials credentials, java.lang.String boardName, java.lang.String inputViewName, java.lang.String xmlData) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:com:esi911:webeoc7:api:1.0/AddData");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "AddData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {credentials, boardName, inputViewName, xmlData});

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
  throw axisFaultException;
}
    }

    public int updateData(com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials credentials, java.lang.String boardName, java.lang.String inputViewName, java.lang.String xmlData, int dataId) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:com:esi911:webeoc7:api:1.0/UpdateData");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "UpdateData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {credentials, boardName, inputViewName, xmlData, new java.lang.Integer(dataId)});

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
  throw axisFaultException;
}
    }

    public int[] updateDataBatch(com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials credentials, java.lang.String boardName, java.lang.String inputViewName, java.lang.String xmlData) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:com:esi911:webeoc7:api:1.0/UpdateDataBatch");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "UpdateDataBatch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {credentials, boardName, inputViewName, xmlData});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (int[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (int[]) org.apache.axis.utils.JavaUtils.convert(_resp, int[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int addRelatedData(com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials credentials, java.lang.String boardName, java.lang.String inputViewName, java.lang.String xmlData, java.lang.String relatedTable, int relatedDataId) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:com:esi911:webeoc7:api:1.0/AddRelatedData");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "AddRelatedData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {credentials, boardName, inputViewName, xmlData, relatedTable, new java.lang.Integer(relatedDataId)});

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
  throw axisFaultException;
}
    }

    public int updateRelatedData(com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials credentials, java.lang.String boardName, java.lang.String inputViewName, java.lang.String xmlData, java.lang.String relatedTable, int relatedDataId, int dataId) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:com:esi911:webeoc7:api:1.0/UpdateRelatedData");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "UpdateRelatedData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {credentials, boardName, inputViewName, xmlData, relatedTable, new java.lang.Integer(relatedDataId), new java.lang.Integer(dataId)});

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
  throw axisFaultException;
}
    }

    public java.lang.String getData(com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials credentials, java.lang.String boardName, java.lang.String displayViewName) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[19]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:com:esi911:webeoc7:api:1.0/GetData");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "GetData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {credentials, boardName, displayViewName});

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
  throw axisFaultException;
}
    }

    public java.lang.String getFilteredData(com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials credentials, java.lang.String boardName, java.lang.String displayViewName, java.lang.String[] viewFilterNames, java.lang.String xmlUserFilter) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[20]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:com:esi911:webeoc7:api:1.0/GetFilteredData");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "GetFilteredData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {credentials, boardName, displayViewName, viewFilterNames, xmlUserFilter});

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
  throw axisFaultException;
}
    }

    public java.lang.String getFilteredDataV2(com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials credentials, java.lang.String boardName, java.lang.String displayViewName, java.lang.String[] viewFilterNames, java.lang.String xmlUserFilter, com.esri.geoevent.solutions.webeoc7.esi911.com.CustomFilter customFilter) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[21]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:com:esi911:webeoc7:api:1.0/GetFilteredDataV2");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "GetFilteredDataV2"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {credentials, boardName, displayViewName, viewFilterNames, xmlUserFilter, customFilter});

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
  throw axisFaultException;
}
    }

    public java.lang.String getUpdatedData(com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials credentials, java.lang.String boardName, java.lang.String displayViewName, java.util.Calendar updatedTime) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[22]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:com:esi911:webeoc7:api:1.0/GetUpdatedData");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "GetUpdatedData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {credentials, boardName, displayViewName, updatedTime});

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
  throw axisFaultException;
}
    }

    public java.lang.String getDataByDataId(com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials credentials, java.lang.String boardName, java.lang.String displayViewName, int dataId) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[23]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:com:esi911:webeoc7:api:1.0/GetDataByDataId");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "GetDataByDataId"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {credentials, boardName, displayViewName, new java.lang.Integer(dataId)});

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
  throw axisFaultException;
}
    }

    public java.lang.String ping(com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials credentials) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[24]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:com:esi911:webeoc7:api:1.0/Ping");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "Ping"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {credentials});

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
  throw axisFaultException;
}
    }

    public void postStandardData(com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials credentials, java.lang.String xmlStandardData) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[25]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:com:esi911:webeoc7:api:1.0/PostStandardData");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "PostStandardData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {credentials, xmlStandardData});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String[] getIncidents(com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials credentials) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[26]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:com:esi911:webeoc7:api:1.0/GetIncidents");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "GetIncidents"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {credentials});

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
  throw axisFaultException;
}
    }

    public void addIncident(com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials credentials, java.lang.String incidentName, java.util.Calendar incidentDateTime, boolean _default) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[27]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:com:esi911:webeoc7:api:1.0/AddIncident");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "AddIncident"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {credentials, incidentName, incidentDateTime, new java.lang.Boolean(_default)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.esri.geoevent.solutions.webeoc7.esi911.com.GetListsResponseGetListsResult getLists(com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials credentials) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[28]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:com:esi911:webeoc7:api:1.0/GetLists");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "GetLists"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {credentials});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.esri.geoevent.solutions.webeoc7.esi911.com.GetListsResponseGetListsResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.esri.geoevent.solutions.webeoc7.esi911.com.GetListsResponseGetListsResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.esri.geoevent.solutions.webeoc7.esi911.com.GetListsResponseGetListsResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.esri.geoevent.solutions.webeoc7.esi911.com.GetListItemsResponseGetListItemsResult getListItems(com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials credentials, int listId) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[29]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:com:esi911:webeoc7:api:1.0/GetListItems");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "GetListItems"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {credentials, new java.lang.Integer(listId)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.esri.geoevent.solutions.webeoc7.esi911.com.GetListItemsResponseGetListItemsResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.esri.geoevent.solutions.webeoc7.esi911.com.GetListItemsResponseGetListItemsResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.esri.geoevent.solutions.webeoc7.esi911.com.GetListItemsResponseGetListItemsResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.esri.geoevent.solutions.webeoc7.esi911.com.GetListItemsByListNameResponseGetListItemsByListNameResult getListItemsByListName(com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials credentials, java.lang.String listName) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[30]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:com:esi911:webeoc7:api:1.0/GetListItemsByListName");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "GetListItemsByListName"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {credentials, listName});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.esri.geoevent.solutions.webeoc7.esi911.com.GetListItemsByListNameResponseGetListItemsByListNameResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.esri.geoevent.solutions.webeoc7.esi911.com.GetListItemsByListNameResponseGetListItemsByListNameResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.esri.geoevent.solutions.webeoc7.esi911.com.GetListItemsByListNameResponseGetListItemsByListNameResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int saveList(com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials credentials, int listId, java.lang.String listName) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[31]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:com:esi911:webeoc7:api:1.0/SaveList");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "SaveList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {credentials, new java.lang.Integer(listId), listName});

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
  throw axisFaultException;
}
    }

    public void deleteList(com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials credentials, int listId) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[32]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:com:esi911:webeoc7:api:1.0/DeleteList");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "DeleteList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {credentials, new java.lang.Integer(listId)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int saveListItem(com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials credentials, int listId, int listItemId, java.lang.String listItemName, java.lang.String listItemColor) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[33]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:com:esi911:webeoc7:api:1.0/SaveListItem");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "SaveListItem"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {credentials, new java.lang.Integer(listId), new java.lang.Integer(listItemId), listItemName, listItemColor});

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
  throw axisFaultException;
}
    }

    public void deleteListItem(com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials credentials, int listItemId) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[34]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:com:esi911:webeoc7:api:1.0/DeleteListItem");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "DeleteListItem"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {credentials, new java.lang.Integer(listItemId)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
