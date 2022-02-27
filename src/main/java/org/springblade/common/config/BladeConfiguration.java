
package org.springblade.common.config;


import org.springblade.core.secure.registry.SecureRegistry;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Blade配置
 *
 * @author Chill
 */
@Configuration
public class BladeConfiguration implements WebMvcConfigurer {

	@Bean
	public SecureRegistry secureRegistry() {
		SecureRegistry secureRegistry = new SecureRegistry();
		secureRegistry.setEnabled(true);
		secureRegistry.excludePathPatterns("/blade-auth/**");
		secureRegistry.excludePathPatterns("/blade-system/menu/auth-routes");
		secureRegistry.excludePathPatterns("/blade-system/tenant/info");
		secureRegistry.excludePathPatterns("/doc.html");
		secureRegistry.excludePathPatterns("/js/**");
		secureRegistry.excludePathPatterns("/webjars/**");
		secureRegistry.excludePathPatterns("/swagger-resources/**");
		return secureRegistry;
	}

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/js/**").addResourceLocations("classpath:/js/");
		registry.addResourceHandler("doc.html")
			.addResourceLocations("classpath:/META-INF/resources/");
		registry.addResourceHandler("/webjars/**")
			.addResourceLocations("classpath:/META-INF/resources/webjars/");
	}

}
