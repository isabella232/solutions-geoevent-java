/**
 * SaveListItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.esri.geoevent.solutions.webeoc7.esi911.com;

public class SaveListItem  implements java.io.Serializable {
    private com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials credentials;

    private int listId;

    private int listItemId;

    private java.lang.String listItemName;

    private java.lang.String listItemColor;

    public SaveListItem() {
    }

    public SaveListItem(
           com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials credentials,
           int listId,
           int listItemId,
           java.lang.String listItemName,
           java.lang.String listItemColor) {
           this.credentials = credentials;
           this.listId = listId;
           this.listItemId = listItemId;
           this.listItemName = listItemName;
           this.listItemColor = listItemColor;
    }


    /**
     * Gets the credentials value for this SaveListItem.
     * 
     * @return credentials
     */
    public com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials getCredentials() {
        return credentials;
    }


    /**
     * Sets the credentials value for this SaveListItem.
     * 
     * @param credentials
     */
    public void setCredentials(com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials credentials) {
        this.credentials = credentials;
    }


    /**
     * Gets the listId value for this SaveListItem.
     * 
     * @return listId
     */
    public int getListId() {
        return listId;
    }


    /**
     * Sets the listId value for this SaveListItem.
     * 
     * @param listId
     */
    public void setListId(int listId) {
        this.listId = listId;
    }


    /**
     * Gets the listItemId value for this SaveListItem.
     * 
     * @return listItemId
     */
    public int getListItemId() {
        return listItemId;
    }


    /**
     * Sets the listItemId value for this SaveListItem.
     * 
     * @param listItemId
     */
    public void setListItemId(int listItemId) {
        this.listItemId = listItemId;
    }


    /**
     * Gets the listItemName value for this SaveListItem.
     * 
     * @return listItemName
     */
    public java.lang.String getListItemName() {
        return listItemName;
    }


    /**
     * Sets the listItemName value for this SaveListItem.
     * 
     * @param listItemName
     */
    public void setListItemName(java.lang.String listItemName) {
        this.listItemName = listItemName;
    }


    /**
     * Gets the listItemColor value for this SaveListItem.
     * 
     * @return listItemColor
     */
    public java.lang.String getListItemColor() {
        return listItemColor;
    }


    /**
     * Sets the listItemColor value for this SaveListItem.
     * 
     * @param listItemColor
     */
    public void setListItemColor(java.lang.String listItemColor) {
        this.listItemColor = listItemColor;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SaveListItem)) return false;
        SaveListItem other = (SaveListItem) obj;
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
            this.listId == other.getListId() &&
            this.listItemId == other.getListItemId() &&
            ((this.listItemName==null && other.getListItemName()==null) || 
             (this.listItemName!=null &&
              this.listItemName.equals(other.getListItemName()))) &&
            ((this.listItemColor==null && other.getListItemColor()==null) || 
             (this.listItemColor!=null &&
              this.listItemColor.equals(other.getListItemColor())));
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
        _hashCode += getListId();
        _hashCode += getListItemId();
        if (getListItemName() != null) {
            _hashCode += getListItemName().hashCode();
        }
        if (getListItemColor() != null) {
            _hashCode += getListItemColor().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SaveListItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", ">SaveListItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("credentials");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "credentials"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "WebEOCCredentials"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "listId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listItemId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "listItemId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listItemName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "listItemName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listItemColor");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "listItemColor"));
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
