package spring_01_demo.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {

		// read spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// get the bean from spring container // Explicit component name
		Coach theCoach = context.getBean("thatSillyCoach", Coach.class);
		
		// Default component name mapping
//		Coach theCoach = context.getBean("cricketCoach", Coach.class);

		// call a method on the bean
		System.out.println(theCoach.getDailyWorkout());

		// close the context
		context.close();

	}

}