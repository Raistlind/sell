package cn.krynn.sell.service.impl;

import cn.krynn.sell.dataobject.ProductInfo;
import cn.krynn.sell.enums.ProductStatusEnum;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by RaistlinD
 * 2018/6/7 下午11:02
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductServiceImplTest {

    @Autowired
    private ProductServiceImpl productService;

    @Test
    public void findOne() {

        ProductInfo productInfo = productService.findOne("123456");
        Assert.assertEquals("123456", productInfo.getProductId());
    }

    @Test
    public void findUpAll() {
        List<ProductInfo> productInfoList = productService.findUpAll();
        Assert.assertNotEquals(0, productInfoList.size());
    }

    @Test
    public void findAll() {
        PageRequest pageRequest = new PageRequest(0, 2);
        Page<ProductInfo> productInfoPage = productService.findAll(pageRequest);
        System.out.println(productInfoPage.getTotalElements());
        Assert.assertNotEquals(0, productInfoPage.getTotalElements());
    }

    @Test
    public void save() {
        ProductInfo productinfo = new ProductInfo();
        productinfo.setProductId("123457");
        productinfo.setProductName("皮皮虾");
        productinfo.setProductPrice(new BigDecimal(3.2));
        productinfo.setProductStock(100);
        productinfo.setProductDescription("很好吃的虾");
        productinfo.setProductIcon("http://xxxx.jpg");
        productinfo.setProductStatus(ProductStatusEnum.DOWN.getCode());
        productinfo.setCategoryType(2);
        ProductInfo result = productService.save(productinfo);
        Assert.assertNotNull(result);
    }
}