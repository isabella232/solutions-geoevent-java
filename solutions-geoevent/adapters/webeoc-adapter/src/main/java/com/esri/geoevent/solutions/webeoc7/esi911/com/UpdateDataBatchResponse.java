/**
 * UpdateDataBatchResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.esri.geoevent.solutions.webeoc7.esi911.com;

public class UpdateDataBatchResponse  implements java.io.Serializable {
    private int[] updateDataBatchResult;

    public UpdateDataBatchResponse() {
    }

    public UpdateDataBatchResponse(
           int[] updateDataBatchResult) {
           this.updateDataBatchResult = updateDataBatchResult;
    }


    /**
     * Gets the updateDataBatchResult value for this UpdateDataBatchResponse.
     * 
     * @return updateDataBatchResult
     */
    public int[] getUpdateDataBatchResult() {
        return updateDataBatchResult;
    }


    /**
     * Sets the updateDataBatchResult value for this UpdateDataBatchResponse.
     * 
     * @param updateDataBatchResult
     */
    public void setUpdateDataBatchResult(int[] updateDataBatchResult) {
        this.updateDataBatchResult = updateDataBatchResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdateDataBatchResponse)) return false;
        UpdateDataBatchResponse other = (UpdateDataBatchResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.updateDataBatchResult==null && other.getUpdateDataBatchResult()==null) || 
             (this.updateDataBatchResult!=null &&
              java.util.Arrays.equals(this.updateDataBatchResult, other.getUpdateDataBatchResult())));
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
        if (getUpdateDataBatchResult() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUpdateDataBatchResult());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUpdateDataBatchResult(), i);
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
        new org.apache.axis.description.TypeDesc(UpdateDataBatchResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", ">UpdateDataBatchResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updateDataBatchResult");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "UpdateDataBatchResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "int"));
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
