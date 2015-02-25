/**
 * AddUser.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.esri.geoevent.solutions.webeoc7.esi911.com;

public class AddUser  implements java.io.Serializable {
    private com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials credentials;

    private com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCUser userToAdd;

    private java.lang.String password;

    public AddUser() {
    }

    public AddUser(
           com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials credentials,
           com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCUser userToAdd,
           java.lang.String password) {
           this.credentials = credentials;
           this.userToAdd = userToAdd;
           this.password = password;
    }


    /**
     * Gets the credentials value for this AddUser.
     * 
     * @return credentials
     */
    public com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials getCredentials() {
        return credentials;
    }


    /**
     * Sets the credentials value for this AddUser.
     * 
     * @param credentials
     */
    public void setCredentials(com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials credentials) {
        this.credentials = credentials;
    }


    /**
     * Gets the userToAdd value for this AddUser.
     * 
     * @return userToAdd
     */
    public com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCUser getUserToAdd() {
        return userToAdd;
    }


    /**
     * Sets the userToAdd value for this AddUser.
     * 
     * @param userToAdd
     */
    public void setUserToAdd(com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCUser userToAdd) {
        this.userToAdd = userToAdd;
    }


    /**
     * Gets the password value for this AddUser.
     * 
     * @return password
     */
    public java.lang.String getPassword() {
        return password;
    }


    /**
     * Sets the password value for this AddUser.
     * 
     * @param password
     */
    public void setPassword(java.lang.String password) {
        this.password = password;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AddUser)) return false;
        AddUser other = (AddUser) obj;
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
            ((this.userToAdd==null && other.getUserToAdd()==null) || 
             (this.userToAdd!=null &&
              this.userToAdd.equals(other.getUserToAdd()))) &&
            ((this.password==null && other.getPassword()==null) || 
             (this.password!=null &&
              this.password.equals(other.getPassword())));
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
        if (getUserToAdd() != null) {
            _hashCode += getUserToAdd().hashCode();
        }
        if (getPassword() != null) {
            _hashCode += getPassword().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AddUser.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", ">AddUser"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("credentials");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "credentials"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "WebEOCCredentials"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userToAdd");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "UserToAdd"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "WebEOCUser"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("password");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "Password"));
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
