package com.yogatama.edo.springlearn.Main;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.yogatama.edo.springlearn.Game.IGame;
import com.yogatama.edo.springlearn.Game.PacmanGame;
import com.yogatama.edo.springlearn.Runner.GameRunner;

@Configuration
@ComponentScan("com.yogatama.edo.springlearn.Game")
@ComponentScan("com.yogatama.edo.springlearn.Runner")
public class AppLauncer {

	public static void main(String[] args) {
		try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppLauncer.class)) {
			context.getBean(IGame.class).up();
			context.getBean(GameRunner.class).run();
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
