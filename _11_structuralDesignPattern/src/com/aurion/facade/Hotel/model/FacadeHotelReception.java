package com.aurion.facade.Hotel.model;

public class FacadeHotelReception {
	 public void getIndianMenu() {
		 IHotel indianhotel=new IndianHotel();
		 IMenu menu=indianhotel.getMenu();
		 menu.displaymenu();
		 }
	 
	 public void getItalianmenu() {
		 IHotel italianmenu=new ItalianHotel();
		 IMenu menu=italianmenu.getMenu();
		 menu.displaymenu();
	 }

}
