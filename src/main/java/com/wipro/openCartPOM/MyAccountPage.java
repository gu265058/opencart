package com.wipro.openCartPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

//'**********************************************************
//'* Method					: MyAccountPage
//'* Method  Description	: This method  will have all the details of the Myaccount page
//'* Created By				: gu265058
//'* Created Date			: 21-Dec-2017 
//'**********************************************************
public class MyAccountPage {
	WebDriver driver;
	public MyAccountPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public String getTittle(){
		return driver.getTitle();
	}
}
