package vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel("商品信息VO")
public class ProductVo {
    @ApiModelProperty("商品名称")
    private String productName;

    @ApiModelProperty("商品编码")
    private String productCode;

    @ApiModelProperty("商品价格")
    private Integer productPrice;
}
