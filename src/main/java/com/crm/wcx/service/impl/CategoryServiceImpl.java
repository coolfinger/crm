/**   
 * 
 * @Package: com.crm.wcx.service.impl 
 * @author: ColdFingers   
 * @date: 2018年11月8日 下午8:16:06 
 */
package com.crm.wcx.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.crm.wcx.dao.CategoryMapper;
import com.crm.wcx.entity.Category;
import com.crm.wcx.entity.CategoryExample;
import com.crm.wcx.service.ICategoryService;

/** 
 * @ClassName: CategoryServiceImpl 
 * @Description: TODO
 * @author: ColdFingers
 * @date: 2018年11月8日 下午8:16:06  
 */
@Service
@Transactional(rollbackFor=Exception.class)
public class CategoryServiceImpl implements ICategoryService {

	@Autowired
	private CategoryMapper categoryMapper;
	
	/* (non-Javadoc)
	 * @see com.crm.wcx.service.ICategoryService#countByCategoryExample(com.crm.wcx.entity.CategoryExample)
	 */
	@Override
	public long countByCategoryExample(CategoryExample categoryExample) {
		// TODO Auto-generated method stub
		return categoryMapper.countByExample(categoryExample);
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.ICategoryService#deleteByCategoryExample(com.crm.wcx.entity.CategoryExample)
	 */
	@Override
	public boolean deleteByCategoryExample(CategoryExample categoryExample) {
		// TODO Auto-generated method stub
		return categoryMapper.deleteByExample(categoryExample)>0 ? true:false;
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.ICategoryService#deleteByPrimaryKey(java.lang.Integer)
	 */
	@Override
	public boolean deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return categoryMapper.deleteByPrimaryKey(id)>0 ? true:false;
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.ICategoryService#insertCategory(com.crm.wcx.entity.Category)
	 */
	@Override
	public boolean insertCategory(Category category) {
		// TODO Auto-generated method stub
		return categoryMapper.insert(category)>0 ? true:false;
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.ICategoryService#insertSelective(com.crm.wcx.entity.Category)
	 */
	@Override
	public boolean insertSelective(Category category) {
		// TODO Auto-generated method stub
		return categoryMapper.insertSelective(category)>0 ?true:false;
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.ICategoryService#selectByCategoryExample(com.crm.wcx.entity.CategoryExample)
	 */
	@Override
	public List<Category> selectByCategoryExample(
			CategoryExample categoryExample) {
		// TODO Auto-generated method stub
		return categoryMapper.selectByExample(categoryExample);
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.ICategoryService#selectCategoryByPrimaryKey(java.lang.Integer)
	 */
	@Override
	public Category selectCategoryByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return categoryMapper.selectByPrimaryKey(id);
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.ICategoryService#updateByCategoryExampleSelective(com.crm.wcx.entity.Category, com.crm.wcx.entity.CategoryExample)
	 */
	@Override
	public boolean updateByCategoryExampleSelective(Category category,
			CategoryExample categoryExample) {
		// TODO Auto-generated method stub
		return categoryMapper.updateByExampleSelective(category, categoryExample)>0 ? true:false;
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.ICategoryService#updateByCategoryExample(com.crm.wcx.entity.Category, com.crm.wcx.entity.CategoryExample)
	 */
	@Override
	public boolean updateByCategoryExample(Category category,
			CategoryExample categoryExample) {
		// TODO Auto-generated method stub
		return categoryMapper.updateByExample(category, categoryExample)>0 ? true:false;
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.ICategoryService#updateCategoryByPrimaryKeySelective(com.crm.wcx.entity.Category)
	 */
	@Override
	public boolean updateCategoryByPrimaryKeySelective(Category category) {
		// TODO Auto-generated method stub
		return categoryMapper.updateByPrimaryKeySelective(category)>0 ? true:false;
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.ICategoryService#updateCategoryByPrimaryKey(com.crm.wcx.entity.Category)
	 */
	@Override
	public boolean updateCategoryByPrimaryKey(Category category) {
		// TODO Auto-generated method stub
		return categoryMapper.updateByPrimaryKey(category)>0 ?true:false;
	}

}
