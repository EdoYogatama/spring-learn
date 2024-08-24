package com.yogatama.edo.springlearn;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.yogatama.edo.springlearn.engine.DbService;

@Configuration
@ComponentScan
public class AppMain {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppMain.class);
		System.out.println(context.getBean(DbService.class).findMax());
	}

}
