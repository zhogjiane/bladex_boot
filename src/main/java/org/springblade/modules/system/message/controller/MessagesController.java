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
package org.springblade.modules.system.message.controller;

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
import org.springblade.modules.system.message.entity.Messages;
import org.springblade.modules.system.message.service.IMessagesService;
import org.springblade.modules.system.message.vo.MessagesVO;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 *  控制器
 *
 * @author Blade
 * @since 2022-02-22
 */
@RestController
@AllArgsConstructor
@RequestMapping("blade-message/messages")
@Api(value = "", tags = "接口")
public class MessagesController extends BladeController {

	private IMessagesService messagesService;

	/**
	 * 详情
	 */
	@GetMapping("/detail")
	@ApiOperationSupport(order = 1)
	@ApiOperation(value = "详情", notes = "传入messages")
	public R<Messages> detail(Messages messages) {
		Messages detail = messagesService.getOne(Condition.getQueryWrapper(messages));
		return R.data(detail);
	}

	/**
	 * 分页
	 */
	@GetMapping("/list")
	@ApiOperationSupport(order = 2)
	@ApiOperation(value = "分页", notes = "传入messages")
	public R<IPage<Messages>> list(Messages messages, Query query) {
		IPage<Messages> pages = messagesService.page(Condition.getPage(query), Condition.getQueryWrapper(messages));
		return R.data(pages);
	}

	/**
	 * 自定义分页
	 */
	@GetMapping("/page")
	@ApiOperationSupport(order = 3)
	@ApiOperation(value = "分页", notes = "传入messages")
	public R<IPage<MessagesVO>> page(MessagesVO messages, Query query) {
		IPage<MessagesVO> pages = messagesService.selectMessagesPage(Condition.getPage(query), messages);
		return R.data(pages);
	}

	/**
	 * 新增
	 */
	@PostMapping("/save")
	@ApiOperationSupport(order = 4)
	@ApiOperation(value = "新增", notes = "传入messages")
	public R save(@Valid @RequestBody Messages messages) {
		return R.status(messagesService.save(messages));
	}

	/**
	 * 修改
	 */
	@PostMapping("/update")
	@ApiOperationSupport(order = 5)
	@ApiOperation(value = "修改", notes = "传入messages")
	public R update(@Valid @RequestBody Messages messages) {
		return R.status(messagesService.updateById(messages));
	}

	/**
	 * 新增或修改
	 */
	@PostMapping("/submit")
	@ApiOperationSupport(order = 6)
	@ApiOperation(value = "新增或修改", notes = "传入messages")
	public R submit(@Valid @RequestBody Messages messages) {
		return R.status(messagesService.saveOrUpdateMessages(messages));
	}


	/**
	 * 删除
	 */
	@PostMapping("/remove")
	@ApiOperationSupport(order = 8)
	@ApiOperation(value = "删除", notes = "传入ids")
	public R remove(@ApiParam(value = "主键集合", required = true) @RequestParam String ids) {
		return R.status(messagesService.removeByIds(Func.toLongList(ids)));
	}

	/**
	 * 自定义分页
	 */
	@GetMapping("/messagePage")
	@ApiOperationSupport(order = 9)
	@ApiOperation(value = "分页", notes = "传入messages")
	public R<IPage<MessagesVO>> page2(MessagesVO messages, Query query, Long toUserId) {
		IPage<MessagesVO> pages = messagesService.selectMessagesPage2(Condition.getPage(query), messages, toUserId);
		return R.data(pages);
	}

	/**
	 * 已读
	 */
	@PostMapping("/updateMessages")
	@ApiOperationSupport(order = 10)
	@ApiOperation(value = "修改", notes = "传入messages")
	public R updateMessages(String id,String toUserId) {
		return R.status(messagesService.updateMessages(id,toUserId));
	}

	/**
	 * 一键已读
	 */
	@PostMapping("/updateUserMessages")
	@ApiOperationSupport(order = 11)
	@ApiOperation(value = "修改", notes = "传入messages")
	public R updateUserMessages(String toUserId) {
		return R.status(messagesService.updateUserMessages(toUserId));
	}


}
