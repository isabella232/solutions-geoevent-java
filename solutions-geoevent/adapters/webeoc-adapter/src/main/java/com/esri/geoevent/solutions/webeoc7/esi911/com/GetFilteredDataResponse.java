/**
 * GetFilteredDataResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.esri.geoevent.solutions.webeoc7.esi911.com;

public class GetFilteredDataResponse  implements java.io.Serializable {
    private java.lang.String getFilteredDataResult;

    public GetFilteredDataResponse() {
    }

    public GetFilteredDataResponse(
           java.lang.String getFilteredDataResult) {
           this.getFilteredDataResult = getFilteredDataResult;
    }


    /**
     * Gets the getFilteredDataResult value for this GetFilteredDataResponse.
     * 
     * @return getFilteredDataResult
     */
    public java.lang.String getGetFilteredDataResult() {
        return getFilteredDataResult;
    }


    /**
     * Sets the getFilteredDataResult value for this GetFilteredDataResponse.
     * 
     * @param getFilteredDataResult
     */
    public void setGetFilteredDataResult(java.lang.String getFilteredDataResult) {
        this.getFilteredDataResult = getFilteredDataResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetFilteredDataResponse)) return false;
        GetFilteredDataResponse other = (GetFilteredDataResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getFilteredDataResult==null && other.getGetFilteredDataResult()==null) || 
             (this.getFilteredDataResult!=null &&
              this.getFilteredDataResult.equals(other.getGetFilteredDataResult())));
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
        if (getGetFilteredDataResult() != null) {
            _hashCode += getGetFilteredDataResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetFilteredDataResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", ">GetFilteredDataResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getFilteredDataResult");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "GetFilteredDataResult"));
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
