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
package org.springblade.modules.system.internshipFileSubmit.controller;

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
import org.springblade.modules.system.internshipFileSubmit.entity.InternshipFileSubmit;
import org.springblade.modules.system.internshipFileSubmit.service.IInternshipFileSubmitService;
import org.springblade.modules.system.internshipFileSubmit.vo.InternshipFileSubmitVO;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * 实习材料提交表 控制器
 *
 * @author Blade
 * @since 2022-02-15
 */
@RestController
@AllArgsConstructor
@RequestMapping("blade-internship/internshipfilesubmit")
@Api(value = "实习材料提交表", tags = "实习材料提交表接口")
public class InternshipFileSubmitController extends BladeController {

	private IInternshipFileSubmitService internshipFileSubmitService;

	/**
	 * 详情
	 */
	@GetMapping("/detail")
	@ApiOperationSupport(order = 1)
	@ApiOperation(value = "详情", notes = "传入internshipFileSubmit")
	public R<InternshipFileSubmit> detail(InternshipFileSubmit internshipFileSubmit) {
		InternshipFileSubmit detail = internshipFileSubmitService.getOne(Condition.getQueryWrapper(internshipFileSubmit));
		return R.data(detail);
	}

	/**
	 * 分页 实习材料提交表
	 */
	@GetMapping("/list")
	@ApiOperationSupport(order = 2)
	@ApiOperation(value = "分页", notes = "传入internshipFileSubmit")
	public R<IPage<InternshipFileSubmit>> list(InternshipFileSubmit internshipFileSubmit, Query query) {
		IPage<InternshipFileSubmit> pages = internshipFileSubmitService.page(Condition.getPage(query), Condition.getQueryWrapper(internshipFileSubmit));
		return R.data(pages);
	}

	/**
	 * 自定义分页 实习材料提交表
	 */
	@GetMapping("/page")
	@ApiOperationSupport(order = 3)
	@ApiOperation(value = "分页", notes = "传入internshipFileSubmit")
	public R<IPage<InternshipFileSubmitVO>> page(InternshipFileSubmitVO internshipFileSubmit, Query query) {
		IPage<InternshipFileSubmitVO> pages = internshipFileSubmitService.selectInternshipFileSubmitPage(Condition.getPage(query), internshipFileSubmit);
		return R.data(pages);
	}

	/**
	 * 新增 实习材料提交表
	 */
	@PostMapping("/save")
	@ApiOperationSupport(order = 4)
	@ApiOperation(value = "新增", notes = "传入internshipFileSubmit")
	public R save(@Valid @RequestBody InternshipFileSubmit internshipFileSubmit) {
		return R.status(internshipFileSubmitService.save(internshipFileSubmit));
	}

	/**
	 * 修改 实习材料提交表
	 */
	@PostMapping("/update")
	@ApiOperationSupport(order = 5)
	@ApiOperation(value = "修改", notes = "传入internshipFileSubmit")
	public R update(@Valid @RequestBody InternshipFileSubmit internshipFileSubmit) {
		return R.status(internshipFileSubmitService.updateById(internshipFileSubmit));
	}

	/**
	 * 新增或修改 实习材料提交表
	 */
	@PostMapping("/submit")
	@ApiOperationSupport(order = 6)
	@ApiOperation(value = "新增或修改", notes = "传入internshipFileSubmit")
	public R submit(@Valid @RequestBody InternshipFileSubmit internshipFileSubmit) {
		return R.status(internshipFileSubmitService.saveOrUpdate(internshipFileSubmit));
	}


	/**
	 * 删除 实习材料提交表
	 */
	@PostMapping("/remove")
	@ApiOperationSupport(order = 8)
	@ApiOperation(value = "删除", notes = "传入ids")
	public R remove(@ApiParam(value = "主键集合", required = true) @RequestParam String ids) {
		return R.status(internshipFileSubmitService.removeByIds(Func.toLongList(ids)));
	}


}
