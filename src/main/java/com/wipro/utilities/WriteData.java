package com.wipro.utilities;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

//'**********************************************************
//'* Method					: WriteData
//'* Method  Description	: This method  will help us to write the data in the excel sheet
//'* Created By				: gu265058
//'**********************************************************
public class WriteData {
	BufferedWriter writer;
	
	public WriteData(String enterFileName) throws Exception{
	FileWriter wt=new FileWriter(System.getProperty("user.dir")+"\\TextFiles\\"+enterFileName+".txt",true);
	writer = new BufferedWriter(wt);
	}
	public void writeTextToFile(String text) throws IOException{	
		writer.write(text);
		writer.newLine();
		writer.close();		
	}

}
