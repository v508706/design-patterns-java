package com.designpattern.structural.facade;

public class Client
{
	public static void main (String[] args)
	{
		HotelKeeper keeper = new HotelKeeper();
		
		VegMenu v = keeper.getVegMenu();
		v.getMenus();
		NonVegMenu nv = keeper.getNonVegMenu();
		nv.getMenus();
		Both b= keeper.getVegNonMenu();
		b.getMenus();

	}
}
