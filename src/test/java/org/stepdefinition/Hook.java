package org.stepdefinition;





import com.resources.BaseClass;

import cucumber.api.java.After;
import cucumber.api.java.Before;





public class Hook extends BaseClass{
@Before
public void beforeBackground() {
	launchChrome("http://demo.guru99.com/telecom/index.html");
}
@After
public void afterScenario() {
	driver.quit();
}
}
