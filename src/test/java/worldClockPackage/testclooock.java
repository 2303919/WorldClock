package worldClockPackage;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;



import org.testng.Assert;

import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeClass;

import org.testng.annotations.Test;
 

 
public class testclooock {

	public static WebDriver driver;
	public static String url="https://be.cognizant.com/";
	public static String browser="chrome";
	public static POMclock wc;

	@BeforeClass
	void openpage(){
		driver=DriverSetUp.getWebDriver(browser);
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().deleteAllCookies();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,document.body.ScrollHeight)");
	
	}


	@Test(priority = 1)
	public static void Test_WorldClock_Title() {
		wc=new POMclock(driver);
		Assert.assertEquals(wc.checkclockbox(), true);
	}

	//India time
	@Test(priority = 2)
	void BangaloreWatch_Title() {
		wc=new POMclock(driver);
		Assert.assertEquals(wc.checkindiaclock(), true);
	}

	@Test(priority = 3)
	public static void Bangalore_Time() {
		Date currentTime = new Date();
		SimpleDateFormat timeformat=new SimpleDateFormat("hh:mm a");
		String formatedtime=timeformat.format(currentTime); 
		//System.out.println(formatedtime);
		String webtime=wc.checkindiatime();
		System.out.println(webtime);
		Assert.assertEquals(webtime, formatedtime);
	}

	@Test(priority = 4)
	public static void Bangalore_Date() {
		LocalDate currentSysDate=LocalDate.now();
		DateTimeFormatter date_formatter=DateTimeFormatter.ofPattern("E, M/d/yyyy");
		String formattedDate=currentSysDate.format(date_formatter);
		System.out.println(formattedDate);
		String webdate=wc.chechindiadate();
		Assert.assertEquals(webdate, formattedDate);
	
	}

	//london test
	@Test(priority = 5)

	void LondonWatch_Tittle() {

		Assert.assertEquals(wc.checklonclock(), true);

	}

	@Test(priority = 6)

	void London_Time() {

	}

	@Test(priority = 7)

	void London_Date() {

	}

	@Test(priority = 8)

	void London_Timegap() {

	}


	//NY Test


	@Test (priority = 9)

	void NY_Watchtittle() {

		Assert.assertEquals(wc.nyclock(), true);

	}

	@Test(priority = 10)

	void NY_Time() {

	}

	@Test (priority = 11)

	void NY_Date() {

	}

	@Test (priority = 12)

	void NY_Timegap() {

	}


	//close browser

	@AfterClass

	void close() {

		driver.close();

	}

}
