package com.ashbur.serviceprod.service;

import com.ashbur.serviceprod.dao.ProductDao;
import com.ashbur.serviceprod.feign.PriceFeign;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import po.Product;
import vo.ProductVo;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductDao productDao;

    @Autowired
    private PriceFeign priceFeign;


    /**
     * 获取商品列表
     * @return
     */
    public List<ProductVo> getProductList(){
        List<Product> productList = productDao.getProductList();
        List<ProductVo> voList = new ArrayList<>();
        productList.forEach(product -> {
            ProductVo vo = new ProductVo();
            BeanUtils.copyProperties(product, vo);
            vo.setProductPrice(priceFeign.getPriceByProductCode(product.getProductCode()));
            voList.add(vo);
        });
        return voList;
    }

    /**
     * 获取productCode对应的商品信息
     * @param productCode 商品编码
     * @return 商品信息
     */
    public Product getProductInfo(String productCode){
        Product pro = new Product();
        pro.setProductCode(productCode + productCode);
        return pro;
    }
}
