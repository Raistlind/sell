package cn.krynn.sell.service;

import cn.krynn.sell.dataobject.ProductInfo;
import cn.krynn.sell.dto.CartDTO;
import org.springframework.data.domain.Page;

import java.awt.print.Pageable;
import java.util.List;

/**
 * @author RaistlinD
 * @date 2018/6/7 下午10:43
 */
public interface ProductService {

    ProductInfo findOne(String productId);

    List<ProductInfo> findUpAll();

    Page<ProductInfo> findAll(org.springframework.data.domain.Pageable pageable);

    ProductInfo save(ProductInfo productInfo);

    void increaseStock(List<CartDTO> cartDTOList);

    void decreaseStock(List<CartDTO> cartDTOList);

}
