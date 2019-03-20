package sauce;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

public class TestSauce {
	 public static WebDriver driver;
	 static String buildnumber=" 2589 4b3da11";
	 static String sauceUserName = "Peter.xu";
     static String sauceAccessKey ="cd64b636-96cb-4279-baec-133a16798773";
     static String sauceURL = "https://" + sauceUserName +":"+sauceAccessKey+"@ondemand.eu-central-1.saucelabs.com:443/wd/hub";

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		 DesiredCapabilities capabilities = new DesiredCapabilities();
		  capabilities.setCapability("browserName", "Chrome");
		 capabilities.setCapability("platform", "Windows 10");
	     capabilities.setCapability("version", "latest");
	     capabilities.setCapability("build", "buildnumber");
	    driver = new RemoteWebDriver(new URL(sauceURL), capabilities);
	     //driver =new ChromeDriver();
	     driver.get("https://google.com");
	     System.out.println(driver.getTitle());
	     driver.findElement(By.name("q")).sendKeys("automation");
	      driver.quit();
	      System.out.println("test finish");
	      //djdsfdsfsdfsdqsdqddqzd
	 //ijdiodhzedzeuduiduiqsdih
	}

}
