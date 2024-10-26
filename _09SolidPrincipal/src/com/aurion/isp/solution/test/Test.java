package com.aurion.isp.solution.test;

import com.aurion.isp.solution.model.Human;
import com.aurion.isp.solution.model.IWorker;
import com.aurion.isp.solution.model.Robot;
import com.aurion.isp.solution.model.IRobot;

public class Test {

	public static void main(String[] args) {
		IWorker human=new Human();
		IRobot robot=new Robot();
		
		human.drink();
		human.eat();
		
		
	
		robot.startwork();
		robot.stopwork();

	}

}
