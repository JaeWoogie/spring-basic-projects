package com.spring.fun;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		//load spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve the bean from xml
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		//call the bean
		System.out.println(theCoach.getDailyWorkout());
		
		//call fortune service
		System.out.println(theCoach.getDailyFortune());
		
		//close the context
		context.close();
	}
}
