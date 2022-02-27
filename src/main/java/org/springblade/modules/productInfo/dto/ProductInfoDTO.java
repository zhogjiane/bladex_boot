
package org.springblade.modules.productInfo.dto;

import org.springblade.modules.productInfo.entity.ProductInfo;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 产品通用信息表数据传输对象实体类
 *
 * @author Blade
 * @since 2022-02-27
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ProductInfoDTO extends ProductInfo {

	private static final long serialVersionUID = 1L;

}
