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


import com.dao.LunwenguanliDao;
import com.entity.LunwenguanliEntity;
import com.service.LunwenguanliService;
import com.entity.vo.LunwenguanliVO;
import com.entity.view.LunwenguanliView;

@Service("lunwenguanliService")
public class LunwenguanliServiceImpl extends ServiceImpl<LunwenguanliDao, LunwenguanliEntity> implements LunwenguanliService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<LunwenguanliEntity> page = this.selectPage(
                new Query<LunwenguanliEntity>(params).getPage(),
                new EntityWrapper<LunwenguanliEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<LunwenguanliEntity> wrapper) {
		  Page<LunwenguanliView> page =new Query<LunwenguanliView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<LunwenguanliVO> selectListVO(Wrapper<LunwenguanliEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public LunwenguanliVO selectVO(Wrapper<LunwenguanliEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<LunwenguanliView> selectListView(Wrapper<LunwenguanliEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public LunwenguanliView selectView(Wrapper<LunwenguanliEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
