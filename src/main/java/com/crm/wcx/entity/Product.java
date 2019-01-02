package com.crm.wcx.entity;

public class Product {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.id
     *
     * @mbg.generated Thu Nov 08 12:22:40 CST 2018
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.name
     *
     * @mbg.generated Thu Nov 08 12:22:40 CST 2018
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.location
     *
     * @mbg.generated Thu Nov 08 12:22:40 CST 2018
     */
    private String location;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.version
     *
     * @mbg.generated Thu Nov 08 12:22:40 CST 2018
     */
    private String version;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.unit
     *
     * @mbg.generated Thu Nov 08 12:22:40 CST 2018
     */
    private String unit;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.price
     *
     * @mbg.generated Thu Nov 08 12:22:40 CST 2018
     */
    private Double price;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.repertory
     *
     * @mbg.generated Thu Nov 08 12:22:40 CST 2018
     */
    private Integer repertory;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.remarks
     *
     * @mbg.generated Thu Nov 08 12:22:40 CST 2018
     */
    private String remarks;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.category_id
     *
     * @mbg.generated Thu Nov 08 12:22:40 CST 2018
     */
    private Integer categoryId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.id
     *
     * @return the value of product.id
     *
     * @mbg.generated Thu Nov 08 12:22:40 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.id
     *
     * @param id the value for product.id
     *
     * @mbg.generated Thu Nov 08 12:22:40 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.name
     *
     * @return the value of product.name
     *
     * @mbg.generated Thu Nov 08 12:22:40 CST 2018
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.name
     *
     * @param name the value for product.name
     *
     * @mbg.generated Thu Nov 08 12:22:40 CST 2018
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.location
     *
     * @return the value of product.location
     *
     * @mbg.generated Thu Nov 08 12:22:40 CST 2018
     */
    public String getLocation() {
        return location;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.location
     *
     * @param location the value for product.location
     *
     * @mbg.generated Thu Nov 08 12:22:40 CST 2018
     */
    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.version
     *
     * @return the value of product.version
     *
     * @mbg.generated Thu Nov 08 12:22:40 CST 2018
     */
    public String getVersion() {
        return version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.version
     *
     * @param version the value for product.version
     *
     * @mbg.generated Thu Nov 08 12:22:40 CST 2018
     */
    public void setVersion(String version) {
        this.version = version == null ? null : version.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.unit
     *
     * @return the value of product.unit
     *
     * @mbg.generated Thu Nov 08 12:22:40 CST 2018
     */
    public String getUnit() {
        return unit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.unit
     *
     * @param unit the value for product.unit
     *
     * @mbg.generated Thu Nov 08 12:22:40 CST 2018
     */
    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.price
     *
     * @return the value of product.price
     *
     * @mbg.generated Thu Nov 08 12:22:40 CST 2018
     */
    public Double getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.price
     *
     * @param price the value for product.price
     *
     * @mbg.generated Thu Nov 08 12:22:40 CST 2018
     */
    public void setPrice(Double price) {
        this.price = price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.repertory
     *
     * @return the value of product.repertory
     *
     * @mbg.generated Thu Nov 08 12:22:40 CST 2018
     */
    public Integer getRepertory() {
        return repertory;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.repertory
     *
     * @param repertory the value for product.repertory
     *
     * @mbg.generated Thu Nov 08 12:22:40 CST 2018
     */
    public void setRepertory(Integer repertory) {
        this.repertory = repertory;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.remarks
     *
     * @return the value of product.remarks
     *
     * @mbg.generated Thu Nov 08 12:22:40 CST 2018
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.remarks
     *
     * @param remarks the value for product.remarks
     *
     * @mbg.generated Thu Nov 08 12:22:40 CST 2018
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.category_id
     *
     * @return the value of product.category_id
     *
     * @mbg.generated Thu Nov 08 12:22:40 CST 2018
     */
    public Integer getCategoryId() {
        return categoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.category_id
     *
     * @param categoryId the value for product.category_id
     *
     * @mbg.generated Thu Nov 08 12:22:40 CST 2018
     */
    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }
}