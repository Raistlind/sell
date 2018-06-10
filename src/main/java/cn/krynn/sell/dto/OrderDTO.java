package cn.krynn.sell.dto;

import cn.krynn.sell.dataobject.OrderDetail;
import cn.krynn.sell.enums.OrderStatusEnum;
import cn.krynn.sell.enums.PayStatusEnum;
import lombok.Data;

import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * Created by RaistlinD
 * 2018/6/10 下午9:47
 */
@Data
public class OrderDTO {

    private String orderId;

    private String buyerName;

    private String buyerPhone;

    private String buyerAddress;

    private String buyerOpenid;

    private BigDecimal orderAmount;

    private Integer orderStatus;

    private Integer payStatus;

    private Date createTime;

    private Date updateTime;

    List<OrderDetail> orderDetailList;
}
