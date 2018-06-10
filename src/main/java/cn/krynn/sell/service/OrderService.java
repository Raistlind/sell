package cn.krynn.sell.service;

import cn.krynn.sell.dataobject.OrderMaster;
import cn.krynn.sell.dto.OrderDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * Created by RaistlinD
 * 2018/6/10 下午9:41
 */
public interface OrderService {

    OrderDTO create(OrderDTO orderDTO) ;

    OrderDTO findOne(String orderId);

    Page<OrderDTO> findList(String buyerOpenid, Pageable pageable);

    OrderDTO cancel(OrderDTO orderDTO);

    OrderDTO finish(OrderDTO orderDTO);

    OrderDTO paid(OrderDTO orderDTO);
}
