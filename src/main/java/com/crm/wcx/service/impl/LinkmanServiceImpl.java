/**   
 * 
 * @Package: com.crm.wcx.service.impl 
 * @author: ColdFingers   
 * @date: 2018年11月8日 下午8:12:12 
 */
package com.crm.wcx.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.crm.wcx.dao.CustomerMapper;
import com.crm.wcx.dao.LinkmanMapper;
import com.crm.wcx.entity.Customer;
import com.crm.wcx.entity.CustomerExample;
import com.crm.wcx.entity.CustomerExample.Criteria;
import com.crm.wcx.entity.Linkman;
import com.crm.wcx.entity.LinkmanExample;
import com.crm.wcx.entity.User;
import com.crm.wcx.service.ILinkmanService;

/** 
 * @ClassName: LinkmanServiceImpl 
 * @Description: TODO
 * @author: ColdFingers
 * @date: 2018年11月8日 下午8:12:12  
 */
@Service
@Transactional(rollbackFor=Exception.class)
public class LinkmanServiceImpl implements ILinkmanService {

	@Autowired
	private LinkmanMapper linkmanMapper;
	
	@Autowired
	private CustomerMapper customerMapper;
	
	/* (non-Javadoc)
	 * @see com.crm.wcx.service.ILinkmanService#countByLinkmanExample(com.crm.wcx.entity.LinkmanExample)
	 */
	@Override
	public long countByLinkmanExample(LinkmanExample linkmanExample) {
		// TODO Auto-generated method stub
		return linkmanMapper.countByExample(linkmanExample);
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.ILinkmanService#deleteByLinkmanExample(com.crm.wcx.entity.LinkmanExample)
	 */
	@Override
	public boolean deleteByLinkmanExample(LinkmanExample linkmanExample) {
		// TODO Auto-generated method stub
		return linkmanMapper.deleteByExample(linkmanExample)>0 ? true:false;
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.ILinkmanService#deleteLinkmanByPrimaryKey(java.lang.Integer)
	 */
	@Override
	public boolean deleteLinkmanByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return linkmanMapper.deleteByPrimaryKey(id)>0 ? true:false;
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.ILinkmanService#insertLinkman(com.crm.wcx.entity.Linkman)
	 */
	@Override
	public boolean insertLinkman(Linkman linkman) {
		// TODO Auto-generated method stub
		return linkmanMapper.insert(linkman)>0 ? true:false;
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.ILinkmanService#insertLinkmanSelective(com.crm.wcx.entity.Linkman)
	 */
	@Override
	public boolean insertLinkmanSelective(Linkman linkman) {
		// TODO Auto-generated method stub
		return linkmanMapper.insertSelective(linkman)>0 ? true:false;
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.ILinkmanService#selectByLinkmanExample(com.crm.wcx.entity.LinkmanExample)
	 */
	@Override
	public List<Linkman> selectByLinkmanExample(LinkmanExample linkmanExample) {
		// TODO Auto-generated method stub
		return linkmanMapper.selectByExample(linkmanExample);
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.ILinkmanService#selectLinkmanByPrimaryKey(java.lang.Integer)
	 */
	@Override
	public Linkman selectLinkmanByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return linkmanMapper.selectByPrimaryKey(id);
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.ILinkmanService#updateByLinkmanExampleSelective(com.crm.wcx.entity.Linkman, com.crm.wcx.entity.LinkmanExample)
	 */
	@Override
	public boolean updateByLinkmanExampleSelective(Linkman linkman,
			LinkmanExample linkmanExample) {
		// TODO Auto-generated method stub
		return linkmanMapper.updateByExampleSelective(linkman, linkmanExample)>0 ? true:false;
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.ILinkmanService#updateByLinkmanExample(com.crm.wcx.entity.Linkman, com.crm.wcx.entity.LinkmanExample)
	 */
	@Override
	public boolean updateByLinkmanExample(Linkman linkman,
			LinkmanExample linkmanExample) {
		// TODO Auto-generated method stub
		return linkmanMapper.updateByExample(linkman, linkmanExample)>0 ? true:false;
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.ILinkmanService#updateLinkmanByPrimaryKeySelective(com.crm.wcx.entity.Linkman)
	 */
	@Override
	public boolean updateLinkmanByPrimaryKeySelective(Linkman linkman) {
		// TODO Auto-generated method stub
		return linkmanMapper.updateByPrimaryKeySelective(linkman)>0 ? true:false;
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.ILinkmanService#updateLinkmanByPrimaryKey(com.crm.wcx.entity.Linkman)
	 */
	@Override
	public boolean updateLinkmanByPrimaryKey(Linkman linkman) {
		// TODO Auto-generated method stub
		return linkmanMapper.updateByPrimaryKey(linkman)>0 ? true:false;
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.ILinkmanService#selectLinkmanByUser(com.crm.wcx.entity.User)
	 */
	@Override
	public List<Linkman> selectLinkmanByUser(User user) {
		List<Linkman> linkmans = new ArrayList<Linkman>();
        try {
            //创建客户模板类
            CustomerExample customerExample = new CustomerExample();
            //创建客户查询准则
            Criteria customerCriteria =  customerExample.createCriteria();
            
            //获取当前客户经理所拥有的客户以及其下所有的联系人
            if(user.getRoleId() == 1){
                customerCriteria.andManagerIdEqualTo(user.getId()); 
            }
            
            //查找属于该客户经理的所有客户
            List<Customer> customers = customerMapper.selectByExample(customerExample);
            //查找所有用户下的联系人
            for (Customer customer : customers) {
              //创建联系人模板类
                LinkmanExample linkmanExample = new LinkmanExample();
                //创建联系人查询准则
                com.crm.wcx.entity.LinkmanExample.Criteria linkmanCriteria = linkmanExample.createCriteria();
                linkmanCriteria.andCustomerIdEqualTo(customer.getId());
                for(Linkman linkman : linkmanMapper.selectByExample(linkmanExample)){
                    //为每一个联系人封装客户实体
                    linkman.setCustomer(customer);
                    linkmans.add(linkman);
                }
            }
        } catch (Exception e) {
           throw new RuntimeException();
        }
        return linkmans;
	}

}
