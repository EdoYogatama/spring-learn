package com.yogatama.edo.springlearn.Main;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.yogatama.edo.springlearn.Game.IGame;
import com.yogatama.edo.springlearn.Runner.GameRunner;

public class AppGameSpringBean {

	public static void main(String[] args) {
		try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(GamingConfiguration.class)) {
			context.getBean(IGame.class).up();
			context.getBean(GameRunner.class).run();
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
