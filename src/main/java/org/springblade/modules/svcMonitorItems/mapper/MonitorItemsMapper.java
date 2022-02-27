
package org.springblade.modules.svcMonitorItems.mapper;

import org.springblade.modules.svcMonitorItems.entity.MonitorItems;
import org.springblade.modules.svcMonitorItems.vo.MonitorItemsVO;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import java.util.List;

/**
 * 监测项信息表 Mapper 接口
 *
 * @author Blade
 * @since 2022-02-27
 */
public interface MonitorItemsMapper extends BaseMapper<MonitorItems> {

	/**
	 * 自定义分页
	 *
	 * @param page
	 * @param monitorItems
	 * @return
	 */
	List<MonitorItemsVO> selectMonitorItemsPage(IPage page, MonitorItemsVO monitorItems);

}
