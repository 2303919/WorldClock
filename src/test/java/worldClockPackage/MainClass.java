package worldClockPackage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class MainClass {
	
	public static WebDriver driver;
	public static String url="https://be.cognizant.com/";
	public static String browser="edge";
	
	public static void launch() {
		driver=DriverSetUp.getWebDriver(browser);
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().deleteAllCookies();
	}
	
	public static void verifyIndiaTime() {
		
	}
	
	public static void verifyLondonTime() {
		
	}

	public static void verifyNewYorkTime() {
	
	}
	
	public static void verifyApp() {
		
	}
	
	public static void takeScreenShot() {
		TakesScreenshot ss = (TakesScreenshot) driver;
		File src=ss.getScreenshotAs(OutputType.FILE);
		try {
			File trg=new File("./testcase/Screenshot/image1.png");
			FileUtils.copyFile(src, trg);
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
			}
	}
}
