/**
 * GetListsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.esri.geoevent.solutions.webeoc7.esi911.com;

public class GetListsResponse  implements java.io.Serializable {
    private com.esri.geoevent.solutions.webeoc7.esi911.com.GetListsResponseGetListsResult getListsResult;

    public GetListsResponse() {
    }

    public GetListsResponse(
           com.esri.geoevent.solutions.webeoc7.esi911.com.GetListsResponseGetListsResult getListsResult) {
           this.getListsResult = getListsResult;
    }


    /**
     * Gets the getListsResult value for this GetListsResponse.
     * 
     * @return getListsResult
     */
    public com.esri.geoevent.solutions.webeoc7.esi911.com.GetListsResponseGetListsResult getGetListsResult() {
        return getListsResult;
    }


    /**
     * Sets the getListsResult value for this GetListsResponse.
     * 
     * @param getListsResult
     */
    public void setGetListsResult(com.esri.geoevent.solutions.webeoc7.esi911.com.GetListsResponseGetListsResult getListsResult) {
        this.getListsResult = getListsResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetListsResponse)) return false;
        GetListsResponse other = (GetListsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getListsResult==null && other.getGetListsResult()==null) || 
             (this.getListsResult!=null &&
              this.getListsResult.equals(other.getGetListsResult())));
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
        if (getGetListsResult() != null) {
            _hashCode += getGetListsResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetListsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", ">GetListsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getListsResult");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "GetListsResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", ">>GetListsResponse>GetListsResult"));
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
