
package org.springblade.modules.system.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import org.springblade.core.mp.base.BaseServiceImpl;
import org.springblade.modules.system.entity.Param;
import org.springblade.modules.system.mapper.ParamMapper;
import org.springblade.modules.system.service.IParamService;
import org.springblade.modules.system.vo.ParamVO;
import org.springframework.stereotype.Service;

/**
 * 服务实现类
 *
 * @author Chill
 */
@Service
public class ParamServiceImpl extends BaseServiceImpl<ParamMapper, Param> implements IParamService {

	@Override
	public IPage<ParamVO> selectParamPage(IPage<ParamVO> page, ParamVO param) {
		return page.setRecords(baseMapper.selectParamPage(page, param));
	}

}
