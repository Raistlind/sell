package cn.krynn.sell.dto;

import lombok.Data;

/**
 * Created by RaistlinD
 * 2018/6/11 下午10:45
 */
@Data
public class CartDTO {

    private String productId;

    private Integer productQuantity;

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
