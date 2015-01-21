/**
 * WebEOCUser.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.esri.geoevent.solutions.webeoc7.esi911.com;

public class WebEOCUser  implements java.io.Serializable {
    private java.lang.String username;

    private boolean isAdministrator;

    private boolean isMultipleUserLogin;

    private boolean isAccountDisabled;

    private boolean changePasswordAtNextLogin;

    private boolean isDualCommitUser;

    private java.lang.String primaryEmail;

    private java.lang.String color;

    public WebEOCUser() {
    }

    public WebEOCUser(
           java.lang.String username,
           boolean isAdministrator,
           boolean isMultipleUserLogin,
           boolean isAccountDisabled,
           boolean changePasswordAtNextLogin,
           boolean isDualCommitUser,
           java.lang.String primaryEmail,
           java.lang.String color) {
           this.username = username;
           this.isAdministrator = isAdministrator;
           this.isMultipleUserLogin = isMultipleUserLogin;
           this.isAccountDisabled = isAccountDisabled;
           this.changePasswordAtNextLogin = changePasswordAtNextLogin;
           this.isDualCommitUser = isDualCommitUser;
           this.primaryEmail = primaryEmail;
           this.color = color;
    }


    /**
     * Gets the username value for this WebEOCUser.
     * 
     * @return username
     */
    public java.lang.String getUsername() {
        return username;
    }


    /**
     * Sets the username value for this WebEOCUser.
     * 
     * @param username
     */
    public void setUsername(java.lang.String username) {
        this.username = username;
    }


    /**
     * Gets the isAdministrator value for this WebEOCUser.
     * 
     * @return isAdministrator
     */
    public boolean isIsAdministrator() {
        return isAdministrator;
    }


    /**
     * Sets the isAdministrator value for this WebEOCUser.
     * 
     * @param isAdministrator
     */
    public void setIsAdministrator(boolean isAdministrator) {
        this.isAdministrator = isAdministrator;
    }


    /**
     * Gets the isMultipleUserLogin value for this WebEOCUser.
     * 
     * @return isMultipleUserLogin
     */
    public boolean isIsMultipleUserLogin() {
        return isMultipleUserLogin;
    }


    /**
     * Sets the isMultipleUserLogin value for this WebEOCUser.
     * 
     * @param isMultipleUserLogin
     */
    public void setIsMultipleUserLogin(boolean isMultipleUserLogin) {
        this.isMultipleUserLogin = isMultipleUserLogin;
    }


    /**
     * Gets the isAccountDisabled value for this WebEOCUser.
     * 
     * @return isAccountDisabled
     */
    public boolean isIsAccountDisabled() {
        return isAccountDisabled;
    }


    /**
     * Sets the isAccountDisabled value for this WebEOCUser.
     * 
     * @param isAccountDisabled
     */
    public void setIsAccountDisabled(boolean isAccountDisabled) {
        this.isAccountDisabled = isAccountDisabled;
    }


    /**
     * Gets the changePasswordAtNextLogin value for this WebEOCUser.
     * 
     * @return changePasswordAtNextLogin
     */
    public boolean isChangePasswordAtNextLogin() {
        return changePasswordAtNextLogin;
    }


    /**
     * Sets the changePasswordAtNextLogin value for this WebEOCUser.
     * 
     * @param changePasswordAtNextLogin
     */
    public void setChangePasswordAtNextLogin(boolean changePasswordAtNextLogin) {
        this.changePasswordAtNextLogin = changePasswordAtNextLogin;
    }


    /**
     * Gets the isDualCommitUser value for this WebEOCUser.
     * 
     * @return isDualCommitUser
     */
    public boolean isIsDualCommitUser() {
        return isDualCommitUser;
    }


    /**
     * Sets the isDualCommitUser value for this WebEOCUser.
     * 
     * @param isDualCommitUser
     */
    public void setIsDualCommitUser(boolean isDualCommitUser) {
        this.isDualCommitUser = isDualCommitUser;
    }


    /**
     * Gets the primaryEmail value for this WebEOCUser.
     * 
     * @return primaryEmail
     */
    public java.lang.String getPrimaryEmail() {
        return primaryEmail;
    }


    /**
     * Sets the primaryEmail value for this WebEOCUser.
     * 
     * @param primaryEmail
     */
    public void setPrimaryEmail(java.lang.String primaryEmail) {
        this.primaryEmail = primaryEmail;
    }


    /**
     * Gets the color value for this WebEOCUser.
     * 
     * @return color
     */
    public java.lang.String getColor() {
        return color;
    }


    /**
     * Sets the color value for this WebEOCUser.
     * 
     * @param color
     */
    public void setColor(java.lang.String color) {
        this.color = color;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WebEOCUser)) return false;
        WebEOCUser other = (WebEOCUser) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.username==null && other.getUsername()==null) || 
             (this.username!=null &&
              this.username.equals(other.getUsername()))) &&
            this.isAdministrator == other.isIsAdministrator() &&
            this.isMultipleUserLogin == other.isIsMultipleUserLogin() &&
            this.isAccountDisabled == other.isIsAccountDisabled() &&
            this.changePasswordAtNextLogin == other.isChangePasswordAtNextLogin() &&
            this.isDualCommitUser == other.isIsDualCommitUser() &&
            ((this.primaryEmail==null && other.getPrimaryEmail()==null) || 
             (this.primaryEmail!=null &&
              this.primaryEmail.equals(other.getPrimaryEmail()))) &&
            ((this.color==null && other.getColor()==null) || 
             (this.color!=null &&
              this.color.equals(other.getColor())));
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
        if (getUsername() != null) {
            _hashCode += getUsername().hashCode();
        }
        _hashCode += (isIsAdministrator() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isIsMultipleUserLogin() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isIsAccountDisabled() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isChangePasswordAtNextLogin() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isIsDualCommitUser() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getPrimaryEmail() != null) {
            _hashCode += getPrimaryEmail().hashCode();
        }
        if (getColor() != null) {
            _hashCode += getColor().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WebEOCUser.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "WebEOCUser"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("username");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "Username"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isAdministrator");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "IsAdministrator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isMultipleUserLogin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "IsMultipleUserLogin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isAccountDisabled");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "IsAccountDisabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("changePasswordAtNextLogin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "ChangePasswordAtNextLogin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isDualCommitUser");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "IsDualCommitUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primaryEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "PrimaryEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("color");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "Color"));
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
