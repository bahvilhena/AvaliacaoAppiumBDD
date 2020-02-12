package br.com.rsinet.hub_bdd.manager;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class DriverFactory {

	private WebDriver driver;
	
	@SuppressWarnings({ "rawtypes" })
	public WebDriver iniciarApp() throws Exception {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "Nexus 5X");
		cap.setCapability("udid", "emulator-5554");
		cap.setCapability("platformName", "Android");
		cap.setCapability("appPackage", "com.Advantage.aShopping");
		cap.setCapability("appActivity", "com.Advantage.aShopping.SplashActivity");
		cap.setCapability("unicodeKeyboard", true);

		if (driver == null)
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		
		return driver;
	}

	public WebDriver fecharApp() {
		if (driver != null) {	
			driver.quit();
		}
		return driver;
	}
}
