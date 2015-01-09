/**
 * UpdateRelatedData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.esri.geoevent.solutions.webeoc7.esi911.com;

public class UpdateRelatedData  implements java.io.Serializable {
    private com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials credentials;

    private java.lang.String boardName;

    private java.lang.String inputViewName;

    private java.lang.String xmlData;

    private java.lang.String relatedTable;

    private int relatedDataId;

    private int dataId;

    public UpdateRelatedData() {
    }

    public UpdateRelatedData(
           com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials credentials,
           java.lang.String boardName,
           java.lang.String inputViewName,
           java.lang.String xmlData,
           java.lang.String relatedTable,
           int relatedDataId,
           int dataId) {
           this.credentials = credentials;
           this.boardName = boardName;
           this.inputViewName = inputViewName;
           this.xmlData = xmlData;
           this.relatedTable = relatedTable;
           this.relatedDataId = relatedDataId;
           this.dataId = dataId;
    }


    /**
     * Gets the credentials value for this UpdateRelatedData.
     * 
     * @return credentials
     */
    public com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials getCredentials() {
        return credentials;
    }


    /**
     * Sets the credentials value for this UpdateRelatedData.
     * 
     * @param credentials
     */
    public void setCredentials(com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials credentials) {
        this.credentials = credentials;
    }


    /**
     * Gets the boardName value for this UpdateRelatedData.
     * 
     * @return boardName
     */
    public java.lang.String getBoardName() {
        return boardName;
    }


    /**
     * Sets the boardName value for this UpdateRelatedData.
     * 
     * @param boardName
     */
    public void setBoardName(java.lang.String boardName) {
        this.boardName = boardName;
    }


    /**
     * Gets the inputViewName value for this UpdateRelatedData.
     * 
     * @return inputViewName
     */
    public java.lang.String getInputViewName() {
        return inputViewName;
    }


    /**
     * Sets the inputViewName value for this UpdateRelatedData.
     * 
     * @param inputViewName
     */
    public void setInputViewName(java.lang.String inputViewName) {
        this.inputViewName = inputViewName;
    }


    /**
     * Gets the xmlData value for this UpdateRelatedData.
     * 
     * @return xmlData
     */
    public java.lang.String getXmlData() {
        return xmlData;
    }


    /**
     * Sets the xmlData value for this UpdateRelatedData.
     * 
     * @param xmlData
     */
    public void setXmlData(java.lang.String xmlData) {
        this.xmlData = xmlData;
    }


    /**
     * Gets the relatedTable value for this UpdateRelatedData.
     * 
     * @return relatedTable
     */
    public java.lang.String getRelatedTable() {
        return relatedTable;
    }


    /**
     * Sets the relatedTable value for this UpdateRelatedData.
     * 
     * @param relatedTable
     */
    public void setRelatedTable(java.lang.String relatedTable) {
        this.relatedTable = relatedTable;
    }


    /**
     * Gets the relatedDataId value for this UpdateRelatedData.
     * 
     * @return relatedDataId
     */
    public int getRelatedDataId() {
        return relatedDataId;
    }


    /**
     * Sets the relatedDataId value for this UpdateRelatedData.
     * 
     * @param relatedDataId
     */
    public void setRelatedDataId(int relatedDataId) {
        this.relatedDataId = relatedDataId;
    }


    /**
     * Gets the dataId value for this UpdateRelatedData.
     * 
     * @return dataId
     */
    public int getDataId() {
        return dataId;
    }


    /**
     * Sets the dataId value for this UpdateRelatedData.
     * 
     * @param dataId
     */
    public void setDataId(int dataId) {
        this.dataId = dataId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdateRelatedData)) return false;
        UpdateRelatedData other = (UpdateRelatedData) obj;
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
              this.xmlData.equals(other.getXmlData()))) &&
            ((this.relatedTable==null && other.getRelatedTable()==null) || 
             (this.relatedTable!=null &&
              this.relatedTable.equals(other.getRelatedTable()))) &&
            this.relatedDataId == other.getRelatedDataId() &&
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
        if (getInputViewName() != null) {
            _hashCode += getInputViewName().hashCode();
        }
        if (getXmlData() != null) {
            _hashCode += getXmlData().hashCode();
        }
        if (getRelatedTable() != null) {
            _hashCode += getRelatedTable().hashCode();
        }
        _hashCode += getRelatedDataId();
        _hashCode += getDataId();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UpdateRelatedData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", ">UpdateRelatedData"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relatedTable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "RelatedTable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relatedDataId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "RelatedDataId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
