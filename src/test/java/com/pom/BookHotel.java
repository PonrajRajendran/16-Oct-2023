package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class BookHotel extends BaseClass{
	public BookHotel() {
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//input[@name='first_name']")
	private WebElement Firstname;
	@FindBy(xpath="//input[@name='last_name']")
	private WebElement LastName;
	@FindBy(xpath="//textarea[@name='address']")
	private WebElement Adress;
	@FindBy(xpath="//input[@name='cc_num']")
	private WebElement cerdicardno;
	@FindBy(xpath="//select[@name='cc_type']")
	private WebElement cardType;
	@FindBy(xpath="//select[@name='cc_exp_month']")
	private WebElement ExpiryMonth;
	@FindBy(xpath="//select[@name='cc_exp_year']")
	private WebElement Expiryyear;
	@FindBy(xpath="//input[@name='cc_cvv']")
	private WebElement CVVNO;
	@FindBy(xpath="//input[@name='book_now']")
	private WebElement Book;
	public WebElement getFirstname() {
		return Firstname;
	}
	public WebElement getLastName() {
		return LastName;
	}
	public WebElement getAdress() {
		return Adress;
	}
	public WebElement getCerdicardno() {
		return cerdicardno;
	}
	public WebElement getCardType() {
		return cardType;
	}
	public WebElement getExpiryMonth() {
		return ExpiryMonth;
	}
	public WebElement getExpiryyear() {
		return Expiryyear;
	}
	public WebElement getCVVNO() {
		return CVVNO;
	}
	public WebElement getBook() {
		return Book;
	}
	
	

}
