package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.KetixuanzeDao;
import com.entity.KetixuanzeEntity;
import com.service.KetixuanzeService;
import com.entity.vo.KetixuanzeVO;
import com.entity.view.KetixuanzeView;

@Service("ketixuanzeService")
public class KetixuanzeServiceImpl extends ServiceImpl<KetixuanzeDao, KetixuanzeEntity> implements KetixuanzeService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<KetixuanzeEntity> page = this.selectPage(
                new Query<KetixuanzeEntity>(params).getPage(),
                new EntityWrapper<KetixuanzeEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<KetixuanzeEntity> wrapper) {
		  Page<KetixuanzeView> page =new Query<KetixuanzeView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<KetixuanzeVO> selectListVO(Wrapper<KetixuanzeEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public KetixuanzeVO selectVO(Wrapper<KetixuanzeEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<KetixuanzeView> selectListView(Wrapper<KetixuanzeEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public KetixuanzeView selectView(Wrapper<KetixuanzeEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
