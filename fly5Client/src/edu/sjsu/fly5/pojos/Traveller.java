/**
 * Traveller.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package edu.sjsu.fly5.pojos;

public class Traveller  extends edu.sjsu.fly5.pojos.Person  implements java.io.Serializable {
    private java.lang.String nationality;

    private java.lang.String passportNumber;

    private java.lang.String travellerClass;

    private long travellerID;

    private java.lang.String travellerType;

    public Traveller() {
    }

    public Traveller(
           java.lang.String address,
           java.lang.String city,
           java.util.Calendar dateOfBirth,
           java.lang.String emailAddress,
           java.lang.String firstName,
           java.lang.String lastName,
           java.lang.String password,
           long personID,
           java.lang.String state,
           long zipcode,
           java.lang.String nationality,
           java.lang.String passportNumber,
           java.lang.String travellerClass,
           long travellerID,
           java.lang.String travellerType) {
        super(
            address,
            city,
            dateOfBirth,
            emailAddress,
            firstName,
            lastName,
            password,
            personID,
            state,
            zipcode);
        this.nationality = nationality;
        this.passportNumber = passportNumber;
        this.travellerClass = travellerClass;
        this.travellerID = travellerID;
        this.travellerType = travellerType;
    }


    /**
     * Gets the nationality value for this Traveller.
     * 
     * @return nationality
     */
    public java.lang.String getNationality() {
        return nationality;
    }


    /**
     * Sets the nationality value for this Traveller.
     * 
     * @param nationality
     */
    public void setNationality(java.lang.String nationality) {
        this.nationality = nationality;
    }


    /**
     * Gets the passportNumber value for this Traveller.
     * 
     * @return passportNumber
     */
    public java.lang.String getPassportNumber() {
        return passportNumber;
    }


    /**
     * Sets the passportNumber value for this Traveller.
     * 
     * @param passportNumber
     */
    public void setPassportNumber(java.lang.String passportNumber) {
        this.passportNumber = passportNumber;
    }


    /**
     * Gets the travellerClass value for this Traveller.
     * 
     * @return travellerClass
     */
    public java.lang.String getTravellerClass() {
        return travellerClass;
    }


    /**
     * Sets the travellerClass value for this Traveller.
     * 
     * @param travellerClass
     */
    public void setTravellerClass(java.lang.String travellerClass) {
        this.travellerClass = travellerClass;
    }


    /**
     * Gets the travellerID value for this Traveller.
     * 
     * @return travellerID
     */
    public long getTravellerID() {
        return travellerID;
    }


    /**
     * Sets the travellerID value for this Traveller.
     * 
     * @param travellerID
     */
    public void setTravellerID(long travellerID) {
        this.travellerID = travellerID;
    }


    /**
     * Gets the travellerType value for this Traveller.
     * 
     * @return travellerType
     */
    public java.lang.String getTravellerType() {
        return travellerType;
    }


    /**
     * Sets the travellerType value for this Traveller.
     * 
     * @param travellerType
     */
    public void setTravellerType(java.lang.String travellerType) {
        this.travellerType = travellerType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Traveller)) return false;
        Traveller other = (Traveller) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.nationality==null && other.getNationality()==null) || 
             (this.nationality!=null &&
              this.nationality.equals(other.getNationality()))) &&
            ((this.passportNumber==null && other.getPassportNumber()==null) || 
             (this.passportNumber!=null &&
              this.passportNumber.equals(other.getPassportNumber()))) &&
            ((this.travellerClass==null && other.getTravellerClass()==null) || 
             (this.travellerClass!=null &&
              this.travellerClass.equals(other.getTravellerClass()))) &&
            this.travellerID == other.getTravellerID() &&
            ((this.travellerType==null && other.getTravellerType()==null) || 
             (this.travellerType!=null &&
              this.travellerType.equals(other.getTravellerType())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getNationality() != null) {
            _hashCode += getNationality().hashCode();
        }
        if (getPassportNumber() != null) {
            _hashCode += getPassportNumber().hashCode();
        }
        if (getTravellerClass() != null) {
            _hashCode += getTravellerClass().hashCode();
        }
        _hashCode += new Long(getTravellerID()).hashCode();
        if (getTravellerType() != null) {
            _hashCode += getTravellerType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Traveller.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://pojos.fly5.sjsu.edu", "Traveller"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nationality");
        elemField.setXmlName(new javax.xml.namespace.QName("http://pojos.fly5.sjsu.edu", "nationality"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("passportNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://pojos.fly5.sjsu.edu", "passportNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("travellerClass");
        elemField.setXmlName(new javax.xml.namespace.QName("http://pojos.fly5.sjsu.edu", "travellerClass"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("travellerID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://pojos.fly5.sjsu.edu", "travellerID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("travellerType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://pojos.fly5.sjsu.edu", "travellerType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
