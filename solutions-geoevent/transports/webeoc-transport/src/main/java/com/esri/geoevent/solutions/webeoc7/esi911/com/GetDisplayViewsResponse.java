/**
 * GetDisplayViewsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.esri.geoevent.solutions.webeoc7.esi911.com;

public class GetDisplayViewsResponse  implements java.io.Serializable {
    private java.lang.String[] getDisplayViewsResult;

    public GetDisplayViewsResponse() {
    }

    public GetDisplayViewsResponse(
           java.lang.String[] getDisplayViewsResult) {
           this.getDisplayViewsResult = getDisplayViewsResult;
    }


    /**
     * Gets the getDisplayViewsResult value for this GetDisplayViewsResponse.
     * 
     * @return getDisplayViewsResult
     */
    public java.lang.String[] getGetDisplayViewsResult() {
        return getDisplayViewsResult;
    }


    /**
     * Sets the getDisplayViewsResult value for this GetDisplayViewsResponse.
     * 
     * @param getDisplayViewsResult
     */
    public void setGetDisplayViewsResult(java.lang.String[] getDisplayViewsResult) {
        this.getDisplayViewsResult = getDisplayViewsResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetDisplayViewsResponse)) return false;
        GetDisplayViewsResponse other = (GetDisplayViewsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getDisplayViewsResult==null && other.getGetDisplayViewsResult()==null) || 
             (this.getDisplayViewsResult!=null &&
              java.util.Arrays.equals(this.getDisplayViewsResult, other.getGetDisplayViewsResult())));
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
        if (getGetDisplayViewsResult() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGetDisplayViewsResult());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGetDisplayViewsResult(), i);
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
        new org.apache.axis.description.TypeDesc(GetDisplayViewsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", ">GetDisplayViewsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getDisplayViewsResult");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "GetDisplayViewsResult"));
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
