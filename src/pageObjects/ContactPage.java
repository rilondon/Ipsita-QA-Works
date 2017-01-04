package pageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
 
public class ContactPage {
 
	private WebDriver driver;

	private By contactPageText = By.cssSelector("div#ContactHead h1");
	private By nameTextBox = By.cssSelector("div#ContactNameBox input");
	private By emailTextBox = By.cssSelector("div#ContactEmailBox input");
	private By messageTextBox = By.cssSelector("div#ContactMessageBox textarea");
	private By sendBtn = By.cssSelector("div#ContactSend input");
	private By successMsgTxt = By.id("errormsg_0_Passwd");
	private By emailTxt = By.linkText("enquiry@qaworks.com");
	private By phoneTxt = By.id("PhoneIcon");
	private By iconTwitter = By.cssSelector("a.footer-social-icon");
	private By iconFB= By.xpath("//div[@id='FooterContent']/a[2]");
	private By iconYT = By.xpath("//div[@id='FooterContent']/a[3]");
	private By iconLN = By.xpath("//div[@id='FooterContent']/a[4]");
	private By nameTextBoxAlert = By.cssSelector("div#ContactNameBox span");
	private By emailTextBoxAlert = By.cssSelector("div#ContactEmailBox span");
	private By messageTextBoxAlert = By.cssSelector("div#ContactMessageBox span");
		
		public ContactPage(WebDriver driver) {
			this.driver=driver;
		}
		
		public String getContactPageTitle() {
			String pageTitle = driver.getTitle();
			return pageTitle;
		}
		
		public boolean verifyContactPageTitle() {
			String expectedTitle = "Contact Us - QAWorks";
			return getContactPageTitle().contains(expectedTitle);
		}
		
		public boolean verifyContactusPageText() {
			WebElement element = driver.findElement(contactPageText);
			String pageText = element.getText();
			String expectedPageText = "Contact";
			return pageText.contains(expectedPageText);
		}
			
		public void sendMessage(String name,String email,String message){
			driver.findElement(nameTextBox).sendKeys(name);
			driver.findElement(emailTextBox).sendKeys(email);
			driver.findElement(messageTextBox).sendKeys(message);
			driver.findElement(sendBtn).click();
		}
		
		public void verifyEmail() {
			WebElement element = driver.findElement(emailTxt);
			element.isDisplayed();
		}
		
		public void verifyPhone() {
			WebElement element = driver.findElement(phoneTxt);
			element.isDisplayed();
		}
		
		public void verifySocialIcons(){
			driver.findElement(iconTwitter).isDisplayed();
			driver.findElement(iconFB).isDisplayed();
			driver.findElement(iconYT).isDisplayed();
			driver.findElement(iconLN).isDisplayed();
		}
		
		public String getErrorMessage() {
				String strSuccesMessage = null;
				WebElement sucMsg = driver.findElement(successMsgTxt);
				if(sucMsg.isDisplayed()&&sucMsg.isEnabled())
					strSuccesMessage = sucMsg.getText();
				return strSuccesMessage;
		}
		
		public void checkAlertMessage(){
			driver.findElement(nameTextBoxAlert).isDisplayed();
			driver.findElement(emailTextBoxAlert).isDisplayed();
			driver.findElement(messageTextBoxAlert).isDisplayed();
		}
}
