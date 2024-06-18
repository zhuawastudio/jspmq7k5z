package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WentiyaopinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WentiyaopinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WentiyaopinView;


/**
 * 问题药品
 *
 * @author 
 * @email 
 * @date 2023-03-02 08:50:16
 */
public interface WentiyaopinService extends IService<WentiyaopinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WentiyaopinVO> selectListVO(Wrapper<WentiyaopinEntity> wrapper);
   	
   	WentiyaopinVO selectVO(@Param("ew") Wrapper<WentiyaopinEntity> wrapper);
   	
   	List<WentiyaopinView> selectListView(Wrapper<WentiyaopinEntity> wrapper);
   	
   	WentiyaopinView selectView(@Param("ew") Wrapper<WentiyaopinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WentiyaopinEntity> wrapper);
   	

}

