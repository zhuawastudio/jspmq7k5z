package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.BaozhiqijianchaEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.BaozhiqijianchaVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.BaozhiqijianchaView;


/**
 * 保质期检查
 *
 * @author 
 * @email 
 * @date 2023-03-02 08:50:16
 */
public interface BaozhiqijianchaService extends IService<BaozhiqijianchaEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<BaozhiqijianchaVO> selectListVO(Wrapper<BaozhiqijianchaEntity> wrapper);
   	
   	BaozhiqijianchaVO selectVO(@Param("ew") Wrapper<BaozhiqijianchaEntity> wrapper);
   	
   	List<BaozhiqijianchaView> selectListView(Wrapper<BaozhiqijianchaEntity> wrapper);
   	
   	BaozhiqijianchaView selectView(@Param("ew") Wrapper<BaozhiqijianchaEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<BaozhiqijianchaEntity> wrapper);
   	

}

