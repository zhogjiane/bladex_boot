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
package org.springblade.modules.system.message.mapper;

import org.apache.ibatis.annotations.Param;
import org.springblade.modules.system.message.entity.Messages;
import org.springblade.modules.system.message.vo.MessagesVO;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import java.util.List;

/**
 *  Mapper 接口
 *
 * @author Blade
 * @since 2022-02-22
 */
public interface MessagesMapper extends BaseMapper<Messages> {

	/**
	 * 自定义分页
	 *
	 * @param page
	 * @param messages
	 * @return
	 */
	List<MessagesVO> selectMessagesPage(IPage page, MessagesVO messages);

	/**
	 * 自定义分页
	 *
	 * @param page
	 * @param messages
	 * @return
	 */
    List<MessagesVO> selectMessagesPage2(IPage<MessagesVO> page, MessagesVO messages,@Param("toUserId") Long toUserId);

	/**
	 * 已读
	 *
	 * @param id
	 * @param toUserId
	 * @return
	 */
	Boolean updateMessages(@Param("id") String id,@Param("toUserId") String toUserId);

	/**
	 * 一键已读
	 *
	 * @param toUserId
	 * @return
	 */
	Boolean updateUserMessages(@Param("toUserId") String toUserId);
}
