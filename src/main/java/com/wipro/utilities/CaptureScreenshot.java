package com.wipro.utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


//'**********************************************************
//'* Method					: CaptureScreenshot
//'* Method  Description	: This method  will help us to capture the screenshots
//'* Created By				: gu265058
//'**********************************************************
public class CaptureScreenshot {
	public static String capture(WebDriver driver, String screenshotName ) throws IOException{
		TakesScreenshot ts=(TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		String dest = System.getProperty("user.dir")+screenshotName+"\\.png";
		File destination = new File(dest);
		FileUtils.copyFile(source,destination);
		return dest;
		
	}

}
