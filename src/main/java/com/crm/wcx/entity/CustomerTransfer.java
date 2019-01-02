package com.crm.wcx.entity;

import java.time.LocalDateTime;
import java.util.Date;

public class CustomerTransfer {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer_transfer.id
     *
     * @mbg.generated Thu Nov 08 12:22:40 CST 2018
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer_transfer.customer_id
     *
     * @mbg.generated Thu Nov 08 12:22:40 CST 2018
     */
    private Integer customerId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer_transfer.old_manager_id
     *
     * @mbg.generated Thu Nov 08 12:22:40 CST 2018
     */
    private Integer oldManagerId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer_transfer.new_manager_id
     *
     * @mbg.generated Thu Nov 08 12:22:40 CST 2018
     */
    private Integer newManagerId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer_transfer.reason
     *
     * @mbg.generated Thu Nov 08 12:22:40 CST 2018
     */
    private String reason;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer_transfer.time
     *
     * @mbg.generated Thu Nov 08 12:22:40 CST 2018
     */
    private LocalDateTime time;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer_transfer.id
     *
     * @return the value of customer_transfer.id
     *
     * @mbg.generated Thu Nov 08 12:22:40 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer_transfer.id
     *
     * @param id the value for customer_transfer.id
     *
     * @mbg.generated Thu Nov 08 12:22:40 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer_transfer.customer_id
     *
     * @return the value of customer_transfer.customer_id
     *
     * @mbg.generated Thu Nov 08 12:22:40 CST 2018
     */
    public Integer getCustomerId() {
        return customerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer_transfer.customer_id
     *
     * @param customerId the value for customer_transfer.customer_id
     *
     * @mbg.generated Thu Nov 08 12:22:40 CST 2018
     */
    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer_transfer.old_manager_id
     *
     * @return the value of customer_transfer.old_manager_id
     *
     * @mbg.generated Thu Nov 08 12:22:40 CST 2018
     */
    public Integer getOldManagerId() {
        return oldManagerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer_transfer.old_manager_id
     *
     * @param oldManagerId the value for customer_transfer.old_manager_id
     *
     * @mbg.generated Thu Nov 08 12:22:40 CST 2018
     */
    public void setOldManagerId(Integer oldManagerId) {
        this.oldManagerId = oldManagerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer_transfer.new_manager_id
     *
     * @return the value of customer_transfer.new_manager_id
     *
     * @mbg.generated Thu Nov 08 12:22:40 CST 2018
     */
    public Integer getNewManagerId() {
        return newManagerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer_transfer.new_manager_id
     *
     * @param newManagerId the value for customer_transfer.new_manager_id
     *
     * @mbg.generated Thu Nov 08 12:22:40 CST 2018
     */
    public void setNewManagerId(Integer newManagerId) {
        this.newManagerId = newManagerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer_transfer.reason
     *
     * @return the value of customer_transfer.reason
     *
     * @mbg.generated Thu Nov 08 12:22:40 CST 2018
     */
    public String getReason() {
        return reason;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer_transfer.reason
     *
     * @param reason the value for customer_transfer.reason
     *
     * @mbg.generated Thu Nov 08 12:22:40 CST 2018
     */
    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer_transfer.time
     *
     * @return the value of customer_transfer.time
     *
     * @mbg.generated Thu Nov 08 12:22:40 CST 2018
     */
    public LocalDateTime getTime() {
        return time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer_transfer.time
     *
     * @param time the value for customer_transfer.time
     *
     * @mbg.generated Thu Nov 08 12:22:40 CST 2018
     */
    public void setTime(LocalDateTime time) {
        this.time = time;
    }
}