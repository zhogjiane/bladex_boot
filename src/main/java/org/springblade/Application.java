
package org.springblade;

import org.springblade.common.constant.LauncherConstant;
import org.springblade.core.launch.BladeApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * 启动器
 *
 * @author Chill
 */
@EnableScheduling
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		BladeApplication.run(LauncherConstant.APPLICATION_NAME, Application.class, args);
	}

}

