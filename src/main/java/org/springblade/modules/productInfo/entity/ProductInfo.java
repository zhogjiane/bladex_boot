
package org.springblade.modules.productInfo.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 产品通用信息表实体类
 *
 * @author Blade
 * @since 2022-02-27
 */
@Data
@TableName("svc_product_info")
@ApiModel(value = "ProductInfo对象", description = "产品通用信息表")
public class ProductInfo implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 产品信息主键
	 */
	@ApiModelProperty(value = "产品信息主键")
	private Long id;
	/**
	 * 产品类型表主键
	 */
	@ApiModelProperty(value = "产品类型表主键")
	private Long productTypeId;
	/**
	 * 产品型号
	 */
	@ApiModelProperty(value = "产品型号")
	private String productModel;
	/**
	 * 产品名称
	 */
	@ApiModelProperty(value = "产品名称")
	private String productName;
	/**
	 * 产品代号
	 */
	@ApiModelProperty(value = "产品代号")
	private String productCode;
	/**
	 * 产品使用寿命,月
	 */
	@ApiModelProperty(value = "产品使用寿命,月")
	private String serviceLife;
	/**
	 * 制造单位ID
	 */
	@ApiModelProperty(value = "制造单位ID")
	private Long manufactureCompanyId;
	/**
	 * 制造单位名称
	 */
	@ApiModelProperty(value = "制造单位名称")
	private String manufactureCompanyName;
	/**
	 * 设计单位ID
	 */
	@ApiModelProperty(value = "设计单位ID")
	private Long designCompanyId;
	/**
	 * 设计单位名称
	 */
	@ApiModelProperty(value = "设计单位名称")
	private String designCompanyName;
	/**
	 * 备注
	 */
	@ApiModelProperty(value = "备注")
	private String remark;
	/**
	 * 密级,0公开,1秘密,2机密,3绝密
	 */
	@ApiModelProperty(value = "密级,0公开,1秘密,2机密,3绝密")
	private Boolean securityLevel;
	/**
	 * 是否删除 0 未删除；1 已删除
	 */
	@ApiModelProperty(value = "是否删除 0 未删除；1 已删除")
	private Boolean isDeleted;
	/**
	 * 所属部门ID
	 */
	@ApiModelProperty(value = "所属部门ID")
	private Long createDept;
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
	 * 修改时间
	 */
	@ApiModelProperty(value = "修改时间")
	private LocalDateTime updateTime;
	/**
	 * 状态
	 */
	@ApiModelProperty(value = "状态")
	private Integer status;


}
