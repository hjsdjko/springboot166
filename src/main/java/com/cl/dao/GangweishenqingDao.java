package com.cl.dao;

import com.cl.entity.GangweishenqingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.GangweishenqingView;


/**
 * 岗位申请
 * 
 * @author 
 * @email 
 * @date 2024-03-12 23:17:23
 */
public interface GangweishenqingDao extends BaseMapper<GangweishenqingEntity> {
	
	List<GangweishenqingView> selectListView(@Param("ew") Wrapper<GangweishenqingEntity> wrapper);

	List<GangweishenqingView> selectListView(Pagination page,@Param("ew") Wrapper<GangweishenqingEntity> wrapper);
	
	GangweishenqingView selectView(@Param("ew") Wrapper<GangweishenqingEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<GangweishenqingEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<GangweishenqingEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<GangweishenqingEntity> wrapper);



}
