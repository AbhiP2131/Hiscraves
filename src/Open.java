import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.Test;
public class Open {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Users/HP/Documents/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		WebElement Search = driver.findElement(By.id("twotabsearchtextbox"));
		Search.sendKeys("Headfones");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.s-suggestion-container")));
		 List<WebElement> suggestions = driver.findElements(By.cssSelector("div.autocomplete-results-container div.s-suggestion"));
         if (suggestions.size() > 1) {
             WebElement secondSuggestion = suggestions.get(1);
             secondSuggestion.click();}
	}
	
	
         
         // Correct method declaration with @Test annotation
         @Test
         public void testAddition() {
             int a = 5;
             int b = 10;
             int sum = a + b;
             Assert.assertEquals(sum, 15, "Sum should be 15");
         }

         // Correct method declaration with @Test annotation and dependency
         @Test(dependsOnMethods = "testAddition")
         public void testSubtraction() {
             int x = 10;
             int y = 5;
             int difference = x - y;
             Assert.assertEquals(difference, 5, "Difference should be 5");
         }
     }

