package org.stepdefinition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;


import com.objectrepository.AddTariffPlan;
import com.resources.BaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;


public class TariffPlanSteps extends BaseClass{
	AddTariffPlan pom2=new AddTariffPlan();
	@Given("User on home page")
	public void user_on_home_page() {
		 
	}

	@When("User enter the tariff details")
	public void user_enter_the_tariff_details(DataTable twodlis) {
		List<List<String>> li2 = twodlis.asLists(String.class);
		clickButton(pom2.getAddtariff());
		fill(pom2.getRental(),(li2.get(1).get(0)));
		fill(pom2.getLocalminutes(),(li2.get(1).get(1)));
		fill(pom2.getInterminutes(),(li2.get(1).get(2)));
		fill(pom2.getSmspack(),(li2.get(1).get(3)));	
	}

	@When("User enter the remaining tariff details")
	public void user_enter_the_remaining_tariff_details(DataTable twodmap) {
		List<Map<String, String>> ma2 = twodmap.asMaps(String.class,String.class);
		fill(pom2.getMinutecharges(),(ma2.get(2).get("LocalperCharge")));
		fill(pom2.getIntercharges(),(ma2.get(2).get("InternationalperCharge")));
		fill(pom2.getSmscharges(),(ma2.get(2).get("SMSperCharge")));
		clickButton(pom2.getSubmit());
	}

	@When("User enter the tariff details {string},{string},{string},{string},{string},{string},{string}")
	public void user_enter_the_tariff_details(String monthly, String local, String Intnl, String freeSMS, String LC, String IC, String SC) {
		clickButton(pom2.getAddtariff());
		fill(pom2.getRental(),monthly);
		fill(pom2.getLocalminutes(),local);
		fill(pom2.getInterminutes(),Intnl);
		fill(pom2.getSmspack(),freeSMS);
		fill(pom2.getMinutecharges(),LC);
		fill(pom2.getIntercharges(),IC);
		fill(pom2.getSmscharges(),SC);
		clickButton(pom2.getSubmit());
	}
	@Then("Check weather tariff added successfully.")
	public void check_weather_tariff_added_successfully() {
		WebElement d = driver.findElement(By.xpath("//h2[text()='Congratulation you add Tariff Plan']"));
		String actual = d.getText();
		boolean act = actual.contains("Congratulation");
		Assert.assertTrue(act);
	 driver.quit();
	}
	@Then("Check weather tariff added successfully at a time")
	public void check_weather_tariff_added_successfully_at_a_time() {
		WebElement d = driver.findElement(By.xpath("//h2[text()='Congratulation you add Tariff Plan']"));
		String actual = d.getText();
		boolean act = actual.contains("Congratulation");
		Assert.assertTrue(act);
	 driver.quit();
	}
}
