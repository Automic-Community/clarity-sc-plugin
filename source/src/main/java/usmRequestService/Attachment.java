/**
 * Attachment.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package usmRequestService;

public class Attachment  implements java.io.Serializable {
    private java.lang.String BU;

    private java.lang.String URL;

    private java.lang.String attachmentID;

    private java.lang.String createdDate;

    private java.lang.String description;

    private java.lang.String fileName;

    private long fileSize;

    private java.lang.String icon;

    private java.lang.String lastModifiedBy;

    private java.lang.String mimeType;

    private java.lang.String modifiedDate;

    private int objectID;

    private int objectType;

    private java.lang.String parentBU;

    private int subscriptionID;

    public Attachment() {
    }

    public Attachment(
           java.lang.String BU,
           java.lang.String URL,
           java.lang.String attachmentID,
           java.lang.String createdDate,
           java.lang.String description,
           java.lang.String fileName,
           long fileSize,
           java.lang.String icon,
           java.lang.String lastModifiedBy,
           java.lang.String mimeType,
           java.lang.String modifiedDate,
           int objectID,
           int objectType,
           java.lang.String parentBU,
           int subscriptionID) {
           this.BU = BU;
           this.URL = URL;
           this.attachmentID = attachmentID;
           this.createdDate = createdDate;
           this.description = description;
           this.fileName = fileName;
           this.fileSize = fileSize;
           this.icon = icon;
           this.lastModifiedBy = lastModifiedBy;
           this.mimeType = mimeType;
           this.modifiedDate = modifiedDate;
           this.objectID = objectID;
           this.objectType = objectType;
           this.parentBU = parentBU;
           this.subscriptionID = subscriptionID;
    }


    /**
     * Gets the BU value for this Attachment.
     * 
     * @return BU
     */
    public java.lang.String getBU() {
        return BU;
    }


    /**
     * Sets the BU value for this Attachment.
     * 
     * @param BU
     */
    public void setBU(java.lang.String BU) {
        this.BU = BU;
    }


    /**
     * Gets the URL value for this Attachment.
     * 
     * @return URL
     */
    public java.lang.String getURL() {
        return URL;
    }


    /**
     * Sets the URL value for this Attachment.
     * 
     * @param URL
     */
    public void setURL(java.lang.String URL) {
        this.URL = URL;
    }


    /**
     * Gets the attachmentID value for this Attachment.
     * 
     * @return attachmentID
     */
    public java.lang.String getAttachmentID() {
        return attachmentID;
    }


    /**
     * Sets the attachmentID value for this Attachment.
     * 
     * @param attachmentID
     */
    public void setAttachmentID(java.lang.String attachmentID) {
        this.attachmentID = attachmentID;
    }


    /**
     * Gets the createdDate value for this Attachment.
     * 
     * @return createdDate
     */
    public java.lang.String getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this Attachment.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.lang.String createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the description value for this Attachment.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this Attachment.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the fileName value for this Attachment.
     * 
     * @return fileName
     */
    public java.lang.String getFileName() {
        return fileName;
    }


    /**
     * Sets the fileName value for this Attachment.
     * 
     * @param fileName
     */
    public void setFileName(java.lang.String fileName) {
        this.fileName = fileName;
    }


    /**
     * Gets the fileSize value for this Attachment.
     * 
     * @return fileSize
     */
    public long getFileSize() {
        return fileSize;
    }


    /**
     * Sets the fileSize value for this Attachment.
     * 
     * @param fileSize
     */
    public void setFileSize(long fileSize) {
        this.fileSize = fileSize;
    }


    /**
     * Gets the icon value for this Attachment.
     * 
     * @return icon
     */
    public java.lang.String getIcon() {
        return icon;
    }


    /**
     * Sets the icon value for this Attachment.
     * 
     * @param icon
     */
    public void setIcon(java.lang.String icon) {
        this.icon = icon;
    }


    /**
     * Gets the lastModifiedBy value for this Attachment.
     * 
     * @return lastModifiedBy
     */
    public java.lang.String getLastModifiedBy() {
        return lastModifiedBy;
    }


    /**
     * Sets the lastModifiedBy value for this Attachment.
     * 
     * @param lastModifiedBy
     */
    public void setLastModifiedBy(java.lang.String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }


    /**
     * Gets the mimeType value for this Attachment.
     * 
     * @return mimeType
     */
    public java.lang.String getMimeType() {
        return mimeType;
    }


    /**
     * Sets the mimeType value for this Attachment.
     * 
     * @param mimeType
     */
    public void setMimeType(java.lang.String mimeType) {
        this.mimeType = mimeType;
    }


    /**
     * Gets the modifiedDate value for this Attachment.
     * 
     * @return modifiedDate
     */
    public java.lang.String getModifiedDate() {
        return modifiedDate;
    }


    /**
     * Sets the modifiedDate value for this Attachment.
     * 
     * @param modifiedDate
     */
    public void setModifiedDate(java.lang.String modifiedDate) {
        this.modifiedDate = modifiedDate;
    }


    /**
     * Gets the objectID value for this Attachment.
     * 
     * @return objectID
     */
    public int getObjectID() {
        return objectID;
    }


    /**
     * Sets the objectID value for this Attachment.
     * 
     * @param objectID
     */
    public void setObjectID(int objectID) {
        this.objectID = objectID;
    }


    /**
     * Gets the objectType value for this Attachment.
     * 
     * @return objectType
     */
    public int getObjectType() {
        return objectType;
    }


    /**
     * Sets the objectType value for this Attachment.
     * 
     * @param objectType
     */
    public void setObjectType(int objectType) {
        this.objectType = objectType;
    }


    /**
     * Gets the parentBU value for this Attachment.
     * 
     * @return parentBU
     */
    public java.lang.String getParentBU() {
        return parentBU;
    }


    /**
     * Sets the parentBU value for this Attachment.
     * 
     * @param parentBU
     */
    public void setParentBU(java.lang.String parentBU) {
        this.parentBU = parentBU;
    }


    /**
     * Gets the subscriptionID value for this Attachment.
     * 
     * @return subscriptionID
     */
    public int getSubscriptionID() {
        return subscriptionID;
    }


    /**
     * Sets the subscriptionID value for this Attachment.
     * 
     * @param subscriptionID
     */
    public void setSubscriptionID(int subscriptionID) {
        this.subscriptionID = subscriptionID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Attachment)) return false;
        Attachment other = (Attachment) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.BU==null && other.getBU()==null) || 
             (this.BU!=null &&
              this.BU.equals(other.getBU()))) &&
            ((this.URL==null && other.getURL()==null) || 
             (this.URL!=null &&
              this.URL.equals(other.getURL()))) &&
            ((this.attachmentID==null && other.getAttachmentID()==null) || 
             (this.attachmentID!=null &&
              this.attachmentID.equals(other.getAttachmentID()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.fileName==null && other.getFileName()==null) || 
             (this.fileName!=null &&
              this.fileName.equals(other.getFileName()))) &&
            this.fileSize == other.getFileSize() &&
            ((this.icon==null && other.getIcon()==null) || 
             (this.icon!=null &&
              this.icon.equals(other.getIcon()))) &&
            ((this.lastModifiedBy==null && other.getLastModifiedBy()==null) || 
             (this.lastModifiedBy!=null &&
              this.lastModifiedBy.equals(other.getLastModifiedBy()))) &&
            ((this.mimeType==null && other.getMimeType()==null) || 
             (this.mimeType!=null &&
              this.mimeType.equals(other.getMimeType()))) &&
            ((this.modifiedDate==null && other.getModifiedDate()==null) || 
             (this.modifiedDate!=null &&
              this.modifiedDate.equals(other.getModifiedDate()))) &&
            this.objectID == other.getObjectID() &&
            this.objectType == other.getObjectType() &&
            ((this.parentBU==null && other.getParentBU()==null) || 
             (this.parentBU!=null &&
              this.parentBU.equals(other.getParentBU()))) &&
            this.subscriptionID == other.getSubscriptionID();
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
        if (getBU() != null) {
            _hashCode += getBU().hashCode();
        }
        if (getURL() != null) {
            _hashCode += getURL().hashCode();
        }
        if (getAttachmentID() != null) {
            _hashCode += getAttachmentID().hashCode();
        }
        if (getCreatedDate() != null) {
            _hashCode += getCreatedDate().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getFileName() != null) {
            _hashCode += getFileName().hashCode();
        }
        _hashCode += new Long(getFileSize()).hashCode();
        if (getIcon() != null) {
            _hashCode += getIcon().hashCode();
        }
        if (getLastModifiedBy() != null) {
            _hashCode += getLastModifiedBy().hashCode();
        }
        if (getMimeType() != null) {
            _hashCode += getMimeType().hashCode();
        }
        if (getModifiedDate() != null) {
            _hashCode += getModifiedDate().hashCode();
        }
        _hashCode += getObjectID();
        _hashCode += getObjectType();
        if (getParentBU() != null) {
            _hashCode += getParentBU().hashCode();
        }
        _hashCode += getSubscriptionID();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Attachment.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:usmRequestService", "Attachment"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BU");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BU"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("URL");
        elemField.setXmlName(new javax.xml.namespace.QName("", "URL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attachmentID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "attachmentID"));
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
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fileName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileSize");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fileSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("icon");
        elemField.setXmlName(new javax.xml.namespace.QName("", "icon"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastModifiedBy");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lastModifiedBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mimeType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mimeType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modifiedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "modifiedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("objectID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "objectID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("objectType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "objectType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentBU");
        elemField.setXmlName(new javax.xml.namespace.QName("", "parentBU"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriptionID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "subscriptionID"));
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
