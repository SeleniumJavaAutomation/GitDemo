package org.browserlaunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserLaunch {
	public static void main(String[] args) {
		//setProperty
		System.setProperty("webdriver.chrome.driver", "D:\\Madhavan\\BrowserLaunch\\driver\\chromedriver.exe");
		
		//launchBrowser
		WebDriver driver=new ChromeDriver();

		//openUrl
		driver.get("http://www.greenstechnologys.com/selenium-course-content.html");
		
		//getTiltle
		String title = driver.getTitle();
		System.out.println(title);
		
		//getCurrentURL
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);

		
		//quitBrowser
		//driver.quit();
	}
}
