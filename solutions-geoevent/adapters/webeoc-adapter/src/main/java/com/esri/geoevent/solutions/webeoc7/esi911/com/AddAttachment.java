/**
 * AddAttachment.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.esri.geoevent.solutions.webeoc7.esi911.com;

public class AddAttachment  implements java.io.Serializable {
    private com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials credentials;

    private java.lang.String boardName;

    private java.lang.String inputViewName;

    private java.lang.String attachmentFieldName;

    private int dataId;

    private byte[] attachmentFileData;

    private java.lang.String attachmentFileName;

    public AddAttachment() {
    }

    public AddAttachment(
           com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials credentials,
           java.lang.String boardName,
           java.lang.String inputViewName,
           java.lang.String attachmentFieldName,
           int dataId,
           byte[] attachmentFileData,
           java.lang.String attachmentFileName) {
           this.credentials = credentials;
           this.boardName = boardName;
           this.inputViewName = inputViewName;
           this.attachmentFieldName = attachmentFieldName;
           this.dataId = dataId;
           this.attachmentFileData = attachmentFileData;
           this.attachmentFileName = attachmentFileName;
    }


    /**
     * Gets the credentials value for this AddAttachment.
     * 
     * @return credentials
     */
    public com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials getCredentials() {
        return credentials;
    }


    /**
     * Sets the credentials value for this AddAttachment.
     * 
     * @param credentials
     */
    public void setCredentials(com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials credentials) {
        this.credentials = credentials;
    }


    /**
     * Gets the boardName value for this AddAttachment.
     * 
     * @return boardName
     */
    public java.lang.String getBoardName() {
        return boardName;
    }


    /**
     * Sets the boardName value for this AddAttachment.
     * 
     * @param boardName
     */
    public void setBoardName(java.lang.String boardName) {
        this.boardName = boardName;
    }


    /**
     * Gets the inputViewName value for this AddAttachment.
     * 
     * @return inputViewName
     */
    public java.lang.String getInputViewName() {
        return inputViewName;
    }


    /**
     * Sets the inputViewName value for this AddAttachment.
     * 
     * @param inputViewName
     */
    public void setInputViewName(java.lang.String inputViewName) {
        this.inputViewName = inputViewName;
    }


    /**
     * Gets the attachmentFieldName value for this AddAttachment.
     * 
     * @return attachmentFieldName
     */
    public java.lang.String getAttachmentFieldName() {
        return attachmentFieldName;
    }


    /**
     * Sets the attachmentFieldName value for this AddAttachment.
     * 
     * @param attachmentFieldName
     */
    public void setAttachmentFieldName(java.lang.String attachmentFieldName) {
        this.attachmentFieldName = attachmentFieldName;
    }


    /**
     * Gets the dataId value for this AddAttachment.
     * 
     * @return dataId
     */
    public int getDataId() {
        return dataId;
    }


    /**
     * Sets the dataId value for this AddAttachment.
     * 
     * @param dataId
     */
    public void setDataId(int dataId) {
        this.dataId = dataId;
    }


    /**
     * Gets the attachmentFileData value for this AddAttachment.
     * 
     * @return attachmentFileData
     */
    public byte[] getAttachmentFileData() {
        return attachmentFileData;
    }


    /**
     * Sets the attachmentFileData value for this AddAttachment.
     * 
     * @param attachmentFileData
     */
    public void setAttachmentFileData(byte[] attachmentFileData) {
        this.attachmentFileData = attachmentFileData;
    }


    /**
     * Gets the attachmentFileName value for this AddAttachment.
     * 
     * @return attachmentFileName
     */
    public java.lang.String getAttachmentFileName() {
        return attachmentFileName;
    }


    /**
     * Sets the attachmentFileName value for this AddAttachment.
     * 
     * @param attachmentFileName
     */
    public void setAttachmentFileName(java.lang.String attachmentFileName) {
        this.attachmentFileName = attachmentFileName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AddAttachment)) return false;
        AddAttachment other = (AddAttachment) obj;
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
            ((this.attachmentFieldName==null && other.getAttachmentFieldName()==null) || 
             (this.attachmentFieldName!=null &&
              this.attachmentFieldName.equals(other.getAttachmentFieldName()))) &&
            this.dataId == other.getDataId() &&
            ((this.attachmentFileData==null && other.getAttachmentFileData()==null) || 
             (this.attachmentFileData!=null &&
              java.util.Arrays.equals(this.attachmentFileData, other.getAttachmentFileData()))) &&
            ((this.attachmentFileName==null && other.getAttachmentFileName()==null) || 
             (this.attachmentFileName!=null &&
              this.attachmentFileName.equals(other.getAttachmentFileName())));
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
        if (getAttachmentFieldName() != null) {
            _hashCode += getAttachmentFieldName().hashCode();
        }
        _hashCode += getDataId();
        if (getAttachmentFileData() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAttachmentFileData());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAttachmentFileData(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAttachmentFileName() != null) {
            _hashCode += getAttachmentFileName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AddAttachment.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", ">AddAttachment"));
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
        elemField.setFieldName("attachmentFieldName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "AttachmentFieldName"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attachmentFileData");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "AttachmentFileData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attachmentFileName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "AttachmentFileName"));
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
