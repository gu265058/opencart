package com.wipro.openCartPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
//'**********************************************************
//'* Method					: Commonactions
//'* Method  Description	: This method  will have all the common actions/functions
//'* Created By				: gu265058
//'* Created Date			: 21-Dec-2017 


//'**********************************************************


public class Commonactions {
	WebDriver driver;
	
	@FindBy(how=How.LINK_TEXT, using="login")
	WebElement login;

//'**********************************************************
//'* Method					: Commonactions
//'* Method  Description	: This method  will have all the common actions/functions
//'**********************************************************	
	
	public Commonactions(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver,this);		
	}
//'**********************************************************
//'* Method					: clickLogin
//'* Method  Description	: This method  will have all the common actions/functions
//'**********************************************************		
	public LoginPage clickLogin(){
		login.click();
		return new LoginPage(driver);
	}
}
