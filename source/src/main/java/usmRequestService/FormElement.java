/**
 * FormElement.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package usmRequestService;

public class FormElement  implements java.io.Serializable {
    private java.lang.String ID;

    private java.lang.String label;

    private java.lang.String labelValue;

    private int type;

    private java.lang.String value;

    public FormElement() {
    }

    public FormElement(
           java.lang.String ID,
           java.lang.String label,
           java.lang.String labelValue,
           int type,
           java.lang.String value) {
           this.ID = ID;
           this.label = label;
           this.labelValue = labelValue;
           this.type = type;
           this.value = value;
    }


    /**
     * Gets the ID value for this FormElement.
     * 
     * @return ID
     */
    public java.lang.String getID() {
        return ID;
    }


    /**
     * Sets the ID value for this FormElement.
     * 
     * @param ID
     */
    public void setID(java.lang.String ID) {
        this.ID = ID;
    }


    /**
     * Gets the label value for this FormElement.
     * 
     * @return label
     */
    public java.lang.String getLabel() {
        return label;
    }


    /**
     * Sets the label value for this FormElement.
     * 
     * @param label
     */
    public void setLabel(java.lang.String label) {
        this.label = label;
    }


    /**
     * Gets the labelValue value for this FormElement.
     * 
     * @return labelValue
     */
    public java.lang.String getLabelValue() {
        return labelValue;
    }


    /**
     * Sets the labelValue value for this FormElement.
     * 
     * @param labelValue
     */
    public void setLabelValue(java.lang.String labelValue) {
        this.labelValue = labelValue;
    }


    /**
     * Gets the type value for this FormElement.
     * 
     * @return type
     */
    public int getType() {
        return type;
    }


    /**
     * Sets the type value for this FormElement.
     * 
     * @param type
     */
    public void setType(int type) {
        this.type = type;
    }


    /**
     * Gets the value value for this FormElement.
     * 
     * @return value
     */
    public java.lang.String getValue() {
        return value;
    }


    /**
     * Sets the value value for this FormElement.
     * 
     * @param value
     */
    public void setValue(java.lang.String value) {
        this.value = value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FormElement)) return false;
        FormElement other = (FormElement) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ID==null && other.getID()==null) || 
             (this.ID!=null &&
              this.ID.equals(other.getID()))) &&
            ((this.label==null && other.getLabel()==null) || 
             (this.label!=null &&
              this.label.equals(other.getLabel()))) &&
            ((this.labelValue==null && other.getLabelValue()==null) || 
             (this.labelValue!=null &&
              this.labelValue.equals(other.getLabelValue()))) &&
            this.type == other.getType() &&
            ((this.value==null && other.getValue()==null) || 
             (this.value!=null &&
              this.value.equals(other.getValue())));
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
        if (getID() != null) {
            _hashCode += getID().hashCode();
        }
        if (getLabel() != null) {
            _hashCode += getLabel().hashCode();
        }
        if (getLabelValue() != null) {
            _hashCode += getLabelValue().hashCode();
        }
        _hashCode += getType();
        if (getValue() != null) {
            _hashCode += getValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FormElement.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:usmRequestService", "FormElement"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("label");
        elemField.setXmlName(new javax.xml.namespace.QName("", "label"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("labelValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "labelValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value");
        elemField.setXmlName(new javax.xml.namespace.QName("", "value"));
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
