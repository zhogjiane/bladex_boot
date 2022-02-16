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
package org.springblade.modules.system.internshipFileSubmit.vo;

import org.springblade.modules.system.internshipFileSubmit.entity.InternshipFileSubmit;
import lombok.Data;
import lombok.EqualsAndHashCode;
import io.swagger.annotations.ApiModel;

/**
 * 实习材料提交表视图实体类
 *
 * @author Blade
 * @since 2022-02-15
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "InternshipFileSubmitVO对象", description = "实习材料提交表")
public class InternshipFileSubmitVO extends InternshipFileSubmit {
	private static final long serialVersionUID = 1L;

}
