/**
 * Animal.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.TutoSoapWCFCSharp_Entities;

public class Animal  implements java.io.Serializable {
    private java.lang.Integer animalId;

    private java.lang.String name;

    private org.datacontract.schemas._2004._07.TutoSoapWCFCSharp_Entities.Race race;

    public Animal() {
    }

    public Animal(
           java.lang.Integer animalId,
           java.lang.String name,
           org.datacontract.schemas._2004._07.TutoSoapWCFCSharp_Entities.Race race) {
           this.animalId = animalId;
           this.name = name;
           this.race = race;
    }


    /**
     * Gets the animalId value for this Animal.
     * 
     * @return animalId
     */
    public java.lang.Integer getAnimalId() {
        return animalId;
    }


    /**
     * Sets the animalId value for this Animal.
     * 
     * @param animalId
     */
    public void setAnimalId(java.lang.Integer animalId) {
        this.animalId = animalId;
    }


    /**
     * Gets the name value for this Animal.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Animal.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the race value for this Animal.
     * 
     * @return race
     */
    public org.datacontract.schemas._2004._07.TutoSoapWCFCSharp_Entities.Race getRace() {
        return race;
    }


    /**
     * Sets the race value for this Animal.
     * 
     * @param race
     */
    public void setRace(org.datacontract.schemas._2004._07.TutoSoapWCFCSharp_Entities.Race race) {
        this.race = race;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Animal)) return false;
        Animal other = (Animal) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.animalId==null && other.getAnimalId()==null) || 
             (this.animalId!=null &&
              this.animalId.equals(other.getAnimalId()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.race==null && other.getRace()==null) || 
             (this.race!=null &&
              this.race.equals(other.getRace())));
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
        if (getAnimalId() != null) {
            _hashCode += getAnimalId().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getRace() != null) {
            _hashCode += getRace().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Animal.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TutoSoapWCFCSharp.Entities", "Animal"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("animalId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TutoSoapWCFCSharp.Entities", "AnimalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TutoSoapWCFCSharp.Entities", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("race");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TutoSoapWCFCSharp.Entities", "race"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TutoSoapWCFCSharp.Entities", "Race"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
