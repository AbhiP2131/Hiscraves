import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MyaccountTests extends BaseTest{
	
	private MyAccount Myaccount;
	
	   @BeforeMethod
	    public void navigatetomyaccount() {
	        driver.get("https://nuxt.hiscraves.com/");
	        Myaccount = new MyAccount(driver);
	    }
	 
	 @Test(priority = 1)
	    public void checkLogin() throws InterruptedException {
	        WebElement myAccountButton = driver.findElement(By.xpath("(//img[@class='desktop_view'])[3]"));
	        myAccountButton.click();

	        Thread.sleep(4000);

	        Myaccount.enterMobileNumber("7769936061");
	        Myaccount.clickContinue();

	        Thread.sleep(3000);

	        String otp = Myaccount.getOTP();
	        System.out.println("Retrieved OTP: " + otp);

	        Thread.sleep(3000);

	        Myaccount.enterOTP(otp);
	        Thread.sleep(4000);
	       // Myaccount.clickEditProfile();
	       // myAccountButton.click();
	 
	 }
	 @Test(priority=2)
		    
		    //    WebElement editProfileButton = Myaccount.waitForElementClickable(editProfileButtonLocator);
		       // editProfileButton.click();
	 public void clickEditProfile() throws InterruptedException {
	      //  myAccount.clickMyAccountButton();
		 
		 Thread.sleep(5000);
		 driver.navigate().back();
		 String getctitle = driver.getTitle();
		 System.out.println(getctitle);
		 driver.get("https://nuxt.hiscraves.com/my-account");
		 Thread.sleep(3000);
		// WebElement element = driver.findElement(By.xpath("//div[@class='link_text']"));
		 WebElement element = Myaccount.waitUtils.waitForElementClickable(By.xpath("//div[@class='link_text']"));
		 Actions actions = new Actions(driver);
	        actions.moveToElement(element).click().perform();
	        Thread.sleep(5000);
	       // WebElement Modal = driver.findElement(By.xpath("//form[@class='register_form']"));
	      //form[@class='register_form']
	       // driver.switchTo.frame.(Modal);
	        Myaccount.editName("John Doe");
	        Thread.sleep(4000);
		/*WebElement editicon =  driver.findElement(By.cssSelector("div[class='row row-cols-1 row-cols-sm-3 row-cols-md-3 row-cols-lg-3 row-cols-xl-3'] div:nth-child(1) button:nth-child(1) div:nth-child(1) img:nth-child(1)"));
	    Thread.sleep(5000);
		editicon.click();
	    Thread.sleep(5000);
	    Myaccount.clickEditProfile();
	    Myaccount.waitForElementClickable(editicon);
	    Myaccount.clickEditProfile();
		*/
	 }
	 
	 @Test(priority = 6)
	    public void testEditName() throws InterruptedException {
	        // Click on My Account button (assuming implementation)
	         WebElement myAccountButton = driver.findElement(By.xpath("(//img[@class='desktop_view'])[3]"));
	         myAccountButton.click();
	        driver.get("https://nuxt.hiscraves.com/my-account");
			 Thread.sleep(3000);
			 WebElement element = driver.findElement(By.xpath("//div[@class='link_text']"));
		        
	         Actions actions = new Actions(driver);
		        actions.moveToElement(element).click().perform();
		        Myaccount.editName("John Doe");

		        Thread.sleep(5000);}
		 	// Replace with your actual edit name functionality
	        // Assert the result after editing name (you can add assertions here)
	        // Example assertion
	        // Assert.assertEquals(myAccount.getName(), "John Doe");

	    @Test(priority = 2)
	    public void testEditEmail() throws InterruptedException {
	      //  Click on My Account button (assuming implementation)
	    	 WebElement myAccountButton = driver.findElement(By.xpath("(//img[@class='desktop_view'])[3]"));
	         myAccountButton.click();
	        driver.get("https://nuxt.hiscraves.com/my-account");
			 Thread.sleep(3000);
			 WebElement element = driver.findElement(By.xpath("//div[@class='link_text']"));
		        
	         Actions actions = new Actions(driver);
		        actions.moveToElement(element).click().perform();
	        // Replace with your actual edit email functionality
		        Myaccount.editEmail("7769936062");
		        
	        // Assert the result after editing email (you can add assertions here)
	        // Example assertion
	        // Assert.assertEquals(myAccount.getEmail(), "john.doe@example.com");
	    }

	    // Optional: Add @AfterClass method to clean up resources
	}

	
