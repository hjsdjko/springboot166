package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.MianshitongzhiEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.MianshitongzhiView;


/**
 * 面试通知
 *
 * @author 
 * @email 
 * @date 2024-03-12 23:17:23
 */
public interface MianshitongzhiService extends IService<MianshitongzhiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<MianshitongzhiView> selectListView(Wrapper<MianshitongzhiEntity> wrapper);
   	
   	MianshitongzhiView selectView(@Param("ew") Wrapper<MianshitongzhiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<MianshitongzhiEntity> wrapper);
   	

}

