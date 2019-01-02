package com.crm.wcx.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.crm.wcx.entity.DictionaryItem;
import com.crm.wcx.entity.DictionaryItemExample;
import com.crm.wcx.entity.DictionaryType;
import com.crm.wcx.entity.DictionaryTypeExample;
import com.crm.wcx.service.IDictionaryItemService;
import com.crm.wcx.service.IDictionaryTypeService;
import com.crm.wcx.utils.Operation;
/**
 * 
 * @ClassName: DictionaryTypeController 
 * @Description: TODO
 * @author: ColdFingers
 * @date: 2018年12月4日 下午12:45:58
 */
@Controller
@RequestMapping("dictionary")
public class DictionaryTypeController {
    
    @Autowired
    private IDictionaryTypeService dictionaryTypeService;
    
    @Autowired
    private IDictionaryItemService dictionaryItemService;
   
    /**
     * 
    * @Title: listDictionaryType 
    * @Description: TODO 
    * @param page
    * @param limit
    * @param name
    * @return Map<String,Object>
    * @author ColdFingers
    * @date 2018年12月4日下午12:46:06
     */
    @RequiresPermissions("20001")
    @Operation(name="数据字典分页查询")
    @RequestMapping("admin/list")
    @ResponseBody
    public Map<String, Object> listDictionaryType(Integer page,Integer limit,String name){
        
        Map<String, Object> map = new HashMap<String,Object>(16);
        
        if(page == null || page <= 0) {
            page = 1;
        }
        if(limit == null || limit <= 0) {
            limit = 10;
        }
        Long offset = new Long((page - 1) * limit);
        
        //设置名称模糊查询
        DictionaryTypeExample example = new DictionaryTypeExample();
        if(name != null) {
            example.createCriteria().andNameLike("%" + name + "%");
        }
        Long count = dictionaryTypeService.countByDictionaryTypeExample(example);
        
        example.setLimit(limit);
        example.setOffset(offset);
        
        List<DictionaryType> list = dictionaryTypeService.selectByDictionaryTypeExample(example);
        
        map.put("data", list);
        map.put("code", 0);
        map.put("msg", "success");
        map.put("count", count);
        return map;
    }
    
    /**
     * 
    * @Title: addDictionaryType 
    * @Description: TODO 
    * @param dictionaryType
    * @return Map<String,Object>
    * @author ColdFingers
    * @date 2018年12月4日下午12:46:18
     */
    @RequiresPermissions("20002")
    @Operation(name="添加数据字典")
    @RequestMapping("admin/add")
    @ResponseBody
    public Map<String, Object> addDictionaryType(DictionaryType dictionaryType){
        
        Map<String, Object> map = new HashMap<String,Object>(16);
        if(dictionaryTypeService.insertDictionaryTypeSelective(dictionaryType)) {
            map.put("success", true);
            map.put("msg", "添加成功");
        }else {
            map.put("success", false);
            map.put("msg", "添加失败");
        }
        
        return map;
    }
    
    /**
     * 
    * @Title: updateDictionaryType 
    * @Description: TODO 
    * @param dictionaryType
    * @return Map<String,Object>
    * @author ColdFingers
    * @date 2018年12月4日下午12:46:22
     */
    @RequiresPermissions("20003")
    @Operation(name="更新数据字典")
    @RequestMapping("admin/update")
    @ResponseBody
    public Map<String, Object> updateDictionaryType(DictionaryType dictionaryType){

        
        Map<String, Object> map = new HashMap<String,Object>(16);
        if(dictionaryTypeService.updateDictionaryTypeByPrimaryKeySelective(dictionaryType)) {
            map.put("success", true);
            map.put("msg", "更新成功");
        }else {
            map.put("success", false);
            map.put("msg", "更新失败");
        }
        
        return map;
    }
    
    /**
     * 
    * @Title: deleteDictionaryType 
    * @Description: TODO 
    * @param id
    * @return Map<String,Object>
    * @author ColdFingers
    * @date 2018年12月4日下午12:46:26
     */
    @RequiresPermissions("20004")
    @Operation(name="删除数据字典")
    @RequestMapping("admin/delete")
    @ResponseBody
    public Map<String, Object> deleteDictionaryType(int id){
        
        Map<String, Object> map = new HashMap<String,Object>(16);
        if(dictionaryTypeService.deleteByPrimaryKey(id)) {
            map.put("success", true);
            map.put("msg", "删除成功");
        }else {
            map.put("success", false);
            map.put("msg", "删除失败");
        }
        
        return map;
    }

    
    /**
     * 
    * @Title: findDictionaryType 
    * @Description: TODO 
    * @param id
    * @param name
    * @return Map<String,Object>
    * @author ColdFingers
    * @date 2018年12月4日下午12:46:37
     */
    @RequiresPermissions("20005")
    @Operation(name="用户通过名称或ID查找字典")
    @RequestMapping("find")
    @ResponseBody
    public Map<String, Object> findDictionaryType(Integer id,String name){
        
        Map<String, Object> map = new HashMap<String,Object>(16);
        DictionaryType type = null;
        //查找字典
        if(id != null) {
            type = dictionaryTypeService.selectDictionaryTypeByPrimaryKey(id);
        }else if(name != null) {
            DictionaryTypeExample example = new DictionaryTypeExample();
            example.createCriteria().andNameEqualTo(name);
            
            List<DictionaryType> list = dictionaryTypeService.selectByDictionaryTypeExample(example);
            if(list.size() > 0) {
                type = list.get(0);
            }
        }else {
            map.put("success", false);
            map.put("msg", "参数错误");
            return map;
        }
        
        //设置字典子项
        if(type != null) {
            DictionaryItemExample example = new DictionaryItemExample();
            example.createCriteria().andTypeIdEqualTo(type.getId());
            List<DictionaryItem> items = dictionaryItemService.selectByDictionaryItemExample(example);
            type.setDictionaryItems(items);
        }
        
        if(type != null) {
            map.put("success", true);
            map.put("msg", "查找成功");
            map.put("data", type);
        }else {
            map.put("success", false);
            map.put("msg", "查找失败，字典不存在");
        }
        return map;
    }
    
}
