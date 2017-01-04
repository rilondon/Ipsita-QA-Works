package baseActions;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class TestSetUp {

		private WebDriver driver;

		public WebDriver getDriver() {
			return driver;
		}

		public void initializeTestBaseSetup() {
			try {
				System.out.println("Launching Chrome browser..");
				driver = new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
				driver.manage().window().maximize();
				System.out.println("init"+driver);
			} catch (Exception e) {
				System.out.println("Error....." + e.getStackTrace());
			}
		}
		
		public void tearDown() {
			driver.quit();
		}
}

