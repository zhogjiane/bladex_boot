
package org.springblade.modules.svcMonitorItems.dto;

import org.springblade.modules.svcMonitorItems.entity.MonitorItems;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 监测项信息表数据传输对象实体类
 *
 * @author Blade
 * @since 2022-02-27
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class MonitorItemsDTO extends MonitorItems {

	private static final long serialVersionUID = 1L;

}
