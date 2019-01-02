package com.crm.wcx.service;

import java.util.List;

import com.crm.wcx.entity.Product;
import com.crm.wcx.entity.ProductExample;

/**
 * 
 * @ClassName: IProductService 
 * @Description: TODO
 * @author: ColdFingers
 * @date: 2018年11月8日 下午5:21:48
 */
public interface IProductService {

	
	/**
	 * 	
	* @Title: countByProductExample 
	* @Description: 按照Example统计记录总数 
	* @param productExample
	* @return long
	* @author ColdFingers
	* @date 2018年11月8日下午5:22:07
	 */
	public long countByProductExample(ProductExample productExample);

	/**
	 * 
	* @Title: deleteByProductExample 
	* @Description: 按照Example 删除Product 
	* @param productExample
	* @return boolean
	* @author ColdFingers
	* @date 2018年11月8日下午5:22:39
	 */
	public boolean deleteByProductExample(ProductExample productExample);

	/**
	 * 
	* @Title: deleteByPrimaryKey 
	* @Description: 按照Product主键id删除Product 
	* @param id
	* @return boolean
	* @author ColdFingers
	* @date 2018年11月8日下午5:22:59
	 */
	public boolean deleteByPrimaryKey(Integer id);
	
	/**
	 * 
	* @Title: insertProduct 
	* @Description: 插入一条Product数据 如字段为空，则插入null 
	* @param product
	* @return boolean
	* @author ColdFingers
	* @date 2018年11月8日下午5:23:13
	 */
	public boolean insertProduct(Product product);
	
	/**
	 * 
	* @Title: insertSelective 
	* @Description: 插入一条Product数据，如字段为空，则插入数据库表字段的默认值 
	* @param product
	* @return boolean
	* @author ColdFingers
	* @date 2018年11月8日下午5:23:31
	 */
	public boolean insertSelective(Product product);
	
	/**
	 * 
	* @Title: selectByProductExample 
	* @Description: 按照Example条件 模糊查询 
	* @param productExample
	* @return List<Product>
	* @author ColdFingers
	* @date 2018年11月8日下午5:23:45
	 */
	public List<Product> selectByProductExample(ProductExample productExample);
	

	/**
	 * 
	* @Title: selectProductByPrimaryKey 
	* @Description: 按照Product 的id 查找 Product 
	* @param id
	* @return Product
	* @author ColdFingers
	* @date 2018年11月8日下午5:24:03
	 */
	public Product selectProductByPrimaryKey(Integer id);
	
	/**
	 * 
	* @Title: updateByProductExample 
	* @Description: 更新Product 若字段为空 设置为null 
	* @param product
	* @param productExample
	* @return boolean
	* @author ColdFingers
	* @date 2018年11月8日下午5:24:26
	 */
	public boolean updateByProductExample(Product product, ProductExample productExample);
	
	/**
	 * 
	* @Title: updateByProductExampleSelective 
	* @Description: 更新product 若字段为空 则不修改 
	* @param product
	* @param productExample
	* @return boolean
	* @author ColdFingers
	* @date 2018年11月8日下午5:24:56
	 */
	public boolean updateByProductExampleSelective(Product product, ProductExample productExample);
		
	/**
	 * 
	* @Title: updateProductByPrimaryKeySelective 
	* @Description: 更新product 如果字段为空 则不更新 
	* @param product
	* @return boolean
	* @author ColdFingers
	* @date 2018年11月8日下午5:25:50
	 */
	public boolean updateProductByPrimaryKeySelective(Product product);
	
	/**
	 * 
	* @Title: updateProductByPrimaryKey 
	* @Description: 更新Product 若字段为空 更新为null 
	* @param product
	* @return boolean
	* @author ColdFingers
	* @date 2018年11月8日下午5:26:42
	 */
	public boolean updateProductByPrimaryKey(Product product);
}
