package Datafactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Data_factory {
	
	//import java.util.Properties; import this package for properties
	public static Properties prop;
	
	public static WebDriver driver;

	
	public static void loadconfig () throws IOException
	{
		prop = new Properties ();
		System.out.println("load config exe");
		// till the line user.dir we get pre path then path of file
		String path = System.getProperty("user.dir") + "/src/test/resources/config.properties";
		// to load file create file input stream obj
		FileInputStream fis = new FileInputStream(path);
		// to load file
		prop.load(fis);
		System.out.println("load config exeted >");
	}
	
	@SuppressWarnings({ "deprecation", "deprecation" })
	public static void setup () 
	{
		System.out.println("executeing");
		 String browser = prop.getProperty("browsername");
		 System.out.println(browser);
		 
		if(browser.equalsIgnoreCase("chrome")) 
			
		{
			WebDriverManager.chromedriver().setup();
			// import this "import org.openqa.selenium.chrome.ChromeDriver;"
			driver = new ChromeDriver();
			System.out.println(browser + "got");
		}
		else if(browser.equalsIgnoreCase("Firefox")) 
			
		{
			WebDriverManager.firefoxdriver().setup();
			// import this "import org.openqa.selenium.firefox.FirefoxDriver;"
			driver = new FirefoxDriver();
		}
		// maximize screen 
		driver.manage().window().maximize();
		// implicity time out
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// page load timoe out
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		//launch url
		System.out.println("fetching url" + prop.getProperty("url"));
		String url= prop.getProperty("url");
		driver.get(url);
		System.out.println(url + "fetched >");
		System.out.println("executed setup >");
	}
	
	
}

