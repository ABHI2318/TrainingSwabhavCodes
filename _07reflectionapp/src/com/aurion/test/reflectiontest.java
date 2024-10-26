package com.aurion.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class reflectiontest {

	public static void main(String[] args) {
		try {
			Class stringClass=Class.forName("java.lang.String");
			System.out.println(stringClass.getName());
			System.out.println(stringClass.getSimpleName());
			System.out.println(stringClass.getCanonicalName());
			
			Constructor stringConstructor[]=stringClass.getConstructors();
			
			for(Constructor constructor:stringConstructor) {
				System.out.println(constructor.getName()+" "+constructor.getParameterCount());
				Parameter parameters[]=constructor.getParameters();
				for(Parameter parameter:parameters)
					System.out.println(parameter.getName()+ "  "+parameter.getType());
			}
			Method stringMethod[]=stringClass.getMethods();
			for(Method method:stringMethod) {
				System.out.println(method.getName()+"  "+method.getParameterCount());
				Parameter parameters[]=method.getParameters();
				for(Parameter parameter:parameters)
					System.out.println(parameter.getName()+ "  "+parameter.getType());
			}
			
		}
		catch(ClassNotFoundException e){
			e.printStackTrace();
			
		}
		

	}

}
