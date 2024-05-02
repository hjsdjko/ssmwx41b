package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.KetiguanliEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.KetiguanliVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.KetiguanliView;


/**
 * 课题管理
 *
 * @author 
 * @email 
 * @date 2021-05-15 14:44:55
 */
public interface KetiguanliService extends IService<KetiguanliEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<KetiguanliVO> selectListVO(Wrapper<KetiguanliEntity> wrapper);
   	
   	KetiguanliVO selectVO(@Param("ew") Wrapper<KetiguanliEntity> wrapper);
   	
   	List<KetiguanliView> selectListView(Wrapper<KetiguanliEntity> wrapper);
   	
   	KetiguanliView selectView(@Param("ew") Wrapper<KetiguanliEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<KetiguanliEntity> wrapper);
   	
}

