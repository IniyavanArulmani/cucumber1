package com.resources;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	public static WebDriver driver;
public static  void launchChrome(String url) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\SASIANAND\\eclipse-workspace\\Twitter\\drivers\\chromedriver_new.exe");
	   driver=new ChromeDriver();
	   driver.get(url);
}
public static void fill(WebElement a,String b) {
	a.sendKeys(b);
}
public static void clickButton(WebElement c) {
	c.click();
}
}
