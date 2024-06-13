import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
public class MobileOtpLogin {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:/Users/HP/Documents/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver() ;
		driver.get("https://nuxt.hiscraves.com/");
		driver.getTitle();		
		String CurrentURL = driver.getCurrentUrl();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement myaccbtn = driver.findElement(By.xpath("(//img[@class='desktop_view'])[3]"));
		//.desktop_view[src='https://hiscraves-res.cloudinary.com/image/upload/v1687782831/v2icons/Header/account_icon.svg']
		//div/img[@class='router_link_icon'][1]
		myaccbtn.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement box = driver .findElement(By.xpath("(//input[@id='mobile'])[1]"));
		box.sendKeys("7769936061");
		WebElement Continue = driver.findElement(By.cssSelector("button[class='btn light_btn btn-secondary']"));
		Continue.click();
		WebElement InputOTP = driver.findElement(By.xpath("//div[@id='otp'][1]//input[1]"));
		
}
}