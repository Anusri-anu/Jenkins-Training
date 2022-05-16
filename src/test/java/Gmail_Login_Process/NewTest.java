package Gmail_Login_Process;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;		
import org.testng.Assert;		
import org.testng.annotations.Test;	
import org.testng.annotations.BeforeTest;	
import org.testng.annotations.AfterTest;		
public class NewTest {		
	    private WebDriver driver;	
	    private By searchBox=By.xpath("//input[@id=\"twotabsearchtextbox\"]");
	    private By searchButton=By.xpath("//input[@id=\"nav-search-submit-button\"]");
		@Test				
		public void testEasy() {	
			driver.get("https://www.amazon.in/");  
			String title = driver.getTitle();				 
			System.out.println(title);		
			try {
			driver.findElement(searchBox).sendKeys("apple");
			driver.findElement(searchButton).click();
			System.out.println("Successfully Run the test case");
			}catch(Exception e) {
				System.out.println("Error got in the test case"+e);
			}
			
		}	
		@BeforeTest
		public void beforeTest() {	
			System.out.println("Welcome ");
			String paths=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", paths+"/Drivers/first/chromedriver.exe");
			driver=new ChromeDriver(); 
		}		
		@AfterTest
		public void afterTest() {
			System.out.println("Thank You ");
			driver.quit();			
		}		
}