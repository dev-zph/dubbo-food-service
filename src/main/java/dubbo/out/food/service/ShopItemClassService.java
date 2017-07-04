package dubbo.out.food.service;

import java.util.List;

import dubbo.out.food.model.ShopItemClass;


public interface ShopItemClassService {

    int deleteByPrimaryKey(Integer id);

    int insert(ShopItemClass record);

    int insertSelective(ShopItemClass record);

    ShopItemClass selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ShopItemClass record);

    int updateByPrimaryKey(ShopItemClass record);
    
    List<ShopItemClass>  selectClassListByShopId(Integer shopId);
}
