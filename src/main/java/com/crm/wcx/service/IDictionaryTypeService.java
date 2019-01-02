package com.crm.wcx.service;

import java.util.List;

import com.crm.wcx.entity.DictionaryType;
import com.crm.wcx.entity.DictionaryTypeExample;

/**
 * 
 * @ClassName: IDictionaryTypeService 
 * @Description: TODO
 * @author: ColdFingers
 * @date: 2018年11月8日 下午7:20:16
 */
public interface IDictionaryTypeService {

	/**
	 *  
	* @Title: countByDictionaryTypeExample 
	* @Description: 按照Example 统计记录总数 
	* @param dictionaryTypeExample
	* @return long
	* @author ColdFingers
	* @date 2018年11月8日下午7:20:47
	 */
    public long countByDictionaryTypeExample(DictionaryTypeExample dictionaryTypeExample);
    
    /**
     * 
    * @Title: deleteByDictionaryTypeExample 
    * @Description: 按照Example 删除 DictionaryType 
    * @param dictionaryTypeExample
    * @return boolean
    * @author ColdFingers
    * @date 2018年11月8日下午7:20:57
     */
    public boolean deleteByDictionaryTypeExample(DictionaryTypeExample dictionaryTypeExample);

    /**
     * 
    * @Title: deleteByPrimaryKey 
    * @Description: 按照主键id删除DictionaryTypeExample 
    * @param id
    * @return boolean
    * @author ColdFingers
    * @date 2018年11月8日下午7:21:07
     */
    public boolean deleteByPrimaryKey(Integer id);
    
    /**
     * 
    * @Title: insertDictionaryType 
    * @Description: 插入一条DictionaryType数据 如字段为空，则插入null 
    * @param dictionaryType
    * @return boolean
    * @author ColdFingers
    * @date 2018年11月8日下午7:21:15
     */
    public boolean insertDictionaryType(DictionaryType dictionaryType);
    
    /**
     * 
    * @Title: insertDictionaryTypeSelective 
    * @Description: 插入一条DictionaryType数据，如字段为空，则插入数据库表字段的默认值 
    * @param dictionaryType
    * @return boolean
    * @author ColdFingers
    * @date 2018年11月8日下午7:21:24
     */
    public boolean insertDictionaryTypeSelective(DictionaryType dictionaryType);
    
    /**
     * 
    * @Title: selectByDictionaryTypeExample 
    * @Description: 按照Example条件 模糊查询 
    * @param dictionaryTypeExample
    * @return List<DictionaryType>
    * @author ColdFingers
    * @date 2018年11月8日下午7:21:36
     */
    public List<DictionaryType> selectByDictionaryTypeExample(DictionaryTypeExample dictionaryTypeExample);
    
    /**
     * 
    * @Title: selectDictionaryTypeByPrimaryKey 
    * @Description: 按照DictionaryType 的id 查找 DictionaryType 
    * @param id
    * @return DictionaryType
    * @author ColdFingers
    * @date 2018年11月8日下午7:21:45
     */
    public DictionaryType selectDictionaryTypeByPrimaryKey(Integer id);
    
    /**
     * 
    * @Title: updateByDictionaryTypeExample 
    * @Description: 更新DictionaryType对象中若有空则更新字段为null 
    * @param dictionaryType
    * @param dictionaryTypeExample
    * @return boolean
    * @author ColdFingers
    * @date 2018年11月8日下午7:22:00
     */
    public boolean updateByDictionaryTypeExample(DictionaryType dictionaryType, DictionaryTypeExample dictionaryTypeExample);
    
    /**
     * 
    * @Title: updateByDictionaryTypeExampleSelective 
    * @Description: 更新DictionaryType 对象中若有空则不会更新此字段 
    * @param dictionaryType
    * @param dictionaryTypeExample
    * @return boolean
    * @author ColdFingers
    * @date 2018年11月8日下午7:22:10
     */
    public boolean updateByDictionaryTypeExampleSelective(DictionaryType dictionaryType, DictionaryTypeExample dictionaryTypeExample);
        
    /**
     * 
    * @Title: updateDictionaryTypeByPrimaryKeySelective 
    * @Description: 按照DictionaryType id 更新DictionaryType对象中如有空则不会更新此字段 
    * @param dictionaryType
    * @return boolean
    * @author ColdFingers
    * @date 2018年11月8日下午7:22:27
     */
    public boolean updateDictionaryTypeByPrimaryKeySelective(DictionaryType dictionaryType);
    
    /**
     * 
    * @Title: updateDictionaryTypeByPrimaryKey 
    * @Description: 按照DictionaryType id 更新DictionaryType对象中如有空则更新此字段为null 
    * @param dictionaryType
    * @return boolean
    * @author ColdFingers
    * @date 2018年11月8日下午7:22:39
     */
    public boolean updateDictionaryTypeByPrimaryKey(DictionaryType dictionaryType);   
}
