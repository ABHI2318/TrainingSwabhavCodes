package com.aurion.model.Smartphone;

public class SmartPhone implements Camera,MusicPlayer,Phone {

	@Override
	public void makecall(String n) {
		System.out.println("making call"+n);
		
	}

	@Override
	public void endcall() {
		System.out.println("ending the call");
	}

	@Override
	public void playmusic() {
		System.out.println("playing the music");
		
	}

	@Override
	public void stopmusic() {
		System.out.println("stopr the music "); 
		
	}

	@Override
	public void takepicture() {
		System.out.println("take pic");
	}

	@Override
	public void recordvideo() {
		System.out.println("record video ");
		
	}

}
