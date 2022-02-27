
package org.springblade.modules.productInfo.service;

import org.springblade.modules.productInfo.entity.ProductInfo;
import org.springblade.modules.productInfo.vo.ProductInfoVO;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.core.metadata.IPage;

/**
 * 产品通用信息表 服务类
 *
 * @author Blade
 * @since 2022-02-27
 */
public interface IProductInfoService extends IService<ProductInfo> {

	/**
	 * 自定义分页
	 *
	 * @param page
	 * @param productInfo
	 * @return
	 */
	IPage<ProductInfoVO> selectProductInfoPage(IPage<ProductInfoVO> page,
		ProductInfoVO productInfo);

}
