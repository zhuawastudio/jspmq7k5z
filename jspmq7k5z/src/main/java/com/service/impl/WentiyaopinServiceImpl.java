package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.WentiyaopinDao;
import com.entity.WentiyaopinEntity;
import com.service.WentiyaopinService;
import com.entity.vo.WentiyaopinVO;
import com.entity.view.WentiyaopinView;

@Service("wentiyaopinService")
public class WentiyaopinServiceImpl extends ServiceImpl<WentiyaopinDao, WentiyaopinEntity> implements WentiyaopinService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WentiyaopinEntity> page = this.selectPage(
                new Query<WentiyaopinEntity>(params).getPage(),
                new EntityWrapper<WentiyaopinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WentiyaopinEntity> wrapper) {
		  Page<WentiyaopinView> page =new Query<WentiyaopinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<WentiyaopinVO> selectListVO(Wrapper<WentiyaopinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public WentiyaopinVO selectVO(Wrapper<WentiyaopinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<WentiyaopinView> selectListView(Wrapper<WentiyaopinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WentiyaopinView selectView(Wrapper<WentiyaopinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
