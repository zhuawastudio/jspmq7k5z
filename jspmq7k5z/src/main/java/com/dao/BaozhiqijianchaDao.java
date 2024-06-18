package com.dao;

import com.entity.BaozhiqijianchaEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.BaozhiqijianchaVO;
import com.entity.view.BaozhiqijianchaView;


/**
 * 保质期检查
 * 
 * @author 
 * @email 
 * @date 2023-03-02 08:50:16
 */
public interface BaozhiqijianchaDao extends BaseMapper<BaozhiqijianchaEntity> {
	
	List<BaozhiqijianchaVO> selectListVO(@Param("ew") Wrapper<BaozhiqijianchaEntity> wrapper);
	
	BaozhiqijianchaVO selectVO(@Param("ew") Wrapper<BaozhiqijianchaEntity> wrapper);
	
	List<BaozhiqijianchaView> selectListView(@Param("ew") Wrapper<BaozhiqijianchaEntity> wrapper);

	List<BaozhiqijianchaView> selectListView(Pagination page,@Param("ew") Wrapper<BaozhiqijianchaEntity> wrapper);
	
	BaozhiqijianchaView selectView(@Param("ew") Wrapper<BaozhiqijianchaEntity> wrapper);
	

}
