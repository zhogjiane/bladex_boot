
package org.springblade.modules.monitorClient.dto;

import org.springblade.modules.monitorClient.entity.MonitorClient;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 监测客户端数据传输对象实体类
 *
 * @author Blade
 * @since 2022-02-27
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class MonitorClientDTO extends MonitorClient {

	private static final long serialVersionUID = 1L;

}
