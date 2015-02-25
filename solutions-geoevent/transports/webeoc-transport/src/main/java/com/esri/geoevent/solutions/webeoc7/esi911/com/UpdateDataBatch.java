/**
 * UpdateDataBatch.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.esri.geoevent.solutions.webeoc7.esi911.com;

public class UpdateDataBatch  implements java.io.Serializable {
    private com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials credentials;

    private java.lang.String boardName;

    private java.lang.String inputViewName;

    private java.lang.String xmlData;

    public UpdateDataBatch() {
    }

    public UpdateDataBatch(
           com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials credentials,
           java.lang.String boardName,
           java.lang.String inputViewName,
           java.lang.String xmlData) {
           this.credentials = credentials;
           this.boardName = boardName;
           this.inputViewName = inputViewName;
           this.xmlData = xmlData;
    }


    /**
     * Gets the credentials value for this UpdateDataBatch.
     * 
     * @return credentials
     */
    public com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials getCredentials() {
        return credentials;
    }


    /**
     * Sets the credentials value for this UpdateDataBatch.
     * 
     * @param credentials
     */
    public void setCredentials(com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials credentials) {
        this.credentials = credentials;
    }


    /**
     * Gets the boardName value for this UpdateDataBatch.
     * 
     * @return boardName
     */
    public java.lang.String getBoardName() {
        return boardName;
    }


    /**
     * Sets the boardName value for this UpdateDataBatch.
     * 
     * @param boardName
     */
    public void setBoardName(java.lang.String boardName) {
        this.boardName = boardName;
    }


    /**
     * Gets the inputViewName value for this UpdateDataBatch.
     * 
     * @return inputViewName
     */
    public java.lang.String getInputViewName() {
        return inputViewName;
    }


    /**
     * Sets the inputViewName value for this UpdateDataBatch.
     * 
     * @param inputViewName
     */
    public void setInputViewName(java.lang.String inputViewName) {
        this.inputViewName = inputViewName;
    }


    /**
     * Gets the xmlData value for this UpdateDataBatch.
     * 
     * @return xmlData
     */
    public java.lang.String getXmlData() {
        return xmlData;
    }


    /**
     * Sets the xmlData value for this UpdateDataBatch.
     * 
     * @param xmlData
     */
    public void setXmlData(java.lang.String xmlData) {
        this.xmlData = xmlData;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdateDataBatch)) return false;
        UpdateDataBatch other = (UpdateDataBatch) obj;
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
            ((this.inputViewName==null && other.getInputViewName()==null) || 
             (this.inputViewName!=null &&
              this.inputViewName.equals(other.getInputViewName()))) &&
            ((this.xmlData==null && other.getXmlData()==null) || 
             (this.xmlData!=null &&
              this.xmlData.equals(other.getXmlData())));
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
        if (getInputViewName() != null) {
            _hashCode += getInputViewName().hashCode();
        }
        if (getXmlData() != null) {
            _hashCode += getXmlData().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UpdateDataBatch.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", ">UpdateDataBatch"));
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
        elemField.setFieldName("inputViewName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "InputViewName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("xmlData");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "XmlData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
