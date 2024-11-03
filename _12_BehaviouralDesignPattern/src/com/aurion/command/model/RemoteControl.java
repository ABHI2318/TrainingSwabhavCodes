package com.aurion.command.model;

public class RemoteControl {
	private ICommand command;

	public void  setCommand(ICommand command) {
		
		this.command = command;
	}
	
	public void pressbutton() {
		command.execute();
	}

}
