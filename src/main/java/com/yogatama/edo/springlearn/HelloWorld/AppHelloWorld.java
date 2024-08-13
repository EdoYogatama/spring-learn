package com.yogatama.edo.springlearn.HelloWorld;

import java.util.Arrays;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

public class AppHelloWorld {

	public static void main(String[] args) {
		try (
//			Launch Spring Context
		GenericApplicationContext context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)) {
//			Retrieve Beans
//			
//			Configure Managable item - 
//			HelloWorldConfiguration - @Configuration
//			name - @Bean
			
//			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			System.out.println(context.getBean("name"));
			System.out.println(context.getBean("age"));
			System.out.println(context.getBean("person"));
			System.out.println(context.getBean("address2"));
			
			System.out.println(context.getBean("person2MethodCall"));
			System.out.println(context.getBean("person3Parameters"));
			System.out.println(context.getBean("person4Parameters"));
			System.out.println(context.getBean("person5Qualifier"));
			System.out.println(context.getBean(Person.class));
			System.out.println(context.getBean(Address.class));
		} catch (BeansException e) {
			e.printStackTrace();
		}

	}

}
