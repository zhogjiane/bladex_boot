
package org.springblade.modules.desk.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import org.springblade.core.mp.base.BaseServiceImpl;
import org.springblade.modules.desk.entity.Notice;
import org.springblade.modules.desk.mapper.NoticeMapper;
import org.springblade.modules.desk.service.INoticeService;
import org.springframework.stereotype.Service;

/**
 * 服务实现类
 *
 * @author Chill
 */
@Service
public class NoticeServiceImpl extends BaseServiceImpl<NoticeMapper, Notice> implements
	INoticeService {

	@Override
	public IPage<Notice> selectNoticePage(IPage<Notice> page, Notice notice) {
		return page.setRecords(baseMapper.selectNoticePage(page, notice));
	}

}
