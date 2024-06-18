package com.entity.vo;

import com.entity.ZhangdanxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 账单信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2023-03-02 08:50:16
 */
public class ZhangdanxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 药品名称
	 */
	
	private String yaopinmingcheng;
		
	/**
	 * 数量
	 */
	
	private Integer shuliang;
		
	/**
	 * 进价
	 */
	
	private Integer jinjia;
		
	/**
	 * 供应商
	 */
	
	private String gongyingshang;
		
	/**
	 * 进货时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date jinhuoshijian;
				
	
	/**
	 * 设置：药品名称
	 */
	 
	public void setYaopinmingcheng(String yaopinmingcheng) {
		this.yaopinmingcheng = yaopinmingcheng;
	}
	
	/**
	 * 获取：药品名称
	 */
	public String getYaopinmingcheng() {
		return yaopinmingcheng;
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
	 * 设置：进价
	 */
	 
	public void setJinjia(Integer jinjia) {
		this.jinjia = jinjia;
	}
	
	/**
	 * 获取：进价
	 */
	public Integer getJinjia() {
		return jinjia;
	}
				
	
	/**
	 * 设置：供应商
	 */
	 
	public void setGongyingshang(String gongyingshang) {
		this.gongyingshang = gongyingshang;
	}
	
	/**
	 * 获取：供应商
	 */
	public String getGongyingshang() {
		return gongyingshang;
	}
				
	
	/**
	 * 设置：进货时间
	 */
	 
	public void setJinhuoshijian(Date jinhuoshijian) {
		this.jinhuoshijian = jinhuoshijian;
	}
	
	/**
	 * 获取：进货时间
	 */
	public Date getJinhuoshijian() {
		return jinhuoshijian;
	}
			
}
