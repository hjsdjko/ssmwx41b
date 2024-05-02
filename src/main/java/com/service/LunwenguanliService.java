package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.LunwenguanliEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.LunwenguanliVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.LunwenguanliView;


/**
 * 论文管理
 *
 * @author 
 * @email 
 * @date 2021-05-15 14:44:55
 */
public interface LunwenguanliService extends IService<LunwenguanliEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<LunwenguanliVO> selectListVO(Wrapper<LunwenguanliEntity> wrapper);
   	
   	LunwenguanliVO selectVO(@Param("ew") Wrapper<LunwenguanliEntity> wrapper);
   	
   	List<LunwenguanliView> selectListView(Wrapper<LunwenguanliEntity> wrapper);
   	
   	LunwenguanliView selectView(@Param("ew") Wrapper<LunwenguanliEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<LunwenguanliEntity> wrapper);
   	
}

