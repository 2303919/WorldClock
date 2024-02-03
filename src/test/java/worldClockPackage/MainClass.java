package worldClockPackage;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import UserDefinedPackage.DriverSetUp;

public class MainClass {
	
	public static WebDriver driver;
	public static String url="https://be.cognizant.com/";
	public static String browser="chrome";
	
	@BeforeClass
	public static void launch() {
		driver=DriverSetUp.getWebDriver(browser);
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().deleteAllCookies();
	}
	
	public static void scrollDown() {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,document.body.ScrollHeight)");
	}
	
	
	@Test
	public static void verifyIndiaTime() {
		Date currentTime = new Date();
		SimpleDateFormat timeformat=new SimpleDateFormat("hh:mm a");
		String formatedtime=timeformat.format(currentTime); 
		System.out.println(formatedtime);
		
		LocalDate currentSysDate=LocalDate.now();
		DateTimeFormatter date_formatter=DateTimeFormatter.ofPattern("E, M/d/yyyy");
		String formattedDate=currentSysDate.format(date_formatter);
		System.out.println(formattedDate);
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
	
	@AfterClass
	public static void closeBrowser() {
		DriverSetUp.closeDriver();	}
	
}
