package com.crm.wcx.service;

import java.util.List;

import com.crm.wcx.entity.Linkman;
import com.crm.wcx.entity.LinkmanExample;
import com.crm.wcx.entity.User;

/**
 * 
 * @ClassName: ILinkmanService 
 * @Description: TODO
 * @author: ColdFingers
 * @date: 2018年11月8日 下午7:13:37
 */
public interface ILinkmanService {

	
	/**
	 * 
	* @Title: countByLinkmanExample 
	* @Description: 根据linkmanExample统计条数 
	* @param linkmanExample
	* @return long
	* @author ColdFingers
	* @date 2018年11月8日下午7:14:10
	 */
	public long countByLinkmanExample(LinkmanExample linkmanExample);

	/**
	 * 
	* @Title: deleteByLinkmanExample 
	* @Description: 根据linkmanExample删除Linkman 
	* @param linkmanExample
	* @return boolean
	* @author ColdFingers
	* @date 2018年11月8日下午7:14:20
	 */
    public boolean deleteByLinkmanExample(LinkmanExample linkmanExample);

    /**
     * 
    * @Title: deleteLinkmanByPrimaryKey 
    * @Description: 根据主键id删除Linkman 
    * @param id
    * @return boolean
    * @author ColdFingers
    * @date 2018年11月8日下午7:14:29
     */
    public boolean deleteLinkmanByPrimaryKey(Integer id);

    /**
     * 
    * @Title: insertLinkman 
    * @Description: 插入一条Linkman数据，如果参数linkman中字段为空，代表此字段插入为空 
    * @param linkman
    * @return boolean
    * @author ColdFingers
    * @date 2018年11月8日下午7:14:39
     */
    public boolean insertLinkman(Linkman linkman);

    /**
     * 
    * @Title: insertLinkmanSelective 
    * @Description: 插入一条Linkman数据，如果参数linkman中字段为空，代表此字段为数据库默认值 
    * @param linkman
    * @return boolean
    * @author ColdFingers
    * @date 2018年11月8日下午7:14:47
     */
    public boolean insertLinkmanSelective(Linkman linkman);

    /**
     * 
    * @Title: selectByLinkmanExample 
    * @Description: 根据linkmanExample查找Linkman 
    * @param linkmanExample
    * @return List<Linkman>
    * @author ColdFingers
    * @date 2018年11月8日下午7:14:57
     */
    public List<Linkman> selectByLinkmanExample(LinkmanExample linkmanExample);

    /**
     * 
    * @Title: selectLinkmanByPrimaryKey 
    * @Description: 根据id查询linkman 
    * @param id
    * @return Linkman
    * @author ColdFingers
    * @date 2018年11月8日下午7:15:09
     */
    public Linkman selectLinkmanByPrimaryKey(Integer id);

    /**
     * 
    * @Title: updateByLinkmanExampleSelective 
    * @Description: 更新Linkman，参数linkman中，如有有字段为空，代表不更新此字段，linkmanExample参数为where条件 
    * @param linkman
    * @param linkmanExample
    * @return boolean
    * @author ColdFingers
    * @date 2018年11月8日下午7:15:40
     */
    public boolean updateByLinkmanExampleSelective(Linkman linkman, LinkmanExample linkmanExample);

    /**
     * 
    * @Title: updateByLinkmanExample 
    * @Description: 更新Linkman，参数linkman中，如有有字段为空，代表对应也更新为空，linkmanExample参数为where条件 
    * @param linkman
    * @param linkmanExample
    * @return boolean
    * @author ColdFingers
    * @date 2018年11月8日下午7:15:52
     */
    public boolean updateByLinkmanExample(Linkman linkman, LinkmanExample linkmanExample);

    /**
     * 
    * @Title: updateLinkmanByPrimaryKeySelective 
    * @Description: 根据主键更新Linkman，参数linkman中，如果字段为空，代表不更新此字段 
    * @param linkman
    * @return boolean
    * @author ColdFingers
    * @date 2018年11月8日下午7:16:04
     */
    public boolean updateLinkmanByPrimaryKeySelective(Linkman linkman);

    /**
     * 
    * @Title: updateLinkmanByPrimaryKey 
    * @Description: 根据主键更新Linkman，参数linkman中，如果字段为空，代表相应字段也更新为空 
    * @param linkman
    * @return boolean
    * @author ColdFingers
    * @date 2018年11月8日下午7:16:14
     */
    public boolean updateLinkmanByPrimaryKey(Linkman linkman);

    /**
     * 
    * @Title: selectLinkmanByUser 
    * @Description: 根据用户ID，查找该用户下的所有联系人信息 
    * @param user
    * @return List<Linkman>
    * @author ColdFingers
    * @date 2018年11月8日下午7:16:24
     */
    public List<Linkman> selectLinkmanByUser(User user);
}
