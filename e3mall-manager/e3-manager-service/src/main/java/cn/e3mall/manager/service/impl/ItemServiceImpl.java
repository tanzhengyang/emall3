package cn.e3mall.manager.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.e3mall.manager.service.ItemService;
import cn.e3mall.mapper.TbItemMapper;
import cn.e3mall.pojo.TbItem;
@Service
public class ItemServiceImpl implements ItemService {
	
	//注入商品mapper接口代理对象
	@Autowired
	private TbItemMapper itemMapper;

	@Override
	public TbItem findItemById(Long itemId) {
		// TODO Auto-generated method stub
		TbItem item = itemMapper.selectByPrimaryKey(itemId);
		
		return item;
	}

}
