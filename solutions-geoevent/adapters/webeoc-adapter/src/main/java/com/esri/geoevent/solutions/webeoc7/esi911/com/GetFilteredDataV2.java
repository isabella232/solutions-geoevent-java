/**
 * GetFilteredDataV2.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.esri.geoevent.solutions.webeoc7.esi911.com;

public class GetFilteredDataV2  implements java.io.Serializable {
    private com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials credentials;

    private java.lang.String boardName;

    private java.lang.String displayViewName;

    private java.lang.String[] viewFilterNames;

    private java.lang.String xmlUserFilter;

    private com.esri.geoevent.solutions.webeoc7.esi911.com.CustomFilter customFilter;

    public GetFilteredDataV2() {
    }

    public GetFilteredDataV2(
           com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials credentials,
           java.lang.String boardName,
           java.lang.String displayViewName,
           java.lang.String[] viewFilterNames,
           java.lang.String xmlUserFilter,
           com.esri.geoevent.solutions.webeoc7.esi911.com.CustomFilter customFilter) {
           this.credentials = credentials;
           this.boardName = boardName;
           this.displayViewName = displayViewName;
           this.viewFilterNames = viewFilterNames;
           this.xmlUserFilter = xmlUserFilter;
           this.customFilter = customFilter;
    }


    /**
     * Gets the credentials value for this GetFilteredDataV2.
     * 
     * @return credentials
     */
    public com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials getCredentials() {
        return credentials;
    }


    /**
     * Sets the credentials value for this GetFilteredDataV2.
     * 
     * @param credentials
     */
    public void setCredentials(com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials credentials) {
        this.credentials = credentials;
    }


    /**
     * Gets the boardName value for this GetFilteredDataV2.
     * 
     * @return boardName
     */
    public java.lang.String getBoardName() {
        return boardName;
    }


    /**
     * Sets the boardName value for this GetFilteredDataV2.
     * 
     * @param boardName
     */
    public void setBoardName(java.lang.String boardName) {
        this.boardName = boardName;
    }


    /**
     * Gets the displayViewName value for this GetFilteredDataV2.
     * 
     * @return displayViewName
     */
    public java.lang.String getDisplayViewName() {
        return displayViewName;
    }


    /**
     * Sets the displayViewName value for this GetFilteredDataV2.
     * 
     * @param displayViewName
     */
    public void setDisplayViewName(java.lang.String displayViewName) {
        this.displayViewName = displayViewName;
    }


    /**
     * Gets the viewFilterNames value for this GetFilteredDataV2.
     * 
     * @return viewFilterNames
     */
    public java.lang.String[] getViewFilterNames() {
        return viewFilterNames;
    }


    /**
     * Sets the viewFilterNames value for this GetFilteredDataV2.
     * 
     * @param viewFilterNames
     */
    public void setViewFilterNames(java.lang.String[] viewFilterNames) {
        this.viewFilterNames = viewFilterNames;
    }


    /**
     * Gets the xmlUserFilter value for this GetFilteredDataV2.
     * 
     * @return xmlUserFilter
     */
    public java.lang.String getXmlUserFilter() {
        return xmlUserFilter;
    }


    /**
     * Sets the xmlUserFilter value for this GetFilteredDataV2.
     * 
     * @param xmlUserFilter
     */
    public void setXmlUserFilter(java.lang.String xmlUserFilter) {
        this.xmlUserFilter = xmlUserFilter;
    }


    /**
     * Gets the customFilter value for this GetFilteredDataV2.
     * 
     * @return customFilter
     */
    public com.esri.geoevent.solutions.webeoc7.esi911.com.CustomFilter getCustomFilter() {
        return customFilter;
    }


    /**
     * Sets the customFilter value for this GetFilteredDataV2.
     * 
     * @param customFilter
     */
    public void setCustomFilter(com.esri.geoevent.solutions.webeoc7.esi911.com.CustomFilter customFilter) {
        this.customFilter = customFilter;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetFilteredDataV2)) return false;
        GetFilteredDataV2 other = (GetFilteredDataV2) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.credentials==null && other.getCredentials()==null) || 
             (this.credentials!=null &&
              this.credentials.equals(other.getCredentials()))) &&
            ((this.boardName==null && other.getBoardName()==null) || 
             (this.boardName!=null &&
              this.boardName.equals(other.getBoardName()))) &&
            ((this.displayViewName==null && other.getDisplayViewName()==null) || 
             (this.displayViewName!=null &&
              this.displayViewName.equals(other.getDisplayViewName()))) &&
            ((this.viewFilterNames==null && other.getViewFilterNames()==null) || 
             (this.viewFilterNames!=null &&
              java.util.Arrays.equals(this.viewFilterNames, other.getViewFilterNames()))) &&
            ((this.xmlUserFilter==null && other.getXmlUserFilter()==null) || 
             (this.xmlUserFilter!=null &&
              this.xmlUserFilter.equals(other.getXmlUserFilter()))) &&
            ((this.customFilter==null && other.getCustomFilter()==null) || 
             (this.customFilter!=null &&
              this.customFilter.equals(other.getCustomFilter())));
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
        if (getCredentials() != null) {
            _hashCode += getCredentials().hashCode();
        }
        if (getBoardName() != null) {
            _hashCode += getBoardName().hashCode();
        }
        if (getDisplayViewName() != null) {
            _hashCode += getDisplayViewName().hashCode();
        }
        if (getViewFilterNames() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getViewFilterNames());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getViewFilterNames(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getXmlUserFilter() != null) {
            _hashCode += getXmlUserFilter().hashCode();
        }
        if (getCustomFilter() != null) {
            _hashCode += getCustomFilter().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetFilteredDataV2.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", ">GetFilteredDataV2"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("credentials");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "credentials"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "WebEOCCredentials"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("boardName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "BoardName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("displayViewName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "DisplayViewName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("viewFilterNames");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "ViewFilterNames"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("xmlUserFilter");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "XmlUserFilter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customFilter");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "CustomFilter"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "CustomFilter"));
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
