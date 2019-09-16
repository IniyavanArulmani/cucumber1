package com.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.resources.BaseClass;

public class AddTariffPlan extends BaseClass{
	public AddTariffPlan() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="(//a[text()='Add Tariff Plan'])[1]")
	private WebElement addtariff;
	@FindBy(xpath="//input[@id='rental1']")
	private WebElement rental;
	@FindBy(xpath="//input[@id='local_minutes']")
	private WebElement localminutes;
	@FindBy(xpath="//input[@id='inter_minutes']")
	private WebElement interminutes;
	@FindBy(xpath="//input[@id='sms_pack']")
	private WebElement smspack;
	@FindBy(xpath="//input[@id='minutes_charges']")
	private WebElement minutecharges;
	@FindBy(xpath="//input[@id='inter_charges']")
	private WebElement intercharges;
	@FindBy(xpath="//input[@id='sms_charges']")
	private WebElement smscharges;
	@FindBy(xpath="//input[@name='submit']")
	private WebElement submit;
	public WebElement getAddtariff() {
		return addtariff;
	}
	public WebElement getRental() {
		return rental;
	}
	public WebElement getLocalminutes() {
		return localminutes;
	}
	public WebElement getInterminutes() {
		return interminutes;
	}
	public WebElement getSmspack() {
		return smspack;
	}
	public WebElement getMinutecharges() {
		return minutecharges;
	}
	public WebElement getIntercharges() {
		return intercharges;
	}
	public WebElement getSmscharges() {
		return smscharges;
	}
	public WebElement getSubmit() {
		return submit;
	}
}
