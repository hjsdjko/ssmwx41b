package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.KetixuanzeEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.KetixuanzeVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.KetixuanzeView;


/**
 * 课题选择
 *
 * @author 
 * @email 
 * @date 2021-05-15 14:44:55
 */
public interface KetixuanzeService extends IService<KetixuanzeEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<KetixuanzeVO> selectListVO(Wrapper<KetixuanzeEntity> wrapper);
   	
   	KetixuanzeVO selectVO(@Param("ew") Wrapper<KetixuanzeEntity> wrapper);
   	
   	List<KetixuanzeView> selectListView(Wrapper<KetixuanzeEntity> wrapper);
   	
   	KetixuanzeView selectView(@Param("ew") Wrapper<KetixuanzeEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<KetixuanzeEntity> wrapper);
   	
}

