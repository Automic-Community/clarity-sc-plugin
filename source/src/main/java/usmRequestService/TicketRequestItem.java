/**
 * TicketRequestItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package usmRequestService;

public class TicketRequestItem  implements java.io.Serializable {
    private java.lang.String persid;

    private java.lang.String refNum;

    private int requestID;

    private int requestItemID;

    public TicketRequestItem() {
    }

    public TicketRequestItem(
           java.lang.String persid,
           java.lang.String refNum,
           int requestID,
           int requestItemID) {
           this.persid = persid;
           this.refNum = refNum;
           this.requestID = requestID;
           this.requestItemID = requestItemID;
    }


    /**
     * Gets the persid value for this TicketRequestItem.
     * 
     * @return persid
     */
    public java.lang.String getPersid() {
        return persid;
    }


    /**
     * Sets the persid value for this TicketRequestItem.
     * 
     * @param persid
     */
    public void setPersid(java.lang.String persid) {
        this.persid = persid;
    }


    /**
     * Gets the refNum value for this TicketRequestItem.
     * 
     * @return refNum
     */
    public java.lang.String getRefNum() {
        return refNum;
    }


    /**
     * Sets the refNum value for this TicketRequestItem.
     * 
     * @param refNum
     */
    public void setRefNum(java.lang.String refNum) {
        this.refNum = refNum;
    }


    /**
     * Gets the requestID value for this TicketRequestItem.
     * 
     * @return requestID
     */
    public int getRequestID() {
        return requestID;
    }


    /**
     * Sets the requestID value for this TicketRequestItem.
     * 
     * @param requestID
     */
    public void setRequestID(int requestID) {
        this.requestID = requestID;
    }


    /**
     * Gets the requestItemID value for this TicketRequestItem.
     * 
     * @return requestItemID
     */
    public int getRequestItemID() {
        return requestItemID;
    }


    /**
     * Sets the requestItemID value for this TicketRequestItem.
     * 
     * @param requestItemID
     */
    public void setRequestItemID(int requestItemID) {
        this.requestItemID = requestItemID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TicketRequestItem)) return false;
        TicketRequestItem other = (TicketRequestItem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.persid==null && other.getPersid()==null) || 
             (this.persid!=null &&
              this.persid.equals(other.getPersid()))) &&
            ((this.refNum==null && other.getRefNum()==null) || 
             (this.refNum!=null &&
              this.refNum.equals(other.getRefNum()))) &&
            this.requestID == other.getRequestID() &&
            this.requestItemID == other.getRequestItemID();
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
        if (getPersid() != null) {
            _hashCode += getPersid().hashCode();
        }
        if (getRefNum() != null) {
            _hashCode += getRefNum().hashCode();
        }
        _hashCode += getRequestID();
        _hashCode += getRequestItemID();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TicketRequestItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:usmRequestService", "TicketRequestItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("persid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "persid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("refNum");
        elemField.setXmlName(new javax.xml.namespace.QName("", "refNum"));
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
        elemField.setFieldName("requestItemID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "requestItemID"));
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
