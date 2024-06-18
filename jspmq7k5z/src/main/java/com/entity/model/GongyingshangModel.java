package com.entity.model;

import com.entity.GongyingshangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 供应商
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2023-03-02 08:50:16
 */
public class GongyingshangModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 联系电话
	 */
	
	private String lianxidianhua;
		
	/**
	 * 联系地址
	 */
	
	private String lianxidizhi;
		
	/**
	 * 供应信息
	 */
	
	private String gongyingxinxi;
				
	
	/**
	 * 设置：联系电话
	 */
	 
	public void setLianxidianhua(String lianxidianhua) {
		this.lianxidianhua = lianxidianhua;
	}
	
	/**
	 * 获取：联系电话
	 */
	public String getLianxidianhua() {
		return lianxidianhua;
	}
				
	
	/**
	 * 设置：联系地址
	 */
	 
	public void setLianxidizhi(String lianxidizhi) {
		this.lianxidizhi = lianxidizhi;
	}
	
	/**
	 * 获取：联系地址
	 */
	public String getLianxidizhi() {
		return lianxidizhi;
	}
				
	
	/**
	 * 设置：供应信息
	 */
	 
	public void setGongyingxinxi(String gongyingxinxi) {
		this.gongyingxinxi = gongyingxinxi;
	}
	
	/**
	 * 获取：供应信息
	 */
	public String getGongyingxinxi() {
		return gongyingxinxi;
	}
			
}
