package com.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.resources.BaseClass;

public class AddCustomer extends BaseClass{
	public AddCustomer() {
		PageFactory.initElements(driver, this);
	}
@FindBy(xpath="(//a[text()='Add Customer'])[1]")
private WebElement addcustomer;
@FindBy(xpath="//label[text()='Done']")
private WebElement done;
@FindBy(id="fname")
private WebElement firstname;
@FindBy(id="lname")
private WebElement lastname;
public WebElement getAddcustomer() {
	return addcustomer;
}
public WebElement getDone() {
	return done;
}
public WebElement getFirstname() {
	return firstname;
}
public WebElement getLastname() {
	return lastname;
}
public WebElement getEmail() {
	return email;
}
public WebElement getMessage() {
	return message;
}
public WebElement getMobile() {
	return mobile;
}
public WebElement getSubmitbutton() {
	return submitbutton;
}
@FindBy(id="email")
private WebElement email;
@FindBy(xpath="//textarea[@id='message']")
private WebElement message;
@FindBy(xpath="//input[@id='telephoneno']")
private WebElement mobile;
@FindBy(xpath="//input[@name='submit']")
private WebElement submitbutton;
}
