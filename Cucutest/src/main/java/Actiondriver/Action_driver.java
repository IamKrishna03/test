package Actiondriver;

import org.openqa.selenium.WebElement;

import Datafactory.Data_factory;

public class Action_driver extends Data_factory {
	
	public String gettitle () {
			System.out.println();
			String actualtitle = driver.getTitle();
			return actualtitle;
		}
		
	public String verifytitle(String exptitle) 
	{
		String actualtitle = driver.getTitle();
		if(actualtitle.equals(exptitle)) {
			System.out.println("Title matched");
		}else {
			System.out.println("Title not matched");
		}
		return actualtitle;
	}
		
	public String verifyurl(String expurl)
	{
			String actualurl = driver.getCurrentUrl(); 
			if(actualurl.equals(expurl)) {
				System.out.println("Url matched");
			}else {
				System.out.println("Url not matched");
			}
			return actualurl;
	}
		
	public void writedata (WebElement el , String data) 
	{
			if (el.isEnabled() && el.isDisplayed()) {
				el.click();
				el.sendKeys(data);
			}
			else {
				System.out.println("NO element found");
			}
	}
		
	public void clickbtn (WebElement el)
	{
			el.click();
	}
		


}
