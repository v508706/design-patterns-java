package com.designpattern.structural.facade;

public class VegRestaurant implements Hotel
{
	public Menus getMenus()
	{
		VegMenu v = new VegMenu();
		return v;
	}
}
