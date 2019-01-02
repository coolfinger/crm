package com.crm.wcx.entity;

import java.util.Date;

public class SaleOpportunity {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sale_opportunity.id
     *
     * @mbg.generated Thu Nov 08 12:19:13 CST 2018
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sale_opportunity.customer_id
     *
     * @mbg.generated Thu Nov 08 12:19:13 CST 2018
     */
    private Integer customerId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sale_opportunity.source
     *
     * @mbg.generated Thu Nov 08 12:19:13 CST 2018
     */
    private String source;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sale_opportunity.success
     *
     * @mbg.generated Thu Nov 08 12:19:13 CST 2018
     */
    private String success;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sale_opportunity.contact_id
     *
     * @mbg.generated Thu Nov 08 12:19:13 CST 2018
     */
    private Integer contactId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sale_opportunity.contact_phone
     *
     * @mbg.generated Thu Nov 08 12:19:13 CST 2018
     */
    private String contactPhone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sale_opportunity.creater
     *
     * @mbg.generated Thu Nov 08 12:19:13 CST 2018
     */
    private Integer creater;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sale_opportunity.create_date
     *
     * @mbg.generated Thu Nov 08 12:19:13 CST 2018
     */
    private Date createDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sale_opportunity.manager_id
     *
     * @mbg.generated Thu Nov 08 12:19:13 CST 2018
     */
    private Integer managerId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sale_opportunity.allot_date
     *
     * @mbg.generated Thu Nov 08 12:19:13 CST 2018
     */
    private Date allotDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sale_opportunity.status
     *
     * @mbg.generated Thu Nov 08 12:19:13 CST 2018
     */
    private String status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sale_opportunity.delete_status
     *
     * @mbg.generated Thu Nov 08 12:19:13 CST 2018
     */
    private Integer deleteStatus;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sale_opportunity.id
     *
     * @return the value of sale_opportunity.id
     *
     * @mbg.generated Thu Nov 08 12:19:13 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sale_opportunity.id
     *
     * @param id the value for sale_opportunity.id
     *
     * @mbg.generated Thu Nov 08 12:19:13 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sale_opportunity.customer_id
     *
     * @return the value of sale_opportunity.customer_id
     *
     * @mbg.generated Thu Nov 08 12:19:13 CST 2018
     */
    public Integer getCustomerId() {
        return customerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sale_opportunity.customer_id
     *
     * @param customerId the value for sale_opportunity.customer_id
     *
     * @mbg.generated Thu Nov 08 12:19:13 CST 2018
     */
    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sale_opportunity.source
     *
     * @return the value of sale_opportunity.source
     *
     * @mbg.generated Thu Nov 08 12:19:13 CST 2018
     */
    public String getSource() {
        return source;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sale_opportunity.source
     *
     * @param source the value for sale_opportunity.source
     *
     * @mbg.generated Thu Nov 08 12:19:13 CST 2018
     */
    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sale_opportunity.success
     *
     * @return the value of sale_opportunity.success
     *
     * @mbg.generated Thu Nov 08 12:19:13 CST 2018
     */
    public String getSuccess() {
        return success;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sale_opportunity.success
     *
     * @param success the value for sale_opportunity.success
     *
     * @mbg.generated Thu Nov 08 12:19:13 CST 2018
     */
    public void setSuccess(String success) {
        this.success = success == null ? null : success.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sale_opportunity.contact_id
     *
     * @return the value of sale_opportunity.contact_id
     *
     * @mbg.generated Thu Nov 08 12:19:13 CST 2018
     */
    public Integer getContactId() {
        return contactId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sale_opportunity.contact_id
     *
     * @param contactId the value for sale_opportunity.contact_id
     *
     * @mbg.generated Thu Nov 08 12:19:13 CST 2018
     */
    public void setContactId(Integer contactId) {
        this.contactId = contactId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sale_opportunity.contact_phone
     *
     * @return the value of sale_opportunity.contact_phone
     *
     * @mbg.generated Thu Nov 08 12:19:13 CST 2018
     */
    public String getContactPhone() {
        return contactPhone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sale_opportunity.contact_phone
     *
     * @param contactPhone the value for sale_opportunity.contact_phone
     *
     * @mbg.generated Thu Nov 08 12:19:13 CST 2018
     */
    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone == null ? null : contactPhone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sale_opportunity.creater
     *
     * @return the value of sale_opportunity.creater
     *
     * @mbg.generated Thu Nov 08 12:19:13 CST 2018
     */
    public Integer getCreater() {
        return creater;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sale_opportunity.creater
     *
     * @param creater the value for sale_opportunity.creater
     *
     * @mbg.generated Thu Nov 08 12:19:13 CST 2018
     */
    public void setCreater(Integer creater) {
        this.creater = creater;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sale_opportunity.create_date
     *
     * @return the value of sale_opportunity.create_date
     *
     * @mbg.generated Thu Nov 08 12:19:13 CST 2018
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sale_opportunity.create_date
     *
     * @param createDate the value for sale_opportunity.create_date
     *
     * @mbg.generated Thu Nov 08 12:19:13 CST 2018
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sale_opportunity.manager_id
     *
     * @return the value of sale_opportunity.manager_id
     *
     * @mbg.generated Thu Nov 08 12:19:13 CST 2018
     */
    public Integer getManagerId() {
        return managerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sale_opportunity.manager_id
     *
     * @param managerId the value for sale_opportunity.manager_id
     *
     * @mbg.generated Thu Nov 08 12:19:13 CST 2018
     */
    public void setManagerId(Integer managerId) {
        this.managerId = managerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sale_opportunity.allot_date
     *
     * @return the value of sale_opportunity.allot_date
     *
     * @mbg.generated Thu Nov 08 12:19:13 CST 2018
     */
    public Date getAllotDate() {
        return allotDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sale_opportunity.allot_date
     *
     * @param allotDate the value for sale_opportunity.allot_date
     *
     * @mbg.generated Thu Nov 08 12:19:13 CST 2018
     */
    public void setAllotDate(Date allotDate) {
        this.allotDate = allotDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sale_opportunity.status
     *
     * @return the value of sale_opportunity.status
     *
     * @mbg.generated Thu Nov 08 12:19:13 CST 2018
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sale_opportunity.status
     *
     * @param status the value for sale_opportunity.status
     *
     * @mbg.generated Thu Nov 08 12:19:13 CST 2018
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sale_opportunity.delete_status
     *
     * @return the value of sale_opportunity.delete_status
     *
     * @mbg.generated Thu Nov 08 12:19:13 CST 2018
     */
    public Integer getDeleteStatus() {
        return deleteStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sale_opportunity.delete_status
     *
     * @param deleteStatus the value for sale_opportunity.delete_status
     *
     * @mbg.generated Thu Nov 08 12:19:13 CST 2018
     */
    public void setDeleteStatus(Integer deleteStatus) {
        this.deleteStatus = deleteStatus;
    }
}