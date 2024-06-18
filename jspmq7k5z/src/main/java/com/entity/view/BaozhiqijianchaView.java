package com.entity.view;

import com.entity.BaozhiqijianchaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 保质期检查
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-03-02 08:50:16
 */
@TableName("baozhiqijiancha")
public class BaozhiqijianchaView  extends BaozhiqijianchaEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public BaozhiqijianchaView(){
	}
 
 	public BaozhiqijianchaView(BaozhiqijianchaEntity baozhiqijianchaEntity){
 	try {
			BeanUtils.copyProperties(this, baozhiqijianchaEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
