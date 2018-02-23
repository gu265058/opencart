package com.wipro.browser;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
//'**********************************************************
//'* Method					: LaunchBrowser
//'* Method  Description	: This method  will launch
//'* Created By				: gu265058
//'* Created Date			: 21-Dec-2017 
//'* Input Parameter		: url,    - URL name were used

//'**********************************************************
public class LaunchBrowser {
	static WebDriver driver;
	static String url;
	
	public static WebDriver openBrowser(String browser){
		if(browser.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver","E://Work//Learnings//Selenium//Selenium documents//chromedriver.exe");
			//driver = new ChromeDriver();
		//}
	       try {
	        	url = "http://10.159.34.45:4444/wd/hub";
	            DesiredCapabilities capabilities = new DesiredCapabilities();
	            capabilities.setBrowserName("chrome");
	            capabilities.setPlatform(Platform.WINDOWS);
	            driver = new RemoteWebDriver(new URL(url), capabilities);
	            
	        }catch(Exception e){
	            e.printStackTrace(); 
	        }}

		/*	else if(browser.equalsIgnoreCase("IE")){
				
				System.setProperty("webdriver.ie.driver","E:\\Work\\Learnings\\Selenium\\Selenium Jars\\IEDriverServer.exe");
				driver =new InternetExplorerDriver();	
			}
			*/
			driver.manage().window().maximize();
			driver.get("http://10.207.182.108:81/opencart/");
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		return driver;
		
	}


}