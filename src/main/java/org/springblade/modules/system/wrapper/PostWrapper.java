
package org.springblade.modules.system.wrapper;

import org.springblade.core.mp.support.BaseEntityWrapper;
import org.springblade.core.tool.utils.BeanUtil;
import org.springblade.core.tool.utils.SpringUtil;
import org.springblade.modules.system.entity.Post;
import org.springblade.modules.system.service.IDictService;
import org.springblade.modules.system.vo.PostVO;

import java.util.Objects;

/**
 * 岗位表包装类,返回视图层所需的字段
 *
 * @author Chill
 */
public class PostWrapper extends BaseEntityWrapper<Post, PostVO> {

	private static IDictService dictService;

	static {
		dictService = SpringUtil.getBean(IDictService.class);
	}

	public static PostWrapper build() {
		return new PostWrapper();
	}

	@Override
	public PostVO entityVO(Post post) {
		PostVO postVO = Objects.requireNonNull(BeanUtil.copy(post, PostVO.class));
		String categoryName = dictService.getValue("post_category", post.getCategory());
		postVO.setCategoryName(categoryName);
		return postVO;
	}

}
