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
package org.springblade.modules.system.filemessage.service.impl;

import org.springblade.modules.system.filemessage.entity.FileMessage;
import org.springblade.modules.system.filemessage.vo.FileMessageVO;
import org.springblade.modules.system.filemessage.mapper.FileMessageMapper;
import org.springblade.modules.system.filemessage.service.IFileMessageService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.metadata.IPage;

/**
 * 上传文件信息表 服务实现类
 *
 * @author Blade
 * @since 2022-02-27
 */
@Service
public class FileMessageServiceImpl extends ServiceImpl<FileMessageMapper, FileMessage> implements IFileMessageService {

	@Override
	public IPage<FileMessageVO> selectFileMessagePage(IPage<FileMessageVO> page, FileMessageVO fileMessage) {
		return page.setRecords(baseMapper.selectFileMessagePage(page, fileMessage));
	}

}
