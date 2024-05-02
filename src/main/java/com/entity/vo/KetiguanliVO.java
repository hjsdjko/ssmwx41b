package com.entity.vo;

import com.entity.KetiguanliEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 课题管理
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-05-15 14:44:55
 */
public class KetiguanliVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 教师姓名
	 */
	
	private String jiaoshixingming;
		
	/**
	 * 电话
	 */
	
	private String dianhua;
		
	/**
	 * 课题名称
	 */
	
	private String ketimingcheng;
		
	/**
	 * 课题简介
	 */
	
	private String ketijianjie;
		
	/**
	 * 课题文件
	 */
	
	private String ketiwenjian;
				
	
	/**
	 * 设置：教师姓名
	 */
	 
	public void setJiaoshixingming(String jiaoshixingming) {
		this.jiaoshixingming = jiaoshixingming;
	}
	
	/**
	 * 获取：教师姓名
	 */
	public String getJiaoshixingming() {
		return jiaoshixingming;
	}
				
	
	/**
	 * 设置：电话
	 */
	 
	public void setDianhua(String dianhua) {
		this.dianhua = dianhua;
	}
	
	/**
	 * 获取：电话
	 */
	public String getDianhua() {
		return dianhua;
	}
				
	
	/**
	 * 设置：课题名称
	 */
	 
	public void setKetimingcheng(String ketimingcheng) {
		this.ketimingcheng = ketimingcheng;
	}
	
	/**
	 * 获取：课题名称
	 */
	public String getKetimingcheng() {
		return ketimingcheng;
	}
				
	
	/**
	 * 设置：课题简介
	 */
	 
	public void setKetijianjie(String ketijianjie) {
		this.ketijianjie = ketijianjie;
	}
	
	/**
	 * 获取：课题简介
	 */
	public String getKetijianjie() {
		return ketijianjie;
	}
				
	
	/**
	 * 设置：课题文件
	 */
	 
	public void setKetiwenjian(String ketiwenjian) {
		this.ketiwenjian = ketiwenjian;
	}
	
	/**
	 * 获取：课题文件
	 */
	public String getKetiwenjian() {
		return ketiwenjian;
	}
			
}
