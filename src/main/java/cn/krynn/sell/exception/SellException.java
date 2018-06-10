package cn.krynn.sell.exception;

import cn.krynn.sell.enums.ResultEnum;

/**
 * Created by RaistlinD
 * 2018/6/10 下午10:34
 */
public class SellException extends RuntimeException {

    private Integer code;

    public SellException(ResultEnum resultEnum) {

        super(resultEnum.getMessage());

        this.code = resultEnum.getCode();
    }
}
