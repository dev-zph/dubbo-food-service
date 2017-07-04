/**
 * 
 */
package dubbo.out.food.service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import dubbo.out.food.model.CartItem;
import dubbo.out.food.querybean.InsertCart;


/**
 *购物车服务层
 * @author 陈佳
 * @createTime 2017�?1�?23�? 上午10:48:17
 * 
 */
public interface CartItemService {
	/**
	 * 根据id查询cartItem对象
	 * @param key
	 * @return
	 */
	CartItem selectById(Integer key);
	/**
	 * 根绝用户Id查询 该用户的�?有购物车里面的商�?
	 * @param userId
	 * @return
	 */
	List<CartItem> selectByUserId(Integer userId);
/**
 *  添加购物车，如果购物车已经有则改变数量，不然新增记录
 * @param param
 * @param request
 */
	void insertCartItem(InsertCart param,HttpServletRequest request);
	/**
	 * 更新
	 * @param cartItem
	 */
	void updateCartItem(CartItem cartItem);
	/**
	 * 查询符合条件的所有的对象集合
	 * @param param
	 * @return
	 */
	List<CartItem> getCartItems(Map<String, Object> param);
	/**
	 * 查询符合条件的�?�记录条�?
	 * @param param
	 * @return
	 */
	Integer getCartItemCount(Map<String, Object> param);
	/**
	 * 查询下单页面，购物车详情页面的数�?
	 * @param param
	 * @return
	 */
	List<CartItem> getCartDetail (Map<String, Object> param);
	/**
	 * 查询购物车�?�计金额
	 * @param param
	 * @return
	 */
	BigDecimal getCartTotalMoney(Map<String, Object> param);
	/**
	 * 逻辑删除
	 * @param cartId
	 */
	void deleteCart(Integer cartId);
}
