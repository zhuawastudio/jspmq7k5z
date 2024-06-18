package com.entity.view;

import com.entity.YaopinleixingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 药品类型
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-03-02 08:50:16
 */
@TableName("yaopinleixing")
public class YaopinleixingView  extends YaopinleixingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YaopinleixingView(){
	}
 
 	public YaopinleixingView(YaopinleixingEntity yaopinleixingEntity){
 	try {
			BeanUtils.copyProperties(this, yaopinleixingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
