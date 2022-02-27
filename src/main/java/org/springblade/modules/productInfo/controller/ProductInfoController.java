/**
 * Copyright (c) 2018-2028, Chill Zhuang 庄骞 (smallchill@163.com).
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springblade.modules.productInfo.controller;

import io.swagger.annotations.Api;

import com.github.xiaoymin.knife4j.annotations.ApiOperationSupport;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.AllArgsConstructor;
import javax.validation.Valid;

import org.springblade.core.mp.support.Condition;
import org.springblade.core.mp.support.Query;
import org.springblade.core.tool.api.R;
import org.springblade.core.tool.utils.Func;
import org.springframework.web.bind.annotation.*;
import com.baomidou.mybatisplus.core.metadata.IPage;
import org.springblade.modules.productInfo.entity.ProductInfo;
import org.springblade.modules.productInfo.vo.ProductInfoVO;
import org.springblade.modules.productInfo.service.IProductInfoService;
import org.springblade.core.boot.ctrl.BladeController;

/**
 * 产品通用信息表 控制器
 *
 * @author Blade
 * @since 2022-02-27
 */
@RestController
@AllArgsConstructor
@RequestMapping("svc_product_info/productinfo")
@Api(value = "产品通用信息表", tags = "产品通用信息表接口")
public class ProductInfoController extends BladeController {

	private IProductInfoService productInfoService;

	/**
	 * 详情
	 */
	@GetMapping("/detail")
	@ApiOperationSupport(order = 1)
	@ApiOperation(value = "详情", notes = "传入productInfo")
	public R<ProductInfo> detail(ProductInfo productInfo) {
		ProductInfo detail = productInfoService.getOne(Condition.getQueryWrapper(productInfo));
		return R.data(detail);
	}

	/**
	 * 分页 产品通用信息表
	 */
	@GetMapping("/list")
	@ApiOperationSupport(order = 2)
	@ApiOperation(value = "分页", notes = "传入productInfo")
	public R<IPage<ProductInfo>> list(ProductInfo productInfo, Query query) {
		IPage<ProductInfo> pages = productInfoService.page(Condition.getPage(query), Condition.getQueryWrapper(productInfo));
		return R.data(pages);
	}

	/**
	 * 自定义分页 产品通用信息表
	 */
	@GetMapping("/page")
	@ApiOperationSupport(order = 3)
	@ApiOperation(value = "分页", notes = "传入productInfo")
	public R<IPage<ProductInfoVO>> page(ProductInfoVO productInfo, Query query) {
		IPage<ProductInfoVO> pages = productInfoService.selectProductInfoPage(Condition.getPage(query), productInfo);
		return R.data(pages);
	}

	/**
	 * 新增 产品通用信息表
	 */
	@PostMapping("/save")
	@ApiOperationSupport(order = 4)
	@ApiOperation(value = "新增", notes = "传入productInfo")
	public R save(@Valid @RequestBody ProductInfo productInfo) {
		return R.status(productInfoService.save(productInfo));
	}

	/**
	 * 修改 产品通用信息表
	 */
	@PostMapping("/update")
	@ApiOperationSupport(order = 5)
	@ApiOperation(value = "修改", notes = "传入productInfo")
	public R update(@Valid @RequestBody ProductInfo productInfo) {
		return R.status(productInfoService.updateById(productInfo));
	}

	/**
	 * 新增或修改 产品通用信息表
	 */
	@PostMapping("/submit")
	@ApiOperationSupport(order = 6)
	@ApiOperation(value = "新增或修改", notes = "传入productInfo")
	public R submit(@Valid @RequestBody ProductInfo productInfo) {
		return R.status(productInfoService.saveOrUpdate(productInfo));
	}

	
	/**
	 * 删除 产品通用信息表
	 */
	@PostMapping("/remove")
	@ApiOperationSupport(order = 8)
	@ApiOperation(value = "删除", notes = "传入ids")
	public R remove(@ApiParam(value = "主键集合", required = true) @RequestParam String ids) {
		return R.status(productInfoService.removeByIds(Func.toLongList(ids)));
	}

	
}
