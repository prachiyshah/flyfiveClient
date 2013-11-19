/**
 * Flight.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package edu.sjsu.fly5.pojos;

public class Flight  implements java.io.Serializable {
    private java.lang.String arrivalTime;

    private java.lang.String availibilityDays;

    private double baseFare;

    private long crewID;

    private java.lang.String departureTime;

    private java.lang.String destination;

    private long distance;

    private java.lang.String flightID;

    private java.lang.String flightStatus;

    private long noOfSeats;

    private java.lang.String source;

    public Flight() {
    }

    public Flight(
           java.lang.String arrivalTime,
           java.lang.String availibilityDays,
           double baseFare,
           long crewID,
           java.lang.String departureTime,
           java.lang.String destination,
           long distance,
           java.lang.String flightID,
           java.lang.String flightStatus,
           long noOfSeats,
           java.lang.String source) {
           this.arrivalTime = arrivalTime;
           this.availibilityDays = availibilityDays;
           this.baseFare = baseFare;
           this.crewID = crewID;
           this.departureTime = departureTime;
           this.destination = destination;
           this.distance = distance;
           this.flightID = flightID;
           this.flightStatus = flightStatus;
           this.noOfSeats = noOfSeats;
           this.source = source;
    }


    /**
     * Gets the arrivalTime value for this Flight.
     * 
     * @return arrivalTime
     */
    public java.lang.String getArrivalTime() {
        return arrivalTime;
    }


    /**
     * Sets the arrivalTime value for this Flight.
     * 
     * @param arrivalTime
     */
    public void setArrivalTime(java.lang.String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }


    /**
     * Gets the availibilityDays value for this Flight.
     * 
     * @return availibilityDays
     */
    public java.lang.String getAvailibilityDays() {
        return availibilityDays;
    }


    /**
     * Sets the availibilityDays value for this Flight.
     * 
     * @param availibilityDays
     */
    public void setAvailibilityDays(java.lang.String availibilityDays) {
        this.availibilityDays = availibilityDays;
    }


    /**
     * Gets the baseFare value for this Flight.
     * 
     * @return baseFare
     */
    public double getBaseFare() {
        return baseFare;
    }


    /**
     * Sets the baseFare value for this Flight.
     * 
     * @param baseFare
     */
    public void setBaseFare(double baseFare) {
        this.baseFare = baseFare;
    }


    /**
     * Gets the crewID value for this Flight.
     * 
     * @return crewID
     */
    public long getCrewID() {
        return crewID;
    }


    /**
     * Sets the crewID value for this Flight.
     * 
     * @param crewID
     */
    public void setCrewID(long crewID) {
        this.crewID = crewID;
    }


    /**
     * Gets the departureTime value for this Flight.
     * 
     * @return departureTime
     */
    public java.lang.String getDepartureTime() {
        return departureTime;
    }


    /**
     * Sets the departureTime value for this Flight.
     * 
     * @param departureTime
     */
    public void setDepartureTime(java.lang.String departureTime) {
        this.departureTime = departureTime;
    }


    /**
     * Gets the destination value for this Flight.
     * 
     * @return destination
     */
    public java.lang.String getDestination() {
        return destination;
    }


    /**
     * Sets the destination value for this Flight.
     * 
     * @param destination
     */
    public void setDestination(java.lang.String destination) {
        this.destination = destination;
    }


    /**
     * Gets the distance value for this Flight.
     * 
     * @return distance
     */
    public long getDistance() {
        return distance;
    }


    /**
     * Sets the distance value for this Flight.
     * 
     * @param distance
     */
    public void setDistance(long distance) {
        this.distance = distance;
    }


    /**
     * Gets the flightID value for this Flight.
     * 
     * @return flightID
     */
    public java.lang.String getFlightID() {
        return flightID;
    }


    /**
     * Sets the flightID value for this Flight.
     * 
     * @param flightID
     */
    public void setFlightID(java.lang.String flightID) {
        this.flightID = flightID;
    }


    /**
     * Gets the flightStatus value for this Flight.
     * 
     * @return flightStatus
     */
    public java.lang.String getFlightStatus() {
        return flightStatus;
    }


    /**
     * Sets the flightStatus value for this Flight.
     * 
     * @param flightStatus
     */
    public void setFlightStatus(java.lang.String flightStatus) {
        this.flightStatus = flightStatus;
    }


    /**
     * Gets the noOfSeats value for this Flight.
     * 
     * @return noOfSeats
     */
    public long getNoOfSeats() {
        return noOfSeats;
    }


    /**
     * Sets the noOfSeats value for this Flight.
     * 
     * @param noOfSeats
     */
    public void setNoOfSeats(long noOfSeats) {
        this.noOfSeats = noOfSeats;
    }


    /**
     * Gets the source value for this Flight.
     * 
     * @return source
     */
    public java.lang.String getSource() {
        return source;
    }


    /**
     * Sets the source value for this Flight.
     * 
     * @param source
     */
    public void setSource(java.lang.String source) {
        this.source = source;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Flight)) return false;
        Flight other = (Flight) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.arrivalTime==null && other.getArrivalTime()==null) || 
             (this.arrivalTime!=null &&
              this.arrivalTime.equals(other.getArrivalTime()))) &&
            ((this.availibilityDays==null && other.getAvailibilityDays()==null) || 
             (this.availibilityDays!=null &&
              this.availibilityDays.equals(other.getAvailibilityDays()))) &&
            this.baseFare == other.getBaseFare() &&
            this.crewID == other.getCrewID() &&
            ((this.departureTime==null && other.getDepartureTime()==null) || 
             (this.departureTime!=null &&
              this.departureTime.equals(other.getDepartureTime()))) &&
            ((this.destination==null && other.getDestination()==null) || 
             (this.destination!=null &&
              this.destination.equals(other.getDestination()))) &&
            this.distance == other.getDistance() &&
            ((this.flightID==null && other.getFlightID()==null) || 
             (this.flightID!=null &&
              this.flightID.equals(other.getFlightID()))) &&
            ((this.flightStatus==null && other.getFlightStatus()==null) || 
             (this.flightStatus!=null &&
              this.flightStatus.equals(other.getFlightStatus()))) &&
            this.noOfSeats == other.getNoOfSeats() &&
            ((this.source==null && other.getSource()==null) || 
             (this.source!=null &&
              this.source.equals(other.getSource())));
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
        if (getArrivalTime() != null) {
            _hashCode += getArrivalTime().hashCode();
        }
        if (getAvailibilityDays() != null) {
            _hashCode += getAvailibilityDays().hashCode();
        }
        _hashCode += new Double(getBaseFare()).hashCode();
        _hashCode += new Long(getCrewID()).hashCode();
        if (getDepartureTime() != null) {
            _hashCode += getDepartureTime().hashCode();
        }
        if (getDestination() != null) {
            _hashCode += getDestination().hashCode();
        }
        _hashCode += new Long(getDistance()).hashCode();
        if (getFlightID() != null) {
            _hashCode += getFlightID().hashCode();
        }
        if (getFlightStatus() != null) {
            _hashCode += getFlightStatus().hashCode();
        }
        _hashCode += new Long(getNoOfSeats()).hashCode();
        if (getSource() != null) {
            _hashCode += getSource().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Flight.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://pojos.fly5.sjsu.edu", "Flight"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arrivalTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://pojos.fly5.sjsu.edu", "arrivalTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("availibilityDays");
        elemField.setXmlName(new javax.xml.namespace.QName("http://pojos.fly5.sjsu.edu", "availibilityDays"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("baseFare");
        elemField.setXmlName(new javax.xml.namespace.QName("http://pojos.fly5.sjsu.edu", "baseFare"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("crewID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://pojos.fly5.sjsu.edu", "crewID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("departureTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://pojos.fly5.sjsu.edu", "departureTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destination");
        elemField.setXmlName(new javax.xml.namespace.QName("http://pojos.fly5.sjsu.edu", "destination"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("distance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://pojos.fly5.sjsu.edu", "distance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flightID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://pojos.fly5.sjsu.edu", "flightID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flightStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://pojos.fly5.sjsu.edu", "flightStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("noOfSeats");
        elemField.setXmlName(new javax.xml.namespace.QName("http://pojos.fly5.sjsu.edu", "noOfSeats"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("source");
        elemField.setXmlName(new javax.xml.namespace.QName("http://pojos.fly5.sjsu.edu", "source"));
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
