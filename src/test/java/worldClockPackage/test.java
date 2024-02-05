package worldClockPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test {
public static void main(String[] args) {
	String title = null;
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://cognizantonline.sharepoint.com/sites/Be.Cognizant/SitePages/Home.aspx");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//	driver.manage().deleteAllCookies();
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	WebElement world = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"60655e4a-73c8-49d0-9571-c762791557af\"]")));
	//*[@id="vpc_WebPart.WorldClockWebPart.internal.60655e4a-73c8-49d0-9571-c762791557af"]/div/div[1]
//	WebElement world=driver.findElement(By.xpath("//*[@id='vpc_WebPart.WorldClockWebPart.internal.60655e4a-73c8-49d0-9571-c762791557af']/div/div[1]"));
//	js.executeScript("window.scrollBy(0,5000)");
//	js.executeScript("arguments[0].scrollIntoView();", world);
	////div[@class='k_b_816e1far6' and text()='Bangalore, India (IST)']
	/*try {
		WebElement world=driver.findElement(By.xpath("//*[@id=\"CaptionElementView\"]"));
		String worldText=world.getText();
	 WebElement bang=driver.findElement(By.xpath("//div[@id='vpc_WebPart.WorldClockWebPart.internal.60655e4a-73c8-49d0-9571-c762791557af']/div[1]/div[2]/div/div/div/div/div/div/div/div/div[1]/div[1][text()='Bangalore, India (IST)']"));
	 String bangText=bang.getText();
	 System.out.println(worldText);
	 System.out.println(bangText);
	//driver.findElement(By.xpath("//*[contains(@class, 'k_b_816e1fa6') and text()='Bangalore, India (IST)']"));
	System.out.println("hello");
	}catch(Exception e) {}
	*/
//	driver.close();
}
}
