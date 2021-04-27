package pages;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.By;

import core.BasePage;

public class PaymentPO extends BasePage {
		
	
	public void payByCheck() {
		clickButton(By.className("cheque")); 
	}
	
	public void confirmOrder() {
		
		clickButton(By.className("button btn btn-default button-medium"));
	}
		
	
	public void saveOrderConfirmationDetailsToTextFile() throws IOException {
		  String TestFile = "//storetests//target//files//orderDetails.txt";
		  File FC = new File(TestFile);//Created object of java File class.
		  FC.createNewFile();//Create file.
		  
		  String details = new String();
		  details = getText(By.xpath("//*/[@class='box order-confirmation']"));
		  
		  
		  FileWriter FW = new FileWriter(TestFile);
		  BufferedWriter BW = new BufferedWriter(FW);
		  BW.write(details); //Writing In To File.
		  BW.close();
		  
	}
	
}
