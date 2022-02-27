
package org.springblade.modules.monitorClient.service;

import org.springblade.modules.monitorClient.entity.MonitorClient;
import org.springblade.modules.monitorClient.vo.MonitorClientVO;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.core.metadata.IPage;

/**
 * 监测客户端 服务类
 *
 * @author Blade
 * @since 2022-02-27
 */
public interface IMonitorClientService extends IService<MonitorClient> {

	/**
	 * 自定义分页
	 *
	 * @param page
	 * @param monitorClient
	 * @return
	 */
	IPage<MonitorClientVO> selectMonitorClientPage(IPage<MonitorClientVO> page,
		MonitorClientVO monitorClient);

}
