package com.aurion.test;

import com.aurion.model.BuilderPatternmodel;
import com.aurion.model.PhoneBuilder;

public class BuilderTest {

	public static void main(String[] args) {
		PhoneBuilder phone=new BuilderPatternmodel().setBattery(23).getPhone();
		System.out.println(phone);
	}

}
