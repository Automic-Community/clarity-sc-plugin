/**
 * Request.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package usmRequestService;

public class Request  implements java.io.Serializable {
    private java.lang.String GLCode;

    private java.lang.String address1;

    private java.lang.String address2;

    private java.lang.String assignedId;

    private java.lang.String authorizationNumber;

    private java.lang.String city;

    private java.lang.String code;

    private java.lang.String comments;

    private java.lang.String completionDate;

    private java.lang.Double cost;

    private java.lang.String costCenter;

    private java.lang.String country;

    private java.lang.String createdDate;

    private java.lang.String currency;

    private java.lang.String desiredCompletionDate;

    private java.lang.String domain;

    private java.util.HashMap fulfillmentData;

    private java.lang.String modifiedDate;

    private java.lang.String name;

    private java.lang.String postalCode;

    private int priority;

    private java.lang.String project;

    private java.lang.String reqByAccountId;

    private java.lang.String reqByUserId;

    private java.lang.String reqForAccountId;

    private java.lang.String reqForUserId;

    private int requestID;

    private java.lang.String state;

    private int status;

    public Request() {
    }

    public Request(
           java.lang.String GLCode,
           java.lang.String address1,
           java.lang.String address2,
           java.lang.String assignedId,
           java.lang.String authorizationNumber,
           java.lang.String city,
           java.lang.String code,
           java.lang.String comments,
           java.lang.String completionDate,
           java.lang.Double cost,
           java.lang.String costCenter,
           java.lang.String country,
           java.lang.String createdDate,
           java.lang.String currency,
           java.lang.String desiredCompletionDate,
           java.lang.String domain,
           java.util.HashMap fulfillmentData,
           java.lang.String modifiedDate,
           java.lang.String name,
           java.lang.String postalCode,
           int priority,
           java.lang.String project,
           java.lang.String reqByAccountId,
           java.lang.String reqByUserId,
           java.lang.String reqForAccountId,
           java.lang.String reqForUserId,
           int requestID,
           java.lang.String state,
           int status) {
           this.GLCode = GLCode;
           this.address1 = address1;
           this.address2 = address2;
           this.assignedId = assignedId;
           this.authorizationNumber = authorizationNumber;
           this.city = city;
           this.code = code;
           this.comments = comments;
           this.completionDate = completionDate;
           this.cost = cost;
           this.costCenter = costCenter;
           this.country = country;
           this.createdDate = createdDate;
           this.currency = currency;
           this.desiredCompletionDate = desiredCompletionDate;
           this.domain = domain;
           this.fulfillmentData = fulfillmentData;
           this.modifiedDate = modifiedDate;
           this.name = name;
           this.postalCode = postalCode;
           this.priority = priority;
           this.project = project;
           this.reqByAccountId = reqByAccountId;
           this.reqByUserId = reqByUserId;
           this.reqForAccountId = reqForAccountId;
           this.reqForUserId = reqForUserId;
           this.requestID = requestID;
           this.state = state;
           this.status = status;
    }


    /**
     * Gets the GLCode value for this Request.
     * 
     * @return GLCode
     */
    public java.lang.String getGLCode() {
        return GLCode;
    }


    /**
     * Sets the GLCode value for this Request.
     * 
     * @param GLCode
     */
    public void setGLCode(java.lang.String GLCode) {
        this.GLCode = GLCode;
    }


    /**
     * Gets the address1 value for this Request.
     * 
     * @return address1
     */
    public java.lang.String getAddress1() {
        return address1;
    }


    /**
     * Sets the address1 value for this Request.
     * 
     * @param address1
     */
    public void setAddress1(java.lang.String address1) {
        this.address1 = address1;
    }


    /**
     * Gets the address2 value for this Request.
     * 
     * @return address2
     */
    public java.lang.String getAddress2() {
        return address2;
    }


    /**
     * Sets the address2 value for this Request.
     * 
     * @param address2
     */
    public void setAddress2(java.lang.String address2) {
        this.address2 = address2;
    }


    /**
     * Gets the assignedId value for this Request.
     * 
     * @return assignedId
     */
    public java.lang.String getAssignedId() {
        return assignedId;
    }


    /**
     * Sets the assignedId value for this Request.
     * 
     * @param assignedId
     */
    public void setAssignedId(java.lang.String assignedId) {
        this.assignedId = assignedId;
    }


    /**
     * Gets the authorizationNumber value for this Request.
     * 
     * @return authorizationNumber
     */
    public java.lang.String getAuthorizationNumber() {
        return authorizationNumber;
    }


    /**
     * Sets the authorizationNumber value for this Request.
     * 
     * @param authorizationNumber
     */
    public void setAuthorizationNumber(java.lang.String authorizationNumber) {
        this.authorizationNumber = authorizationNumber;
    }


    /**
     * Gets the city value for this Request.
     * 
     * @return city
     */
    public java.lang.String getCity() {
        return city;
    }


    /**
     * Sets the city value for this Request.
     * 
     * @param city
     */
    public void setCity(java.lang.String city) {
        this.city = city;
    }


    /**
     * Gets the code value for this Request.
     * 
     * @return code
     */
    public java.lang.String getCode() {
        return code;
    }


    /**
     * Sets the code value for this Request.
     * 
     * @param code
     */
    public void setCode(java.lang.String code) {
        this.code = code;
    }


    /**
     * Gets the comments value for this Request.
     * 
     * @return comments
     */
    public java.lang.String getComments() {
        return comments;
    }


    /**
     * Sets the comments value for this Request.
     * 
     * @param comments
     */
    public void setComments(java.lang.String comments) {
        this.comments = comments;
    }


    /**
     * Gets the completionDate value for this Request.
     * 
     * @return completionDate
     */
    public java.lang.String getCompletionDate() {
        return completionDate;
    }


    /**
     * Sets the completionDate value for this Request.
     * 
     * @param completionDate
     */
    public void setCompletionDate(java.lang.String completionDate) {
        this.completionDate = completionDate;
    }


    /**
     * Gets the cost value for this Request.
     * 
     * @return cost
     */
    public java.lang.Double getCost() {
        return cost;
    }


    /**
     * Sets the cost value for this Request.
     * 
     * @param cost
     */
    public void setCost(java.lang.Double cost) {
        this.cost = cost;
    }


    /**
     * Gets the costCenter value for this Request.
     * 
     * @return costCenter
     */
    public java.lang.String getCostCenter() {
        return costCenter;
    }


    /**
     * Sets the costCenter value for this Request.
     * 
     * @param costCenter
     */
    public void setCostCenter(java.lang.String costCenter) {
        this.costCenter = costCenter;
    }


    /**
     * Gets the country value for this Request.
     * 
     * @return country
     */
    public java.lang.String getCountry() {
        return country;
    }


    /**
     * Sets the country value for this Request.
     * 
     * @param country
     */
    public void setCountry(java.lang.String country) {
        this.country = country;
    }


    /**
     * Gets the createdDate value for this Request.
     * 
     * @return createdDate
     */
    public java.lang.String getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this Request.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.lang.String createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the currency value for this Request.
     * 
     * @return currency
     */
    public java.lang.String getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this Request.
     * 
     * @param currency
     */
    public void setCurrency(java.lang.String currency) {
        this.currency = currency;
    }


    /**
     * Gets the desiredCompletionDate value for this Request.
     * 
     * @return desiredCompletionDate
     */
    public java.lang.String getDesiredCompletionDate() {
        return desiredCompletionDate;
    }


    /**
     * Sets the desiredCompletionDate value for this Request.
     * 
     * @param desiredCompletionDate
     */
    public void setDesiredCompletionDate(java.lang.String desiredCompletionDate) {
        this.desiredCompletionDate = desiredCompletionDate;
    }


    /**
     * Gets the domain value for this Request.
     * 
     * @return domain
     */
    public java.lang.String getDomain() {
        return domain;
    }


    /**
     * Sets the domain value for this Request.
     * 
     * @param domain
     */
    public void setDomain(java.lang.String domain) {
        this.domain = domain;
    }


    /**
     * Gets the fulfillmentData value for this Request.
     * 
     * @return fulfillmentData
     */
    public java.util.HashMap getFulfillmentData() {
        return fulfillmentData;
    }


    /**
     * Sets the fulfillmentData value for this Request.
     * 
     * @param fulfillmentData
     */
    public void setFulfillmentData(java.util.HashMap fulfillmentData) {
        this.fulfillmentData = fulfillmentData;
    }


    /**
     * Gets the modifiedDate value for this Request.
     * 
     * @return modifiedDate
     */
    public java.lang.String getModifiedDate() {
        return modifiedDate;
    }


    /**
     * Sets the modifiedDate value for this Request.
     * 
     * @param modifiedDate
     */
    public void setModifiedDate(java.lang.String modifiedDate) {
        this.modifiedDate = modifiedDate;
    }


    /**
     * Gets the name value for this Request.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Request.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the postalCode value for this Request.
     * 
     * @return postalCode
     */
    public java.lang.String getPostalCode() {
        return postalCode;
    }


    /**
     * Sets the postalCode value for this Request.
     * 
     * @param postalCode
     */
    public void setPostalCode(java.lang.String postalCode) {
        this.postalCode = postalCode;
    }


    /**
     * Gets the priority value for this Request.
     * 
     * @return priority
     */
    public int getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this Request.
     * 
     * @param priority
     */
    public void setPriority(int priority) {
        this.priority = priority;
    }


    /**
     * Gets the project value for this Request.
     * 
     * @return project
     */
    public java.lang.String getProject() {
        return project;
    }


    /**
     * Sets the project value for this Request.
     * 
     * @param project
     */
    public void setProject(java.lang.String project) {
        this.project = project;
    }


    /**
     * Gets the reqByAccountId value for this Request.
     * 
     * @return reqByAccountId
     */
    public java.lang.String getReqByAccountId() {
        return reqByAccountId;
    }


    /**
     * Sets the reqByAccountId value for this Request.
     * 
     * @param reqByAccountId
     */
    public void setReqByAccountId(java.lang.String reqByAccountId) {
        this.reqByAccountId = reqByAccountId;
    }


    /**
     * Gets the reqByUserId value for this Request.
     * 
     * @return reqByUserId
     */
    public java.lang.String getReqByUserId() {
        return reqByUserId;
    }


    /**
     * Sets the reqByUserId value for this Request.
     * 
     * @param reqByUserId
     */
    public void setReqByUserId(java.lang.String reqByUserId) {
        this.reqByUserId = reqByUserId;
    }


    /**
     * Gets the reqForAccountId value for this Request.
     * 
     * @return reqForAccountId
     */
    public java.lang.String getReqForAccountId() {
        return reqForAccountId;
    }


    /**
     * Sets the reqForAccountId value for this Request.
     * 
     * @param reqForAccountId
     */
    public void setReqForAccountId(java.lang.String reqForAccountId) {
        this.reqForAccountId = reqForAccountId;
    }


    /**
     * Gets the reqForUserId value for this Request.
     * 
     * @return reqForUserId
     */
    public java.lang.String getReqForUserId() {
        return reqForUserId;
    }


    /**
     * Sets the reqForUserId value for this Request.
     * 
     * @param reqForUserId
     */
    public void setReqForUserId(java.lang.String reqForUserId) {
        this.reqForUserId = reqForUserId;
    }


    /**
     * Gets the requestID value for this Request.
     * 
     * @return requestID
     */
    public int getRequestID() {
        return requestID;
    }


    /**
     * Sets the requestID value for this Request.
     * 
     * @param requestID
     */
    public void setRequestID(int requestID) {
        this.requestID = requestID;
    }


    /**
     * Gets the state value for this Request.
     * 
     * @return state
     */
    public java.lang.String getState() {
        return state;
    }


    /**
     * Sets the state value for this Request.
     * 
     * @param state
     */
    public void setState(java.lang.String state) {
        this.state = state;
    }


    /**
     * Gets the status value for this Request.
     * 
     * @return status
     */
    public int getStatus() {
        return status;
    }


    /**
     * Sets the status value for this Request.
     * 
     * @param status
     */
    public void setStatus(int status) {
        this.status = status;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Request)) return false;
        Request other = (Request) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.GLCode==null && other.getGLCode()==null) || 
             (this.GLCode!=null &&
              this.GLCode.equals(other.getGLCode()))) &&
            ((this.address1==null && other.getAddress1()==null) || 
             (this.address1!=null &&
              this.address1.equals(other.getAddress1()))) &&
            ((this.address2==null && other.getAddress2()==null) || 
             (this.address2!=null &&
              this.address2.equals(other.getAddress2()))) &&
            ((this.assignedId==null && other.getAssignedId()==null) || 
             (this.assignedId!=null &&
              this.assignedId.equals(other.getAssignedId()))) &&
            ((this.authorizationNumber==null && other.getAuthorizationNumber()==null) || 
             (this.authorizationNumber!=null &&
              this.authorizationNumber.equals(other.getAuthorizationNumber()))) &&
            ((this.city==null && other.getCity()==null) || 
             (this.city!=null &&
              this.city.equals(other.getCity()))) &&
            ((this.code==null && other.getCode()==null) || 
             (this.code!=null &&
              this.code.equals(other.getCode()))) &&
            ((this.comments==null && other.getComments()==null) || 
             (this.comments!=null &&
              this.comments.equals(other.getComments()))) &&
            ((this.completionDate==null && other.getCompletionDate()==null) || 
             (this.completionDate!=null &&
              this.completionDate.equals(other.getCompletionDate()))) &&
            ((this.cost==null && other.getCost()==null) || 
             (this.cost!=null &&
              this.cost.equals(other.getCost()))) &&
            ((this.costCenter==null && other.getCostCenter()==null) || 
             (this.costCenter!=null &&
              this.costCenter.equals(other.getCostCenter()))) &&
            ((this.country==null && other.getCountry()==null) || 
             (this.country!=null &&
              this.country.equals(other.getCountry()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              this.currency.equals(other.getCurrency()))) &&
            ((this.desiredCompletionDate==null && other.getDesiredCompletionDate()==null) || 
             (this.desiredCompletionDate!=null &&
              this.desiredCompletionDate.equals(other.getDesiredCompletionDate()))) &&
            ((this.domain==null && other.getDomain()==null) || 
             (this.domain!=null &&
              this.domain.equals(other.getDomain()))) &&
            ((this.fulfillmentData==null && other.getFulfillmentData()==null) || 
             (this.fulfillmentData!=null &&
              this.fulfillmentData.equals(other.getFulfillmentData()))) &&
            ((this.modifiedDate==null && other.getModifiedDate()==null) || 
             (this.modifiedDate!=null &&
              this.modifiedDate.equals(other.getModifiedDate()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.postalCode==null && other.getPostalCode()==null) || 
             (this.postalCode!=null &&
              this.postalCode.equals(other.getPostalCode()))) &&
            this.priority == other.getPriority() &&
            ((this.project==null && other.getProject()==null) || 
             (this.project!=null &&
              this.project.equals(other.getProject()))) &&
            ((this.reqByAccountId==null && other.getReqByAccountId()==null) || 
             (this.reqByAccountId!=null &&
              this.reqByAccountId.equals(other.getReqByAccountId()))) &&
            ((this.reqByUserId==null && other.getReqByUserId()==null) || 
             (this.reqByUserId!=null &&
              this.reqByUserId.equals(other.getReqByUserId()))) &&
            ((this.reqForAccountId==null && other.getReqForAccountId()==null) || 
             (this.reqForAccountId!=null &&
              this.reqForAccountId.equals(other.getReqForAccountId()))) &&
            ((this.reqForUserId==null && other.getReqForUserId()==null) || 
             (this.reqForUserId!=null &&
              this.reqForUserId.equals(other.getReqForUserId()))) &&
            this.requestID == other.getRequestID() &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            this.status == other.getStatus();
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
        if (getGLCode() != null) {
            _hashCode += getGLCode().hashCode();
        }
        if (getAddress1() != null) {
            _hashCode += getAddress1().hashCode();
        }
        if (getAddress2() != null) {
            _hashCode += getAddress2().hashCode();
        }
        if (getAssignedId() != null) {
            _hashCode += getAssignedId().hashCode();
        }
        if (getAuthorizationNumber() != null) {
            _hashCode += getAuthorizationNumber().hashCode();
        }
        if (getCity() != null) {
            _hashCode += getCity().hashCode();
        }
        if (getCode() != null) {
            _hashCode += getCode().hashCode();
        }
        if (getComments() != null) {
            _hashCode += getComments().hashCode();
        }
        if (getCompletionDate() != null) {
            _hashCode += getCompletionDate().hashCode();
        }
        if (getCost() != null) {
            _hashCode += getCost().hashCode();
        }
        if (getCostCenter() != null) {
            _hashCode += getCostCenter().hashCode();
        }
        if (getCountry() != null) {
            _hashCode += getCountry().hashCode();
        }
        if (getCreatedDate() != null) {
            _hashCode += getCreatedDate().hashCode();
        }
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
        }
        if (getDesiredCompletionDate() != null) {
            _hashCode += getDesiredCompletionDate().hashCode();
        }
        if (getDomain() != null) {
            _hashCode += getDomain().hashCode();
        }
        if (getFulfillmentData() != null) {
            _hashCode += getFulfillmentData().hashCode();
        }
        if (getModifiedDate() != null) {
            _hashCode += getModifiedDate().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getPostalCode() != null) {
            _hashCode += getPostalCode().hashCode();
        }
        _hashCode += getPriority();
        if (getProject() != null) {
            _hashCode += getProject().hashCode();
        }
        if (getReqByAccountId() != null) {
            _hashCode += getReqByAccountId().hashCode();
        }
        if (getReqByUserId() != null) {
            _hashCode += getReqByUserId().hashCode();
        }
        if (getReqForAccountId() != null) {
            _hashCode += getReqForAccountId().hashCode();
        }
        if (getReqForUserId() != null) {
            _hashCode += getReqForUserId().hashCode();
        }
        _hashCode += getRequestID();
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        _hashCode += getStatus();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Request.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:usmRequestService", "Request"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GLCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "GLCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "address1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "address2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assignedId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "assignedId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authorizationNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "authorizationNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("city");
        elemField.setXmlName(new javax.xml.namespace.QName("", "city"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("code");
        elemField.setXmlName(new javax.xml.namespace.QName("", "code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comments");
        elemField.setXmlName(new javax.xml.namespace.QName("", "comments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("completionDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "completionDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cost");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cost"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("costCenter");
        elemField.setXmlName(new javax.xml.namespace.QName("", "costCenter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("country");
        elemField.setXmlName(new javax.xml.namespace.QName("", "country"));
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
        elemField.setFieldName("currency");
        elemField.setXmlName(new javax.xml.namespace.QName("", "currency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("desiredCompletionDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "desiredCompletionDate"));
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
        elemField.setFieldName("fulfillmentData");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fulfillmentData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xml.apache.org/xml-soap", "Map"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modifiedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "modifiedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postalCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "postalCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "priority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("project");
        elemField.setXmlName(new javax.xml.namespace.QName("", "project"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reqByAccountId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reqByAccountId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reqByUserId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reqByUserId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reqForAccountId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reqForAccountId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reqForUserId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reqForUserId"));
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
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("", "state"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
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
