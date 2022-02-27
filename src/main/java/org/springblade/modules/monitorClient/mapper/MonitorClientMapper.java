
package org.springblade.modules.monitorClient.mapper;

import org.springblade.modules.monitorClient.entity.MonitorClient;
import org.springblade.modules.monitorClient.vo.MonitorClientVO;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import java.util.List;

/**
 * 监测客户端 Mapper 接口
 *
 * @author Blade
 * @since 2022-02-27
 */
public interface MonitorClientMapper extends BaseMapper<MonitorClient> {

	/**
	 * 自定义分页
	 *
	 * @param page
	 * @param monitorClient
	 * @return
	 */
	List<MonitorClientVO> selectMonitorClientPage(IPage page, MonitorClientVO monitorClient);

}
