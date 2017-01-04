package testCases;

import java.util.List;

import org.openqa.selenium.WebDriver;

import baseActions.TestSetUp;
import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.BasePage;
import pageObjects.ContactPage;

public class ContactPageTests {

	private WebDriver driver;
	private BasePage basePage;
	private ContactPage contactPage;
	private TestSetUp testSetup ;

	@Before
	public void setUp(){
		
		testSetup = new TestSetUp();
		testSetup.initializeTestBaseSetup();
		driver = testSetup.getDriver();
		System.out.println("after initialize-------->"+driver);
	
		basePage=  new BasePage(driver);
		contactPage = new ContactPage(driver);
	}
	
	@Given("^I am on the QAWorks Site$")
	public void i_am_on_the_QAWorks_Site() throws Throwable {
		Thread.sleep(2000);
		basePage.navigateToQAworks();
		basePage.clickonContactus();
		contactPage.verifyContactPageTitle();
		contactPage.verifyContactusPageText();
	}
	
	@Then("^I should be able to contact QAWorks with the following information$")
	public void i_should_be_able_to_contact_QAWorks_with_the_following_information(DataTable inputValues) throws Throwable {
		//Write the code to handle Data Table
		Thread.sleep(2000);
		List<List<String>> data = inputValues.raw();
		contactPage.sendMessage(data.get(1).get(0), data.get(1).get(1), data.get(1).get(2));
	}


	@Then("^the content should be displayed$")
	public void the_content_should_be_displayed() throws Throwable {
		Thread.sleep(3000);
		contactPage.verifyEmail();
		contactPage.verifyPhone();
		contactPage.verifySocialIcons();
	}
	
	@When("^I enter null values to the contact form$")
	public void i_enter_null_values_to_the_contact_form(DataTable inputValues) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(3000);
		List<List<String>> data = inputValues.raw();
		contactPage.sendMessage(data.get(1).get(0), data.get(1).get(1), data.get(1).get(2));
	}
	
	@Then("^the appropriate messages would be displayed$")
	public void the_appropriate_messages_would_be_displayed() throws Throwable {
		Thread.sleep(2000);
	    contactPage.checkAlertMessage();
	}

	@After
	public void tearDown(){
		testSetup.tearDown();
	}

}
