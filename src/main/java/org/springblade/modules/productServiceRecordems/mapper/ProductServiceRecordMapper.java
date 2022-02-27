
package org.springblade.modules.productServiceRecordems.mapper;

import org.springblade.modules.productServiceRecordems.entity.ProductServiceRecord;
import org.springblade.modules.productServiceRecordems.vo.ProductServiceRecordVO;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import java.util.List;

/**
 * 产品服务台账 Mapper 接口
 *
 * @author Blade
 * @since 2022-02-27
 */
public interface ProductServiceRecordMapper extends BaseMapper<ProductServiceRecord> {

	/**
	 * 自定义分页
	 *
	 * @param page
	 * @param productServiceRecord
	 * @return
	 */
	List<ProductServiceRecordVO> selectProductServiceRecordPage(IPage page,
		ProductServiceRecordVO productServiceRecord);

}
