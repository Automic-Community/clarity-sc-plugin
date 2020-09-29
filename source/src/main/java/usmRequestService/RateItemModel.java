/**
 * RateItemModel.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package usmRequestService;

public class RateItemModel  implements java.io.Serializable {
    private java.lang.String createdByUserId;

    private java.lang.String createdDate;

    private java.lang.String modelUUID;

    private int rateItemID;

    public RateItemModel() {
    }

    public RateItemModel(
           java.lang.String createdByUserId,
           java.lang.String createdDate,
           java.lang.String modelUUID,
           int rateItemID) {
           this.createdByUserId = createdByUserId;
           this.createdDate = createdDate;
           this.modelUUID = modelUUID;
           this.rateItemID = rateItemID;
    }


    /**
     * Gets the createdByUserId value for this RateItemModel.
     * 
     * @return createdByUserId
     */
    public java.lang.String getCreatedByUserId() {
        return createdByUserId;
    }


    /**
     * Sets the createdByUserId value for this RateItemModel.
     * 
     * @param createdByUserId
     */
    public void setCreatedByUserId(java.lang.String createdByUserId) {
        this.createdByUserId = createdByUserId;
    }


    /**
     * Gets the createdDate value for this RateItemModel.
     * 
     * @return createdDate
     */
    public java.lang.String getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this RateItemModel.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.lang.String createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the modelUUID value for this RateItemModel.
     * 
     * @return modelUUID
     */
    public java.lang.String getModelUUID() {
        return modelUUID;
    }


    /**
     * Sets the modelUUID value for this RateItemModel.
     * 
     * @param modelUUID
     */
    public void setModelUUID(java.lang.String modelUUID) {
        this.modelUUID = modelUUID;
    }


    /**
     * Gets the rateItemID value for this RateItemModel.
     * 
     * @return rateItemID
     */
    public int getRateItemID() {
        return rateItemID;
    }


    /**
     * Sets the rateItemID value for this RateItemModel.
     * 
     * @param rateItemID
     */
    public void setRateItemID(int rateItemID) {
        this.rateItemID = rateItemID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RateItemModel)) return false;
        RateItemModel other = (RateItemModel) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.createdByUserId==null && other.getCreatedByUserId()==null) || 
             (this.createdByUserId!=null &&
              this.createdByUserId.equals(other.getCreatedByUserId()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.modelUUID==null && other.getModelUUID()==null) || 
             (this.modelUUID!=null &&
              this.modelUUID.equals(other.getModelUUID()))) &&
            this.rateItemID == other.getRateItemID();
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
        if (getCreatedByUserId() != null) {
            _hashCode += getCreatedByUserId().hashCode();
        }
        if (getCreatedDate() != null) {
            _hashCode += getCreatedDate().hashCode();
        }
        if (getModelUUID() != null) {
            _hashCode += getModelUUID().hashCode();
        }
        _hashCode += getRateItemID();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RateItemModel.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:usmRequestService", "RateItemModel"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdByUserId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "createdByUserId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "createdDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modelUUID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "modelUUID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rateItemID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rateItemID"));
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
