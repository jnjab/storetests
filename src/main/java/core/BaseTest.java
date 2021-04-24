package core;

import static core.DriverFactory.getDriver;
import static core.DriverFactory.killDriver;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import pages.LoginPage;

public class BaseTest {
	//Authentication
	private LoginPage page =  new LoginPage();
	
	@Rule
	public TestName testname = new TestName();
	
	@Before
	public  void starting() {
		page.acessInitialScreen();
		page.Login("jn.jab.rj@gmail.com", "Test2021");
	}
	
	@After
	public void terminate() throws IOException{
		
		TakesScreenshot ss = (TakesScreenshot) getDriver();
		File arquivo = ss.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(arquivo, new File("target"+ File.separator + "screenshot"  + 
				File.separator+testname.getMethodName() + ".jpg"));
		if(Properties.CLOSE_BROWSER) killDriver();
	}
	
}
