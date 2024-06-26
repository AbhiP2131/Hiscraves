import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtils {

	    private WebDriver driver;
	    private WebDriverWait wait;

	    // Constructor to initialize WebDriver and WebDriverWait
	    public WaitUtils(WebDriver driver) {
	        this.driver = driver;
	        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20)); // Set default timeout as 20 seconds
	    }

	    // Method to wait for element to be present
	    public WebElement waitForElementPresent(By locator) {
	        return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	    }

	    // Method to wait for element to be clickable
	    public WebElement waitForElementClickable(By locator) {
	        return wait.until(ExpectedConditions.elementToBeClickable(locator));
	    }

	    // Method to scroll to element
	    public void scrollToElement(WebElement element) {
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].scrollIntoView(true);", element);
	    }
	}