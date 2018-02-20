package org.epsi.pointbreak;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class PointBreakApplication {
	
	public static ConfigurableApplicationContext context;

	public static void main(String[] args) {
		SpringApplication.run(PointBreakApplication.class, args);
		context = new ClassPathXmlApplicationContext("applicationContext.xml");
	}

}
