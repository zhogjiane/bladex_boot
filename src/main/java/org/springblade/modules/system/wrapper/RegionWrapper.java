
package org.springblade.modules.system.wrapper;

import org.springblade.core.mp.support.BaseEntityWrapper;
import org.springblade.core.tool.node.ForestNodeMerger;
import org.springblade.core.tool.node.INode;
import org.springblade.core.tool.utils.BeanUtil;
import org.springblade.core.tool.utils.SpringUtil;
import org.springblade.modules.system.entity.Region;
import org.springblade.modules.system.service.IRegionService;
import org.springblade.modules.system.vo.RegionVO;

import java.util.List;
import java.util.Objects;

/**
 * 包装类,返回视图层所需的字段
 *
 * @author Chill
 */
public class RegionWrapper extends BaseEntityWrapper<Region, RegionVO> {

	private static IRegionService regionService;

	static {
		regionService = SpringUtil.getBean(IRegionService.class);
	}

	public static RegionWrapper build() {
		return new RegionWrapper();
	}

	@Override
	public RegionVO entityVO(Region region) {
		RegionVO regionVO = Objects.requireNonNull(BeanUtil.copy(region, RegionVO.class));
		Region parentRegion = regionService.getById(region.getParentCode());
		regionVO.setParentName(parentRegion.getName());
		return regionVO;
	}

	public List<INode> listNodeLazyVO(List<INode> list) {
		return ForestNodeMerger.merge(list);
	}

}
