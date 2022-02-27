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
package org.springblade.modules.productServiceRecordems.controller;

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
import org.springblade.modules.productServiceRecordems.entity.ProductServiceRecord;
import org.springblade.modules.productServiceRecordems.vo.ProductServiceRecordVO;
import org.springblade.modules.productServiceRecordems.service.IProductServiceRecordService;
import org.springblade.core.boot.ctrl.BladeController;

/**
 * 产品服务台账 控制器
 *
 * @author Blade
 * @since 2022-02-27
 */
@RestController
@AllArgsConstructor
@RequestMapping("svc_product_service_record/productservicerecord")
@Api(value = "产品服务台账", tags = "产品服务台账接口")
public class ProductServiceRecordController extends BladeController {

	private IProductServiceRecordService productServiceRecordService;

	/**
	 * 详情
	 */
	@GetMapping("/detail")
	@ApiOperationSupport(order = 1)
	@ApiOperation(value = "详情", notes = "传入productServiceRecord")
	public R<ProductServiceRecord> detail(ProductServiceRecord productServiceRecord) {
		ProductServiceRecord detail = productServiceRecordService.getOne(Condition.getQueryWrapper(productServiceRecord));
		return R.data(detail);
	}

	/**
	 * 分页 产品服务台账
	 */
	@GetMapping("/list")
	@ApiOperationSupport(order = 2)
	@ApiOperation(value = "分页", notes = "传入productServiceRecord")
	public R<IPage<ProductServiceRecord>> list(ProductServiceRecord productServiceRecord, Query query) {
		IPage<ProductServiceRecord> pages = productServiceRecordService.page(Condition.getPage(query), Condition.getQueryWrapper(productServiceRecord));
		return R.data(pages);
	}

	/**
	 * 自定义分页 产品服务台账
	 */
	@GetMapping("/page")
	@ApiOperationSupport(order = 3)
	@ApiOperation(value = "分页", notes = "传入productServiceRecord")
	public R<IPage<ProductServiceRecordVO>> page(ProductServiceRecordVO productServiceRecord, Query query) {
		IPage<ProductServiceRecordVO> pages = productServiceRecordService.selectProductServiceRecordPage(Condition.getPage(query), productServiceRecord);
		return R.data(pages);
	}

	/**
	 * 新增 产品服务台账
	 */
	@PostMapping("/save")
	@ApiOperationSupport(order = 4)
	@ApiOperation(value = "新增", notes = "传入productServiceRecord")
	public R save(@Valid @RequestBody ProductServiceRecord productServiceRecord) {
		return R.status(productServiceRecordService.save(productServiceRecord));
	}

	/**
	 * 修改 产品服务台账
	 */
	@PostMapping("/update")
	@ApiOperationSupport(order = 5)
	@ApiOperation(value = "修改", notes = "传入productServiceRecord")
	public R update(@Valid @RequestBody ProductServiceRecord productServiceRecord) {
		return R.status(productServiceRecordService.updateById(productServiceRecord));
	}

	/**
	 * 新增或修改 产品服务台账
	 */
	@PostMapping("/submit")
	@ApiOperationSupport(order = 6)
	@ApiOperation(value = "新增或修改", notes = "传入productServiceRecord")
	public R submit(@Valid @RequestBody ProductServiceRecord productServiceRecord) {
		return R.status(productServiceRecordService.saveOrUpdate(productServiceRecord));
	}

	
	/**
	 * 删除 产品服务台账
	 */
	@PostMapping("/remove")
	@ApiOperationSupport(order = 8)
	@ApiOperation(value = "删除", notes = "传入ids")
	public R remove(@ApiParam(value = "主键集合", required = true) @RequestParam String ids) {
		return R.status(productServiceRecordService.removeByIds(Func.toLongList(ids)));
	}

	
}
