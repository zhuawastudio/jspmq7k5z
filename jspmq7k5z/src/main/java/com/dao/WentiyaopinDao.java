package com.dao;

import com.entity.WentiyaopinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WentiyaopinVO;
import com.entity.view.WentiyaopinView;


/**
 * 问题药品
 * 
 * @author 
 * @email 
 * @date 2023-03-02 08:50:16
 */
public interface WentiyaopinDao extends BaseMapper<WentiyaopinEntity> {
	
	List<WentiyaopinVO> selectListVO(@Param("ew") Wrapper<WentiyaopinEntity> wrapper);
	
	WentiyaopinVO selectVO(@Param("ew") Wrapper<WentiyaopinEntity> wrapper);
	
	List<WentiyaopinView> selectListView(@Param("ew") Wrapper<WentiyaopinEntity> wrapper);

	List<WentiyaopinView> selectListView(Pagination page,@Param("ew") Wrapper<WentiyaopinEntity> wrapper);
	
	WentiyaopinView selectView(@Param("ew") Wrapper<WentiyaopinEntity> wrapper);
	

}
