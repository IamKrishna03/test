package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Datafactory.Data_factory;

public class Signup extends Data_factory {
	static WebDriver driver;
	static WebElement mrradio;
	static WebElement msradio;
	static WebElement spass;
	static WebElement checkbox1;
	static WebElement checkbox2;
	static WebElement ftname;
	static WebElement ltname;
	static WebElement cname;
	static WebElement add1 ;
	static WebElement add2;
	static WebElement states;
	static WebElement cities;
	static WebElement zipcode;
	static WebElement mobno;
	static WebElement datedrp;
	static WebElement monthdrp;
	static WebElement yeardrp;
	static WebElement countrydrp;
	static WebElement createacc;
	static WebElement ltext;
	static WebElement luser;
	

	


	
	static void signupelems () {
		 mrradio = driver.findElement(By.id("id_gender1"));
		 msradio = driver.findElement(By.id("id_gender2"));
		 spass  = driver.findElement(By.id("password"));
		 checkbox1 = driver.findElement(By.cssSelector("label[for=\"newsletter\"]"));
		 checkbox2 = driver.findElement(By.cssSelector("label[for=\"optin\"]"));
		 ftname = driver.findElement(By.id("first_name"));
		 ltname = driver.findElement(By.id("last_name"));
		 cname = driver.findElement(By.id("company"));
		 add1 = driver.findElement(By.id("address1"));
		 add2 = driver.findElement(By.id("address2"));
		 states = driver.findElement(By.id("state"));
		 cities = driver.findElement(By.id("city"));
		 zipcode = driver.findElement(By.id("zipcode"));
		 mobno = driver.findElement(By.id("mobile_number"));
		 datedrp = driver.findElement(By.id("days"));
		 monthdrp = driver.findElement(By.id("months"));
		 yeardrp = driver.findElement(By.id("years"));
		 countrydrp = driver.findElement(By.id("country"));
		 createacc = driver.findElement(By.className("btn-default"));
		 
	}
	
	
	static void verifytitle(String expectedtitle) {
		String actualtitle = driver.getTitle();
		if (expectedtitle.equals(actualtitle)) {
			System.out.println("correct title");
		} else {
			System.out.println("invalid title");
		}
	}
	
	static void accountinfo(String day, String month , String year , String pass) {
		
		mrradio.click();
		spass.click();
		spass.sendKeys(pass);
		Select days = new Select(datedrp);
		days.selectByVisibleText(day);
		Select months = new Select(monthdrp);
		months.selectByVisibleText(month);
		Select years = new Select(yeardrp);
		years.selectByVisibleText(year);
		checkbox1.click();
		checkbox2.click();
		 

	}

	static void adrsinfo(String fname, String lname, String company, String adress, String adress2 , String country ,String state ,String city , String zip , String mono) {

		ftname.click();
		ftname.sendKeys(fname);

		ltname.click();
		ltname.sendKeys(lname);

		cname.click();
		cname.sendKeys(company);

		add1.click();
		add1.sendKeys(adress);

		add2.click();
		add2.sendKeys(adress2);

		Select countriesdrp = new Select(countrydrp);
		countriesdrp.selectByVisibleText(country);
		
		states.click();
		states.sendKeys(state);
		
		cities.click();
		cities.sendKeys(city);
		
		zipcode.click();
		zipcode.sendKeys(zip);
		
		mobno.click();
		mobno.sendKeys(mono);
		
	}
	
	static void Createacc() {
		createacc.click();
	}

}
