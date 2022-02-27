
package org.springblade.modules.system.wrapper;

import org.springblade.core.mp.support.BaseEntityWrapper;
import org.springblade.core.tool.utils.BeanUtil;
import org.springblade.core.tool.utils.SpringUtil;
import org.springblade.modules.system.entity.DataScope;
import org.springblade.modules.system.service.IDictService;
import org.springblade.modules.system.vo.DataScopeVO;

import java.util.Objects;


/**
 * 包装类,返回视图层所需的字段
 *
 * @author Chill
 */
public class DataScopeWrapper extends BaseEntityWrapper<DataScope, DataScopeVO> {

	private static IDictService dictService;

	static {
		dictService = SpringUtil.getBean(IDictService.class);
	}

	public static DataScopeWrapper build() {
		return new DataScopeWrapper();
	}

	@Override
	public DataScopeVO entityVO(DataScope dataScope) {
		DataScopeVO dataScopeVO = Objects.requireNonNull(
			BeanUtil.copy(dataScope, DataScopeVO.class));
		String scopeTypeName = dictService.getValue("data_scope_type", dataScope.getScopeType());
		dataScopeVO.setScopeTypeName(scopeTypeName);
		return dataScopeVO;
	}

}
