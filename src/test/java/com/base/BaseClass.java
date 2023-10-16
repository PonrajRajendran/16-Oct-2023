package com.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	protected static WebDriver driver;
	WebElement findElement;
	XSSFWorkbook WB;
	XSSFSheet sheet;
	
	
	public void Browserlaunch (String browserName) {
		switch(browserName) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			 driver= new ChromeDriver();
			 break;
		case"edge":
			WebDriverManager.edgedriver().setup();
			driver= new EdgeDriver();
			break;
		}
			 driver.manage().window().maximize();
			 driver.manage().deleteAllCookies();
			 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}
	//to enter text
	public void typeText (WebElement element, String value) {
		element.sendKeys(value);
		
	}

	public void typeText1 (WebElement element,boolean no) {
		element.sendKeys("value");
		}
	
public void cleartext(WebElement elemnet) {
	elemnet.clear();
}
//to locate the web element
public WebElement locator(String locatorName,String value) {
	switch (locatorName) {
	case"id":
	 findElement = driver.findElement(By.id(value) );
	 break;
	 
	case"name":
	
	 findElement = driver.findElement(By.name(value) );
	 break;
	case"xpath":
		 findElement = driver.findElement(By.xpath(value) );
		break;
	}
	return findElement;}
//to click button
public void btnclick(WebElement element) {
	element.click();}

//to launchurl
public void launchUrl (String url) {
driver.get(url);
}


public String readExcelData(String sheetName, int rowIdx, int colIdx) throws IOException {
	String filePath="D:\\Maven.xlsx";
    FileInputStream fileInputStream = new FileInputStream(new File(filePath));

    WB = new XSSFWorkbook(fileInputStream);
    sheet = WB.getSheet(sheetName);

    Row row = sheet.getRow(rowIdx);
    if (row == null) {
        return null;  // Row does not exist
    }

    Cell cell = row.getCell(colIdx);
    if (cell == null) {
        return null;  // Cell does not exist in the specified row
    }

    switch (cell.getCellType()) {
        case STRING:
            return cell.getStringCellValue();

        case BOOLEAN:
            return String.valueOf(cell.getBooleanCellValue());

        case NUMERIC:
            if (DateUtil.isCellDateFormatted(cell)) {
                Date dcv = cell.getDateCellValue();
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                return dateFormat.format(dcv);
            } else {double ncv = cell.getNumericCellValue();
			long round = Math.round(ncv);
			if(round==ncv) {
				String valueOf = String.valueOf(round);
				return valueOf;}
               
            }

        default:
            return null;  // Unsupported cell type
    }
}
public void DropDown (WebElement element, int loc) {
	
	Select S= new Select(element);
	S.selectByIndex(loc);
	
}
public void DropDownvisibletext (WebElement location, String value) {
	Select S= new Select(location);
	S.selectByVisibleText(value);
	
}
public void DropDownvalue (String element, String value) {
	WebElement singleSelect  = driver.findElement(By.xpath(element));
	Select S= new Select(singleSelect);
	S.selectByValue(value);
	
}

public static void screeShort(String location) throws IOException {
	TakesScreenshot ts= (TakesScreenshot) driver;
	File source =ts.getScreenshotAs(OutputType.FILE);
	File target = new File(location);
	FileUtils.copyFile(source, target);
	 
		
}

	
	
	
}



