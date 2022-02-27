
package org.springblade.modules.svcMonitorItems.controller;

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
import org.springblade.modules.svcMonitorItems.entity.MonitorItems;
import org.springblade.modules.svcMonitorItems.vo.MonitorItemsVO;
import org.springblade.modules.svcMonitorItems.service.IMonitorItemsService;
import org.springblade.core.boot.ctrl.BladeController;

/**
 * 监测项信息表 控制器
 *
 * @author Blade
 * @since 2022-02-27
 */
@RestController
@AllArgsConstructor
@RequestMapping("svc_monitor_items/monitoritems")
@Api(value = "监测项信息表", tags = "监测项信息表接口")
public class MonitorItemsController extends BladeController {

	private IMonitorItemsService monitorItemsService;

	/**
	 * 详情
	 */
	@GetMapping("/detail")
	@ApiOperationSupport(order = 1)
	@ApiOperation(value = "详情", notes = "传入monitorItems")
	public R<MonitorItems> detail(MonitorItems monitorItems) {
		MonitorItems detail = monitorItemsService.getOne(Condition.getQueryWrapper(monitorItems));
		return R.data(detail);
	}

	/**
	 * 分页 监测项信息表
	 */
	@GetMapping("/list")
	@ApiOperationSupport(order = 2)
	@ApiOperation(value = "分页", notes = "传入monitorItems")
	public R<IPage<MonitorItems>> list(MonitorItems monitorItems, Query query) {
		IPage<MonitorItems> pages = monitorItemsService.page(Condition.getPage(query), Condition.getQueryWrapper(monitorItems));
		return R.data(pages);
	}

	/**
	 * 自定义分页 监测项信息表
	 */
	@GetMapping("/page")
	@ApiOperationSupport(order = 3)
	@ApiOperation(value = "分页", notes = "传入monitorItems")
	public R<IPage<MonitorItemsVO>> page(MonitorItemsVO monitorItems, Query query) {
		IPage<MonitorItemsVO> pages = monitorItemsService.selectMonitorItemsPage(Condition.getPage(query), monitorItems);
		return R.data(pages);
	}

	/**
	 * 新增 监测项信息表
	 */
	@PostMapping("/save")
	@ApiOperationSupport(order = 4)
	@ApiOperation(value = "新增", notes = "传入monitorItems")
	public R save(@Valid @RequestBody MonitorItems monitorItems) {
		return R.status(monitorItemsService.save(monitorItems));
	}

	/**
	 * 修改 监测项信息表
	 */
	@PostMapping("/update")
	@ApiOperationSupport(order = 5)
	@ApiOperation(value = "修改", notes = "传入monitorItems")
	public R update(@Valid @RequestBody MonitorItems monitorItems) {
		return R.status(monitorItemsService.updateById(monitorItems));
	}

	/**
	 * 新增或修改 监测项信息表
	 */
	@PostMapping("/submit")
	@ApiOperationSupport(order = 6)
	@ApiOperation(value = "新增或修改", notes = "传入monitorItems")
	public R submit(@Valid @RequestBody MonitorItems monitorItems) {
		return R.status(monitorItemsService.saveOrUpdate(monitorItems));
	}


	/**
	 * 删除 监测项信息表
	 */
	@PostMapping("/remove")
	@ApiOperationSupport(order = 8)
	@ApiOperation(value = "删除", notes = "传入ids")
	public R remove(@ApiParam(value = "主键集合", required = true) @RequestParam String ids) {
		return R.status(monitorItemsService.removeByIds(Func.toLongList(ids)));
	}


}
