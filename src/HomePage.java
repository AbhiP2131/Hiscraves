import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

	    WebDriver driver;

	    // Constructor to initialize WebDriver
	    public HomePage(WebDriver driver) {
	        this.driver = driver;
	    }

	    // Method to get the page title
	    public String getPageTitle() {
	        return driver.getTitle();
	    }

	    // Method to check if a button is enabled
	    public boolean isButtonEnabled(WebElement button) {
	        return button.isEnabled();
	    }

	    // Method to enter mobile number
	    public void enterMobileNumber(String mobileNumber) {
	        WebElement mobileNumberField = driver.findElement(By.xpath("(//input[@id='mobile'])[1]"));
	        mobileNumberField.clear();
	        mobileNumberField.sendKeys(mobileNumber);
	    }

	    // Method to click Continue button
	    public void clickContinue() {
	        WebElement continueButton = driver.findElement(By.cssSelector("button[class='btn light_btn btn-secondary']"));
	        continueButton.click();
	    }

	    // Method to get OTP from the toaster popup
	    public String getOTP() {
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        WebElement toasterPopup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("swal2-title")));
	        String otpText = toasterPopup.getText();
	        String[] otpParts = otpText.split(" ");
	        return otpParts[3];
	    }

	    // Method to enter OTP
	    public void enterOTP(String otp) {
	        WebElement otpField = driver.findElement(By.xpath("//div[@id='otp'][1]//input[1]"));
	        otpField.click();
	        otpField.sendKeys(otp);
	    }
	}