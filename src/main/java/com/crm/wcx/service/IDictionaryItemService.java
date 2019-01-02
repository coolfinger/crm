package com.crm.wcx.service;

import java.util.List;

import com.crm.wcx.entity.DictionaryItem;
import com.crm.wcx.entity.DictionaryItemExample;

/**
 * 
 * @ClassName: IDictionaryItemService 
 * @Description: TODO
 * @author: ColdFingers
 * @date: 2018年11月8日 下午7:23:14
 */
public interface IDictionaryItemService {

	/**
	 * 
	* @Title: countByDictionaryItemExample 
	* @Description: 按照Example 统计记录总数 
	* @param dictionaryItemExample
	* @return long
	* @author ColdFingers
	* @date 2018年11月8日下午7:23:45
	 */
    public long countByDictionaryItemExample(DictionaryItemExample dictionaryItemExample);
    
    /**
     * 
    * @Title: deleteByDictionaryItemExample 
    * @Description: 按照Example 删除 DictionaryItemExample 
    * @param dictionaryItemExample
    * @return boolean
    * @author ColdFingers
    * @date 2018年11月8日下午7:23:55
     */
    public boolean deleteByDictionaryItemExample(DictionaryItemExample dictionaryItemExample);

    /**
     * 
    * @Title: deleteByPrimaryKey 
    * @Description: 按照主键id删除DictionaryItem 
    * @param id
    * @return boolean
    * @author ColdFingers
    * @date 2018年11月8日下午7:24:04
     */
    public boolean deleteByPrimaryKey(Integer id);
    
    /**
     * 
    * @Title: insertDictionaryItem 
    * @Description: 插入一条DictionaryItem数据 如字段为空，则插入null 
    * @param dictionaryItem
    * @return boolean
    * @author ColdFingers
    * @date 2018年11月8日下午7:24:13
     */
    public boolean insertDictionaryItem(DictionaryItem dictionaryItem);
    
    /**
     * 
    * @Title: insertDictionaryItemSelective 
    * @Description: 插入一条DictionaryItem数据，如字段为空，则插入数据库表字段的默认值 
    * @param dictionaryItem
    * @return boolean
    * @author ColdFingers
    * @date 2018年11月8日下午7:24:22
     */
    public boolean insertDictionaryItemSelective(DictionaryItem dictionaryItem);
    
    /**
     * 
    * @Title: selectByDictionaryItemExample 
    * @Description: 按照Example条件 模糊查询 
    * @param dictionaryItemExample
    * @return List<DictionaryItem>
    * @author ColdFingers
    * @date 2018年11月8日下午7:24:32
     */
    public List<DictionaryItem> selectByDictionaryItemExample(DictionaryItemExample dictionaryItemExample);
    
    /**
     * 
    * @Title: selectDictionaryItemByPrimaryKey 
    * @Description: 按照DictionaryItem 的id 查找 DictionaryItem 
    * @param id
    * @return DictionaryItem
    * @author ColdFingers
    * @date 2018年11月8日下午7:24:42
     */
    public DictionaryItem selectDictionaryItemByPrimaryKey(Integer id);
    
    /**
     * 
    * @Title: updateByDictionaryItemExample 
    * @Description: 更新DictionaryItem对象中若有空则更新字段为null 
    * @param dictionaryItem
    * @param dictionaryItemExample
    * @return boolean
    * @author ColdFingers
    * @date 2018年11月8日下午7:25:00
     */
    public boolean updateByDictionaryItemExample(DictionaryItem dictionaryItem, DictionaryItemExample dictionaryItemExample);
    
    /**
     * 
    * @Title: updateByDictionaryItemExampleSelective 
    * @Description: 更新DictionaryItem 对象中若有空则不会更新此字段 
    * @param dictionaryItem
    * @param dictionaryItemExample
    * @return boolean
    * @author ColdFingers
    * @date 2018年11月8日下午7:25:13
     */
    public boolean updateByDictionaryItemExampleSelective(DictionaryItem dictionaryItem, DictionaryItemExample dictionaryItemExample);
        
    /**
     * 
    * @Title: updateDictionaryItemByPrimaryKeySelective 
    * @Description: 按照DictionaryItem id 更新DictionaryItem对象中如有空则不会更新此字段 
    * @param dictionaryItem
    * @return boolean
    * @author ColdFingers
    * @date 2018年11月8日下午7:25:26
     */
    public boolean updateDictionaryItemByPrimaryKeySelective(DictionaryItem dictionaryItem);
    
    /**
     * 
    * @Title: updateDictionaryItemByPrimaryKey 
    * @Description: 按照DictionaryItem id 更新DictionaryItem对象中如有空则更新此字段为null 
    * @param dictionaryItem
    * @return boolean
    * @author ColdFingers
    * @date 2018年11月8日下午7:25:41
     */
    public boolean updateDictionaryItemByPrimaryKey(DictionaryItem dictionaryItem);   
}
