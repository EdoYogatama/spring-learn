package com.yogatama.edo.springlearn.Main.ex1;

import java.util.Arrays;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.yogatama.edo.springlearn.Business.MyBusinessClass;
import com.yogatama.edo.springlearn.Game.IGame;
import com.yogatama.edo.springlearn.Game.PacmanGame;
import com.yogatama.edo.springlearn.Runner.GameRunner;

@Configuration
@ComponentScan("com.yogatama.edo.springlearn.Business")
public class DepInjectLauncher {

	public static void main(String[] args) {
		try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DepInjectLauncher.class)) {
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			System.out.println(context.getBean(MyBusinessClass.class));
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
