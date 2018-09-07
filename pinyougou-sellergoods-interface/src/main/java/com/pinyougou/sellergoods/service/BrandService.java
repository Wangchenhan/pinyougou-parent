package com.pinyougou.sellergoods.service;

import java.util.List;
import java.util.Map;

import com.pinyougou.pojo.TbBrand;

import entity.PageResult;

/**
 * 
 * <pre>项目名称：pinyougou-sellergoods-interface    
 * 类名称：BrandService    
 * 类描述：    品牌
 * 创建人：杨志超 yangzhichao150@126.com    
 * 创建时间：2018年9月4日 下午3:49:11    
 * 修改人：杨志超 yangzhichao150@126.com     
 * 修改时间：2018年9月4日 下午3:49:11    
 * 修改备注：       
 * @version </pre>
 */
public interface BrandService {


	public List<TbBrand> findAll();
	

	public PageResult findPage(TbBrand brand,int page, int rows);


	public void add(TbBrand brand);

	public void update(TbBrand brand);

	public TbBrand findOne(Long id);

	public void delete(Long [] ids);

	/**
	 * 品牌下拉框数据
	 */
	List<Map> selectOptionList();

}
