
package org.springblade.modules.productInfo.mapper;

import org.springblade.modules.productInfo.entity.ProductInfo;
import org.springblade.modules.productInfo.vo.ProductInfoVO;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import java.util.List;

/**
 * 产品通用信息表 Mapper 接口
 *
 * @author Blade
 * @since 2022-02-27
 */
public interface ProductInfoMapper extends BaseMapper<ProductInfo> {

	/**
	 * 自定义分页
	 *
	 * @param page
	 * @param productInfo
	 * @return
	 */
	List<ProductInfoVO> selectProductInfoPage(IPage page, ProductInfoVO productInfo);

}
