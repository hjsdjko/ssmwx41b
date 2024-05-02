package com.dao;

import com.entity.KetixuanzeEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.KetixuanzeVO;
import com.entity.view.KetixuanzeView;


/**
 * 课题选择
 * 
 * @author 
 * @email 
 * @date 2021-05-15 14:44:55
 */
public interface KetixuanzeDao extends BaseMapper<KetixuanzeEntity> {
	
	List<KetixuanzeVO> selectListVO(@Param("ew") Wrapper<KetixuanzeEntity> wrapper);
	
	KetixuanzeVO selectVO(@Param("ew") Wrapper<KetixuanzeEntity> wrapper);
	
	List<KetixuanzeView> selectListView(@Param("ew") Wrapper<KetixuanzeEntity> wrapper);

	List<KetixuanzeView> selectListView(Pagination page,@Param("ew") Wrapper<KetixuanzeEntity> wrapper);
	
	KetixuanzeView selectView(@Param("ew") Wrapper<KetixuanzeEntity> wrapper);
	
}
