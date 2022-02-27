
package org.springblade.modules.desk.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import org.springblade.modules.desk.entity.Notice;

import java.util.List;

/**
 * Mapper 接口
 *
 * @author Chill
 */
public interface NoticeMapper extends BaseMapper<Notice> {

	/**
	 * 前N条数据
	 * @param number
	 * @return
	 */
	List<Notice> topList(Integer number);

	/**
	 * 自定义分页
	 * @param page
	 * @param notice
	 * @return
	 */
	List<Notice> selectNoticePage(IPage page, Notice notice);

}
