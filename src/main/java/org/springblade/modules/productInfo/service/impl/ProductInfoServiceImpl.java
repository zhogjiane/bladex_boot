
package org.springblade.modules.productInfo.service.impl;

import org.springblade.modules.productInfo.entity.ProductInfo;
import org.springblade.modules.productInfo.vo.ProductInfoVO;
import org.springblade.modules.productInfo.mapper.ProductInfoMapper;
import org.springblade.modules.productInfo.service.IProductInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.metadata.IPage;

/**
 * 产品通用信息表 服务实现类
 *
 * @author Blade
 * @since 2022-02-27
 */
@Service
public class ProductInfoServiceImpl extends ServiceImpl<ProductInfoMapper, ProductInfo> implements
	IProductInfoService {

	@Override
	public IPage<ProductInfoVO> selectProductInfoPage(IPage<ProductInfoVO> page,
		ProductInfoVO productInfo) {
		return page.setRecords(baseMapper.selectProductInfoPage(page, productInfo));
	}

}
