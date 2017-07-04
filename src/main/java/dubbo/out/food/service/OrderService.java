package dubbo.out.food.service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import dubbo.out.food.model.CartItem;
import dubbo.out.food.model.Order;
import dubbo.out.food.querybean.OrderDetailBean;
import dubbo.out.food.querybean.Query1;


public interface OrderService {
	/**
	 * 卖家中心 订单列表统计
	 * 
	 * @param params
	 * @return
	 */
	Integer getSellerOrderListCount(Map<String, Object> params);

	/**
	 * 卖家中心，订单列�?
	 * 
	 * @param params
	 * @return
	 */
	List<Map<String, Object>> getSellerOrderList(Map<String, Object> params);

	/**
	 * 根据传入�?
	 * 
	 * @param CartItem
	 *            list 封装�? Order list
	 * @throws Exception
	 */
	void insertOrderOrderFromCart(List<CartItem> list,BigDecimal totalMoney,String address) throws Exception;

	/**
	 * 提交订单
	 * 
	 * @param address
	 * @param userId
	 * @param shopId
	 * @throws Exception
	 */
	void submitOrder(String address, Integer userId, Integer shopId) throws Exception;

	/**
	 * 根据登入用户的id查询 他开的店铺的相关状�?�的订单
	 * @param query
	 * @return
	 * @throws Exception
	 */
	List<Order> getOrderListByShopUserId(Query1 query) throws Exception;
	/**
	 * 更新 订单
	 * @param order
	 */
	void updateOrder(Order order);
	/**
	 * 查看订单详情
	 * @param params
	 * @return
	 */
	List<OrderDetailBean> getOrderDetail(Integer id);

	/**
	 *根据登入用户的userId查询跟他相关的订单列�?
	 * @param query
	 * @return
	 * @throws Exception
	 */
	List<Order> getOrderListByUserId(Query1 query) throws Exception;
}
