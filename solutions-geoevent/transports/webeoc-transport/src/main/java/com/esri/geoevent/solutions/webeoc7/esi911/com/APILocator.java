/**
 * APILocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.esri.geoevent.solutions.webeoc7.esi911.com;

public class APILocator extends org.apache.axis.client.Service implements com.esri.geoevent.solutions.webeoc7.esi911.com.API {

    public APILocator() {
    }


    public APILocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public APILocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for APISoap
    private java.lang.String APISoap_address = "https://webeoc.chs.state.ma.us/eoc7/api.asmx";

    public java.lang.String getAPISoapAddress() {
        return APISoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String APISoapWSDDServiceName = "APISoap";

    public java.lang.String getAPISoapWSDDServiceName() {
        return APISoapWSDDServiceName;
    }

    public void setAPISoapWSDDServiceName(java.lang.String name) {
        APISoapWSDDServiceName = name;
    }

    public com.esri.geoevent.solutions.webeoc7.esi911.com.APISoap getAPISoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(APISoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getAPISoap(endpoint);
    }

    public com.esri.geoevent.solutions.webeoc7.esi911.com.APISoap getAPISoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.esri.geoevent.solutions.webeoc7.esi911.com.APISoapStub _stub = new com.esri.geoevent.solutions.webeoc7.esi911.com.APISoapStub(portAddress, this);
            _stub.setPortName(getAPISoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setAPISoapEndpointAddress(java.lang.String address) {
        APISoap_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.esri.geoevent.solutions.webeoc7.esi911.com.APISoap.class.isAssignableFrom(serviceEndpointInterface)) {
                com.esri.geoevent.solutions.webeoc7.esi911.com.APISoapStub _stub = new com.esri.geoevent.solutions.webeoc7.esi911.com.APISoapStub(new java.net.URL(APISoap_address), this);
                _stub.setPortName(getAPISoapWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("APISoap".equals(inputPortName)) {
            return getAPISoap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "API");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:com:esi911:webeoc7:api:1.0", "APISoap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("APISoap".equals(portName)) {
            setAPISoapEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
