/**   
 * 
 * @Package: com.crm.wcx.service.impl 
 * @author: ColdFingers   
 * @date: 2018年11月8日 下午8:13:30 
 */
package com.crm.wcx.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.crm.wcx.dao.DictionaryItemMapper;
import com.crm.wcx.entity.DictionaryItem;
import com.crm.wcx.entity.DictionaryItemExample;
import com.crm.wcx.service.IDictionaryItemService;

/** 
 * @ClassName: DictionaryItemServiceImpl 
 * @Description: TODO
 * @author: ColdFingers
 * @date: 2018年11月8日 下午8:13:30  
 */
@Service
@Transactional(rollbackFor=Exception.class)
public class DictionaryItemServiceImpl implements IDictionaryItemService {

	@Autowired
	private DictionaryItemMapper dictionaryItemMapper;
	/* (non-Javadoc)
	 * @see com.crm.wcx.service.IDictionaryItemService#countByDictionaryItemExample(com.crm.wcx.entity.DictionaryItemExample)
	 */
	@Override
	public long countByDictionaryItemExample(
			DictionaryItemExample dictionaryItemExample) {
		// TODO Auto-generated method stub
		return dictionaryItemMapper.countByExample(dictionaryItemExample);
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.IDictionaryItemService#deleteByDictionaryItemExample(com.crm.wcx.entity.DictionaryItemExample)
	 */
	@Override
	public boolean deleteByDictionaryItemExample(
			DictionaryItemExample dictionaryItemExample) {
		// TODO Auto-generated method stub
		return dictionaryItemMapper.deleteByExample(dictionaryItemExample)>0 ? true:false;
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.IDictionaryItemService#deleteByPrimaryKey(java.lang.Integer)
	 */
	@Override
	public boolean deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return dictionaryItemMapper.deleteByPrimaryKey(id)>0 ? true:false;
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.IDictionaryItemService#insertDictionaryItem(com.crm.wcx.entity.DictionaryItem)
	 */
	@Override
	public boolean insertDictionaryItem(DictionaryItem dictionaryItem) {
		// TODO Auto-generated method stub
		return dictionaryItemMapper.insert(dictionaryItem)>0 ? true:false;
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.IDictionaryItemService#insertDictionaryItemSelective(com.crm.wcx.entity.DictionaryItem)
	 */
	@Override
	public boolean insertDictionaryItemSelective(DictionaryItem dictionaryItem) {
		// TODO Auto-generated method stub
		return dictionaryItemMapper.insertSelective(dictionaryItem)>0 ? true:false;
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.IDictionaryItemService#selectByDictionaryItemExample(com.crm.wcx.entity.DictionaryItemExample)
	 */
	@Override
	public List<DictionaryItem> selectByDictionaryItemExample(
			DictionaryItemExample dictionaryItemExample) {
		// TODO Auto-generated method stub
		return dictionaryItemMapper.selectByExample(dictionaryItemExample);
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.IDictionaryItemService#selectDictionaryItemByPrimaryKey(java.lang.Integer)
	 */
	@Override
	public DictionaryItem selectDictionaryItemByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return dictionaryItemMapper.selectByPrimaryKey(id);
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.IDictionaryItemService#updateByDictionaryItemExample(com.crm.wcx.entity.DictionaryItem, com.crm.wcx.entity.DictionaryItemExample)
	 */
	@Override
	public boolean updateByDictionaryItemExample(DictionaryItem dictionaryItem,
			DictionaryItemExample dictionaryItemExample) {
		// TODO Auto-generated method stub
		return dictionaryItemMapper.updateByExample(dictionaryItem, dictionaryItemExample)>0 ?true:false;
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.IDictionaryItemService#updateByDictionaryItemExampleSelective(com.crm.wcx.entity.DictionaryItem, com.crm.wcx.entity.DictionaryItemExample)
	 */
	@Override
	public boolean updateByDictionaryItemExampleSelective(
			DictionaryItem dictionaryItem,
			DictionaryItemExample dictionaryItemExample) {
		// TODO Auto-generated method stub
		return dictionaryItemMapper.updateByExampleSelective(dictionaryItem, dictionaryItemExample)>0 ? true:false;
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.IDictionaryItemService#updateDictionaryItemByPrimaryKeySelective(com.crm.wcx.entity.DictionaryItem)
	 */
	@Override
	public boolean updateDictionaryItemByPrimaryKeySelective(
			DictionaryItem dictionaryItem) {
		// TODO Auto-generated method stub
		return dictionaryItemMapper.updateByPrimaryKeySelective(dictionaryItem)>0 ? true:false;
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.IDictionaryItemService#updateDictionaryItemByPrimaryKey(com.crm.wcx.entity.DictionaryItem)
	 */
	@Override
	public boolean updateDictionaryItemByPrimaryKey(
			DictionaryItem dictionaryItem) {
		// TODO Auto-generated method stub
		return dictionaryItemMapper.updateByPrimaryKey(dictionaryItem)>0 ? true:false;
	}

}
