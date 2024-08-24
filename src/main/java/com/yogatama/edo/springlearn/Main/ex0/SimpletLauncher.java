package com.yogatama.edo.springlearn.Main.ex0;

import java.util.Arrays;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.yogatama.edo.springlearn.Game.IGame;
import com.yogatama.edo.springlearn.Game.PacmanGame;
import com.yogatama.edo.springlearn.Runner.GameRunner;

@Configuration
@ComponentScan
public class SimpletLauncher {

	public static void main(String[] args) {
		try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SimpletLauncher.class)) {
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
