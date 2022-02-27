
package org.springblade.modules.productServiceRecordems.service.impl;

import org.springblade.modules.productServiceRecordems.entity.ProductServiceRecord;
import org.springblade.modules.productServiceRecordems.vo.ProductServiceRecordVO;
import org.springblade.modules.productServiceRecordems.mapper.ProductServiceRecordMapper;
import org.springblade.modules.productServiceRecordems.service.IProductServiceRecordService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.metadata.IPage;

/**
 * 产品服务台账 服务实现类
 *
 * @author Blade
 * @since 2022-02-27
 */
@Service
public class ProductServiceRecordServiceImpl extends
	ServiceImpl<ProductServiceRecordMapper, ProductServiceRecord> implements
	IProductServiceRecordService {

	@Override
	public IPage<ProductServiceRecordVO> selectProductServiceRecordPage(
		IPage<ProductServiceRecordVO> page, ProductServiceRecordVO productServiceRecord) {
		return page.setRecords(
			baseMapper.selectProductServiceRecordPage(page, productServiceRecord));
	}

}
