package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Actiondriver.Action_driver;
import Datafactory.Data_factory;
public class Header extends Data_factory {
	
	static WebElement searchbox;
	static WebElement searchbtn;

	static Action_driver ad = new Action_driver();

	public static void verifytitle(String exptitle) {
		System.out.println(ad.verifytitle(exptitle));
	}
	
	public static void verifyurl (String expectedurl) {
		System.out.println(ad.verifyurl(expectedurl));
	}
	
	public static void add_data (String data) {
		searchbox = driver.findElement(By.name("q"));
		ad.writedata(searchbox, data);
		
	}
	
	public static void search () {
		searchbtn = driver.findElement(By.name("btnK"));
		ad.clickbtn(searchbtn);
	}
	
	
	 
	 
	
}
