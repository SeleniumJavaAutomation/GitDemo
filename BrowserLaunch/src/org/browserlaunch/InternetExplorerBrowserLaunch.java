package org.browserlaunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class InternetExplorerBrowserLaunch {
	public static void main(String[] args) {
		//setProperty
		System.setProperty("webdriver.ie.driver", "D:\\Madhavan\\BrowserLaunch\\driver\\IEDriverServer.exe");
		
		//launchBrowser
		WebDriver driver=new InternetExplorerDriver();
		
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
