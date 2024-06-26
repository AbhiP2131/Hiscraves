import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class selfintroduction {

	  WebDriver driver;
		// TODO Auto-generated method stub
// Invoking browser//
		//To automatecrhromedriver
		
			 @BeforeClass
			    public void OpenBrowser() {
			        // Set the path to the WebDriver executable (if not in PATH)
			        System.setProperty("webdriver.chrome.driver", "C:/Users/HP/Documents/chromedriver-win64/chromedriver.exe");
			        driver = new ChromeDriver();
			        driver.get("https://nuxt.hiscraves.com/");
			    }

			    @Test(priority = 5)
			    public void testLogin() throws InterruptedException {
			        WebElement myaccbtn = driver.findElement(By.xpath("(//img[@class='desktop_view'])[3]"));
			        myaccbtn.click();

			        Thread.sleep(3000);

			        WebElement box = driver.findElement(By.xpath("(//input[@id='mobile'])[1]"));
			        box.sendKeys("7769936061");

			        WebElement Continue = driver.findElement(By.cssSelector("button[class='btn light_btn btn-secondary']"));
			        Continue.click();

			        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			        WebElement toasterPopup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("swal2-title")));

			        String OTP = toasterPopup.getText();
			        String[] test = OTP.split(" ");
			        String ActualOTP = (test[3]);
			        System.out.println(ActualOTP);

			        WebElement InputOTP = driver.findElement(By.xpath("//div[@id='otp'][1]//input[1]"));
			        InputOTP.click();
			        InputOTP.sendKeys(ActualOTP);

			        Thread.sleep(6000);
			        WebElement element = driver.findElement(By.xpath("//div[@class='link_text']"));
			        Actions actions = new Actions(driver);
			        actions.moveToElement(element).click().perform();
			        // Clicking the Edit button (assuming correct XPath is used)
			        WebElement Edit = driver.findElement(By.xpath("//div[@class='link_text']"));
			        
			        Edit.click();
			        WebElement nameField = driver.findElement(By.xpath("///div[@id='otp'][1]//input[1]")); // Replace with actual locator
			        nameField.clear();
			        nameField.sendKeys("DHOOM MACHLE");
			        Thread.sleep(5000);
			    }

			    @Test(priority = 2)
			    public void getPageTitle() {
			        String pageTitle = driver.getTitle();
			        System.out.println("Page Title: " + pageTitle);
			    
			}
         
		 }	


