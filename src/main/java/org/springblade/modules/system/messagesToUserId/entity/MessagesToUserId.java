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
package org.springblade.modules.system.messagesToUserId.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springblade.core.mp.base.TenantEntity;

import java.io.Serializable;

/**MessagesToUserId
 * 实体类
 *
 * @author Blade
 * @since 2022-02-26
 */
@Data
@TableName("MessagesToUserId")
@ApiModel(value = "Messagestouserid对象", description = "Messagestouserid对象")
public class MessagesToUserId extends TenantEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @ApiModelProperty(value = "id")
    private String id;
    /**
     * message  ID
     */
    @ApiModelProperty(value = "message  ID")
    private String messagesId;
    /**
     * toUserId
     */
    @ApiModelProperty(value = "toUserId")
    private String toUserId;


}
