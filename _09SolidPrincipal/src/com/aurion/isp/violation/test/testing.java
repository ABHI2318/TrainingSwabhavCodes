package com.aurion.isp.violation.test;

import com.aurion.isp.violation.model.Human;
import com.aurion.isp.violation.model.IWorker;
import com.aurion.isp.violation.model.Robot;

public class testing {

	public static void main(String[] args) {
	IWorker human=new Human();
	IWorker robot=new Robot();
	
	
	human.drink();
	human.eat();
	human.startWork();
	human.stopWork();
	
	robot.chargfe();
	robot.startWork();
	robot.stopWork();
	}

}