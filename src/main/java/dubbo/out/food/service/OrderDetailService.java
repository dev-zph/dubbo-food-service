/**
 * 
 */
package dubbo.out.food.service;

import java.util.List;

import dubbo.out.food.model.OrderDetail;


/**
 * @author 陈佳
 * @createTime 2017�?2�?15�? 下午2:13:35
 * 
 */
public interface OrderDetailService {

	int deleteByPrimaryKey(Integer id);

    int insert(OrderDetail record);

    int insertSelective(OrderDetail record);

    OrderDetail selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OrderDetail record);

    int updateByPrimaryKey(OrderDetail record);
    /**
     * 根据order_id查询 对应的order_detail 集合
     * @param id
     * @return
     */
    List<OrderDetail> findDetailsByOrderId(Integer id);
}
