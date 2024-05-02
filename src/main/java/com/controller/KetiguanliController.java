package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.KetiguanliEntity;
import com.entity.view.KetiguanliView;

import com.service.KetiguanliService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 课题管理
 * 后端接口
 * @author 
 * @email 
 * @date 2021-05-15 14:44:55
 */
@RestController
@RequestMapping("/ketiguanli")
public class KetiguanliController {
    @Autowired
    private KetiguanliService ketiguanliService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,KetiguanliEntity ketiguanli, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("jiaoshi")) {
			ketiguanli.setJiaoshizhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<KetiguanliEntity> ew = new EntityWrapper<KetiguanliEntity>();
		PageUtils page = ketiguanliService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, ketiguanli), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,KetiguanliEntity ketiguanli, 
		HttpServletRequest request){
        EntityWrapper<KetiguanliEntity> ew = new EntityWrapper<KetiguanliEntity>();
		PageUtils page = ketiguanliService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, ketiguanli), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( KetiguanliEntity ketiguanli){
       	EntityWrapper<KetiguanliEntity> ew = new EntityWrapper<KetiguanliEntity>();
      	ew.allEq(MPUtil.allEQMapPre( ketiguanli, "ketiguanli")); 
        return R.ok().put("data", ketiguanliService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(KetiguanliEntity ketiguanli){
        EntityWrapper< KetiguanliEntity> ew = new EntityWrapper< KetiguanliEntity>();
 		ew.allEq(MPUtil.allEQMapPre( ketiguanli, "ketiguanli")); 
		KetiguanliView ketiguanliView =  ketiguanliService.selectView(ew);
		return R.ok("查询课题管理成功").put("data", ketiguanliView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        KetiguanliEntity ketiguanli = ketiguanliService.selectById(id);
        return R.ok().put("data", ketiguanli);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        KetiguanliEntity ketiguanli = ketiguanliService.selectById(id);
        return R.ok().put("data", ketiguanli);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody KetiguanliEntity ketiguanli, HttpServletRequest request){
    	ketiguanli.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(ketiguanli);

        ketiguanliService.insert(ketiguanli);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody KetiguanliEntity ketiguanli, HttpServletRequest request){
    	ketiguanli.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(ketiguanli);

        ketiguanliService.insert(ketiguanli);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody KetiguanliEntity ketiguanli, HttpServletRequest request){
        //ValidatorUtils.validateEntity(ketiguanli);
        ketiguanliService.updateById(ketiguanli);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        ketiguanliService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<KetiguanliEntity> wrapper = new EntityWrapper<KetiguanliEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("jiaoshi")) {
			wrapper.eq("jiaoshizhanghao", (String)request.getSession().getAttribute("username"));
		}

		int count = ketiguanliService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
