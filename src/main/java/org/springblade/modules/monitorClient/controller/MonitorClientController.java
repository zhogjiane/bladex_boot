
package org.springblade.modules.monitorClient.controller;

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
import org.springblade.modules.monitorClient.entity.MonitorClient;
import org.springblade.modules.monitorClient.vo.MonitorClientVO;
import org.springblade.modules.monitorClient.service.IMonitorClientService;
import org.springblade.core.boot.ctrl.BladeController;

/**
 * 监测客户端 控制器
 *
 * @author Blade
 * @since 2022-02-27
 */
@RestController
@AllArgsConstructor
@RequestMapping("svc_monitor_client/monitorclient")
@Api(value = "监测客户端", tags = "监测客户端接口")
public class MonitorClientController extends BladeController {

	private IMonitorClientService monitorClientService;

	/**
	 * 详情
	 */
	@GetMapping("/detail")
	@ApiOperationSupport(order = 1)
	@ApiOperation(value = "详情", notes = "传入monitorClient")
	public R<MonitorClient> detail(MonitorClient monitorClient) {
		MonitorClient detail = monitorClientService.getOne(
			Condition.getQueryWrapper(monitorClient));
		return R.data(detail);
	}

	/**
	 * 分页 监测客户端
	 */
	@GetMapping("/list")
	@ApiOperationSupport(order = 2)
	@ApiOperation(value = "分页", notes = "传入monitorClient")
	public R<IPage<MonitorClient>> list(MonitorClient monitorClient, Query query) {
		IPage<MonitorClient> pages = monitorClientService.page(Condition.getPage(query),
			Condition.getQueryWrapper(monitorClient));
		return R.data(pages);
	}

	/**
	 * 自定义分页 监测客户端
	 */
	@GetMapping("/page")
	@ApiOperationSupport(order = 3)
	@ApiOperation(value = "分页", notes = "传入monitorClient")
	public R<IPage<MonitorClientVO>> page(MonitorClientVO monitorClient, Query query) {
		IPage<MonitorClientVO> pages = monitorClientService.selectMonitorClientPage(
			Condition.getPage(query), monitorClient);
		return R.data(pages);
	}

	/**
	 * 新增 监测客户端
	 */
	@PostMapping("/save")
	@ApiOperationSupport(order = 4)
	@ApiOperation(value = "新增", notes = "传入monitorClient")
	public R save(@Valid @RequestBody MonitorClient monitorClient) {
		return R.status(monitorClientService.save(monitorClient));
	}

	/**
	 * 修改 监测客户端
	 */
	@PostMapping("/update")
	@ApiOperationSupport(order = 5)
	@ApiOperation(value = "修改", notes = "传入monitorClient")
	public R update(@Valid @RequestBody MonitorClient monitorClient) {
		return R.status(monitorClientService.updateById(monitorClient));
	}

	/**
	 * 新增或修改 监测客户端
	 */
	@PostMapping("/submit")
	@ApiOperationSupport(order = 6)
	@ApiOperation(value = "新增或修改", notes = "传入monitorClient")
	public R submit(@Valid @RequestBody MonitorClient monitorClient) {
		return R.status(monitorClientService.saveOrUpdate(monitorClient));
	}


	/**
	 * 删除 监测客户端
	 */
	@PostMapping("/remove")
	@ApiOperationSupport(order = 8)
	@ApiOperation(value = "删除", notes = "传入ids")
	public R remove(@ApiParam(value = "主键集合", required = true) @RequestParam String ids) {
		return R.status(monitorClientService.removeByIds(Func.toLongList(ids)));
	}


}
