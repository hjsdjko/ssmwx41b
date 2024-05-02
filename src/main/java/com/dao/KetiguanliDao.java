package com.dao;

import com.entity.KetiguanliEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.KetiguanliVO;
import com.entity.view.KetiguanliView;


/**
 * 课题管理
 * 
 * @author 
 * @email 
 * @date 2021-05-15 14:44:55
 */
public interface KetiguanliDao extends BaseMapper<KetiguanliEntity> {
	
	List<KetiguanliVO> selectListVO(@Param("ew") Wrapper<KetiguanliEntity> wrapper);
	
	KetiguanliVO selectVO(@Param("ew") Wrapper<KetiguanliEntity> wrapper);
	
	List<KetiguanliView> selectListView(@Param("ew") Wrapper<KetiguanliEntity> wrapper);

	List<KetiguanliView> selectListView(Pagination page,@Param("ew") Wrapper<KetiguanliEntity> wrapper);
	
	KetiguanliView selectView(@Param("ew") Wrapper<KetiguanliEntity> wrapper);
	
}
