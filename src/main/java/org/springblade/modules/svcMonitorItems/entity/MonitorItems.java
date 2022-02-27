
package org.springblade.modules.svcMonitorItems.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 监测项信息表实体类
 *
 * @author Blade
 * @since 2022-02-27
 */
@Data
@TableName("svc_monitor_items")
@ApiModel(value = "MonitorItems对象", description = "监测项信息表")
public class MonitorItems implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	/**
	 * 监测项名称
	 */
	@ApiModelProperty(value = "监测项名称")
	private String cname;
	/**
	 * 监测项单位
	 */
	@ApiModelProperty(value = "监测项单位")
	private String cunit;
	/**
	 * 监测项类型
	 */
	@ApiModelProperty(value = "监测项类型")
	private String ctype;
	/**
	 * 创建人ID
	 */
	@ApiModelProperty(value = "创建人ID")
	private Long createUser;
	/**
	 * 创建时间
	 */
	@ApiModelProperty(value = "创建时间")
	private LocalDateTime createTime;
	/**
	 * 修改人ID
	 */
	@ApiModelProperty(value = "修改人ID")
	private Long updateUser;
	/**
	 * 创建时间
	 */
	@ApiModelProperty(value = "创建时间")
	private LocalDateTime updateTime;
	/**
	 * 是否启用
	 */
	@ApiModelProperty(value = "是否启用")
	private Boolean status;
	/**
	 * 是否删除
	 */
	@ApiModelProperty(value = "是否删除")
	private Boolean isDeleted;
	/**
	 * 所属部门
	 */
	@ApiModelProperty(value = "所属部门")
	private Long createDept;


}
