package com.ashbur.serviceprod.api;

import com.ashbur.serviceprod.service.ProductService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import vo.ProductVo;

import java.util.List;

@RestController
@RequestMapping("/api/product")
@Api("商品信息API-v1.0")
public class ProductApiController {
    @Autowired
    private ProductService productService;

    @GetMapping("/list")
    @ApiOperation("获取商品列表信息")
    @ResponseBody
    public List<ProductVo> getProductList(){
       return productService.getProductList();
    }

    @GetMapping("/getInfo/{productCode}")
    @ApiOperation("获取商品信息")
    @ResponseBody
    public String getProductInfo(@PathVariable("productCode") String productCode){
        return productService.getProductInfo(productCode).getProductCode();
    }
}
