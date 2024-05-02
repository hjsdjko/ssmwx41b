package com.entity.view;

import com.entity.LunwenguanliEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 论文管理
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-15 14:44:55
 */
@TableName("lunwenguanli")
public class LunwenguanliView  extends LunwenguanliEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public LunwenguanliView(){
	}
 
 	public LunwenguanliView(LunwenguanliEntity lunwenguanliEntity){
 	try {
			BeanUtils.copyProperties(this, lunwenguanliEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
