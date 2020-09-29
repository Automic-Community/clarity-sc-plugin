/**
 * RequestRelationship.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package usmRequestService;

public class RequestRelationship  implements java.io.Serializable {
    private java.lang.Long createdDate;

    private java.lang.String domain;

    private java.lang.Long modifiedDate;

    private int offeringID;

    private java.lang.String offeringName;

    private int requestID;

    private java.lang.String requestName;

    private int requestStatus;

    public RequestRelationship() {
    }

    public RequestRelationship(
           java.lang.Long createdDate,
           java.lang.String domain,
           java.lang.Long modifiedDate,
           int offeringID,
           java.lang.String offeringName,
           int requestID,
           java.lang.String requestName,
           int requestStatus) {
           this.createdDate = createdDate;
           this.domain = domain;
           this.modifiedDate = modifiedDate;
           this.offeringID = offeringID;
           this.offeringName = offeringName;
           this.requestID = requestID;
           this.requestName = requestName;
           this.requestStatus = requestStatus;
    }


    /**
     * Gets the createdDate value for this RequestRelationship.
     * 
     * @return createdDate
     */
    public java.lang.Long getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this RequestRelationship.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.lang.Long createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the domain value for this RequestRelationship.
     * 
     * @return domain
     */
    public java.lang.String getDomain() {
        return domain;
    }


    /**
     * Sets the domain value for this RequestRelationship.
     * 
     * @param domain
     */
    public void setDomain(java.lang.String domain) {
        this.domain = domain;
    }


    /**
     * Gets the modifiedDate value for this RequestRelationship.
     * 
     * @return modifiedDate
     */
    public java.lang.Long getModifiedDate() {
        return modifiedDate;
    }


    /**
     * Sets the modifiedDate value for this RequestRelationship.
     * 
     * @param modifiedDate
     */
    public void setModifiedDate(java.lang.Long modifiedDate) {
        this.modifiedDate = modifiedDate;
    }


    /**
     * Gets the offeringID value for this RequestRelationship.
     * 
     * @return offeringID
     */
    public int getOfferingID() {
        return offeringID;
    }


    /**
     * Sets the offeringID value for this RequestRelationship.
     * 
     * @param offeringID
     */
    public void setOfferingID(int offeringID) {
        this.offeringID = offeringID;
    }


    /**
     * Gets the offeringName value for this RequestRelationship.
     * 
     * @return offeringName
     */
    public java.lang.String getOfferingName() {
        return offeringName;
    }


    /**
     * Sets the offeringName value for this RequestRelationship.
     * 
     * @param offeringName
     */
    public void setOfferingName(java.lang.String offeringName) {
        this.offeringName = offeringName;
    }


    /**
     * Gets the requestID value for this RequestRelationship.
     * 
     * @return requestID
     */
    public int getRequestID() {
        return requestID;
    }


    /**
     * Sets the requestID value for this RequestRelationship.
     * 
     * @param requestID
     */
    public void setRequestID(int requestID) {
        this.requestID = requestID;
    }


    /**
     * Gets the requestName value for this RequestRelationship.
     * 
     * @return requestName
     */
    public java.lang.String getRequestName() {
        return requestName;
    }


    /**
     * Sets the requestName value for this RequestRelationship.
     * 
     * @param requestName
     */
    public void setRequestName(java.lang.String requestName) {
        this.requestName = requestName;
    }


    /**
     * Gets the requestStatus value for this RequestRelationship.
     * 
     * @return requestStatus
     */
    public int getRequestStatus() {
        return requestStatus;
    }


    /**
     * Sets the requestStatus value for this RequestRelationship.
     * 
     * @param requestStatus
     */
    public void setRequestStatus(int requestStatus) {
        this.requestStatus = requestStatus;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RequestRelationship)) return false;
        RequestRelationship other = (RequestRelationship) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.domain==null && other.getDomain()==null) || 
             (this.domain!=null &&
              this.domain.equals(other.getDomain()))) &&
            ((this.modifiedDate==null && other.getModifiedDate()==null) || 
             (this.modifiedDate!=null &&
              this.modifiedDate.equals(other.getModifiedDate()))) &&
            this.offeringID == other.getOfferingID() &&
            ((this.offeringName==null && other.getOfferingName()==null) || 
             (this.offeringName!=null &&
              this.offeringName.equals(other.getOfferingName()))) &&
            this.requestID == other.getRequestID() &&
            ((this.requestName==null && other.getRequestName()==null) || 
             (this.requestName!=null &&
              this.requestName.equals(other.getRequestName()))) &&
            this.requestStatus == other.getRequestStatus();
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
        if (getCreatedDate() != null) {
            _hashCode += getCreatedDate().hashCode();
        }
        if (getDomain() != null) {
            _hashCode += getDomain().hashCode();
        }
        if (getModifiedDate() != null) {
            _hashCode += getModifiedDate().hashCode();
        }
        _hashCode += getOfferingID();
        if (getOfferingName() != null) {
            _hashCode += getOfferingName().hashCode();
        }
        _hashCode += getRequestID();
        if (getRequestName() != null) {
            _hashCode += getRequestName().hashCode();
        }
        _hashCode += getRequestStatus();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RequestRelationship.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:usmRequestService", "RequestRelationship"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "createdDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("domain");
        elemField.setXmlName(new javax.xml.namespace.QName("", "domain"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modifiedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "modifiedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offeringID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "offeringID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offeringName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "offeringName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "requestID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "requestName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "requestStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
