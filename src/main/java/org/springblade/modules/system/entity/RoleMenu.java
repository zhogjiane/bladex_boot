
package org.springblade.modules.system.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * 实体类
 *
 * @author Chill
 */
@Data
@TableName("blade_role_menu")
@ApiModel(value = "RoleMenu对象", description = "RoleMenu对象")
public class RoleMenu implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
	@ApiModelProperty(value = "主键")
	@TableId(value = "id", type = IdType.ASSIGN_ID)
	@JsonSerialize(using = ToStringSerializer.class)
	private Long id;

	/**
	 * 菜单id
	 */
	@ApiModelProperty(value = "菜单id")
	@JsonSerialize(using = ToStringSerializer.class)
	private Long menuId;

	/**
	 * 角色id
	 */
	@ApiModelProperty(value = "角色id")
	@JsonSerialize(using = ToStringSerializer.class)
	private Long roleId;


}
