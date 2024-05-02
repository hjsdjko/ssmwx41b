package com.entity.vo;

import com.entity.LunwenguanliEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 论文管理
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-05-15 14:44:55
 */
public class LunwenguanliVO  implements Serializable {
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
	 * 账号
	 */
	
	private String zhanghao;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 班级
	 */
	
	private String banji;
		
	/**
	 * 专业
	 */
	
	private String zhuanye;
		
	/**
	 * 论文名称
	 */
	
	private String lunwenmingcheng;
		
	/**
	 * 论文上传
	 */
	
	private String lunwenshangchuan;
		
	/**
	 * 上传时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date shangchuanshijian;
				
	
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
				
	
	/**
	 * 设置：账号
	 */
	 
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	
	/**
	 * 获取：账号
	 */
	public String getZhanghao() {
		return zhanghao;
	}
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
				
	
	/**
	 * 设置：班级
	 */
	 
	public void setBanji(String banji) {
		this.banji = banji;
	}
	
	/**
	 * 获取：班级
	 */
	public String getBanji() {
		return banji;
	}
				
	
	/**
	 * 设置：专业
	 */
	 
	public void setZhuanye(String zhuanye) {
		this.zhuanye = zhuanye;
	}
	
	/**
	 * 获取：专业
	 */
	public String getZhuanye() {
		return zhuanye;
	}
				
	
	/**
	 * 设置：论文名称
	 */
	 
	public void setLunwenmingcheng(String lunwenmingcheng) {
		this.lunwenmingcheng = lunwenmingcheng;
	}
	
	/**
	 * 获取：论文名称
	 */
	public String getLunwenmingcheng() {
		return lunwenmingcheng;
	}
				
	
	/**
	 * 设置：论文上传
	 */
	 
	public void setLunwenshangchuan(String lunwenshangchuan) {
		this.lunwenshangchuan = lunwenshangchuan;
	}
	
	/**
	 * 获取：论文上传
	 */
	public String getLunwenshangchuan() {
		return lunwenshangchuan;
	}
				
	
	/**
	 * 设置：上传时间
	 */
	 
	public void setShangchuanshijian(Date shangchuanshijian) {
		this.shangchuanshijian = shangchuanshijian;
	}
	
	/**
	 * 获取：上传时间
	 */
	public Date getShangchuanshijian() {
		return shangchuanshijian;
	}
			
}
