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
package org.springblade.modules.system.filemessage.controller;

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
import org.springblade.modules.system.filemessage.entity.FileMessage;
import org.springblade.modules.system.filemessage.vo.FileMessageVO;
import org.springblade.modules.system.filemessage.service.IFileMessageService;
import org.springblade.core.boot.ctrl.BladeController;

/**
 * 上传文件信息表 控制器
 *
 * @author Blade
 * @since 2022-02-27
 */
@RestController
@AllArgsConstructor
@RequestMapping("blade-file/filemessage")
@Api(value = "上传文件信息表", tags = "上传文件信息表接口")
public class FileMessageController extends BladeController {

	private IFileMessageService fileMessageService;

	/**
	 * 详情
	 */
	@GetMapping("/detail")
	@ApiOperationSupport(order = 1)
	@ApiOperation(value = "详情", notes = "传入fileMessage")
	public R<FileMessage> detail(FileMessage fileMessage) {
		FileMessage detail = fileMessageService.getOne(Condition.getQueryWrapper(fileMessage));
		return R.data(detail);
	}

	/**
	 * 分页 上传文件信息表
	 */
	@GetMapping("/list")
	@ApiOperationSupport(order = 2)
	@ApiOperation(value = "分页", notes = "传入fileMessage")
	public R<IPage<FileMessage>> list(FileMessage fileMessage, Query query) {
		IPage<FileMessage> pages = fileMessageService.page(Condition.getPage(query), Condition.getQueryWrapper(fileMessage));
		return R.data(pages);
	}

	/**
	 * 自定义分页 上传文件信息表
	 */
	@GetMapping("/page")
	@ApiOperationSupport(order = 3)
	@ApiOperation(value = "分页", notes = "传入fileMessage")
	public R<IPage<FileMessageVO>> page(FileMessageVO fileMessage, Query query) {
		IPage<FileMessageVO> pages = fileMessageService.selectFileMessagePage(Condition.getPage(query), fileMessage);
		return R.data(pages);
	}

	/**
	 * 新增 上传文件信息表
	 */
	@PostMapping("/save")
	@ApiOperationSupport(order = 4)
	@ApiOperation(value = "新增", notes = "传入fileMessage")
	public R save(@Valid @RequestBody FileMessage fileMessage) {
		return R.status(fileMessageService.save(fileMessage));
	}

	/**
	 * 修改 上传文件信息表
	 */
	@PostMapping("/update")
	@ApiOperationSupport(order = 5)
	@ApiOperation(value = "修改", notes = "传入fileMessage")
	public R update(@Valid @RequestBody FileMessage fileMessage) {
		return R.status(fileMessageService.updateById(fileMessage));
	}

	/**
	 * 新增或修改 上传文件信息表
	 */
	@PostMapping("/submit")
	@ApiOperationSupport(order = 6)
	@ApiOperation(value = "新增或修改", notes = "传入fileMessage")
	public R submit(@Valid @RequestBody FileMessage fileMessage) {
		return R.status(fileMessageService.saveOrUpdate(fileMessage));
	}


	/**
	 * 删除 上传文件信息表
	 */
	@PostMapping("/remove")
	@ApiOperationSupport(order = 8)
	@ApiOperation(value = "删除", notes = "传入ids")
	public R remove(@ApiParam(value = "主键集合", required = true) @RequestParam String ids) {
		return R.status(fileMessageService.removeByIds(Func.toLongList(ids)));
	}


}
