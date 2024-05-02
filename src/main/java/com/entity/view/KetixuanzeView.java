package com.entity.view;

import com.entity.KetixuanzeEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 课题选择
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-15 14:44:55
 */
@TableName("ketixuanze")
public class KetixuanzeView  extends KetixuanzeEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public KetixuanzeView(){
	}
 
 	public KetixuanzeView(KetixuanzeEntity ketixuanzeEntity){
 	try {
			BeanUtils.copyProperties(this, ketixuanzeEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
