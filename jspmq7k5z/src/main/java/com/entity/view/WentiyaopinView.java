package com.entity.view;

import com.entity.WentiyaopinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 问题药品
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-03-02 08:50:16
 */
@TableName("wentiyaopin")
public class WentiyaopinView  extends WentiyaopinEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public WentiyaopinView(){
	}
 
 	public WentiyaopinView(WentiyaopinEntity wentiyaopinEntity){
 	try {
			BeanUtils.copyProperties(this, wentiyaopinEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
