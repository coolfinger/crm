package com.crm.wcx.dao;

import com.crm.wcx.entity.Log;
import com.crm.wcx.entity.LogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table log
     *
     * @mbg.generated Thu Nov 08 12:19:13 CST 2018
     */
    long countByExample(LogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table log
     *
     * @mbg.generated Thu Nov 08 12:19:13 CST 2018
     */
    int deleteByExample(LogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table log
     *
     * @mbg.generated Thu Nov 08 12:19:13 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table log
     *
     * @mbg.generated Thu Nov 08 12:19:13 CST 2018
     */
    int insert(Log record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table log
     *
     * @mbg.generated Thu Nov 08 12:19:13 CST 2018
     */
    int insertSelective(Log record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table log
     *
     * @mbg.generated Thu Nov 08 12:19:13 CST 2018
     */
    List<Log> selectByExample(LogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table log
     *
     * @mbg.generated Thu Nov 08 12:19:13 CST 2018
     */
    Log selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table log
     *
     * @mbg.generated Thu Nov 08 12:19:13 CST 2018
     */
    int updateByExampleSelective(@Param("record") Log record, @Param("example") LogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table log
     *
     * @mbg.generated Thu Nov 08 12:19:13 CST 2018
     */
    int updateByExample(@Param("record") Log record, @Param("example") LogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table log
     *
     * @mbg.generated Thu Nov 08 12:19:13 CST 2018
     */
    int updateByPrimaryKeySelective(Log record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table log
     *
     * @mbg.generated Thu Nov 08 12:19:13 CST 2018
     */
    int updateByPrimaryKey(Log record);
}