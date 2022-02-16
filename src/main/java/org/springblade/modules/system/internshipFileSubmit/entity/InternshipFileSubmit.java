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
package org.springblade.modules.system.internshipFileSubmit.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 实习材料提交表实体类
 *
 * @author Blade
 * @since 2022-02-15
 */
@Data
@ApiModel(value = "InternshipFileSubmit对象", description = "实习材料提交表")
public class InternshipFileSubmit implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @ApiModelProperty(value = "主键")
    private Integer id;
	/**
	 * 材料名称
	 */
	@ApiModelProperty(value = "材料名称")
	@TableField("internshipFileName")
	private String internshipFileName;
    /**
     * 实习公司
     */
    @ApiModelProperty(value = "实习公司")
    @TableField("companyName")
  private String companyname;
    /**
     * 实习地址
     */
    @ApiModelProperty(value = "实习地址")
    @TableField("companyAddress")
  private String companyaddress;
    /**
     * 创建人
     */
    @ApiModelProperty(value = "创建人")
    private Long createUser;
    /**
     * 创建部门
     */
    @ApiModelProperty(value = "创建部门")
    private Long createDept;
    /**
     * 创建时间
     */
    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createTime;
    /**
     * 修改人
     */
    @ApiModelProperty(value = "修改人")
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
    /**
     * 是否已删除
     */
    @ApiModelProperty(value = "是否已删除")
    private Integer isDeleted;
    /**
     * 备注
     */
    @ApiModelProperty(value = "备注")
    private String remark;
	/**
	 * 附件地址
	 */
	@ApiModelProperty(value = "附件地址")
	@TableField("filePath")
	private String filePath;
	/**
	 * 所属教师
	 */
	@ApiModelProperty(value = "所属教师")
	private String deptId;

}
