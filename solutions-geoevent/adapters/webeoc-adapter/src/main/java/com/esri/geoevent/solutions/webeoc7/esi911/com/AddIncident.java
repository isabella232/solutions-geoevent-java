/**
 * AddIncident.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.esri.geoevent.solutions.webeoc7.esi911.com;

public class AddIncident  implements java.io.Serializable {
    private com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials credentials;

    private java.lang.String incidentName;

    private java.util.Calendar incidentDateTime;

    private boolean _default;

    public AddIncident() {
    }

    public AddIncident(
           com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials credentials,
           java.lang.String incidentName,
           java.util.Calendar incidentDateTime,
           boolean _default) {
           this.credentials = credentials;
           this.incidentName = incidentName;
           this.incidentDateTime = incidentDateTime;
           this._default = _default;
    }


    /**
     * Gets the credentials value for this AddIncident.
     * 
     * @return credentials
     */
    public com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials getCredentials() {
        return credentials;
    }


    /**
     * Sets the credentials value for this AddIncident.
     * 
     * @param credentials
     */
    public void setCredentials(com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials credentials) {
        this.credentials = credentials;
    }


    /**
     * Gets the incidentName value for this AddIncident.
     * 
     * @return incidentName
     */
    public java.lang.String getIncidentName() {
        return incidentName;
    }


    /**
     * Sets the incidentName value for this AddIncident.
     * 
     * @param incidentName
     */
    public void setIncidentName(java.lang.String incidentName) {
        this.incidentName = incidentName;
    }


    /**
     * Gets the incidentDateTime value for this AddIncident.
     * 
     * @return incidentDateTime
     */
    public java.util.Calendar getIncidentDateTime() {
        return incidentDateTime;
    }


    /**
     * Sets the incidentDateTime value for this AddIncident.
     * 
     * @param incidentDateTime
     */
    public void setIncidentDateTime(java.util.Calendar incidentDateTime) {
        this.incidentDateTime = incidentDateTime;
    }


    /**
     * Gets the _default value for this AddIncident.
     * 
     * @return _default
     */
    public boolean is_default() {
        return _default;
    }


    /**
     * Sets the _default value for this AddIncident.
     * 
     * @param _default
     */
    public void set_default(boolean _default) {
        this._default = _default;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AddIncident)) return false;
        AddIncident other = (AddIncident) obj;
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
            ((this.incidentName==null && other.getIncidentName()==null) || 
             (this.incidentName!=null &&
              this.incidentName.equals(other.getIncidentName()))) &&
            ((this.incidentDateTime==null && other.getIncidentDateTime()==null) || 
             (this.incidentDateTime!=null &&
              this.incidentDateTime.equals(other.getIncidentDateTime()))) &&
            this._default == other.is_default();
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
        if (getIncidentName() != null) {
            _hashCode += getIncidentName().hashCode();
        }
        if (getIncidentDateTime() != null) {
            _hashCode += getIncidentDateTime().hashCode();
        }
        _hashCode += (is_default() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AddIncident.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", ">AddIncident"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("credentials");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "credentials"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "WebEOCCredentials"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("incidentName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "IncidentName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("incidentDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "IncidentDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_default");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "Default"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
