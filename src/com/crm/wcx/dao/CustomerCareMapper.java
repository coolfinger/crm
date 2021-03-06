package com.crm.wcx.dao;

import com.crm.wcx.entity.CustomerCare;
import com.crm.wcx.entity.CustomerCareExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CustomerCareMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer_care
     *
     * @mbg.generated Thu Nov 08 12:19:13 CST 2018
     */
    long countByExample(CustomerCareExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer_care
     *
     * @mbg.generated Thu Nov 08 12:19:13 CST 2018
     */
    int deleteByExample(CustomerCareExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer_care
     *
     * @mbg.generated Thu Nov 08 12:19:13 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer_care
     *
     * @mbg.generated Thu Nov 08 12:19:13 CST 2018
     */
    int insert(CustomerCare record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer_care
     *
     * @mbg.generated Thu Nov 08 12:19:13 CST 2018
     */
    int insertSelective(CustomerCare record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer_care
     *
     * @mbg.generated Thu Nov 08 12:19:13 CST 2018
     */
    List<CustomerCare> selectByExample(CustomerCareExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer_care
     *
     * @mbg.generated Thu Nov 08 12:19:13 CST 2018
     */
    CustomerCare selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer_care
     *
     * @mbg.generated Thu Nov 08 12:19:13 CST 2018
     */
    int updateByExampleSelective(@Param("record") CustomerCare record, @Param("example") CustomerCareExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer_care
     *
     * @mbg.generated Thu Nov 08 12:19:13 CST 2018
     */
    int updateByExample(@Param("record") CustomerCare record, @Param("example") CustomerCareExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer_care
     *
     * @mbg.generated Thu Nov 08 12:19:13 CST 2018
     */
    int updateByPrimaryKeySelective(CustomerCare record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer_care
     *
     * @mbg.generated Thu Nov 08 12:19:13 CST 2018
     */
    int updateByPrimaryKey(CustomerCare record);
}