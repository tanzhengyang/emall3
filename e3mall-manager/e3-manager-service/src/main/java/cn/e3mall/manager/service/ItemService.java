package cn.e3mall.manager.service;

import cn.e3mall.pojo.TbItem;

public interface ItemService {
	/**
	 * 需求:根据id查询商品数据
	 * 参数: Long itemId
	 * 返回值:TbItem
	 */
	public TbItem findItemById(Long itemId);
}
