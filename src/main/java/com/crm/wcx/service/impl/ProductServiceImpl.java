/**   
 * 
 * @Package: com.crm.wcx.service.impl 
 * @author: ColdFingers   
 * @date: 2018年11月8日 下午8:08:59 
 */
package com.crm.wcx.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.crm.wcx.dao.ProductMapper;
import com.crm.wcx.entity.Product;
import com.crm.wcx.entity.ProductExample;
import com.crm.wcx.service.IProductService;

/** 
 * @ClassName: ProductServiceImpl 
 * @Description: TODO
 * @author: ColdFingers
 * @date: 2018年11月8日 下午8:08:59  
 */
@Service
@Transactional(rollbackFor=Exception.class)
public class ProductServiceImpl implements IProductService {

	
	@Autowired
	private ProductMapper productMapper;
	
	/* (non-Javadoc)
	 * @see com.crm.wcx.service.IProductService#countByProductExample(com.crm.wcx.entity.ProductExample)
	 */
	@Override
	public long countByProductExample(ProductExample productExample) {
		// TODO Auto-generated method stub
		return productMapper.countByExample(productExample);
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.IProductService#deleteByProductExample(com.crm.wcx.entity.ProductExample)
	 */
	@Override
	public boolean deleteByProductExample(ProductExample productExample) {
		// TODO Auto-generated method stub
		return productMapper.deleteByExample(productExample)>0 ? true:false;
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.IProductService#deleteByPrimaryKey(java.lang.Integer)
	 */
	@Override
	public boolean deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return productMapper.deleteByPrimaryKey(id)>0 ? true:false;
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.IProductService#insertProduct(com.crm.wcx.entity.Product)
	 */
	@Override
	public boolean insertProduct(Product product) {
		// TODO Auto-generated method stub
		return productMapper.insert(product)>0 ? true:false;
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.IProductService#insertSelective(com.crm.wcx.entity.Product)
	 */
	@Override
	public boolean insertSelective(Product product) {
		// TODO Auto-generated method stub
		return productMapper.insertSelective(product)>0 ? true:false;
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.IProductService#selectByProductExample(com.crm.wcx.entity.ProductExample)
	 */
	@Override
	public List<Product> selectByProductExample(ProductExample productExample) {
		// TODO Auto-generated method stub
		return productMapper.selectByExample(productExample);
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.IProductService#selectProductByPrimaryKey(java.lang.Integer)
	 */
	@Override
	public Product selectProductByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return productMapper.selectByPrimaryKey(id);
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.IProductService#updateByProductExample(com.crm.wcx.entity.Product, com.crm.wcx.entity.ProductExample)
	 */
	@Override
	public boolean updateByProductExample(Product product,
			ProductExample productExample) {
		// TODO Auto-generated method stub
		return productMapper.updateByExample(product, productExample)>0 ? true:false;
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.IProductService#updateByProductExampleSelective(com.crm.wcx.entity.Product, com.crm.wcx.entity.ProductExample)
	 */
	@Override
	public boolean updateByProductExampleSelective(Product product,
			ProductExample productExample) {
		// TODO Auto-generated method stub
		return productMapper.updateByExampleSelective(product, productExample)>0 ? true:false;
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.IProductService#updateProductByPrimaryKeySelective(com.crm.wcx.entity.Product)
	 */
	@Override
	public boolean updateProductByPrimaryKeySelective(Product product) {
		// TODO Auto-generated method stub
		return productMapper.updateByPrimaryKeySelective(product)>0 ? true:false;
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.IProductService#updateProductByPrimaryKey(com.crm.wcx.entity.Product)
	 */
	@Override
	public boolean updateProductByPrimaryKey(Product product) {
		// TODO Auto-generated method stub
		return productMapper.updateByPrimaryKey(product)>0 ? true:false;
	}

}
