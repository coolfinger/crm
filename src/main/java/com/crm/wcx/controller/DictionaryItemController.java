package com.crm.wcx.controller;

import java.util.ArrayList;
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
import com.crm.wcx.service.IDictionaryItemService;
import com.crm.wcx.utils.Operation;
/**
 * 
 * @ClassName: DictionaryItemController 
 * @Description: TODO
 * @author: ColdFingers
 * @date: 2018年12月4日 下午12:44:50
 */
@Controller
@RequestMapping("dictionary/item")
public class DictionaryItemController {
    
    @Autowired
    private IDictionaryItemService dictionaryItemService;
 
    
    
    /**
     * 
    * @Title: listDictionaryItem 
    * @Description: 查询字典子项 
    * @param page
    * @param limit
    * @param typeid
    * @return Map<String,Object>
    * @author ColdFingers
    * @date 2018年12月4日下午12:44:58
     */
    @RequiresPermissions("20006")
    @Operation(name="数据字典子项查询")
    @RequestMapping("list")
    @ResponseBody
    public Map<String, Object> listDictionaryItem(Integer page,Integer limit,int typeid){
        
        Map<String, Object> map = new HashMap<String,Object>(16);
        DictionaryItemExample example = new DictionaryItemExample();
        example.createCriteria().andTypeIdEqualTo(typeid);
        List<DictionaryItem> list = dictionaryItemService.selectByDictionaryItemExample(example);
            
        map.put("data", list);
        map.put("code", 0);
        map.put("msg", "success");
        return map;
    }
    
    
    /**
     * 
    * @Title: addDictionaryItem 
    * @Description: 添加非锁定状态子项 
    * @param item
    * @return Map<String,Object>
    * @author ColdFingers
    * @date 2018年12月4日下午12:45:07
     */
    @RequiresPermissions("20007")
    @Operation(name="数据字典子项添加")
    @RequestMapping("add")
    @ResponseBody
    public Map<String, Object> addDictionaryItem(DictionaryItem item){
        
        Map<String, Object> map = new HashMap<String,Object>(16);
        //设置字典子项权限为所有用户可操作，即非锁定状态
        item.setStatus(1);
        
        if(dictionaryItemService.insertDictionaryItemSelective(item)) {
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
    * @Title: updateDictionaryItem 
    * @Description: 更新非锁定状态子项 
    * @param item
    * @return Map<String,Object>
    * @author ColdFingers
    * @date 2018年12月4日下午12:45:17
     */
    @RequiresPermissions("20008")
    @Operation(name="数据字典子项更新")
    @RequestMapping("update")
    @ResponseBody
    public Map<String, Object> updateDictionaryItem(DictionaryItem item){
        
        Map<String, Object> map = new HashMap<String,Object>(16);
        
        DictionaryItem dictionaryItem = dictionaryItemService.selectDictionaryItemByPrimaryKey(item.getId());
        if(dictionaryItem == null) {
            map.put("success", false);
            map.put("msg", "非法操作");
            return map;
        }
        
        //锁定子项，普通用户无法操作
        if(dictionaryItem.getStatus() == 0) {
            map.put("success", false);
            map.put("msg", "非法操作");
            return map;
        }

        //确保子项状态非锁定
        item.setStatus(1);
        
        if(dictionaryItemService.updateDictionaryItemByPrimaryKeySelective(item)) {
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
    * @Title: deleteDictionaryItem 
    * @Description: 删除非锁定子项 
    * @param ids
    * @return Map<String,Object>
    * @author ColdFingers
    * @date 2018年12月4日下午12:45:28
     */
    @RequiresPermissions("20009")
    @Operation(name="数据字典子项删除")
    @RequestMapping("delete")
    @ResponseBody
    public Map<String, Object> deleteDictionaryItem(int[] ids){
        
        Map<String, Object> map = new HashMap<String,Object>(16);
        List<Integer> success = new ArrayList<Integer>();
        List<Integer> fail = new ArrayList<Integer>();
        DictionaryItem dictionaryItem = null;
        
        if(ids == null) {
            map.put("msg", "参数为空，删除失败");
            map.put("status", false);
            return map;
        }
        for(int id : ids) {
            dictionaryItem = dictionaryItemService.selectDictionaryItemByPrimaryKey(id);
            if(dictionaryItem == null || dictionaryItem.getStatus() == 0) {
                fail.add(id);
                continue;
            }
            if(dictionaryItemService.deleteByPrimaryKey(id)) {
                success.add(id);
            }else {
                fail.add(id);
            }
        }
        
        map.put("msg", "删除完成");
        map.put("status", true);
        map.put("success", success);
        map.put("fail", fail);
        
        return map;
    }
    
    /**
     * 
    * @Title: addDictionaryItemAdmin 
    * @Description: 添加子项 
    * @param item
    * @return Map<String,Object>
    * @author ColdFingers
    * @date 2018年12月4日下午12:45:37
     */
    @RequiresPermissions("20010")
    @Operation(name="数据字典子项添加")
    @RequestMapping("admin/add")
    @ResponseBody
    public Map<String, Object> addDictionaryItemAdmin(DictionaryItem item){
        
        Map<String, Object> map = new HashMap<String,Object>(16);
        if(dictionaryItemService.insertDictionaryItemSelective(item)) {
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
    * @Title: updateDictionaryItemAdmin 
    * @Description: TODO 
    * @param item
    * @return Map<String,Object>
    * @author ColdFingers
    * @date 2018年12月4日下午12:45:44
     */
    @RequiresPermissions("20011")
    @Operation(name="数据字典子项更新")
    @RequestMapping("admin/update")
    @ResponseBody
    public Map<String, Object> updateDictionaryItemAdmin(DictionaryItem item){
        
        Map<String, Object> map = new HashMap<String,Object>(16);
        if(dictionaryItemService.updateDictionaryItemByPrimaryKeySelective(item)) {
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
    * @Title: deleteDictionaryItemAdmin 
    * @Description: TODO 
    * @param ids
    * @return Map<String,Object>
    * @author ColdFingers
    * @date 2018年12月4日下午12:45:49
     */
    @RequiresPermissions("20012")
    @Operation(name="数据字典子项删除")
    @RequestMapping("admin/delete")
    @ResponseBody
    public Map<String, Object> deleteDictionaryItemAdmin(int[] ids){
        
        Map<String, Object> map = new HashMap<String,Object>(16);
        List<Integer> success = new ArrayList<Integer>();
        List<Integer> fail = new ArrayList<Integer>();
        
        if(ids == null) {
            map.put("msg", "参数为空，删除失败");
            map.put("status", false);
            return map;
        }
        for(int id : ids) {
            if(dictionaryItemService.deleteByPrimaryKey(id)) {
                success.add(id);
            }else {
                fail.add(id);
            }
        }
        
        map.put("msg", "删除完成");
        map.put("status", true);
        map.put("success", success);
        map.put("fail", fail);
        
        return map;
    }
    
    
}
