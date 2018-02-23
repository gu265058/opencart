package com.wipro.openCartPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
//'**********************************************************
//'* Method_Name			: LogOutPage
//'* Method  Description	: This method will help in closing the browser
//'* Created By				: gu265058
//'* Created Date			: 21-Dec-2017 
//'**********************************************************
public class LogOutPage {
	WebDriver driver;
	@FindBy(how=How.TAG_NAME,using="h1")
	 WebElement heading;
	 public LogOutPage(WebDriver driver){
		 this.driver=driver;
		 PageFactory.initElements(driver,this);
		 }
	 public String getlogoutMsg(){
		return heading.getText();
		 
	 }
}
