package com.aurion.PolyOverideTest;

import com.aurion.PolyOverideModel.OverideBase;
import com.aurion.PolyOverideModel.Child;

public class OverideTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverideBase obj=new OverideBase();
		obj.base();
		
		OverideBase obj2=new Child();
		obj2.base();

	}

}
