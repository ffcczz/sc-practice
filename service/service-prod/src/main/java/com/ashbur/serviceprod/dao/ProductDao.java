package com.ashbur.serviceprod.dao;

import org.springframework.stereotype.Repository;
import po.Product;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductDao {

    /**
     * 查询商品信息
     * @return
     */
    public List<Product> getProductList(){
        List<Product> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Product pro = new Product();
            pro.setProductCode("code_" + i);
            pro.setProductName("name_" + i);
            list.add(pro);
        }
        return list;
    }
}
