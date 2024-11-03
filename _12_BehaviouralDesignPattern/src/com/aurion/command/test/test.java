package com.aurion.command.test;

import com.aurion.command.model.ICommand;
import com.aurion.command.model.Receiver_Light;
import com.aurion.command.model.RemoteControl;
import com.aurion.command.model.TurnOffLight;
import com.aurion.command.model.TurnOnLight;

public class test {

	public static void main(String[] args) {
		Receiver_Light light=new Receiver_Light();
		ICommand turnoff=new TurnOffLight(light);
		ICommand turnon=new TurnOnLight(light);
		
		RemoteControl remote =new RemoteControl();
	   remote.setCommand(turnon);
	   remote.pressbutton();
	   
	   remote.setCommand(turnoff);
	   remote.pressbutton();
	}

}
