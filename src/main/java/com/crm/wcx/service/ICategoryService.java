package com.crm.wcx.service;

import java.util.List;

import com.crm.wcx.entity.Category;
import com.crm.wcx.entity.CategoryExample;

/**
 * 
 * @ClassName: ICategoryService 
 * @Description: TODO
 * @author: ColdFingers
 * @date: 2018年11月8日 下午7:48:54
 */
public interface ICategoryService {

	/**
	 * 
	* @Title: countByCategoryExample 
	* @Description: 按照Example 统计记录总数 
	* @param categoryExample
	* @return long
	* @author ColdFingers
	* @date 2018年11月8日下午7:49:29
	 */
	public long countByCategoryExample(CategoryExample categoryExample);
	

	/**
	 * 
	* @Title: deleteByCategoryExample 
	* @Description: 按照Example 删除category 
	* @param categoryExample
	* @return boolean
	* @author ColdFingers
	* @date 2018年11月8日下午7:49:38
	 */
	public boolean deleteByCategoryExample(CategoryExample categoryExample);
	
	/**
	 * 
	* @Title: deleteByPrimaryKey 
	* @Description: 根据主键id删除 
	* @param id
	* @return boolean
	* @author ColdFingers
	* @date 2018年11月8日下午7:49:45
	 */
	public boolean deleteByPrimaryKey(Integer id);
	
	/**
	 * 
	* @Title: insertCategory 
	* @Description: 插入一条category数据 如字段为空，则插入null 
	* @param category
	* @return boolean
	* @author ColdFingers
	* @date 2018年11月8日下午7:50:05
	 */
	public boolean insertCategory(Category category);
	
	/**
	 * 
	* @Title: insertSelective 
	* @Description: 插入一条category数据，如字段为空，则插入数据库表字段的默认值 
	* @param category
	* @return boolean
	* @author ColdFingers
	* @date 2018年11月8日下午7:50:14
	 */
	public boolean insertSelective(Category category);
	
	/**
	 * 
	* @Title: selectByCategoryExample 
	* @Description: 按照Example 条件 模糊查询 
	* @param categoryExample
	* @return List<Category>
	* @author ColdFingers
	* @date 2018年11月8日下午7:50:25
	 */
	public List<Category> selectByCategoryExample(CategoryExample categoryExample);
	
	/**
	 * 
	* @Title: selectCategoryByPrimaryKey 
	* @Description: 按照category 的id 查找 category 
	* @param id
	* @return Category
	* @author ColdFingers
	* @date 2018年11月8日下午7:50:34
	 */
	public Category selectCategoryByPrimaryKey(Integer id);
	
	/**
	 * 
	* @Title: updateByCategoryExampleSelective 
	* @Description: 更新category ， category对象中若有空则不会更新此字段  categoryExample为where条件 
	* @param category
	* @param categoryExample
	* @return boolean
	* @author ColdFingers
	* @date 2018年11月8日下午7:50:43
	 */
	public boolean updateByCategoryExampleSelective(Category category, CategoryExample categoryExample);
	
	/**
	 * 
	* @Title: updateByCategoryExample 
	* @Description: 更新category， category对象中若有空则更新字段为null   categoryExample为where条件 
	* @param category
	* @param categoryExample
	* @return boolean
	* @author ColdFingers
	* @date 2018年11月8日下午7:50:51
	 */
	public boolean updateByCategoryExample(Category category, CategoryExample categoryExample);
	
	/**
	 * 
	* @Title: updateCategoryByPrimaryKeySelective 
	* @Description: 按照category id 更新category  category对象中如有空则不会更新此字段 
	* @param category
	* @return boolean
	* @author ColdFingers
	* @date 2018年11月8日下午7:51:00
	 */
	public boolean updateCategoryByPrimaryKeySelective(Category category);
	
	/**
	 * 
	* @Title: updateCategoryByPrimaryKey 
	* @Description: 按照category id 更新category  category对象中如有空则更新此字段为null 
	* @param category
	* @return boolean
	* @author ColdFingers
	* @date 2018年11月8日下午7:51:10
	 */
	public boolean updateCategoryByPrimaryKey(Category category);
}
