package org.stepdefinition;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class LoginStepsCheck {
	static WebDriver driver;
	@Given("User is on home page")
	public void user_is_on_home_page() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SASIANAND\\eclipse-workspace\\Twitter\\drivers\\chromedriver_new.exe");
		   driver=new ChromeDriver();
		   driver.get("http://demo.automationtesting.in/Register.html");
	}

	@When("User enter some valid details.")
	public void user_enter_some_valid_details(DataTable map1) {
		List<String> li1 = map1.asList(String.class);
		 driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys(li1.get(0));
		  driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys(li1.get(1));
		  driver.findElement(By.xpath("//textarea[@rows='3']")).sendKeys(li1.get(2));
		  driver.findElement(By.xpath("//input[@type='email']")).sendKeys(li1.get(3));
		  driver.findElement(By.xpath("//input[@type='tel']")).sendKeys(li1.get(4));
		  driver.findElement(By.xpath("//input[@value='Male']")).click();
		  driver.findElement(By.xpath("//input[@value='Hockey']")).click();
		  driver.findElement(By.xpath("//div[@class='ui-autocomplete-multiselect ui-state-default ui-widget']")).click(); 
		  driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		  driver.findElement(By.xpath("//a[text()='Croatian']")).click();
		  driver.findElement(By.xpath("//label[text()='Languages']")).click();
		  WebElement z = driver.findElement(By.id("Skills"));
		  Select skill =new Select(z);
		  skill.selectByValue("Android");
		  WebElement x = driver.findElement(By.id("countries"));
		  Select country =new Select(x);
		  country.selectByValue("American Samoa");
		  WebElement y = driver.findElement(By.id("yearbox"));
		  Select year =new Select(y);
		  year.selectByValue("1994");
	}

	@When("User enters remaining..")
	public void user_enters_remaining(DataTable data) throws Throwable {
		WebElement m = driver.findElement(By.xpath("//select[@placeholder='Month']"));
		Select month =new Select(m);
		  month.selectByValue("March");
		  WebElement d = driver.findElement(By.xpath("//select[@placeholder='Day']"));
		  Select date =new Select(d);
		  date.selectByValue("3");
		  List<String> li2 = data.asList(String.class);
		  driver.findElement(By.xpath("//input[@id='firstpassword']")).sendKeys(li2.get(0));
		  driver.findElement(By.xpath("//input[@id='secondpassword']")).sendKeys(li2.get(1));
		  driver.findElement(By.id("submitbtn")).click(); 
		  Thread.sleep(10000);
	}

	@Then("Verify wheather able to login")
	public void verify_wheather_able_to_login() {
		String url = driver.getCurrentUrl();
	    boolean i = url.contains("WebTable");
	    Assert.assertTrue(i); 
	    driver.quit();
	}
}
