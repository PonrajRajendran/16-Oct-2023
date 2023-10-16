package org.stepdifinitions;

import java.io.IOException;
import org.openqa.selenium.WebElement;

import com.base.BaseClass;
import com.pom.BookHotel;
import com.pom.LoginPage;
import com.pom.SearchHotel;
import com.pom.Selecthotel;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AdactinHotelAutomation extends BaseClass{
	
	@Given("launch the browser and adacting hotel url")
	public void launch_the_browser_and_adacting_hotel_url() {
	    Browserlaunch("chrome");
	    launchUrl("https://adactinhotelapp.com/");
	}
	@When("user enters username and password and login")
	public void user_enters_username_and_password_and_login() throws IOException {
    LoginPage a1=new LoginPage();
    String data1 = readExcelData("sheet1", 0, 0);
	    WebElement username = a1.getUsername();
	    a1.typeText(username, data1);
	    String data2 = readExcelData("sheet1", 1, 0);
	    WebElement password = a1.getPassword();
    a1.typeText(password, data2);
	    WebElement login = a1.getLogin();
    a1.btnclick(login);
	}
	

	@When("get all the input from Excell file")
	public void get_all_the_input_from_excell_file() throws IOException {
	 SearchHotel a2=new SearchHotel();
	 WebElement location = a2.getLocation();
	 //a2.DropDown(location, 1);
 String loc = readExcelData("Search", 0, 0);
a2.DropDownvisibletext(location, loc);
	WebElement hotel = a2.getHotel();
	
	//a2.DropDown(hotel, 2);
String hot = readExcelData("Search", 1, 0);
System.out.println(hot);
a2.DropDownvisibletext(hotel, hot);
	WebElement roomtype = a2.getRoomtype();
	//a2.DropDown(roomtype, 2);
String type = readExcelData("Search", 2, 0);

a2.DropDownvisibletext(roomtype, type);
	WebElement noofrooms = a2.getNoofrooms();
	//a2.DropDown(noofrooms, 2);
	String noroom = readExcelData("Search", 3, 0);
a2.DropDownvisibletext(noofrooms, noroom);
	WebElement checkindate = a2.getCheckindate();
	a2.cleartext(checkindate);
	
	String indate = readExcelData("Search", 4, 0);
System.out.println(indate);
a2.typeText(checkindate, indate);
	WebElement checkoutdata = a2.getCheckoutdata();
	a2.cleartext(checkoutdata);
	String outdate = readExcelData("Search", 5, 0);
	a2.typeText(checkoutdata, outdate);
	WebElement adultsroom = a2.getAdultsroom();
	//a2.DropDown(adultsroom, 2);
	
String adult = readExcelData("Search", 6, 0);
a2.DropDownvisibletext(adultsroom, adult);
	WebElement childroom = a2.getChildroom();
	//a2.DropDown(childroom, 0);
String child = readExcelData("Search", 7, 0);
a2.DropDownvisibletext(childroom, child);
	WebElement search = a2.getSearch();
	a2.btnclick(search);

	Selecthotel a3=new Selecthotel();
	WebElement select = a3.getSelect();
	a3.btnclick(select);
	WebElement continuepage = a3.getContinuepage();
	a3.btnclick(continuepage);
	
	//book A hotel
	BookHotel a4 =new BookHotel();
	WebElement firstname = a4.getFirstname();
	String name = readExcelData("Book", 0, 0);
	System.out.println(name);
	a4.typeText(firstname, name);
	WebElement lastName = a4.getLastName();
	String last = readExcelData("Book", 1, 0);
	a4.typeText(lastName, last);
	WebElement adress = a4.getAdress();
	String addr = readExcelData("Book", 2, 0);
	a4.typeText(adress, addr);
	WebElement cerdicardno = a4.getCerdicardno();
	String cardno = readExcelData("Book", 3, 0);
	a4.typeText(cerdicardno, cardno);
	WebElement cardType = a4.getCardType();
	String type1 = readExcelData("Book", 4, 0);
	a4.DropDownvisibletext(cardType, type1);
	WebElement expiryMonth = a4.getExpiryMonth();
	String month = readExcelData("Book", 5, 0);
	a4.DropDownvisibletext(expiryMonth, month);
	WebElement expiryyear = a4.getExpiryyear();
	String year = readExcelData("Book",6, 0);
	System.out.println(year);
	a4.DropDownvisibletext(expiryyear, year);
	WebElement cvvno = a4.getCVVNO();
	String no = readExcelData("Book", 7, 0);
	a4.typeText(cvvno, no);
	WebElement book = a4.getBook();
	a4.btnclick(book);
	
	
	
	}

	
	

//	@When("user enters username {string}  and password {string} and login")
//	public void user_enters_username_and_password_and_login(String string, String string2) {
//		 LoginPage a1=new LoginPage();
//		    
//		    WebElement username = a1.getUsername();
//		    a1.typeText(username, string);
//	  WebElement password = a1.getPassword();
//		    a1.typeText(password, string2);
//		    WebElement login = a1.getLogin();
//		    a1.btnclick(login);
//	}
//





	@Then("take screenshot and exit")
	public void take_screenshot_and_exit() throws IOException {
	   screeShort("D:\\eclipse-workspace\\CucumberProject\\target\\screenshort.png");
	}



}
