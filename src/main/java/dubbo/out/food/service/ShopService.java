package dubbo.out.food.service;

import java.util.List;

import dubbo.out.food.model.Shop;


public interface ShopService {

    int deleteByPrimaryKey(Integer id);

    int insert(Shop record);

    int insertSelective(Shop record);

    Shop selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Shop record);

    int updateByPrimaryKey(Shop record);
    /**
     * 根据userId查询出店铺信�?
     */
    List<Shop> selectListByUserId(String userId, Integer status
	       , String deleted);
    /**
     * 判断是否�? 买家再自己的店家购物
     * @param userId
     * @param shopId
     * @return true :是同�?家店,false:不是同一家店，可以购�?
     */
    Boolean isSameShop(Integer userId , Integer shopId);
    /**
     * 获取�?量最好的三家�?
     * @return
     */
    List<Shop> selectOrderMastShops(Integer count);
    /**
     * 获取�?新开出的shop
     * @param count
     * @return
     */
    List<Shop> selectNewShops(Integer count);
    /**
     * 获取评价�?好的三家�?
     * @return
     */
    List<Shop> selectOrderGoodestShops(Integer count);
    
    /**
     * 获取赞助商家
     * @return
     */
    List<Shop> selectSponsorShop();
    
    /**
     * 获取�?有的店铺列表
     */
    List<Shop> selectAllShops();
}
