package test;

import java.util.Scanner;

import com.aurion.model.CarDemoModel;

public class CarTestApp {

	public static void main(String[] args) {
		
		CarDemoModel car=new CarDemoModel();
		Scanner scanner=new Scanner(System.in);
		System.out.println("car details----- ");
        car.color="wevf";
        System.out.println(car.color);
		
		car.accelrate(45);
		System.out.println("the new speed of car is "+car.speed);
		
		
		
	    
	}

}
