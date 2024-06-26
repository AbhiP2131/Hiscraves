import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
public class Hiscraves {
WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/HP/Documents/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver() ;
		driver.get("https://nuxt.hiscraves.com/");
		
		String title = driver.getTitle();
		System.out.println(title);
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
		// WebElement disappearingElement = driver.findElement(By.id("swal2-title"));
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        WebElement toasterPopup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("swal2-title")));
	        
		String  OTP = toasterPopup.getText();
		String [] test = OTP.split(" ");
		String ActualOTP = (test[3]);
		System.out.println(ActualOTP);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement InputOTP = driver.findElement(By.xpath("//div[@id='otp'][1]//input[1]"));
		InputOTP.click();
		InputOTP.sendKeys(ActualOTP);
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
      //  WebElement sidebarclk = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='nav_toggle_btn desktop_view tran-btn']//img[@alt='menu']")));
       // sidebarclk.click();
        try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
      //  String Handleid= driver.getWindowHandle();
      //  System.out.println(Handleid);
	//	WebElement EXPANDSHOPBUTTON = driver.findElement(By.cssSelector("body > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > header:nth-child(2) > nav:nth-child(1) > div:nth-child(3) > div:nth-child(2) > div:nth-child(1) > ul:nth-child(1) > div:nth-child(2) > li:nth-child(3) > a:nth-child(1)"));
		//EXPANDSHOPBUTTON.click();
		//driver.findElement(By.xpath("(//span[contains(text(),'Shop')])[1]")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();}
		}
		public void scrollToElement(WebElement element) throws InterruptedException {
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].scrollIntoView(true);", element);
	//	 WebElement DSHOP =driver.findElement(By.xpath("//a[@href='/shop']//div[@class='d-flex align-items-center gap-2']//span[contains(text(),'Shop')]"));
		 Thread.sleep(3000);
			WebElement editicon =  driver.findElement(By.cssSelector("div[class='row row-cols-1 row-cols-sm-3 row-cols-md-3 row-cols-lg-3 row-cols-xl-3'] div:nth-child(1) button:nth-child(1) div:nth-child(1) img:nth-child(1)"));
		   
			Thread.sleep(5000);
			editicon.click();
       // DSHOP.click();
		 driver.manage().window().maximize();
		 String SHopURL = driver.getCurrentUrl();
		 System.out.println(SHopURL);
		  //Starting shopping by using filter
		//WebElement SmallFilter = wait.until(ExpectedConditions.visibilityOfElementLocatedBy.xpath("//span[@class='custom_checkbox']"));
		//SmallFilter.click();
	}
	}
