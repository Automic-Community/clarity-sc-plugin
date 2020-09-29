/**
 * FormItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package usmRequestService;

public class FormItem  implements java.io.Serializable {
    private java.lang.String fileName;

    private usmRequestService.FormElement[] form;

    private java.lang.String formName;

    private int offeringID;

    private int rateItemID;

    private int ratePlanID;

    private int subscriptionDetailID;

    public FormItem() {
    }

    public FormItem(
           java.lang.String fileName,
           usmRequestService.FormElement[] form,
           java.lang.String formName,
           int offeringID,
           int rateItemID,
           int ratePlanID,
           int subscriptionDetailID) {
           this.fileName = fileName;
           this.form = form;
           this.formName = formName;
           this.offeringID = offeringID;
           this.rateItemID = rateItemID;
           this.ratePlanID = ratePlanID;
           this.subscriptionDetailID = subscriptionDetailID;
    }


    /**
     * Gets the fileName value for this FormItem.
     * 
     * @return fileName
     */
    public java.lang.String getFileName() {
        return fileName;
    }


    /**
     * Sets the fileName value for this FormItem.
     * 
     * @param fileName
     */
    public void setFileName(java.lang.String fileName) {
        this.fileName = fileName;
    }


    /**
     * Gets the form value for this FormItem.
     * 
     * @return form
     */
    public usmRequestService.FormElement[] getForm() {
        return form;
    }


    /**
     * Sets the form value for this FormItem.
     * 
     * @param form
     */
    public void setForm(usmRequestService.FormElement[] form) {
        this.form = form;
    }


    /**
     * Gets the formName value for this FormItem.
     * 
     * @return formName
     */
    public java.lang.String getFormName() {
        return formName;
    }


    /**
     * Sets the formName value for this FormItem.
     * 
     * @param formName
     */
    public void setFormName(java.lang.String formName) {
        this.formName = formName;
    }


    /**
     * Gets the offeringID value for this FormItem.
     * 
     * @return offeringID
     */
    public int getOfferingID() {
        return offeringID;
    }


    /**
     * Sets the offeringID value for this FormItem.
     * 
     * @param offeringID
     */
    public void setOfferingID(int offeringID) {
        this.offeringID = offeringID;
    }


    /**
     * Gets the rateItemID value for this FormItem.
     * 
     * @return rateItemID
     */
    public int getRateItemID() {
        return rateItemID;
    }


    /**
     * Sets the rateItemID value for this FormItem.
     * 
     * @param rateItemID
     */
    public void setRateItemID(int rateItemID) {
        this.rateItemID = rateItemID;
    }


    /**
     * Gets the ratePlanID value for this FormItem.
     * 
     * @return ratePlanID
     */
    public int getRatePlanID() {
        return ratePlanID;
    }


    /**
     * Sets the ratePlanID value for this FormItem.
     * 
     * @param ratePlanID
     */
    public void setRatePlanID(int ratePlanID) {
        this.ratePlanID = ratePlanID;
    }


    /**
     * Gets the subscriptionDetailID value for this FormItem.
     * 
     * @return subscriptionDetailID
     */
    public int getSubscriptionDetailID() {
        return subscriptionDetailID;
    }


    /**
     * Sets the subscriptionDetailID value for this FormItem.
     * 
     * @param subscriptionDetailID
     */
    public void setSubscriptionDetailID(int subscriptionDetailID) {
        this.subscriptionDetailID = subscriptionDetailID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FormItem)) return false;
        FormItem other = (FormItem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.fileName==null && other.getFileName()==null) || 
             (this.fileName!=null &&
              this.fileName.equals(other.getFileName()))) &&
            ((this.form==null && other.getForm()==null) || 
             (this.form!=null &&
              java.util.Arrays.equals(this.form, other.getForm()))) &&
            ((this.formName==null && other.getFormName()==null) || 
             (this.formName!=null &&
              this.formName.equals(other.getFormName()))) &&
            this.offeringID == other.getOfferingID() &&
            this.rateItemID == other.getRateItemID() &&
            this.ratePlanID == other.getRatePlanID() &&
            this.subscriptionDetailID == other.getSubscriptionDetailID();
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
        if (getFileName() != null) {
            _hashCode += getFileName().hashCode();
        }
        if (getForm() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getForm());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getForm(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFormName() != null) {
            _hashCode += getFormName().hashCode();
        }
        _hashCode += getOfferingID();
        _hashCode += getRateItemID();
        _hashCode += getRatePlanID();
        _hashCode += getSubscriptionDetailID();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FormItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:usmRequestService", "FormItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fileName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("form");
        elemField.setXmlName(new javax.xml.namespace.QName("", "form"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:usmRequestService", "FormElement"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("formName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "formName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offeringID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "offeringID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rateItemID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rateItemID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ratePlanID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ratePlanID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriptionDetailID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "subscriptionDetailID"));
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
