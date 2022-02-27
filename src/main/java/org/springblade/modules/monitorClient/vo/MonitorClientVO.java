
package org.springblade.modules.monitorClient.vo;

import org.springblade.modules.monitorClient.entity.MonitorClient;
import lombok.Data;
import lombok.EqualsAndHashCode;
import io.swagger.annotations.ApiModel;

/**
 * 监测客户端视图实体类
 *
 * @author Blade
 * @since 2022-02-27
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "MonitorClientVO对象", description = "监测客户端")
public class MonitorClientVO extends MonitorClient {

	private static final long serialVersionUID = 1L;

}
