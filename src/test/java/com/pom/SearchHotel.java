package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class SearchHotel extends BaseClass {
	public SearchHotel() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//select[@class='search_combobox']")
private WebElement location;
	@FindBy(xpath="//select[@id='hotels']")
private WebElement hotel;
	@FindBy(xpath="//select[@id='room_type']")
private WebElement roomtype;
	@FindBy(xpath="//select[@id='room_nos']")
	private WebElement noofrooms;
	
	@FindBy(xpath="//input[@name='datepick_in']")
private WebElement checkindate;
	@FindBy(xpath="//input[@name='datepick_out']")
	private WebElement Checkoutdata;
	@FindBy(xpath="//Select[@name='adult_room']")
private WebElement adultsroom;
	@FindBy(xpath="//Select[@name='child_room']")
private WebElement childroom;
	
	@FindBy(xpath="//input[@name='Submit']")
private WebElement Search;
	
public WebElement getLocation() {
	return location;
}

public WebElement getHotel() {
	return hotel;
}


public WebElement getRoomtype() {
	return roomtype;
}
public WebElement getNoofrooms() {
	return noofrooms;
}

public WebElement getCheckindate() {
	return checkindate;
}

public WebElement getCheckoutdata() {
	return Checkoutdata;
}

public WebElement getAdultsroom() {
	return adultsroom;
}

public WebElement getChildroom() {
	return childroom;
}


public WebElement getSearch() {
	return Search;
}


}
