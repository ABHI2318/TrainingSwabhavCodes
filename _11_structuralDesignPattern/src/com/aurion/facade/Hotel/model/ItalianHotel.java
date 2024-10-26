package com.aurion.facade.Hotel.model;

public class ItalianHotel implements IHotel {

	@Override
	public IMenu getMenu() {
		return new ItalianMenu();
	}

}
