package com.cl.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.cl.utils.PageUtils;
import com.cl.utils.Query;


import com.cl.dao.GangweishenqingDao;
import com.cl.entity.GangweishenqingEntity;
import com.cl.service.GangweishenqingService;
import com.cl.entity.view.GangweishenqingView;

@Service("gangweishenqingService")
public class GangweishenqingServiceImpl extends ServiceImpl<GangweishenqingDao, GangweishenqingEntity> implements GangweishenqingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GangweishenqingEntity> page = this.selectPage(
                new Query<GangweishenqingEntity>(params).getPage(),
                new EntityWrapper<GangweishenqingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GangweishenqingEntity> wrapper) {
		  Page<GangweishenqingView> page =new Query<GangweishenqingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<GangweishenqingView> selectListView(Wrapper<GangweishenqingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GangweishenqingView selectView(Wrapper<GangweishenqingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<GangweishenqingEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<GangweishenqingEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<GangweishenqingEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }




}
