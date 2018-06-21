package cn.krynn.sell.service;

import cn.krynn.sell.dto.OrderDTO;

/**
 * 买家
 * Created by RaistlinD
 * 2018/6/21 下午11:14
 */
public interface BuyerService {

    //查询一个订单
    OrderDTO findOrderOne(String openid, String orderId);

    //取消订单
    OrderDTO cancelOrder(String openid, String orderId);

}
