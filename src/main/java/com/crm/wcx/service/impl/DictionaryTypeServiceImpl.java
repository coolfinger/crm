/**   
 * 
 * @Package: com.crm.wcx.service.impl 
 * @author: ColdFingers   
 * @date: 2018年11月8日 下午8:13:03 
 */
package com.crm.wcx.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.crm.wcx.dao.DictionaryTypeMapper;
import com.crm.wcx.entity.DictionaryType;
import com.crm.wcx.entity.DictionaryTypeExample;
import com.crm.wcx.service.IDictionaryTypeService;

/** 
 * @ClassName: DictionaryTypeServiceImpl 
 * @Description: TODO
 * @author: ColdFingers
 * @date: 2018年11月8日 下午8:13:03  
 */
@Service
@Transactional(rollbackFor=Exception.class)
public class DictionaryTypeServiceImpl implements IDictionaryTypeService {

	@Autowired
	private DictionaryTypeMapper dictionaryTypeMapper;
	
	/* (non-Javadoc)
	 * @see com.crm.wcx.service.IDictionaryTypeService#countByDictionaryTypeExample(com.crm.wcx.entity.DictionaryTypeExample)
	 */
	@Override
	public long countByDictionaryTypeExample(
			DictionaryTypeExample dictionaryTypeExample) {
		// TODO Auto-generated method stub
		return dictionaryTypeMapper.countByExample(dictionaryTypeExample);
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.IDictionaryTypeService#deleteByDictionaryTypeExample(com.crm.wcx.entity.DictionaryTypeExample)
	 */
	@Override
	public boolean deleteByDictionaryTypeExample(
			DictionaryTypeExample dictionaryTypeExample) {
		// TODO Auto-generated method stub
		return dictionaryTypeMapper.deleteByExample(dictionaryTypeExample)>0 ? true:false;
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.IDictionaryTypeService#deleteByPrimaryKey(java.lang.Integer)
	 */
	@Override
	public boolean deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return dictionaryTypeMapper.deleteByPrimaryKey(id)>0 ? true:false;
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.IDictionaryTypeService#insertDictionaryType(com.crm.wcx.entity.DictionaryType)
	 */
	@Override
	public boolean insertDictionaryType(DictionaryType dictionaryType) {
		// TODO Auto-generated method stub
		return dictionaryTypeMapper.insert(dictionaryType)>0 ? true:false;
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.IDictionaryTypeService#insertDictionaryTypeSelective(com.crm.wcx.entity.DictionaryType)
	 */
	@Override
	public boolean insertDictionaryTypeSelective(DictionaryType dictionaryType) {
		// TODO Auto-generated method stub
		return dictionaryTypeMapper.insertSelective(dictionaryType)>0 ? true:false;
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.IDictionaryTypeService#selectByDictionaryTypeExample(com.crm.wcx.entity.DictionaryTypeExample)
	 */
	@Override
	public List<DictionaryType> selectByDictionaryTypeExample(
			DictionaryTypeExample dictionaryTypeExample) {
		// TODO Auto-generated method stub
		return dictionaryTypeMapper.selectByExample(dictionaryTypeExample);
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.IDictionaryTypeService#selectDictionaryTypeByPrimaryKey(java.lang.Integer)
	 */
	@Override
	public DictionaryType selectDictionaryTypeByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return dictionaryTypeMapper.selectByPrimaryKey(id);
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.IDictionaryTypeService#updateByDictionaryTypeExample(com.crm.wcx.entity.DictionaryType, com.crm.wcx.entity.DictionaryTypeExample)
	 */
	@Override
	public boolean updateByDictionaryTypeExample(DictionaryType dictionaryType,
			DictionaryTypeExample dictionaryTypeExample) {
		// TODO Auto-generated method stub
		return dictionaryTypeMapper.updateByExample(dictionaryType, dictionaryTypeExample)>0 ? true:false;
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.IDictionaryTypeService#updateByDictionaryTypeExampleSelective(com.crm.wcx.entity.DictionaryType, com.crm.wcx.entity.DictionaryTypeExample)
	 */
	@Override
	public boolean updateByDictionaryTypeExampleSelective(
			DictionaryType dictionaryType,
			DictionaryTypeExample dictionaryTypeExample) {
		// TODO Auto-generated method stub
		return dictionaryTypeMapper.updateByExampleSelective(dictionaryType, dictionaryTypeExample)>0 ? true:false;
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.IDictionaryTypeService#updateDictionaryTypeByPrimaryKeySelective(com.crm.wcx.entity.DictionaryType)
	 */
	@Override
	public boolean updateDictionaryTypeByPrimaryKeySelective(
			DictionaryType dictionaryType) {
		// TODO Auto-generated method stub
		return dictionaryTypeMapper.updateByPrimaryKeySelective(dictionaryType)>0 ? true:false;
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.IDictionaryTypeService#updateDictionaryTypeByPrimaryKey(com.crm.wcx.entity.DictionaryType)
	 */
	@Override
	public boolean updateDictionaryTypeByPrimaryKey(
			DictionaryType dictionaryType) {
		// TODO Auto-generated method stub
		return dictionaryTypeMapper.updateByPrimaryKey(dictionaryType)>0 ? true:false;
	}

}
