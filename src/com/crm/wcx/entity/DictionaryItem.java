package com.crm.wcx.entity;

public class DictionaryItem {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dictionary_item.id
     *
     * @mbg.generated Thu Nov 08 12:19:13 CST 2018
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dictionary_item.type_id
     *
     * @mbg.generated Thu Nov 08 12:19:13 CST 2018
     */
    private Integer typeId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dictionary_item.name
     *
     * @mbg.generated Thu Nov 08 12:19:13 CST 2018
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dictionary_item.status
     *
     * @mbg.generated Thu Nov 08 12:19:13 CST 2018
     */
    private Integer status;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dictionary_item.id
     *
     * @return the value of dictionary_item.id
     *
     * @mbg.generated Thu Nov 08 12:19:13 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dictionary_item.id
     *
     * @param id the value for dictionary_item.id
     *
     * @mbg.generated Thu Nov 08 12:19:13 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dictionary_item.type_id
     *
     * @return the value of dictionary_item.type_id
     *
     * @mbg.generated Thu Nov 08 12:19:13 CST 2018
     */
    public Integer getTypeId() {
        return typeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dictionary_item.type_id
     *
     * @param typeId the value for dictionary_item.type_id
     *
     * @mbg.generated Thu Nov 08 12:19:13 CST 2018
     */
    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dictionary_item.name
     *
     * @return the value of dictionary_item.name
     *
     * @mbg.generated Thu Nov 08 12:19:13 CST 2018
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dictionary_item.name
     *
     * @param name the value for dictionary_item.name
     *
     * @mbg.generated Thu Nov 08 12:19:13 CST 2018
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dictionary_item.status
     *
     * @return the value of dictionary_item.status
     *
     * @mbg.generated Thu Nov 08 12:19:13 CST 2018
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dictionary_item.status
     *
     * @param status the value for dictionary_item.status
     *
     * @mbg.generated Thu Nov 08 12:19:13 CST 2018
     */
    public void setStatus(Integer status) {
        this.status = status;
    }
}