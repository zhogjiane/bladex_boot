
package org.springblade.modules.monitorClient.service.impl;

import org.springblade.modules.monitorClient.entity.MonitorClient;
import org.springblade.modules.monitorClient.vo.MonitorClientVO;
import org.springblade.modules.monitorClient.mapper.MonitorClientMapper;
import org.springblade.modules.monitorClient.service.IMonitorClientService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.metadata.IPage;

/**
 * 监测客户端 服务实现类
 *
 * @author Blade
 * @since 2022-02-27
 */
@Service
public class MonitorClientServiceImpl extends
	ServiceImpl<MonitorClientMapper, MonitorClient> implements IMonitorClientService {

	@Override
	public IPage<MonitorClientVO> selectMonitorClientPage(IPage<MonitorClientVO> page,
		MonitorClientVO monitorClient) {
		return page.setRecords(baseMapper.selectMonitorClientPage(page, monitorClient));
	}

}
