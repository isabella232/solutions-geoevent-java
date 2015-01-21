/**
 * GetListItemsByListNameResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.esri.geoevent.solutions.webeoc7.esi911.com;

public class GetListItemsByListNameResponse  implements java.io.Serializable {
    private com.esri.geoevent.solutions.webeoc7.esi911.com.GetListItemsByListNameResponseGetListItemsByListNameResult getListItemsByListNameResult;

    public GetListItemsByListNameResponse() {
    }

    public GetListItemsByListNameResponse(
           com.esri.geoevent.solutions.webeoc7.esi911.com.GetListItemsByListNameResponseGetListItemsByListNameResult getListItemsByListNameResult) {
           this.getListItemsByListNameResult = getListItemsByListNameResult;
    }


    /**
     * Gets the getListItemsByListNameResult value for this GetListItemsByListNameResponse.
     * 
     * @return getListItemsByListNameResult
     */
    public com.esri.geoevent.solutions.webeoc7.esi911.com.GetListItemsByListNameResponseGetListItemsByListNameResult getGetListItemsByListNameResult() {
        return getListItemsByListNameResult;
    }


    /**
     * Sets the getListItemsByListNameResult value for this GetListItemsByListNameResponse.
     * 
     * @param getListItemsByListNameResult
     */
    public void setGetListItemsByListNameResult(com.esri.geoevent.solutions.webeoc7.esi911.com.GetListItemsByListNameResponseGetListItemsByListNameResult getListItemsByListNameResult) {
        this.getListItemsByListNameResult = getListItemsByListNameResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetListItemsByListNameResponse)) return false;
        GetListItemsByListNameResponse other = (GetListItemsByListNameResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getListItemsByListNameResult==null && other.getGetListItemsByListNameResult()==null) || 
             (this.getListItemsByListNameResult!=null &&
              this.getListItemsByListNameResult.equals(other.getGetListItemsByListNameResult())));
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
        if (getGetListItemsByListNameResult() != null) {
            _hashCode += getGetListItemsByListNameResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetListItemsByListNameResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", ">GetListItemsByListNameResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getListItemsByListNameResult");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "GetListItemsByListNameResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", ">>GetListItemsByListNameResponse>GetListItemsByListNameResult"));
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
