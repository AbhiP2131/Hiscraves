import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {


    private HomePage homePage;

    @BeforeMethod
    public void navigateToHomePage() {
        driver.get("https://nuxt.hiscraves.com/");
        homePage = new HomePage(driver);
    }

    @Test(priority = 1)
    public void testPageTitle() {
        // Get the page title
        String title = homePage.getPageTitle();

        // Assert that the page title is as expected
        Assert.assertEquals(title, "Home", "The page title should be 'Home'");
    }

    @Test
    public void testButtonIsEnabled() {
        // Check if the button is enabled
        WebElement button = driver.findElement(By.xpath("(//img[@class='desktop_view'])[3]"));
        boolean isEnabled = homePage.isButtonEnabled(button);

        // Assert that the button is enabled
        Assert.assertTrue(isEnabled, "The button should be enabled");
    }

    @Test(priority = 2)
    public void checkLogin() throws InterruptedException {
        WebElement myAccountButton = driver.findElement(By.xpath("(//img[@class='desktop_view'])[3]"));
        myAccountButton.click();

        Thread.sleep(3000);

        homePage.enterMobileNumber("7769936061");
        homePage.clickContinue();

        Thread.sleep(3000);

        String otp = homePage.getOTP();
        System.out.println("Retrieved OTP: " + otp);

        Thread.sleep(3000);

        homePage.enterOTP(otp);
        Thread.sleep(5000);
        WebElement Edit = driver.findElement(By.xpath("(//body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/section[1]/div[1]/div[2]/div[2]/div[1]/div[1]/button[1]/div[1]/img[1]\r\n"+""));
        Edit.click();
        Thread.sleep(5000);
      //body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/section[1]/div[1]/div[2]/div[2]/div[1]/div[1]/button[1]/div[1]/img[1]
        // Verify that we navigated to the My Account page
        String myAccountTitle = driver.getTitle();
        System.out.println("My Account page title: " + myAccountTitle);
        Assert.assertEquals(myAccountTitle, "Home", "The page title should match the expected title");
    }
    
}