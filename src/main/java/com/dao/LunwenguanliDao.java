package com.dao;

import com.entity.LunwenguanliEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.LunwenguanliVO;
import com.entity.view.LunwenguanliView;


/**
 * 论文管理
 * 
 * @author 
 * @email 
 * @date 2021-05-15 14:44:55
 */
public interface LunwenguanliDao extends BaseMapper<LunwenguanliEntity> {
	
	List<LunwenguanliVO> selectListVO(@Param("ew") Wrapper<LunwenguanliEntity> wrapper);
	
	LunwenguanliVO selectVO(@Param("ew") Wrapper<LunwenguanliEntity> wrapper);
	
	List<LunwenguanliView> selectListView(@Param("ew") Wrapper<LunwenguanliEntity> wrapper);

	List<LunwenguanliView> selectListView(Pagination page,@Param("ew") Wrapper<LunwenguanliEntity> wrapper);
	
	LunwenguanliView selectView(@Param("ew") Wrapper<LunwenguanliEntity> wrapper);
	
}
