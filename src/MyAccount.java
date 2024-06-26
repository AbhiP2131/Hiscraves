import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyAccount {
    private WebDriver driver;
    public WaitUtils waitUtils;

    private By editProfileButtonLocator = By.xpath("(//img[@loading='lazy'])[22]");

    // Constructor to initialize WebDriver
    public MyAccount(WebDriver driver) {
        this.driver = driver;
        this.waitUtils = new WaitUtils(driver);
    }

    // Method to click Edit Profile button
    public void clickEditProfile() {
        WebElement editProfileButton = waitUtils.waitForElementClickable(editProfileButtonLocator);
        waitUtils.scrollToElement(editProfileButton);
        editProfileButton.click();
    }

    // Method to enter mobile number
    public void enterMobileNumber(String mobileNumber) {
        WebElement mobileNumberField = waitUtils.waitForElementClickable(By.xpath("(//input[@id='mobile'])[1]"));
        mobileNumberField.clear();
        mobileNumberField.sendKeys(mobileNumber);
    }

    // Method to click Continue button
    public void clickContinue() {
        WebElement continueButton = waitUtils.waitForElementClickable(By.cssSelector("button[class='btn light_btn btn-secondary']"));
        continueButton.click();
    }

    // Method to get OTP from the toaster popup
    public String getOTP() {
        WebElement toasterPopup = waitUtils.waitForElementPresent(By.id("swal2-title"));
        String otpText = toasterPopup.getText();
        String[] otpParts = otpText.split(" ");
        return otpParts[3];
    }

    // Method to enter OTP
    public void enterOTP(String otp) {
        WebElement otpField = waitUtils.waitForElementClickable(By.xpath("//div[@id='otp'][1]//input[1]"));
        otpField.click();
        otpField.sendKeys(otp);
    }
    // Method to edit name
    public void editName(String newName) {
        WebElement nameField = waitUtils.waitForElementClickable(By.xpath("//input[@placeholder='Enter your name']")); 
        nameField.clear();
        nameField.sendKeys(newName);
        // Additional steps if needed (like clicking save button)
    }
  //input[@placeholder='Enter your email'][1]
    public void editEmail(String newName) {
        WebElement emailField = waitUtils.waitForElementClickable(By.xpath("//input[@placeholder='Enter your mobile number']")); 
        emailField.clear();
        emailField.sendKeys(newName);
}}