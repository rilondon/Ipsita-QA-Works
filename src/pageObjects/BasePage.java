package pageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;




public class BasePage {

	protected WebDriver driver;
	private By contactusLink = By.linkText("Contact");
	
	public BasePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void navigateToQAworks(){
		driver.navigate().to("http://www.qaworks.com");
	}
	
	public String getPageTitle(){
		String title = driver.getTitle();
		return title;
	}
	
	public boolean verifyBasePageTitle() {
		String expectedPageTitle="Home Page - QAWorks";
		return getPageTitle().contains(expectedPageTitle);
	}
	
	public ContactPage clickonContactus() {
		WebElement element=driver.findElement(contactusLink);
		if(element.isDisplayed()||element.isEnabled())
			element.click();
		return new ContactPage(driver);
}
}
