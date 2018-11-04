/**
 * Race.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.TutoSoapWCFCSharp_Entities;

public class Race  implements java.io.Serializable {
    private org.datacontract.schemas._2004._07.TutoSoapWCFCSharp_Entities.Animal[] animals;

    private java.lang.String name;

    private java.lang.Integer raceId;

    public Race() {
    }

    public Race(
           org.datacontract.schemas._2004._07.TutoSoapWCFCSharp_Entities.Animal[] animals,
           java.lang.String name,
           java.lang.Integer raceId) {
           this.animals = animals;
           this.name = name;
           this.raceId = raceId;
    }


    /**
     * Gets the animals value for this Race.
     * 
     * @return animals
     */
    public org.datacontract.schemas._2004._07.TutoSoapWCFCSharp_Entities.Animal[] getAnimals() {
        return animals;
    }


    /**
     * Sets the animals value for this Race.
     * 
     * @param animals
     */
    public void setAnimals(org.datacontract.schemas._2004._07.TutoSoapWCFCSharp_Entities.Animal[] animals) {
        this.animals = animals;
    }


    /**
     * Gets the name value for this Race.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Race.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the raceId value for this Race.
     * 
     * @return raceId
     */
    public java.lang.Integer getRaceId() {
        return raceId;
    }


    /**
     * Sets the raceId value for this Race.
     * 
     * @param raceId
     */
    public void setRaceId(java.lang.Integer raceId) {
        this.raceId = raceId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Race)) return false;
        Race other = (Race) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.animals==null && other.getAnimals()==null) || 
             (this.animals!=null &&
              java.util.Arrays.equals(this.animals, other.getAnimals()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.raceId==null && other.getRaceId()==null) || 
             (this.raceId!=null &&
              this.raceId.equals(other.getRaceId())));
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
        if (getAnimals() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAnimals());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAnimals(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getRaceId() != null) {
            _hashCode += getRaceId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Race.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TutoSoapWCFCSharp.Entities", "Race"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("animals");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TutoSoapWCFCSharp.Entities", "Animals"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TutoSoapWCFCSharp.Entities", "Animal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TutoSoapWCFCSharp.Entities", "Animal"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TutoSoapWCFCSharp.Entities", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("raceId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TutoSoapWCFCSharp.Entities", "RaceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
