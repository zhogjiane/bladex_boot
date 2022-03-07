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
package org.springblade.modules.template.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.github.xiaoymin.knife4j.annotations.ApiOperationSupport;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.AllArgsConstructor;
import org.springblade.core.boot.ctrl.BladeController;
import org.springblade.core.mp.support.Condition;
import org.springblade.core.mp.support.Query;
import org.springblade.core.tool.api.R;
import org.springblade.core.tool.utils.Func;
import org.springblade.modules.template.entity.Template;
import org.springblade.modules.template.service.ITemplateService;
import org.springblade.modules.template.vo.TemplateVO;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 *  控制器
 *
 * @author Blade
 * @since 2022-02-28
 */
@RestController
@AllArgsConstructor
@RequestMapping("template/template")
@Api(value = "", tags = "接口")
public class TemplateController extends BladeController {

	private ITemplateService templateService;

	/**
	 * 详情
	 */
	@GetMapping("/detail")
	@ApiOperationSupport(order = 1)
	@ApiOperation(value = "详情", notes = "传入template")
	public R<Template> detail(Template template) {
		/**
		 * mybatisplus 封装方法，例如:getOne,update,page,save,submit,saveOrUpdate,removeById,removeByIds
		 * 注意update方法中获取条件的写法
		 */
		Template detail = templateService.getOne(Condition.getQueryWrapper(template));
		return R.data(detail);
	}

	/**
	 * 分页
	 */
	@GetMapping("/list")
	@ApiOperationSupport(order = 2)
	@ApiOperation(value = "分页", notes = "传入template")
	public R<IPage<Template>> list(Template template, Query query) {
		IPage<Template> pages = templateService.page(Condition.getPage(query), Condition.getQueryWrapper(template));
		return R.data(pages);
	}

	/**
	 * 自定义分页
	 */
	@GetMapping("/page")
	@ApiOperationSupport(order = 3)
	@ApiOperation(value = "分页", notes = "传入template")
	public R<IPage<TemplateVO>> page(TemplateVO template, Query query) {
		/**
		 * 自写的分页方法，将查询结果用IPage封装
		 */
		IPage<TemplateVO> pages = templateService.selectTemplatePage(Condition.getPage(query), template);
		return R.data(pages);
	}

	/**
	 * 新增
	 */
	@PostMapping("/save")
	@ApiOperationSupport(order = 4)
	@ApiOperation(value = "新增", notes = "传入template")
	public R save(@Valid @RequestBody Template template) {
		return R.status(templateService.save(template));
	}

	/**
	 * 修改
	 */
	@PostMapping("/update")
	@ApiOperationSupport(order = 5)
	@ApiOperation(value = "修改", notes = "传入template")
	public R update(@Valid @RequestBody Template template) {
		return R.status(templateService.updateById(template));
	}

	/**
	 * 新增或修改
	 */
	@PostMapping("/submit")
	@ApiOperationSupport(order = 6)
	@ApiOperation(value = "新增或修改", notes = "传入template")
	public R submit(@Valid @RequestBody Template template) {
		return R.status(templateService.saveOrUpdate(template));
	}


	/**
	 * 删除
	 */
	@PostMapping("/remove")
	@ApiOperationSupport(order = 8)
	@ApiOperation(value = "删除", notes = "传入ids")
	public R remove(@ApiParam(value = "主键集合", required = true) @RequestParam String ids) {
		return R.status(templateService.removeByIds(Func.toLongList(ids)));
	}


}
