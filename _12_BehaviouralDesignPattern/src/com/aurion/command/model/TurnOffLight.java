package com.aurion.command.model;

public class TurnOffLight implements ICommand{
   
	private Receiver_Light light;
	public TurnOffLight(Receiver_Light light) {
	
		this.light = light;
	}
	@Override
	public void execute() {
		light.turnOff();
		
	}

}
