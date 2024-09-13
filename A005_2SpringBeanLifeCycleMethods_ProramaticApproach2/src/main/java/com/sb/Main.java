package com.sb;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		Motor motor = context.getBean(Motor.class);
		motor.doWork();
		// by default start method call but stop won't call
		// for removing container (before removing container object removed)
		ConfigurableApplicationContext cfgcontext = (ConfigurableApplicationContext) context;
		cfgcontext.registerShutdownHook();

	}

}
