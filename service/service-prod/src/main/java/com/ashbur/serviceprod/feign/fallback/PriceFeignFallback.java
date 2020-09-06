package com.ashbur.serviceprod.feign.fallback;

import com.ashbur.serviceprod.feign.PriceFeign;
import lombok.extern.slf4j.Slf4j;

/**
 * 价格服务降级处理
 */
@Slf4j
public class PriceFeignFallback implements PriceFeign {
    @Override
    public int getPriceByProductCode(String productCode) {
        log.info("商品价格降级服务开始....");
        return 0;
    }
}
