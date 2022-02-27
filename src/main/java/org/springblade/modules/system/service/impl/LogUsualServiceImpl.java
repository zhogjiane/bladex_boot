
package org.springblade.modules.system.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springblade.core.log.model.LogUsual;
import org.springblade.modules.system.mapper.LogUsualMapper;
import org.springblade.modules.system.service.ILogUsualService;
import org.springframework.stereotype.Service;

/**
 * 服务实现类
 *
 * @author Chill
 */
@Service
public class LogUsualServiceImpl extends ServiceImpl<LogUsualMapper, LogUsual> implements
	ILogUsualService {

}
