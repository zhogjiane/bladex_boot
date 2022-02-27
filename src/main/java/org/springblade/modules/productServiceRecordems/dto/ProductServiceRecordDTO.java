
package org.springblade.modules.productServiceRecordems.dto;

import org.springblade.modules.productServiceRecordems.entity.ProductServiceRecord;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 产品服务台账数据传输对象实体类
 *
 * @author Blade
 * @since 2022-02-27
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ProductServiceRecordDTO extends ProductServiceRecord {

	private static final long serialVersionUID = 1L;

}
