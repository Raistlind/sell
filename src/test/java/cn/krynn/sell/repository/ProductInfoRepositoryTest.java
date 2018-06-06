package cn.krynn.sell.repository;

import cn.krynn.sell.dataobject.ProductInfo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author RaistlinD
 * @date 2018/6/6 下午10:53
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductInfoRepositoryTest {

    @Autowired
    private ProductInfoRepository repository;

    @Test
    public void saveTest() {
        ProductInfo productinfo = new ProductInfo();
        productinfo.setProductId("123456");
        productinfo.setProductName("皮蛋粥");
        productinfo.setProductPrice(new BigDecimal(3.2));
        productinfo.setProductStock(100);
        productinfo.setProductDescription("很好喝的粥");
        productinfo.setProductIcon("http://xxxx.jpg");
        productinfo.setProductStatus(0);
        productinfo.setCategoryType(2);

        ProductInfo result = repository.save(productinfo);
        Assert.assertNotNull(result);

    }

    @Test
    public void findByProductStatus() {

        List<ProductInfo> productInfoList = repository.findByProductStatus(0);
        Assert.assertNotEquals(0, productInfoList.size());
    }
}
