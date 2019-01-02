package com.crm.wcx.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;




import com.crm.wcx.entity.Pager;
import com.crm.wcx.entity.SaleOpportunity;
import com.crm.wcx.entity.SaleOpportunityExample;

/**
 * 
 * @ClassName: ISaleOpportunityService 
 * @Description: TODO
 * @author: ColdFingers
 * @date: 2018年11月8日 下午3:26:03
 */
public interface ISaleOpportunityService {

	/**
	 * 
	* @Title: countBySaleOpportunityExample 
	* @Description: 按照Example统计记录总数 
	* @param saleOpportunityExample
	* @return long
	* @author ColdFingers
	* @date 2018年11月8日下午3:31:34
	 */
	public long countBySaleOpportunityExample(SaleOpportunityExample saleOpportunityExample);
	
	/**
	 * 
	* @Title: deleteBySaleOpportunityExample 
	* @Description: 根据Example删除记录 
	* @param saleOpportunityExample
	* @return boolean
	* @author ColdFingers
	* @date 2018年11月8日下午3:32:11
	 */
	public boolean deleteBySaleOpportunityExample(SaleOpportunityExample saleOpportunityExample);
	
	/**
	 * 
	* @Title: deleteByPrimaryKey 
	* @Description: 根据主键id删除记录 
	* @param id
	* @return boolean
	* @author ColdFingers
	* @date 2018年11月8日下午3:32:46
	 */
	public boolean deleteByPrimaryKey(Integer id);
	
	/**
	 * 
	* @Title: insertSaleOpportunity 
	* @Description: 插入一条记录 如果字段为空则插入null 
	* @param saleOpportunity
	* @return boolean
	* @author ColdFingers
	* @date 2018年11月8日下午3:34:03
	 */
	public boolean insertSaleOpportunity(SaleOpportunity saleOpportunity);
	
	/**
	 * 
	* @Title: insertSelective 
	* @Description: 插入一条记录 如果记录为空则插入默认值 
	* @param saleOpportunity
	* @return boolean
	* @author ColdFingers
	* @date 2018年11月8日下午3:34:38
	 */
	public boolean insertSelective(SaleOpportunity saleOpportunity);
	
	/**
	 * 
	* @Title: selectBySaleOpportunityExample 
	* @Description: 根据Example查询记录 
	* @param saleOpportunityExample
	* @return List<SaleOpportunity>
	* @author ColdFingers
	* @date 2018年11月8日下午3:35:13
	 */
	public List<SaleOpportunity> selectBySaleOpportunityExample(SaleOpportunityExample saleOpportunityExample);
	
	/**
	 * 
	* @Title: selectBySaleOpportunitySelectiveAndPager 
	* @Description: 传入参数到Example在根据selectBySaleOpportunity查询 
	* @param saleOpportunity
	* @param pager
	* @param request
	* @return List<SaleOpportunity>
	* @author ColdFingers
	* @date 2018年11月8日下午3:35:43
	 */
	//public List<SaleOpportunity> selectBySaleOpportunitySelectiveAndPager(SaleOpportunity saleOpportunity,Pager pager,HttpServletRequest request);
	
	/**
	 * 
	* @Title: selectSaleOpportunityByPrimaryKey 
	* @Description: 根据主键id查询saleOpportunity 
	* @param id
	* @return SaleOpportunity
	* @author ColdFingers
	* @date 2018年11月8日下午3:37:12
	 */
	public SaleOpportunity selectSaleOpportunityByPrimaryKey(Integer id);
	
	/**
	 * 
	* @Title: updateBySaleOpportunityExample 
	* @Description: 根据Example更改SaleOpportunity 如果对象为空 则更改为空 
	* @param saleOpportunity
	* @param saleOpportunityExample
	* @return boolean
	* @author ColdFingers
	* @date 2018年11月8日下午3:37:44
	 */
	public boolean updateBySaleOpportunityExample(SaleOpportunity saleOpportunity, SaleOpportunityExample saleOpportunityExample);
	
	/**
	 * 
	* @Title: updateBySaleOpportunityExampleSelective 
	* @Description: 根据Example更改SaleOpportunity 如果字段为空则设置为默认值 
	* @param saleOpportunity
	* @param saleOpportunityExample
	* @return boolean
	* @author ColdFingers
	* @date 2018年11月8日下午3:38:38
	 */
	public boolean updateBySaleOpportunityExampleSelective(SaleOpportunity saleOpportunity, SaleOpportunityExample saleOpportunityExample);
	
	/**
	 * 
	* @Title: updateSaleOpportunityByPrimaryKeySelective 
	* @Description: 通过主键id更改saleOpportunity 如果字段为空则设置为默认值 
	* @param saleOpportunity
	* @return boolean
	* @author ColdFingers
	* @date 2018年11月8日下午3:39:38
	 */
	public boolean updateSaleOpportunityByPrimaryKeySelective(SaleOpportunity saleOpportunity);
	
	/**
	 * 
	* @Title: updateSaleOpportunityByPrimaryKey 
	* @Description: 更改saleOpportunity 如果字段为空则设置为null 
	* @param saleOpportunity
	* @return boolean
	* @author ColdFingers
	* @date 2018年11月8日下午3:40:30
	 */
	public boolean updateSaleOpportunityByPrimaryKey(SaleOpportunity saleOpportunity);	
	
	/**
	 * 
	* @Title: deleteSaleOpportunitiesByPrimaryKey 
	* @Description: 批量删除 
	* @param ids
	* @return boolean
	* @author ColdFingers
	* @date 2018年11月8日下午3:41:08
	 */
	public boolean deleteSaleOpportunitiesByPrimaryKey(String ids);

	/** 
	* @Title: selectBySaleOpportunitySelectiveAndPager 
	* @Description: TODO 
	* @param saleOpportunity
	* @param pager
	* @param request
	* @return List<SaleOpportunity>
	* @author CoolFingers
	* @date 2018年11月9日下午1:15:25
	*/ 
	public List<SaleOpportunity> selectBySaleOpportunitySelectiveAndPager(
			SaleOpportunity saleOpportunity, com.crm.wcx.entity.Pager pager,
			HttpServletRequest request);
	
}
