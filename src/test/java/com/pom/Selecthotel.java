package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class Selecthotel extends BaseClass {
public Selecthotel() {
	PageFactory.initElements(driver,this);
}
	
	@FindBy(xpath="//input[@name='radiobutton_0']")
	private WebElement select;
	@FindBy(xpath="//input[@name='continue']")
	private WebElement continuepage;
	public WebElement getSelect() {
		return select;
	}
	public WebElement getContinuepage() {
		return continuepage;
	}
	
}
