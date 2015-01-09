/**
 * GetDataByDataId.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.esri.geoevent.solutions.webeoc7.esi911.com;

public class GetDataByDataId  implements java.io.Serializable {
    private com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials credentials;

    private java.lang.String boardName;

    private java.lang.String displayViewName;

    private int dataId;

    public GetDataByDataId() {
    }

    public GetDataByDataId(
           com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials credentials,
           java.lang.String boardName,
           java.lang.String displayViewName,
           int dataId) {
           this.credentials = credentials;
           this.boardName = boardName;
           this.displayViewName = displayViewName;
           this.dataId = dataId;
    }


    /**
     * Gets the credentials value for this GetDataByDataId.
     * 
     * @return credentials
     */
    public com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials getCredentials() {
        return credentials;
    }


    /**
     * Sets the credentials value for this GetDataByDataId.
     * 
     * @param credentials
     */
    public void setCredentials(com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials credentials) {
        this.credentials = credentials;
    }


    /**
     * Gets the boardName value for this GetDataByDataId.
     * 
     * @return boardName
     */
    public java.lang.String getBoardName() {
        return boardName;
    }


    /**
     * Sets the boardName value for this GetDataByDataId.
     * 
     * @param boardName
     */
    public void setBoardName(java.lang.String boardName) {
        this.boardName = boardName;
    }


    /**
     * Gets the displayViewName value for this GetDataByDataId.
     * 
     * @return displayViewName
     */
    public java.lang.String getDisplayViewName() {
        return displayViewName;
    }


    /**
     * Sets the displayViewName value for this GetDataByDataId.
     * 
     * @param displayViewName
     */
    public void setDisplayViewName(java.lang.String displayViewName) {
        this.displayViewName = displayViewName;
    }


    /**
     * Gets the dataId value for this GetDataByDataId.
     * 
     * @return dataId
     */
    public int getDataId() {
        return dataId;
    }


    /**
     * Sets the dataId value for this GetDataByDataId.
     * 
     * @param dataId
     */
    public void setDataId(int dataId) {
        this.dataId = dataId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetDataByDataId)) return false;
        GetDataByDataId other = (GetDataByDataId) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.credentials==null && other.getCredentials()==null) || 
             (this.credentials!=null &&
              this.credentials.equals(other.getCredentials()))) &&
            ((this.boardName==null && other.getBoardName()==null) || 
             (this.boardName!=null &&
              this.boardName.equals(other.getBoardName()))) &&
            ((this.displayViewName==null && other.getDisplayViewName()==null) || 
             (this.displayViewName!=null &&
              this.displayViewName.equals(other.getDisplayViewName()))) &&
            this.dataId == other.getDataId();
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getCredentials() != null) {
            _hashCode += getCredentials().hashCode();
        }
        if (getBoardName() != null) {
            _hashCode += getBoardName().hashCode();
        }
        if (getDisplayViewName() != null) {
            _hashCode += getDisplayViewName().hashCode();
        }
        _hashCode += getDataId();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetDataByDataId.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", ">GetDataByDataId"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("credentials");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "credentials"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "WebEOCCredentials"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("boardName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "BoardName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("displayViewName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "DisplayViewName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "DataId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
