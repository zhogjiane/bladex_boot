
package org.springblade.modules.system.wrapper;

import org.springblade.core.mp.support.BaseEntityWrapper;
import org.springblade.core.tool.utils.BeanUtil;
import org.springblade.core.tool.utils.Func;
import org.springblade.core.tool.utils.SpringUtil;
import org.springblade.modules.system.entity.User;
import org.springblade.modules.system.service.IDictService;
import org.springblade.modules.system.service.IUserService;
import org.springblade.modules.system.vo.UserVO;

import java.util.List;

/**
 * 包装类,返回视图层所需的字段
 *
 * @author Chill
 */
public class UserWrapper extends BaseEntityWrapper<User, UserVO> {

	private static IUserService userService;

	private static IDictService dictService;

	static {
		userService = SpringUtil.getBean(IUserService.class);
		dictService = SpringUtil.getBean(IDictService.class);
	}

	public static UserWrapper build() {
		return new UserWrapper();
	}

	@Override
	public UserVO entityVO(User user) {
		UserVO userVO = BeanUtil.copy(user, UserVO.class);
		List<String> roleName = userService.getRoleName(user.getRoleId());
		List<String> deptName = userService.getDeptName(user.getDeptId());
		userVO.setRoleName(Func.join(roleName));
		userVO.setDeptName(Func.join(deptName));
		userVO.setSexName(dictService.getValue("sex", Func.toInt(user.getSex())));
		return userVO;
	}

}
