/**
 * GetFilteredDataV2Response.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.esri.geoevent.solutions.webeoc7.esi911.com;

public class GetFilteredDataV2Response  implements java.io.Serializable {
    private java.lang.String getFilteredDataV2Result;

    public GetFilteredDataV2Response() {
    }

    public GetFilteredDataV2Response(
           java.lang.String getFilteredDataV2Result) {
           this.getFilteredDataV2Result = getFilteredDataV2Result;
    }


    /**
     * Gets the getFilteredDataV2Result value for this GetFilteredDataV2Response.
     * 
     * @return getFilteredDataV2Result
     */
    public java.lang.String getGetFilteredDataV2Result() {
        return getFilteredDataV2Result;
    }


    /**
     * Sets the getFilteredDataV2Result value for this GetFilteredDataV2Response.
     * 
     * @param getFilteredDataV2Result
     */
    public void setGetFilteredDataV2Result(java.lang.String getFilteredDataV2Result) {
        this.getFilteredDataV2Result = getFilteredDataV2Result;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetFilteredDataV2Response)) return false;
        GetFilteredDataV2Response other = (GetFilteredDataV2Response) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getFilteredDataV2Result==null && other.getGetFilteredDataV2Result()==null) || 
             (this.getFilteredDataV2Result!=null &&
              this.getFilteredDataV2Result.equals(other.getGetFilteredDataV2Result())));
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
        if (getGetFilteredDataV2Result() != null) {
            _hashCode += getGetFilteredDataV2Result().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetFilteredDataV2Response.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", ">GetFilteredDataV2Response"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getFilteredDataV2Result");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "GetFilteredDataV2Result"));
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
