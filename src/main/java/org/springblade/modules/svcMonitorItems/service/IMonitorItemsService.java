
package org.springblade.modules.svcMonitorItems.service;

import org.springblade.modules.svcMonitorItems.entity.MonitorItems;
import org.springblade.modules.svcMonitorItems.vo.MonitorItemsVO;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.core.metadata.IPage;

/**
 * 监测项信息表 服务类
 *
 * @author Blade
 * @since 2022-02-27
 */
public interface IMonitorItemsService extends IService<MonitorItems> {

	/**
	 * 自定义分页
	 *
	 * @param page
	 * @param monitorItems
	 * @return
	 */
	IPage<MonitorItemsVO> selectMonitorItemsPage(IPage<MonitorItemsVO> page,
		MonitorItemsVO monitorItems);

}
