package core;

import static core.DriverFactory.getDriver;
import static core.DriverFactory.killDriver;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import pages.InicialScreenPO;

public class BaseTest {
	//Authentication
	protected InicialScreenPO il = new InicialScreenPO();
	
	@Rule
	public TestName testname = new TestName();
	
	@BeforeClass
	public static void setup() {
		
		getDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}
	
	@Before
	public  void starting() {
		il.acessInitialScreen();
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
