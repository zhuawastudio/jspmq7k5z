package com.entity.model;

import com.entity.WentiyaopinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 问题药品
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2023-03-02 08:50:16
 */
public class WentiyaopinModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 药品类型
	 */
	
	private String yaopinleixing;
		
	/**
	 * 数量
	 */
	
	private Integer shuliang;
		
	/**
	 * 问题描述
	 */
	
	private String wentimiaoshu;
				
	
	/**
	 * 设置：药品类型
	 */
	 
	public void setYaopinleixing(String yaopinleixing) {
		this.yaopinleixing = yaopinleixing;
	}
	
	/**
	 * 获取：药品类型
	 */
	public String getYaopinleixing() {
		return yaopinleixing;
	}
				
	
	/**
	 * 设置：数量
	 */
	 
	public void setShuliang(Integer shuliang) {
		this.shuliang = shuliang;
	}
	
	/**
	 * 获取：数量
	 */
	public Integer getShuliang() {
		return shuliang;
	}
				
	
	/**
	 * 设置：问题描述
	 */
	 
	public void setWentimiaoshu(String wentimiaoshu) {
		this.wentimiaoshu = wentimiaoshu;
	}
	
	/**
	 * 获取：问题描述
	 */
	public String getWentimiaoshu() {
		return wentimiaoshu;
	}
			
}
