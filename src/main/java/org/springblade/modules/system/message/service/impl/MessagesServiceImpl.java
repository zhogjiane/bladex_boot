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
package org.springblade.modules.system.message.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springblade.modules.system.message.entity.Messages;
import org.springblade.modules.system.message.mapper.MessagesMapper;
import org.springblade.modules.system.message.service.IMessagesService;
import org.springblade.modules.system.message.vo.MessagesVO;
import org.springblade.modules.system.messagesToUserId.entity.MessagesToUserId;
import org.springblade.modules.system.messagesToUserId.service.IMessagesToUserIdService;
import org.springblade.modules.system.service.IUserService;
import org.springblade.modules.system.vo.UserVO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 *  服务实现类
 *
 * @author Blade
 * @since 2022-02-22
 */
@Service
public class MessagesServiceImpl extends ServiceImpl<MessagesMapper, Messages> implements IMessagesService {
	@Resource
	private IUserService userService;
	@Resource
	private IMessagesToUserIdService messagesToUserIdService;

	@Override
	public IPage<MessagesVO> selectMessagesPage(IPage<MessagesVO> page, MessagesVO messages) {
		return page.setRecords(baseMapper.selectMessagesPage(page, messages));
	}

	@Override
	public IPage<MessagesVO> selectMessagesPage2(IPage<MessagesVO> page, MessagesVO messages, Long toUserId) {
		return page.setRecords(baseMapper.selectMessagesPage2(page, messages, toUserId));
	}

	@Override
	public Boolean updateMessages(String id,String toUserId) {
		return baseMapper.updateMessages(id,toUserId);
	}

	@Override
	public Boolean updateUserMessages(String toUserId) {
		return baseMapper.updateUserMessages(toUserId);
	}

	@Override
	public boolean saveOrUpdateMessages(Messages messages) {
		boolean successFlag = this.saveOrUpdate(messages);
		String toUserId = messages.getToUserId();
		if(successFlag){
			if("1".equals(toUserId)){
				List<UserVO> userList = userService.getAllUser();
				for(int i = 0;i<userList.size();i++){
					MessagesToUserId messagesToUserId = new MessagesToUserId();
					messagesToUserId.setToUserId(userList.get(i).getId().toString());
					messagesToUserId.setMessagesId(messages.getId());
					successFlag = messagesToUserIdService.save(messagesToUserId);
				}
			}else{
				MessagesToUserId messagesToUserId = new MessagesToUserId();
				messagesToUserId.setToUserId(messages.getToUserId());
				messagesToUserId.setMessagesId(messages.getId());
				successFlag = messagesToUserIdService.save(messagesToUserId);
			}
		}
		return successFlag;
	}

}
