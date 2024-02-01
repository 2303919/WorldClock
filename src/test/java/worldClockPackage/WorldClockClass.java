package worldClockPackage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import worldClockPackage.DriverSetUp;

public class WorldClockClass {

	public static String url="http://change2naturalfoods.com";
	public static WebDriver driver = DriverSetUp.getWebDriver("edge");
	
	public static void launch() {
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().deleteAllCookies();
	}
}
