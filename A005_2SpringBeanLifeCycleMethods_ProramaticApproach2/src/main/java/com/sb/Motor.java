package com.sb;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Motor implements InitializingBean, DisposableBean	 {
	public Motor () {
		System.out.println(" Motor :: Constructor");
	}
	public void doWork () {
		System.out.println(" Motor pulling water...");
	}

	public void destroy() throws Exception {
		System.out.println(" Motor stopped...");
		
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println(" Motor Started...");
	}

}
