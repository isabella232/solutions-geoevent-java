/**
 * CustomFilter.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.esri.geoevent.solutions.webeoc7.esi911.com;

public class CustomFilter  implements java.io.Serializable {
    private com.esri.geoevent.solutions.webeoc7.esi911.com.CustomFilterItem[] customFilterItems;

    private com.esri.geoevent.solutions.webeoc7.esi911.com.CustomFilterBoolean customFilterBoolean;

    public CustomFilter() {
    }

    public CustomFilter(
           com.esri.geoevent.solutions.webeoc7.esi911.com.CustomFilterItem[] customFilterItems,
           com.esri.geoevent.solutions.webeoc7.esi911.com.CustomFilterBoolean customFilterBoolean) {
           this.customFilterItems = customFilterItems;
           this.customFilterBoolean = customFilterBoolean;
    }


    /**
     * Gets the customFilterItems value for this CustomFilter.
     * 
     * @return customFilterItems
     */
    public com.esri.geoevent.solutions.webeoc7.esi911.com.CustomFilterItem[] getCustomFilterItems() {
        return customFilterItems;
    }


    /**
     * Sets the customFilterItems value for this CustomFilter.
     * 
     * @param customFilterItems
     */
    public void setCustomFilterItems(com.esri.geoevent.solutions.webeoc7.esi911.com.CustomFilterItem[] customFilterItems) {
        this.customFilterItems = customFilterItems;
    }


    /**
     * Gets the customFilterBoolean value for this CustomFilter.
     * 
     * @return customFilterBoolean
     */
    public com.esri.geoevent.solutions.webeoc7.esi911.com.CustomFilterBoolean getCustomFilterBoolean() {
        return customFilterBoolean;
    }


    /**
     * Sets the customFilterBoolean value for this CustomFilter.
     * 
     * @param customFilterBoolean
     */
    public void setCustomFilterBoolean(com.esri.geoevent.solutions.webeoc7.esi911.com.CustomFilterBoolean customFilterBoolean) {
        this.customFilterBoolean = customFilterBoolean;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomFilter)) return false;
        CustomFilter other = (CustomFilter) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.customFilterItems==null && other.getCustomFilterItems()==null) || 
             (this.customFilterItems!=null &&
              java.util.Arrays.equals(this.customFilterItems, other.getCustomFilterItems()))) &&
            ((this.customFilterBoolean==null && other.getCustomFilterBoolean()==null) || 
             (this.customFilterBoolean!=null &&
              this.customFilterBoolean.equals(other.getCustomFilterBoolean())));
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
        if (getCustomFilterItems() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCustomFilterItems());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCustomFilterItems(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCustomFilterBoolean() != null) {
            _hashCode += getCustomFilterBoolean().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustomFilter.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "CustomFilter"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customFilterItems");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "CustomFilterItems"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "CustomFilterItem"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "CustomFilterItem"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customFilterBoolean");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "CustomFilterBoolean"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "CustomFilterBoolean"));
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
