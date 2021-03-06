package cn.krynn.sell.repository;

import cn.krynn.sell.dataobject.ProductCategory;
import cn.krynn.sell.service.impl.CategoryServiceImpl;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;

import java.util.Arrays;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest {
    @Autowired
    private ProductCategoryRepository repository;

    @Autowired
    private CategoryServiceImpl categoryService;

    @Test
    public void findOneTest() {
        ProductCategory productCategory = repository.findOne(1);
        System.out.println(productCategory.toString());

        if (categoryService == null) {
            System.out.println("================ categoryService is NULL ===============");
        } else {
            System.out.println("**************** categoryService is NOT NULL ***************");
        }
    }

    @Test
    @Transactional
    public void saveTest() {
        ProductCategory productCategory = new ProductCategory("不知名最爱", 8);
        ProductCategory result = repository.save(productCategory);
        Assert.assertNotNull(result);
        Assert.assertNotEquals(null, result);

    }

    @Test
    public void findByCategoryTypeIn() {
        List<Integer> list = Arrays.asList(4, 5);

        List<ProductCategory> result = repository.findByCategoryTypeIn(list);
        Assert.assertNotEquals(0, result.size());
    }
}