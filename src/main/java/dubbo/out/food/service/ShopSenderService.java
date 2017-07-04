package dubbo.out.food.service;

import dubbo.out.food.model.ShopSender;

public interface ShopSenderService {
	int deleteByPrimaryKey(Integer id);

    int insert(ShopSender record);

    int insertSelective(ShopSender record);

    ShopSender selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ShopSender record);

    int updateByPrimaryKey(ShopSender record);
}
