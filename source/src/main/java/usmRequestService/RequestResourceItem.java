/**
 * RequestResourceItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package usmRequestService;

public class RequestResourceItem  implements java.io.Serializable {
    private java.lang.String createdDate;

    private java.lang.String id;

    private java.lang.String parentId;

    private int requestItemId;

    private java.lang.String resourceId;

    private java.lang.String resourceName;

    private java.lang.String resourceTypeId;

    private java.lang.String resourceUrl;

    private java.lang.String status;

    public RequestResourceItem() {
    }

    public RequestResourceItem(
           java.lang.String createdDate,
           java.lang.String id,
           java.lang.String parentId,
           int requestItemId,
           java.lang.String resourceId,
           java.lang.String resourceName,
           java.lang.String resourceTypeId,
           java.lang.String resourceUrl,
           java.lang.String status) {
           this.createdDate = createdDate;
           this.id = id;
           this.parentId = parentId;
           this.requestItemId = requestItemId;
           this.resourceId = resourceId;
           this.resourceName = resourceName;
           this.resourceTypeId = resourceTypeId;
           this.resourceUrl = resourceUrl;
           this.status = status;
    }


    /**
     * Gets the createdDate value for this RequestResourceItem.
     * 
     * @return createdDate
     */
    public java.lang.String getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this RequestResourceItem.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.lang.String createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the id value for this RequestResourceItem.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this RequestResourceItem.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the parentId value for this RequestResourceItem.
     * 
     * @return parentId
     */
    public java.lang.String getParentId() {
        return parentId;
    }


    /**
     * Sets the parentId value for this RequestResourceItem.
     * 
     * @param parentId
     */
    public void setParentId(java.lang.String parentId) {
        this.parentId = parentId;
    }


    /**
     * Gets the requestItemId value for this RequestResourceItem.
     * 
     * @return requestItemId
     */
    public int getRequestItemId() {
        return requestItemId;
    }


    /**
     * Sets the requestItemId value for this RequestResourceItem.
     * 
     * @param requestItemId
     */
    public void setRequestItemId(int requestItemId) {
        this.requestItemId = requestItemId;
    }


    /**
     * Gets the resourceId value for this RequestResourceItem.
     * 
     * @return resourceId
     */
    public java.lang.String getResourceId() {
        return resourceId;
    }


    /**
     * Sets the resourceId value for this RequestResourceItem.
     * 
     * @param resourceId
     */
    public void setResourceId(java.lang.String resourceId) {
        this.resourceId = resourceId;
    }


    /**
     * Gets the resourceName value for this RequestResourceItem.
     * 
     * @return resourceName
     */
    public java.lang.String getResourceName() {
        return resourceName;
    }


    /**
     * Sets the resourceName value for this RequestResourceItem.
     * 
     * @param resourceName
     */
    public void setResourceName(java.lang.String resourceName) {
        this.resourceName = resourceName;
    }


    /**
     * Gets the resourceTypeId value for this RequestResourceItem.
     * 
     * @return resourceTypeId
     */
    public java.lang.String getResourceTypeId() {
        return resourceTypeId;
    }


    /**
     * Sets the resourceTypeId value for this RequestResourceItem.
     * 
     * @param resourceTypeId
     */
    public void setResourceTypeId(java.lang.String resourceTypeId) {
        this.resourceTypeId = resourceTypeId;
    }


    /**
     * Gets the resourceUrl value for this RequestResourceItem.
     * 
     * @return resourceUrl
     */
    public java.lang.String getResourceUrl() {
        return resourceUrl;
    }


    /**
     * Sets the resourceUrl value for this RequestResourceItem.
     * 
     * @param resourceUrl
     */
    public void setResourceUrl(java.lang.String resourceUrl) {
        this.resourceUrl = resourceUrl;
    }


    /**
     * Gets the status value for this RequestResourceItem.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this RequestResourceItem.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RequestResourceItem)) return false;
        RequestResourceItem other = (RequestResourceItem) obj;
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
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.parentId==null && other.getParentId()==null) || 
             (this.parentId!=null &&
              this.parentId.equals(other.getParentId()))) &&
            this.requestItemId == other.getRequestItemId() &&
            ((this.resourceId==null && other.getResourceId()==null) || 
             (this.resourceId!=null &&
              this.resourceId.equals(other.getResourceId()))) &&
            ((this.resourceName==null && other.getResourceName()==null) || 
             (this.resourceName!=null &&
              this.resourceName.equals(other.getResourceName()))) &&
            ((this.resourceTypeId==null && other.getResourceTypeId()==null) || 
             (this.resourceTypeId!=null &&
              this.resourceTypeId.equals(other.getResourceTypeId()))) &&
            ((this.resourceUrl==null && other.getResourceUrl()==null) || 
             (this.resourceUrl!=null &&
              this.resourceUrl.equals(other.getResourceUrl()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus())));
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
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getParentId() != null) {
            _hashCode += getParentId().hashCode();
        }
        _hashCode += getRequestItemId();
        if (getResourceId() != null) {
            _hashCode += getResourceId().hashCode();
        }
        if (getResourceName() != null) {
            _hashCode += getResourceName().hashCode();
        }
        if (getResourceTypeId() != null) {
            _hashCode += getResourceTypeId().hashCode();
        }
        if (getResourceUrl() != null) {
            _hashCode += getResourceUrl().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RequestResourceItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:usmRequestService", "RequestResourceItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "createdDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "parentId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestItemId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "requestItemId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resourceId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "resourceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resourceName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "resourceName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resourceTypeId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "resourceTypeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resourceUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "resourceUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
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
