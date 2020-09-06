package com.ashbur.serviceprice.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/price")
@Api("价格信息Api-V1.0")
public class PriceApiController {

    /**
     * 获取商品价格信息
     * @param productCode  商品编码
     * @return 商品价格
     */
    @PostMapping("/getPriceByProductCode/{productCode}")
    @ApiOperation("获取商品价格信息")
    @ResponseBody
    public Integer getPriceByProductCode(@PathVariable("productCode") String productCode){
        return 12;
    }
}
