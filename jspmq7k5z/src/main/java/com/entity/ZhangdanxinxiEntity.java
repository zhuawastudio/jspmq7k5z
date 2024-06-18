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
 * 账单信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-03-02 08:50:16
 */
@TableName("zhangdanxinxi")
public class ZhangdanxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ZhangdanxinxiEntity() {
		
	}
	
	public ZhangdanxinxiEntity(T t) {
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
	 * 药品类型
	 */
					
	private String yaopinleixing;
	
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
