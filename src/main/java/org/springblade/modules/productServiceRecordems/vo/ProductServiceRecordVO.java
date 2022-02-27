
package org.springblade.modules.productServiceRecordems.vo;

import org.springblade.modules.productServiceRecordems.entity.ProductServiceRecord;
import lombok.Data;
import lombok.EqualsAndHashCode;
import io.swagger.annotations.ApiModel;

/**
 * 产品服务台账视图实体类
 *
 * @author Blade
 * @since 2022-02-27
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "ProductServiceRecordVO对象", description = "产品服务台账")
public class ProductServiceRecordVO extends ProductServiceRecord {

	private static final long serialVersionUID = 1L;

}
