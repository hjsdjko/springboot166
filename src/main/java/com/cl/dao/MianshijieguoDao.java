package com.cl.dao;

import com.cl.entity.MianshijieguoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.MianshijieguoView;


/**
 * 面试结果
 * 
 * @author 
 * @email 
 * @date 2024-03-12 23:17:23
 */
public interface MianshijieguoDao extends BaseMapper<MianshijieguoEntity> {
	
	List<MianshijieguoView> selectListView(@Param("ew") Wrapper<MianshijieguoEntity> wrapper);

	List<MianshijieguoView> selectListView(Pagination page,@Param("ew") Wrapper<MianshijieguoEntity> wrapper);
	
	MianshijieguoView selectView(@Param("ew") Wrapper<MianshijieguoEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<MianshijieguoEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<MianshijieguoEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<MianshijieguoEntity> wrapper);



}
