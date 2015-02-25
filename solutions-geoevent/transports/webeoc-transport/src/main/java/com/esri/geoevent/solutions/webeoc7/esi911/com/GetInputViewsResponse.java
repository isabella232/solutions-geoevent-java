/**
 * GetInputViewsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.esri.geoevent.solutions.webeoc7.esi911.com;

public class GetInputViewsResponse  implements java.io.Serializable {
    private java.lang.String[] getInputViewsResult;

    public GetInputViewsResponse() {
    }

    public GetInputViewsResponse(
           java.lang.String[] getInputViewsResult) {
           this.getInputViewsResult = getInputViewsResult;
    }


    /**
     * Gets the getInputViewsResult value for this GetInputViewsResponse.
     * 
     * @return getInputViewsResult
     */
    public java.lang.String[] getGetInputViewsResult() {
        return getInputViewsResult;
    }


    /**
     * Sets the getInputViewsResult value for this GetInputViewsResponse.
     * 
     * @param getInputViewsResult
     */
    public void setGetInputViewsResult(java.lang.String[] getInputViewsResult) {
        this.getInputViewsResult = getInputViewsResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetInputViewsResponse)) return false;
        GetInputViewsResponse other = (GetInputViewsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getInputViewsResult==null && other.getGetInputViewsResult()==null) || 
             (this.getInputViewsResult!=null &&
              java.util.Arrays.equals(this.getInputViewsResult, other.getGetInputViewsResult())));
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
        if (getGetInputViewsResult() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGetInputViewsResult());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGetInputViewsResult(), i);
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
        new org.apache.axis.description.TypeDesc(GetInputViewsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", ">GetInputViewsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getInputViewsResult");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "GetInputViewsResult"));
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
