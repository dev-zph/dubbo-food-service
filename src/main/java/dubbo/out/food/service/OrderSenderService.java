package dubbo.out.food.service;

import java.util.List;
import java.util.Map;

import dubbo.out.food.model.OrderSender;
import dubbo.out.food.model.User;
import dubbo.out.food.querybean.OrderBeanForSender;


public interface OrderSenderService {
    int insert(OrderSender record);

    OrderSender selectByKey(Integer id);
    /**
     * 接单
     * @param orderId
     * @param user 登入用户
     */
    void receiveOrder(Integer orderId,User user);
    /**
     * 
     * @param param
     * @return
     */
    List<OrderBeanForSender> getOrderListForSender(Map<String,Object> param);
    
    /**
     * 骑士确认已经送达
     * 
     * @param orderId
     * @param userId
     */
    void sureArrive(Integer orderId , Integer userId);
}
