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
package org.springblade.modules.productServiceRecordems.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 产品服务台账实体类
 *
 * @author Blade
 * @since 2022-02-27
 */
@Data
@TableName("svc_product_service_record")
@ApiModel(value = "ProductServiceRecord对象", description = "产品服务台账")
public class ProductServiceRecord implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 产品服务台账主键
     */
    @ApiModelProperty(value = "产品服务台账主键")
    private Long id;
    /**
     * 产品信息主键
     */
    @ApiModelProperty(value = "产品信息主键")
    private Long productInfoId;
    /**
     * 产品型号
     */
    @ApiModelProperty(value = "产品型号")
    private String productModel;
    /**
     * 场内编号
     */
    @ApiModelProperty(value = "场内编号")
    private String productNumber;
    /**
     * 用户编号
     */
    @ApiModelProperty(value = "用户编号")
    private String customerNumber;
    /**
     * 出厂时间
     */
    @ApiModelProperty(value = "出厂时间")
    private LocalDateTime manufactureTime;
    /**
     * 交付时间
     */
    @ApiModelProperty(value = "交付时间")
    private LocalDateTime deliveryTime;
    /**
     * 启用时间
     */
    @ApiModelProperty(value = "启用时间")
    private LocalDateTime startUseTime;
    /**
     * 使用单位ID
     */
    @ApiModelProperty(value = "使用单位ID")
    private Long customerId;
    /**
     * 使用单位名称
     */
    @ApiModelProperty(value = "使用单位名称")
    private String customerName;
    /**
     * 所属国家
     */
    @ApiModelProperty(value = "所属国家")
    private Boolean country;
    /**
     * 商保期限,月
     */
    @ApiModelProperty(value = "商保期限,月")
    private String warrantyPeriod;
    /**
     * 经度
     */
    @ApiModelProperty(value = "经度")
    private String longitude;
    /**
     * 纬度
     */
    @ApiModelProperty(value = "纬度")
    private String latitude;
    /**
     * 产品位置
     */
    @ApiModelProperty(value = "产品位置")
    private String productAddress;
    /**
     * 运营状态 1正常,2停用
     */
    @ApiModelProperty(value = "运营状态 1正常,2停用")
    private Boolean useStatus;
    /**
     * 密级,0公开,1秘密,2机密,3绝密
     */
    @ApiModelProperty(value = "密级,0公开,1秘密,2机密,3绝密")
    private Boolean securityLevel;
    /**
     * 备注
     */
    @ApiModelProperty(value = "备注")
    private String remark;
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
    /**
     * 产品型号名称
     */
    @ApiModelProperty(value = "产品型号名称")
    private String productName;


}
