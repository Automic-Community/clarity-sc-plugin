/**
 * Note.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package usmRequestService;

public class Note  implements java.io.Serializable {
    private java.lang.String accountID;

    private java.lang.String createdDate;

    private java.lang.String domain;

    private int noteID;

    private java.lang.String noteText;

    private int noteType;

    private int ref1;

    private int ref2;

    private int ref3;

    private int sourceID;

    private int sourceType;

    private int status;

    private int type1;

    private int type2;

    private int type3;

    private java.lang.String userID;

    public Note() {
    }

    public Note(
           java.lang.String accountID,
           java.lang.String createdDate,
           java.lang.String domain,
           int noteID,
           java.lang.String noteText,
           int noteType,
           int ref1,
           int ref2,
           int ref3,
           int sourceID,
           int sourceType,
           int status,
           int type1,
           int type2,
           int type3,
           java.lang.String userID) {
           this.accountID = accountID;
           this.createdDate = createdDate;
           this.domain = domain;
           this.noteID = noteID;
           this.noteText = noteText;
           this.noteType = noteType;
           this.ref1 = ref1;
           this.ref2 = ref2;
           this.ref3 = ref3;
           this.sourceID = sourceID;
           this.sourceType = sourceType;
           this.status = status;
           this.type1 = type1;
           this.type2 = type2;
           this.type3 = type3;
           this.userID = userID;
    }


    /**
     * Gets the accountID value for this Note.
     * 
     * @return accountID
     */
    public java.lang.String getAccountID() {
        return accountID;
    }


    /**
     * Sets the accountID value for this Note.
     * 
     * @param accountID
     */
    public void setAccountID(java.lang.String accountID) {
        this.accountID = accountID;
    }


    /**
     * Gets the createdDate value for this Note.
     * 
     * @return createdDate
     */
    public java.lang.String getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this Note.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.lang.String createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the domain value for this Note.
     * 
     * @return domain
     */
    public java.lang.String getDomain() {
        return domain;
    }


    /**
     * Sets the domain value for this Note.
     * 
     * @param domain
     */
    public void setDomain(java.lang.String domain) {
        this.domain = domain;
    }


    /**
     * Gets the noteID value for this Note.
     * 
     * @return noteID
     */
    public int getNoteID() {
        return noteID;
    }


    /**
     * Sets the noteID value for this Note.
     * 
     * @param noteID
     */
    public void setNoteID(int noteID) {
        this.noteID = noteID;
    }


    /**
     * Gets the noteText value for this Note.
     * 
     * @return noteText
     */
    public java.lang.String getNoteText() {
        return noteText;
    }


    /**
     * Sets the noteText value for this Note.
     * 
     * @param noteText
     */
    public void setNoteText(java.lang.String noteText) {
        this.noteText = noteText;
    }


    /**
     * Gets the noteType value for this Note.
     * 
     * @return noteType
     */
    public int getNoteType() {
        return noteType;
    }


    /**
     * Sets the noteType value for this Note.
     * 
     * @param noteType
     */
    public void setNoteType(int noteType) {
        this.noteType = noteType;
    }


    /**
     * Gets the ref1 value for this Note.
     * 
     * @return ref1
     */
    public int getRef1() {
        return ref1;
    }


    /**
     * Sets the ref1 value for this Note.
     * 
     * @param ref1
     */
    public void setRef1(int ref1) {
        this.ref1 = ref1;
    }


    /**
     * Gets the ref2 value for this Note.
     * 
     * @return ref2
     */
    public int getRef2() {
        return ref2;
    }


    /**
     * Sets the ref2 value for this Note.
     * 
     * @param ref2
     */
    public void setRef2(int ref2) {
        this.ref2 = ref2;
    }


    /**
     * Gets the ref3 value for this Note.
     * 
     * @return ref3
     */
    public int getRef3() {
        return ref3;
    }


    /**
     * Sets the ref3 value for this Note.
     * 
     * @param ref3
     */
    public void setRef3(int ref3) {
        this.ref3 = ref3;
    }


    /**
     * Gets the sourceID value for this Note.
     * 
     * @return sourceID
     */
    public int getSourceID() {
        return sourceID;
    }


    /**
     * Sets the sourceID value for this Note.
     * 
     * @param sourceID
     */
    public void setSourceID(int sourceID) {
        this.sourceID = sourceID;
    }


    /**
     * Gets the sourceType value for this Note.
     * 
     * @return sourceType
     */
    public int getSourceType() {
        return sourceType;
    }


    /**
     * Sets the sourceType value for this Note.
     * 
     * @param sourceType
     */
    public void setSourceType(int sourceType) {
        this.sourceType = sourceType;
    }


    /**
     * Gets the status value for this Note.
     * 
     * @return status
     */
    public int getStatus() {
        return status;
    }


    /**
     * Sets the status value for this Note.
     * 
     * @param status
     */
    public void setStatus(int status) {
        this.status = status;
    }


    /**
     * Gets the type1 value for this Note.
     * 
     * @return type1
     */
    public int getType1() {
        return type1;
    }


    /**
     * Sets the type1 value for this Note.
     * 
     * @param type1
     */
    public void setType1(int type1) {
        this.type1 = type1;
    }


    /**
     * Gets the type2 value for this Note.
     * 
     * @return type2
     */
    public int getType2() {
        return type2;
    }


    /**
     * Sets the type2 value for this Note.
     * 
     * @param type2
     */
    public void setType2(int type2) {
        this.type2 = type2;
    }


    /**
     * Gets the type3 value for this Note.
     * 
     * @return type3
     */
    public int getType3() {
        return type3;
    }


    /**
     * Sets the type3 value for this Note.
     * 
     * @param type3
     */
    public void setType3(int type3) {
        this.type3 = type3;
    }


    /**
     * Gets the userID value for this Note.
     * 
     * @return userID
     */
    public java.lang.String getUserID() {
        return userID;
    }


    /**
     * Sets the userID value for this Note.
     * 
     * @param userID
     */
    public void setUserID(java.lang.String userID) {
        this.userID = userID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Note)) return false;
        Note other = (Note) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.accountID==null && other.getAccountID()==null) || 
             (this.accountID!=null &&
              this.accountID.equals(other.getAccountID()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.domain==null && other.getDomain()==null) || 
             (this.domain!=null &&
              this.domain.equals(other.getDomain()))) &&
            this.noteID == other.getNoteID() &&
            ((this.noteText==null && other.getNoteText()==null) || 
             (this.noteText!=null &&
              this.noteText.equals(other.getNoteText()))) &&
            this.noteType == other.getNoteType() &&
            this.ref1 == other.getRef1() &&
            this.ref2 == other.getRef2() &&
            this.ref3 == other.getRef3() &&
            this.sourceID == other.getSourceID() &&
            this.sourceType == other.getSourceType() &&
            this.status == other.getStatus() &&
            this.type1 == other.getType1() &&
            this.type2 == other.getType2() &&
            this.type3 == other.getType3() &&
            ((this.userID==null && other.getUserID()==null) || 
             (this.userID!=null &&
              this.userID.equals(other.getUserID())));
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
        if (getAccountID() != null) {
            _hashCode += getAccountID().hashCode();
        }
        if (getCreatedDate() != null) {
            _hashCode += getCreatedDate().hashCode();
        }
        if (getDomain() != null) {
            _hashCode += getDomain().hashCode();
        }
        _hashCode += getNoteID();
        if (getNoteText() != null) {
            _hashCode += getNoteText().hashCode();
        }
        _hashCode += getNoteType();
        _hashCode += getRef1();
        _hashCode += getRef2();
        _hashCode += getRef3();
        _hashCode += getSourceID();
        _hashCode += getSourceType();
        _hashCode += getStatus();
        _hashCode += getType1();
        _hashCode += getType2();
        _hashCode += getType3();
        if (getUserID() != null) {
            _hashCode += getUserID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Note.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:usmRequestService", "Note"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "accountID"));
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
        elemField.setFieldName("domain");
        elemField.setXmlName(new javax.xml.namespace.QName("", "domain"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("noteID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "noteID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("noteText");
        elemField.setXmlName(new javax.xml.namespace.QName("", "noteText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("noteType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "noteType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ref1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ref1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ref2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ref2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ref3");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ref3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sourceID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sourceType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "type1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "type2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type3");
        elemField.setXmlName(new javax.xml.namespace.QName("", "type3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userID"));
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
