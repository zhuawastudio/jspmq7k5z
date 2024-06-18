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


import com.dao.BaozhiqijianchaDao;
import com.entity.BaozhiqijianchaEntity;
import com.service.BaozhiqijianchaService;
import com.entity.vo.BaozhiqijianchaVO;
import com.entity.view.BaozhiqijianchaView;

@Service("baozhiqijianchaService")
public class BaozhiqijianchaServiceImpl extends ServiceImpl<BaozhiqijianchaDao, BaozhiqijianchaEntity> implements BaozhiqijianchaService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BaozhiqijianchaEntity> page = this.selectPage(
                new Query<BaozhiqijianchaEntity>(params).getPage(),
                new EntityWrapper<BaozhiqijianchaEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<BaozhiqijianchaEntity> wrapper) {
		  Page<BaozhiqijianchaView> page =new Query<BaozhiqijianchaView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<BaozhiqijianchaVO> selectListVO(Wrapper<BaozhiqijianchaEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public BaozhiqijianchaVO selectVO(Wrapper<BaozhiqijianchaEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<BaozhiqijianchaView> selectListView(Wrapper<BaozhiqijianchaEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public BaozhiqijianchaView selectView(Wrapper<BaozhiqijianchaEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
