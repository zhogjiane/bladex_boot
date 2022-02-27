
package org.springblade.modules.svcMonitorItems.vo;

import org.springblade.modules.svcMonitorItems.entity.MonitorItems;
import lombok.Data;
import lombok.EqualsAndHashCode;
import io.swagger.annotations.ApiModel;

/**
 * 监测项信息表视图实体类
 *
 * @author Blade
 * @since 2022-02-27
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "MonitorItemsVO对象", description = "监测项信息表")
public class MonitorItemsVO extends MonitorItems {
	private static final long serialVersionUID = 1L;

}
