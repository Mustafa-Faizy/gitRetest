package stepDefinitions;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import core.Base;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;


public class Initializer extends Base {

	
	
	// this method will run before each scenario
	@Before
	public void beforeHooks() {
		
		if (Base.browserName().equals("chrome")) {
			WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		}
	else if (Base.browserName().equals("FF")) {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
	}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(getpageLoadTimeOut(), TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(getimplicitlyWait(), TimeUnit.SECONDS);
	
		//try {
			//ScreenRecordUtility.startRecording("TekSchool scenarios");
	//	} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		//}
	}
	
	
	
	
	
	// this method will run after scenario
	@After
	public void afterHooks() {
												// the method below is screen recorder that commented.
		//try {
		//	ScreenRecordUtility.stopRecording();
		//} catch (Exception e) {
			// TODO Auto-generated catch block
		//	e.printStackTrace();
		//}
		
		driver.close();
		driver.quit();
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
