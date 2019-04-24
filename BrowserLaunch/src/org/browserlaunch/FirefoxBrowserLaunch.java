package org.browserlaunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowserLaunch {
	public static void main(String[] args) {
		//setProperty
		System.setProperty("webdriver.gecko.driver", "D:\\Madhavan\\BrowserLaunch\\driver\\geckodriver.exe");
		
		//launchBrowser
		WebDriver driver=new FirefoxDriver();
		
		//openUrl
		driver.get("http://www.greenstechnologys.com/selenium-course-content.html");
		
		//getTiltle
		String title = driver.getTitle();
		System.out.println(title);
		
		//getCurrentURL
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		//quitBrowser
		driver.quit();
	}
}
