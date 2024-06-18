package com.entity.model;

import com.entity.BaozhiqijianchaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 保质期检查
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2023-03-02 08:50:16
 */
public class BaozhiqijianchaModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 药品类型
	 */
	
	private String yaopinleixing;
		
	/**
	 * 保质期
	 */
	
	private String baozhiqi;
		
	/**
	 * 过期日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date guoqiriqi;
		
	/**
	 * 是否过期
	 */
	
	private String shifouguoqi;
		
	/**
	 * 检查时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date jianchashijian;
				
	
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
	 * 设置：保质期
	 */
	 
	public void setBaozhiqi(String baozhiqi) {
		this.baozhiqi = baozhiqi;
	}
	
	/**
	 * 获取：保质期
	 */
	public String getBaozhiqi() {
		return baozhiqi;
	}
				
	
	/**
	 * 设置：过期日期
	 */
	 
	public void setGuoqiriqi(Date guoqiriqi) {
		this.guoqiriqi = guoqiriqi;
	}
	
	/**
	 * 获取：过期日期
	 */
	public Date getGuoqiriqi() {
		return guoqiriqi;
	}
				
	
	/**
	 * 设置：是否过期
	 */
	 
	public void setShifouguoqi(String shifouguoqi) {
		this.shifouguoqi = shifouguoqi;
	}
	
	/**
	 * 获取：是否过期
	 */
	public String getShifouguoqi() {
		return shifouguoqi;
	}
				
	
	/**
	 * 设置：检查时间
	 */
	 
	public void setJianchashijian(Date jianchashijian) {
		this.jianchashijian = jianchashijian;
	}
	
	/**
	 * 获取：检查时间
	 */
	public Date getJianchashijian() {
		return jianchashijian;
	}
			
}
