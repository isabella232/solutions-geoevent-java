/**
 * GetUserPositionsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.esri.geoevent.solutions.webeoc7.esi911.com;

public class GetUserPositionsResponse  implements java.io.Serializable {
    private java.lang.String[] getUserPositionsResult;

    public GetUserPositionsResponse() {
    }

    public GetUserPositionsResponse(
           java.lang.String[] getUserPositionsResult) {
           this.getUserPositionsResult = getUserPositionsResult;
    }


    /**
     * Gets the getUserPositionsResult value for this GetUserPositionsResponse.
     * 
     * @return getUserPositionsResult
     */
    public java.lang.String[] getGetUserPositionsResult() {
        return getUserPositionsResult;
    }


    /**
     * Sets the getUserPositionsResult value for this GetUserPositionsResponse.
     * 
     * @param getUserPositionsResult
     */
    public void setGetUserPositionsResult(java.lang.String[] getUserPositionsResult) {
        this.getUserPositionsResult = getUserPositionsResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetUserPositionsResponse)) return false;
        GetUserPositionsResponse other = (GetUserPositionsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getUserPositionsResult==null && other.getGetUserPositionsResult()==null) || 
             (this.getUserPositionsResult!=null &&
              java.util.Arrays.equals(this.getUserPositionsResult, other.getGetUserPositionsResult())));
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
        if (getGetUserPositionsResult() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGetUserPositionsResult());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGetUserPositionsResult(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetUserPositionsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", ">GetUserPositionsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getUserPositionsResult");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "GetUserPositionsResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "string"));
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
