package sauce;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.offset.PointOption;

public class MobileTest {
	private AppiumDriver driver;

	@BeforeMethod
	public void setUp() throws Exception {

		DesiredCapabilities capabilities = new DesiredCapabilities();

		/*  1. Choose your project */
		capabilities.setCapability("testobject_api_key", "5928AE9D208E4E909525ED7B49F7B6AC");

		/*  2. Select your testing device:
		*   Specify a `platformVersion` without `deviceName` to get any available device with that platform version.
		*   Not selecting a device at all is also a valid choice, we will select it carefully for you */
		//capabilities.setCapability("platformVersion", "7"); // Optional
		//capabilities.setCapability("deviceName", "Google Pixel"); // Optional

		/*  3. Where is your device located? */
		URL EU_endpoint = new URL("https://eu1.appium.testobject.com/wd/hub");
		//URL US_endpoint = new URL("https://us1.appium.testobject.com/wd/hub");

		/*  The driver will take care of establishing the connection, so we must provide
		*  it with the correct endpoint and the requested capabilities. */
		driver = new AndroidDriver(EU_endpoint, capabilities);

	}

	/* We disable the driver after EACH test has been executed. */
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

	@Test
	public void testMethod() throws InterruptedException {
		/* Your test. */MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId("OnboardingSkipButton");
		el1.click();
		Thread.sleep(2000);
		TouchAction touchAction178 = new TouchAction(driver);
		touchAction178.tap(PointOption.point(339, 336)).perform();
		Thread.sleep(2000);
		MobileElement el2 = (MobileElement) driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"OffersSearchFormKeywordsEntry\"]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.EditText");
		el2.sendKeys("architecte");
		Thread.sleep(1000);
		TouchAction touchAction1 = new TouchAction(driver);
		touchAction1.tap(PointOption.point(151, 354)).perform();
		Thread.sleep(1000);
	}
}
