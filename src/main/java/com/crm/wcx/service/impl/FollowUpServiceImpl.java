/**   
 * 
 * @Package: com.crm.wcx.service.impl 
 * @author: ColdFingers   
 * @date: 2018年11月8日 下午8:12:36 
 */
package com.crm.wcx.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.crm.wcx.dao.FollowUpMapper;
import com.crm.wcx.entity.FollowUp;
import com.crm.wcx.entity.FollowUpExample;
import com.crm.wcx.service.IFollowUpService;

/** 
 * @ClassName: FollowUpServiceImpl 
 * @Description: TODO
 * @author: ColdFingers
 * @date: 2018年11月8日 下午8:12:36  
 */
@Service
@Transactional(rollbackFor=Exception.class)
public class FollowUpServiceImpl implements IFollowUpService {

	@Autowired
	private FollowUpMapper followUpMapper;
	
	/* (non-Javadoc)
	 * @see com.crm.wcx.service.IFollowUpService#countByFollowUpExample(com.crm.wcx.entity.FollowUpExample)
	 */
	@Override
	public long countByFollowUpExample(FollowUpExample followUpExample) {
		// TODO Auto-generated method stub
		return followUpMapper.countByExample(followUpExample);
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.IFollowUpService#deleteByFollowUpExample(com.crm.wcx.entity.FollowUpExample)
	 */
	@Override
	public boolean deleteByFollowUpExample(FollowUpExample followUpExample) {
		// TODO Auto-generated method stub
		return followUpMapper.deleteByExample(followUpExample)>0 ? true:false;
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.IFollowUpService#deleteByPrimaryKey(java.lang.Integer)
	 */
	@Override
	public boolean deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return followUpMapper.deleteByPrimaryKey(id)>0 ? true:false;
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.IFollowUpService#insertFollowUp(com.crm.wcx.entity.FollowUp)
	 */
	@Override
	public boolean insertFollowUp(FollowUp followUp) {
		// TODO Auto-generated method stub
		return followUpMapper.insert(followUp)>0 ? true:false;
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.IFollowUpService#insertSelective(com.crm.wcx.entity.FollowUp)
	 */
	@Override
	public boolean insertSelective(FollowUp followUp) {
		// TODO Auto-generated method stub
		return followUpMapper.insertSelective(followUp)>0 ? true:false;
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.IFollowUpService#selectByFollowUpExample(com.crm.wcx.entity.FollowUpExample)
	 */
	@Override
	public List<FollowUp> selectByFollowUpExample(
			FollowUpExample followUpExample) {
		// TODO Auto-generated method stub
		return followUpMapper.selectByExample(followUpExample);
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.IFollowUpService#selectFollowUpByPrimaryKey(java.lang.Integer)
	 */
	@Override
	public FollowUp selectFollowUpByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return followUpMapper.selectByPrimaryKey(id);
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.IFollowUpService#updateByFollowUpExample(com.crm.wcx.entity.FollowUp, com.crm.wcx.entity.FollowUpExample)
	 */
	@Override
	public boolean updateByFollowUpExample(FollowUp followUp,
			FollowUpExample followUpExample) {
		// TODO Auto-generated method stub
		return followUpMapper.updateByExample(followUp, followUpExample)>0 ?true:false;
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.IFollowUpService#updateByFollowUpExampleSelective(com.crm.wcx.entity.FollowUp, com.crm.wcx.entity.FollowUpExample)
	 */
	@Override
	public boolean updateByFollowUpExampleSelective(FollowUp followUp,
			FollowUpExample followUpExample) {
		// TODO Auto-generated method stub
		return followUpMapper.updateByExampleSelective(followUp, followUpExample)>0 ? true:false;
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.IFollowUpService#updateFollowUpByPrimaryKeySelective(com.crm.wcx.entity.FollowUp)
	 */
	@Override
	public boolean updateFollowUpByPrimaryKeySelective(FollowUp followUp) {
		// TODO Auto-generated method stub
		return followUpMapper.updateByPrimaryKeySelective(followUp)>0 ?true:false;
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.IFollowUpService#updateFollowUpByPrimaryKey(com.crm.wcx.entity.FollowUp)
	 */
	@Override
	public boolean updateFollowUpByPrimaryKey(FollowUp followUp) {
		// TODO Auto-generated method stub
		return followUpMapper.updateByPrimaryKey(followUp)>0 ? true:false;
	}

}
