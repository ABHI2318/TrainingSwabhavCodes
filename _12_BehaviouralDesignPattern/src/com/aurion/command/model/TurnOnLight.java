package com.aurion.command.model;

public class TurnOnLight implements ICommand {
	private Receiver_Light light;

	public TurnOnLight(Receiver_Light light) {
		
		this.light = light;
	}

	@Override
	public void execute() {
		light.turnOn();
		
	}

}
