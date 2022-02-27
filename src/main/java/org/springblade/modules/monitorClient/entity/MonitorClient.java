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
package org.springblade.modules.monitorClient.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 监测客户端实体类
 *
 * @author Blade
 * @since 2022-02-27
 */
@Data
@TableName("svc_monitor_client")
@ApiModel(value = "MonitorClient对象", description = "监测客户端")
public class MonitorClient implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ID主键，自增长
     */
    @ApiModelProperty(value = "ID主键，自增长")
    private Long id;
    /**
     * 客户端识别码
     */
    @ApiModelProperty(value = "客户端识别码")
    private String clientCode;
    /**
     * 客户端名称
     */
    @ApiModelProperty(value = "客户端名称")
    private String clientName;
    /**
     * 归属机构
     */
    @ApiModelProperty(value = "归属机构")
    private Long parentId;
    /**
     * 坐标位置
     */
    @ApiModelProperty(value = "坐标位置")
    private String formattedAddress;
    /**
     * 经度
     */
    @ApiModelProperty(value = "经度")
    private String longitude;
    /**
     * 维度
     */
    @ApiModelProperty(value = "维度")
    private String latitude;
    /**
     * 监测项
     */
    @ApiModelProperty(value = "监测项")
    private String monitoringType;
    /**
     * 创建人
     */
    @ApiModelProperty(value = "创建人")
    private Long createUser;
    /**
     * 创建时间
     */
    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createTime;
    /**
     * 更新人
     */
    @ApiModelProperty(value = "更新人")
    private Long updateUser;
    /**
     * 修改时间
     */
    @ApiModelProperty(value = "修改时间")
    private LocalDateTime updateTime;
    /**
     * 删除状态
     */
    @ApiModelProperty(value = "删除状态")
    private Boolean isDeleted;
    /**
     * 创建部门
     */
    @ApiModelProperty(value = "创建部门")
    private Long createDept;
    /**
     * 是否启用
     */
    @ApiModelProperty(value = "是否启用")
    private Integer status;
    /**
     * 设备编号
     */
    @ApiModelProperty(value = "设备编号")
    private Long outreachId;


}
