
package org.springblade.modules.system.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.AllArgsConstructor;
import org.springblade.core.log.model.LogUsual;
import org.springblade.core.log.model.LogUsualVo;
import org.springblade.core.mp.support.Condition;
import org.springblade.core.mp.support.Query;
import org.springblade.core.tool.api.R;
import org.springblade.core.tool.utils.BeanUtil;
import org.springblade.core.tool.utils.Func;
import org.springblade.core.tool.utils.StringPool;
import org.springblade.modules.system.service.ILogUsualService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 控制器
 *
 * @author Chill
 */
@ApiIgnore
@RestController
@AllArgsConstructor
@RequestMapping("/blade-log/usual")
public class LogUsualController {

	private ILogUsualService logService;

	/**
	 * 查询单条
	 */
	@GetMapping("/detail")
	public R<LogUsual> detail(LogUsual log) {
		return R.data(logService.getOne(Condition.getQueryWrapper(log)));
	}

	/**
	 * 查询多条(分页)
	 */
	@GetMapping("/list")
	public R<IPage<LogUsualVo>> list(@ApiIgnore @RequestParam Map<String, Object> log,
		Query query) {
		query.setAscs("create_time");
		query.setDescs(StringPool.EMPTY);
		IPage<LogUsual> pages = logService.page(Condition.getPage(query),
			Condition.getQueryWrapper(log, LogUsual.class));
		List<LogUsualVo> records = pages.getRecords().stream().map(logApi -> {
			LogUsualVo vo = BeanUtil.copy(logApi, LogUsualVo.class);
			vo.setStrId(Func.toStr(logApi.getId()));
			return vo;
		}).collect(Collectors.toList());
		IPage<LogUsualVo> pageVo = new Page<>(pages.getCurrent(), pages.getSize(),
			pages.getTotal());
		pageVo.setRecords(records);
		return R.data(pageVo);
	}

}
