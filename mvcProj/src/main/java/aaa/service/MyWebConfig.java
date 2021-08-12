package aaa.service;

import javax.annotation.Resource;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Configuration
public class MyWebConfig implements WebMvcConfigurer {

	@Resource
	EventIntercep intercep;
	
	@Resource
	AdminIntercep adminIntercep;
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		// TODO Auto-generated method stub
		//WebMvcConfigurer.super.addInterceptors(registry);
		
		System.out.println("MyWebConfig.addInterceptors() 실행");  //서버 가동시 실행
		
		
		//이벤트
		registry.addInterceptor(intercep).addPathPatterns("/intercep/event");
		
		//관리자
		registry.addInterceptor(adminIntercep).
		addPathPatterns("/admin/**")				//적용
		.excludePathPatterns("/admin/login");		//적용 예외
		
	}
	
	
	
}
