package com.example.service.annotation;

import com.example.service.annotation.DummyAnnotation.Authorization;

public class App {
	
	@DummyAnnotation( permission = Authorization.UPDATE)
	public void method1(){
		System.out.println("this is updated annotation is used");
	}

	
	@DummyAnnotation( permission = Authorization.READ)
	public void method2(){
		System.out.println("this is read annotation is used");
	}
}
