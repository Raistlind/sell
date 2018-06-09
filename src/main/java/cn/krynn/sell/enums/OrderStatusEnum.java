package cn.krynn.sell.enums;

import lombok.Getter;

/**
 * Created by RaistlinD
 * 2018/6/9 下午9:57
 */
@Getter
public enum OrderStatusEnum {
    NEW(0, "新订单"),
    FINISHED(1, "完结"),
    CANCEL(2, "已取消"),
    ;

    private Integer code;

    private String message;

    OrderStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
