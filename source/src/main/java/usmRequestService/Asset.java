/**
 * Asset.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package usmRequestService;

public class Asset  implements java.io.Serializable {
    private java.lang.String assetUUID;

    private int requestID;

    private int requestItemID;

    public Asset() {
    }

    public Asset(
           java.lang.String assetUUID,
           int requestID,
           int requestItemID) {
           this.assetUUID = assetUUID;
           this.requestID = requestID;
           this.requestItemID = requestItemID;
    }


    /**
     * Gets the assetUUID value for this Asset.
     * 
     * @return assetUUID
     */
    public java.lang.String getAssetUUID() {
        return assetUUID;
    }


    /**
     * Sets the assetUUID value for this Asset.
     * 
     * @param assetUUID
     */
    public void setAssetUUID(java.lang.String assetUUID) {
        this.assetUUID = assetUUID;
    }


    /**
     * Gets the requestID value for this Asset.
     * 
     * @return requestID
     */
    public int getRequestID() {
        return requestID;
    }


    /**
     * Sets the requestID value for this Asset.
     * 
     * @param requestID
     */
    public void setRequestID(int requestID) {
        this.requestID = requestID;
    }


    /**
     * Gets the requestItemID value for this Asset.
     * 
     * @return requestItemID
     */
    public int getRequestItemID() {
        return requestItemID;
    }


    /**
     * Sets the requestItemID value for this Asset.
     * 
     * @param requestItemID
     */
    public void setRequestItemID(int requestItemID) {
        this.requestItemID = requestItemID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Asset)) return false;
        Asset other = (Asset) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.assetUUID==null && other.getAssetUUID()==null) || 
             (this.assetUUID!=null &&
              this.assetUUID.equals(other.getAssetUUID()))) &&
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
        if (getAssetUUID() != null) {
            _hashCode += getAssetUUID().hashCode();
        }
        _hashCode += getRequestID();
        _hashCode += getRequestItemID();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Asset.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:usmRequestService", "Asset"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assetUUID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "assetUUID"));
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
