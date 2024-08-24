package com.yogatama.edo.springlearn.Business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyBusinessClass {
	Dependency1 dependency1;
	Dependency2 dependency2;
	
//	@Autowired
	public MyBusinessClass(Dependency1 dependency1, Dependency2 dependency2) {
		System.out.println("Constructor Injection - MyBusinessClass");	
		this.dependency1 = dependency1;
		this.dependency2 = dependency2;
	}
	
//	@Autowired
//	public void setDep1(Dependency1 dependency1) {
//		System.out.println("Setter Injection - Dependency 1");
//		this.dependency1 = dependency1;
//	}
//	
//	@Autowired
//	public void setDep2(Dependency2 dependency2) {
//		System.out.println("Setter Injection - Dependency 2");
//	}
	
	@Override
	public String toString() {
		return "MyBusinessClass [dependency1=" + dependency1 + ", dependency2=" + dependency2 + "]";
	}
}
