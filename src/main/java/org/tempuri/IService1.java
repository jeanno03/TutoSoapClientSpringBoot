/**
 * IService1.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public interface IService1 extends java.rmi.Remote {
    public java.lang.String getData(java.lang.Integer value) throws java.rmi.RemoteException;
    public org.datacontract.schemas._2004._07.TutoSoapWCFCSharp.CompositeType getDataUsingDataContract(org.datacontract.schemas._2004._07.TutoSoapWCFCSharp.CompositeType composite) throws java.rmi.RemoteException;
    public org.datacontract.schemas._2004._07.TutoSoapWCFCSharp_Entities.Race getRaceExample() throws java.rmi.RemoteException;
}
