package com.example.service.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class DummyAnnotationReadPostProcessor {
	
	public static void main(String[] args) {
		
		Class<DummyAnnotation> cls=DummyAnnotation.class;
		Class<App> clz=App.class;
		
		DummyAnnotation annotation = clz.getAnnotation(DummyAnnotation.class);
		System.out.println(annotation);
		
		/*Annotation[] annotations = cls.getAnnotations();
		for (Annotation annotation2 : annotations) {
			System.out.println(annotation2);
		}
		if(cls.isAnnotation()) {
			System.out.println(true);
		}	
		
		Method[] methods = cls.getDeclaredMethods();
		
		for (Method method : methods) {
			System.out.println(method.toString());
		}*/
		
		if(clz.isAnnotationPresent(DummyAnnotation.class)){
			DummyAnnotation annotation2 = clz.getAnnotation(DummyAnnotation.class);
			DummyAnnotation dummy=(DummyAnnotation) annotation2;
			System.out.println(dummy.permission());
		}
		
		
	}
}
