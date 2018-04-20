package com.appleyk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * 
 * 下面是一个典型的结构：
 * 
 * com +- example +- myproject +- Application.java --
 * 注意这个位置，习惯性的放在项目的一开始，也就是根包的第一层 | + - domain | +- Customer.java | +-
 * CustomerRepository.java | + - service | +- CustomerService.java | + - web +-
 * CustomerController.java
 * 
 * 
 * 文件将声明 main 方法， 还有基本的 @Configuration
 * 
 * @author yukun24@126.com
 * @date 2018年4月20日13:05:36
 */
@SpringBootApplication// same as @Configuration @EnableAutoConfiguration  @ComponentScan	
public class Application extends SpringBootServletInitializer{

	/**
	 * SpringApplication类提供了一种从main()方法启动Spring应用的便捷方式。 在很多情况下， 你只需委托给
	 * SpringApplication.run这个静态方法：
	 * 
	 * @param args
	 */

	public static void  main(String[] args) {
        		
		SpringApplication.run(Application.class, args);
			
	}	
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(Application.class);
	}
}
