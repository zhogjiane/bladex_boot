
package org.springblade.modules.svcMonitorItems.service.impl;

import org.springblade.modules.svcMonitorItems.entity.MonitorItems;
import org.springblade.modules.svcMonitorItems.vo.MonitorItemsVO;
import org.springblade.modules.svcMonitorItems.mapper.MonitorItemsMapper;
import org.springblade.modules.svcMonitorItems.service.IMonitorItemsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.metadata.IPage;

/**
 * 监测项信息表 服务实现类
 *
 * @author Blade
 * @since 2022-02-27
 */
@Service
public class MonitorItemsServiceImpl extends ServiceImpl<MonitorItemsMapper, MonitorItems> implements IMonitorItemsService {

	@Override
	public IPage<MonitorItemsVO> selectMonitorItemsPage(IPage<MonitorItemsVO> page, MonitorItemsVO monitorItems) {
		return page.setRecords(baseMapper.selectMonitorItemsPage(page, monitorItems));
	}

}
