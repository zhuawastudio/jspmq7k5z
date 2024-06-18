package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 保质期检查
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-03-02 08:50:16
 */
@TableName("baozhiqijiancha")
public class BaozhiqijianchaEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public BaozhiqijianchaEntity() {
		
	}
	
	public BaozhiqijianchaEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 药品名称
	 */
					
	private String yaopinmingcheng;
	
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
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date guoqiriqi;
	
	/**
	 * 是否过期
	 */
					
	private String shifouguoqi;
	
	/**
	 * 检查时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date jianchashijian;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
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
