package com.dao;

import com.entity.YaopinchukuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YaopinchukuVO;
import com.entity.view.YaopinchukuView;


/**
 * 药品出库
 * 
 * @author 
 * @email 
 * @date 2023-03-02 08:50:16
 */
public interface YaopinchukuDao extends BaseMapper<YaopinchukuEntity> {
	
	List<YaopinchukuVO> selectListVO(@Param("ew") Wrapper<YaopinchukuEntity> wrapper);
	
	YaopinchukuVO selectVO(@Param("ew") Wrapper<YaopinchukuEntity> wrapper);
	
	List<YaopinchukuView> selectListView(@Param("ew") Wrapper<YaopinchukuEntity> wrapper);

	List<YaopinchukuView> selectListView(Pagination page,@Param("ew") Wrapper<YaopinchukuEntity> wrapper);
	
	YaopinchukuView selectView(@Param("ew") Wrapper<YaopinchukuEntity> wrapper);
	

}
