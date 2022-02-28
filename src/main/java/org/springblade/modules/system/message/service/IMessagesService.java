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
package org.springblade.modules.system.message.service;

import org.springblade.modules.system.message.entity.Messages;
import org.springblade.modules.system.message.vo.MessagesVO;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.core.metadata.IPage;

/**
 *  服务类
 *
 * @author Blade
 * @since 2022-02-22
 */
public interface IMessagesService extends IService<Messages> {

	/**
	 * 自定义分页
	 *
	 * @param page
	 * @param messages
	 * @return
	 */
	IPage<MessagesVO> selectMessagesPage(IPage<MessagesVO> page, MessagesVO messages);

	/**
	 * 自定义分页
	 *
	 * @param page
	 * @param messages
	 * @param toUserId
	 * @return
	 */
	IPage<MessagesVO> selectMessagesPage2(IPage<MessagesVO> page, MessagesVO messages, Long toUserId);

	/**
	 * 已读
	 *
	 * @param id
	 * @param toUserId
	 * @return
	 */
	Boolean updateMessages(String id,String toUserId);

	/**
	 * 一键已读
	 *
	 * @param toUserId
	 * @return
	 */
    Boolean updateUserMessages(String toUserId);

	/**
	 * 保存
	 *
	 * @param messages
	 * @return
	 */
	boolean saveOrUpdateMessages(Messages messages);
}
