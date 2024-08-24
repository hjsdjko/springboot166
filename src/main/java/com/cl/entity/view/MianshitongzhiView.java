package com.cl.entity.view;

import com.cl.entity.MianshitongzhiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.cl.utils.EncryptUtil;
 

/**
 * 面试通知
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-03-12 23:17:23
 */
@TableName("mianshitongzhi")
public class MianshitongzhiView  extends MianshitongzhiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public MianshitongzhiView(){
	}
 
 	public MianshitongzhiView(MianshitongzhiEntity mianshitongzhiEntity){
 	try {
			BeanUtils.copyProperties(this, mianshitongzhiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
