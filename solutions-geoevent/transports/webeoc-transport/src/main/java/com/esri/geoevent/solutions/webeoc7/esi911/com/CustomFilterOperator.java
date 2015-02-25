/**
 * CustomFilterOperator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.esri.geoevent.solutions.webeoc7.esi911.com;

public class CustomFilterOperator implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected CustomFilterOperator(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _Equal = "Equal";
    public static final java.lang.String _LessThan = "LessThan";
    public static final java.lang.String _GreaterThan = "GreaterThan";
    public static final java.lang.String _LessThanOrEqual = "LessThanOrEqual";
    public static final java.lang.String _GreaterThanOrEqual = "GreaterThanOrEqual";
    public static final java.lang.String _Like = "Like";
    public static final CustomFilterOperator Equal = new CustomFilterOperator(_Equal);
    public static final CustomFilterOperator LessThan = new CustomFilterOperator(_LessThan);
    public static final CustomFilterOperator GreaterThan = new CustomFilterOperator(_GreaterThan);
    public static final CustomFilterOperator LessThanOrEqual = new CustomFilterOperator(_LessThanOrEqual);
    public static final CustomFilterOperator GreaterThanOrEqual = new CustomFilterOperator(_GreaterThanOrEqual);
    public static final CustomFilterOperator Like = new CustomFilterOperator(_Like);
    public java.lang.String getValue() { return _value_;}
    public static CustomFilterOperator fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        CustomFilterOperator enumeration = (CustomFilterOperator)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static CustomFilterOperator fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustomFilterOperator.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "CustomFilterOperator"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
