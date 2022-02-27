
package org.springblade.modules.productInfo.vo;

import org.springblade.modules.productInfo.entity.ProductInfo;
import lombok.Data;
import lombok.EqualsAndHashCode;
import io.swagger.annotations.ApiModel;

/**
 * 产品通用信息表视图实体类
 *
 * @author Blade
 * @since 2022-02-27
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "ProductInfoVO对象", description = "产品通用信息表")
public class ProductInfoVO extends ProductInfo {

	private static final long serialVersionUID = 1L;

}
