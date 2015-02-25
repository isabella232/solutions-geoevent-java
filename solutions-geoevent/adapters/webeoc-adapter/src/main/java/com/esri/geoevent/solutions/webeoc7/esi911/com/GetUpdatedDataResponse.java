/**
 * GetUpdatedDataResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.esri.geoevent.solutions.webeoc7.esi911.com;

public class GetUpdatedDataResponse  implements java.io.Serializable {
    private java.lang.String getUpdatedDataResult;

    public GetUpdatedDataResponse() {
    }

    public GetUpdatedDataResponse(
           java.lang.String getUpdatedDataResult) {
           this.getUpdatedDataResult = getUpdatedDataResult;
    }


    /**
     * Gets the getUpdatedDataResult value for this GetUpdatedDataResponse.
     * 
     * @return getUpdatedDataResult
     */
    public java.lang.String getGetUpdatedDataResult() {
        return getUpdatedDataResult;
    }


    /**
     * Sets the getUpdatedDataResult value for this GetUpdatedDataResponse.
     * 
     * @param getUpdatedDataResult
     */
    public void setGetUpdatedDataResult(java.lang.String getUpdatedDataResult) {
        this.getUpdatedDataResult = getUpdatedDataResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetUpdatedDataResponse)) return false;
        GetUpdatedDataResponse other = (GetUpdatedDataResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getUpdatedDataResult==null && other.getGetUpdatedDataResult()==null) || 
             (this.getUpdatedDataResult!=null &&
              this.getUpdatedDataResult.equals(other.getGetUpdatedDataResult())));
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
        if (getGetUpdatedDataResult() != null) {
            _hashCode += getGetUpdatedDataResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetUpdatedDataResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", ">GetUpdatedDataResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getUpdatedDataResult");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "GetUpdatedDataResult"));
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
