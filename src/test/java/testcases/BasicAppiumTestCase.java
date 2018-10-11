package testcases;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class BasicAppiumTestCase {

	public static AndroidDriver driver;
	
	
	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		// TODO Auto-generated method stub
		//Setup the app
				File appDir = new File("./src/main/resources/");
				File app = new File(appDir, "selendroid-test-app-0.17.0.apk");
		
			//Set the desired capabilities
				DesiredCapabilities caps = new DesiredCapabilities();
				caps.setCapability("device", "Android");
				caps.setCapability("deviceName", "Redmi");
				caps.setCapability("platformName", "Android");
				caps.setCapability("app", app);
				
		
		
		//capabilities.setCapability("device", "Android");
		//capabilities.setCapability("platformVersion", "6.0.1");
		//capabilities.setCapability("platformName", "Android");


		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
		
		driver.manage().timeouts().implicitlyWait(40L, TimeUnit.SECONDS);
		
		driver.get("http://google.com");
		
		driver.findElement(By.name("q")).sendKeys("Hello Appium !!!!");
		
		Thread.sleep(4000);
		
		driver.quit();

	}

}
