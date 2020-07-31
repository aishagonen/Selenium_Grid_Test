package gridTest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class GridTesting {

	public static void main(String[] args) throws MalformedURLException {
		

		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.MAC);
		
		ChromeOptions co = new ChromeOptions();
		co.merge(cap);
		
//		FirefoxOptions fo = new FirefoxOptions();
//		fo.merge(cap);
			
		String hubURL = "http://192.168.200.101:4444/wd/hub";
		WebDriver driver = new RemoteWebDriver(new URL(hubURL), co);
		driver.get("https://www.google.com");
		System.out.println("Title is "+ driver.getTitle());
		driver.close();
		

	}

}
