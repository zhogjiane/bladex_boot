
package org.springblade.modules.productServiceRecordems.service;

import org.springblade.modules.productServiceRecordems.entity.ProductServiceRecord;
import org.springblade.modules.productServiceRecordems.vo.ProductServiceRecordVO;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.core.metadata.IPage;

/**
 * 产品服务台账 服务类
 *
 * @author Blade
 * @since 2022-02-27
 */
public interface IProductServiceRecordService extends IService<ProductServiceRecord> {

	/**
	 * 自定义分页
	 *
	 * @param page
	 * @param productServiceRecord
	 * @return
	 */
	IPage<ProductServiceRecordVO> selectProductServiceRecordPage(IPage<ProductServiceRecordVO> page,
		ProductServiceRecordVO productServiceRecord);

}
