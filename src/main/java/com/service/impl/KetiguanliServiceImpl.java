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


import com.dao.KetiguanliDao;
import com.entity.KetiguanliEntity;
import com.service.KetiguanliService;
import com.entity.vo.KetiguanliVO;
import com.entity.view.KetiguanliView;

@Service("ketiguanliService")
public class KetiguanliServiceImpl extends ServiceImpl<KetiguanliDao, KetiguanliEntity> implements KetiguanliService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<KetiguanliEntity> page = this.selectPage(
                new Query<KetiguanliEntity>(params).getPage(),
                new EntityWrapper<KetiguanliEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<KetiguanliEntity> wrapper) {
		  Page<KetiguanliView> page =new Query<KetiguanliView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<KetiguanliVO> selectListVO(Wrapper<KetiguanliEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public KetiguanliVO selectVO(Wrapper<KetiguanliEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<KetiguanliView> selectListView(Wrapper<KetiguanliEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public KetiguanliView selectView(Wrapper<KetiguanliEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
