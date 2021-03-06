package com.crm.wcx.entity;

import java.util.Date;

public class Log {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column log.id
     *
     * @mbg.generated Thu Nov 08 12:19:13 CST 2018
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column log.user_id
     *
     * @mbg.generated Thu Nov 08 12:19:13 CST 2018
     */
    private Integer userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column log.operation
     *
     * @mbg.generated Thu Nov 08 12:19:13 CST 2018
     */
    private String operation;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column log.operation_content
     *
     * @mbg.generated Thu Nov 08 12:19:13 CST 2018
     */
    private String operationContent;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column log.operation_time
     *
     * @mbg.generated Thu Nov 08 12:19:13 CST 2018
     */
    private Date operationTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column log.id
     *
     * @return the value of log.id
     *
     * @mbg.generated Thu Nov 08 12:19:13 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column log.id
     *
     * @param id the value for log.id
     *
     * @mbg.generated Thu Nov 08 12:19:13 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column log.user_id
     *
     * @return the value of log.user_id
     *
     * @mbg.generated Thu Nov 08 12:19:13 CST 2018
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column log.user_id
     *
     * @param userId the value for log.user_id
     *
     * @mbg.generated Thu Nov 08 12:19:13 CST 2018
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column log.operation
     *
     * @return the value of log.operation
     *
     * @mbg.generated Thu Nov 08 12:19:13 CST 2018
     */
    public String getOperation() {
        return operation;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column log.operation
     *
     * @param operation the value for log.operation
     *
     * @mbg.generated Thu Nov 08 12:19:13 CST 2018
     */
    public void setOperation(String operation) {
        this.operation = operation == null ? null : operation.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column log.operation_content
     *
     * @return the value of log.operation_content
     *
     * @mbg.generated Thu Nov 08 12:19:13 CST 2018
     */
    public String getOperationContent() {
        return operationContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column log.operation_content
     *
     * @param operationContent the value for log.operation_content
     *
     * @mbg.generated Thu Nov 08 12:19:13 CST 2018
     */
    public void setOperationContent(String operationContent) {
        this.operationContent = operationContent == null ? null : operationContent.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column log.operation_time
     *
     * @return the value of log.operation_time
     *
     * @mbg.generated Thu Nov 08 12:19:13 CST 2018
     */
    public Date getOperationTime() {
        return operationTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column log.operation_time
     *
     * @param operationTime the value for log.operation_time
     *
     * @mbg.generated Thu Nov 08 12:19:13 CST 2018
     */
    public void setOperationTime(Date operationTime) {
        this.operationTime = operationTime;
    }
}