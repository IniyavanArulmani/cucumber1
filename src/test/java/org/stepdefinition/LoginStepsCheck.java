package org.stepdefinition;


import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import com.objectrepository.AddCustomer;
import com.resources.BaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;


public class LoginStepsCheck extends BaseClass{

	AddCustomer pom1=new AddCustomer();
	@Given("User is on home page")
	public void user_is_on_home_page() {
	
	}

	@When("User enter some valid details")
	public void user_enter_some_valid_details(DataTable lis) {
		List<String> list1 = lis.asList(String.class);
		 clickButton(pom1.getAddcustomer());
		 clickButton(pom1.getDone());
		  fill((pom1.getFirstname()),(list1.get(0)));
		  fill((pom1.getLastname()),(list1.get(1)));
		 }

	@When("User enters remaining details")
	public void user_enters_remaining_details(DataTable ma) {
		Map<String, String> map1 = ma.asMap(String.class, String.class);
		 fill((pom1.getEmail()),(map1.get("email")));
		  fill(pom1.getMessage(),(map1.get("message")));
		  fill(pom1.getMobile(),(map1.get("telepone")));
		  clickButton(pom1.getSubmitbutton());
		  
	}

	@Then("Verify wheather able to login")
	public void verify_wheather_able_to_login() {
WebElement o = driver.findElement(By.xpath("//b[text()='Customer ID']"));
String actual = o.getText();
Assert.assertEquals("Customer ID", actual);
	}
}
