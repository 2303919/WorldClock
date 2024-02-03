package worldClockPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
 
public class POMclock {
	public WebDriver driver;
	POMclock (WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
		//Title 
	@FindBy(xpath="//*[@id=\"CaptionElementView\"]")
	WebElement Title_clock;
	//Bangalore, India (IST)
	@FindBy(xpath="//*[@class=\"k_b_816e1fa6 bodyText-273\"][text()=\"Bangalore, India (IST)\"]") 
	WebElement india_loc;
	@FindBy(xpath="//*[@id=\"vpc_WebPart.WorldClockWebPart.internal.60655e4a-73c8-49d0-9571-c762791557af\"]/div/div[2]/div/div/div/div/div/div[1]/div/div/div/div[2]/div[1]")
	WebElement india_time;
	@FindBy(xpath="//*[@id=\"vpc_WebPart.WorldClockWebPart.internal.60655e4a-73c8-49d0-9571-c762791557af\"]/div/div[2]/div/div/div/div/div/div[1]/div/div/div/div[2]/div[2]/div[2]")
	WebElement day_date;
	//london 
	@FindBy(xpath="//*[@id=\"vpc_WebPart.WorldClockWebPart.internal.60655e4a-73c8-49d0-9571-c762791557af\"]/div/div[2]/div/div/div/div/div/div[2]/div/div/div/div[1]")
	WebElement lon_loc;
	@FindBy(xpath="//*[@id=\"vpc_WebPart.WorldClockWebPart.internal.60655e4a-73c8-49d0-9571-c762791557af\"]/div/div[2]/div/div/div/div/div/div[2]/div/div/div/div[2]/div[1]")
	WebElement lon_time;
	@FindBy(xpath="//*[@id=\"vpc_WebPart.WorldClockWebPart.internal.60655e4a-73c8-49d0-9571-c762791557af\"]/div/div[2]/div/div/div/div/div/div[2]/div/div/div/div[2]/div[2]/div[2]")
	WebElement lon_date;
	@FindBy(xpath="//*[@id=\"vpc_WebPart.WorldClockWebPart.internal.60655e4a-73c8-49d0-9571-c762791557af\"]/div/div[2]/div/div/div/div/div/div[2]/div/div/div/div[2]/div[2]/div[1]")
	WebElement lon_ind_gap;
	//NY
	@FindBy(xpath="//*[@id=\"vpc_WebPart.WorldClockWebPart.internal.60655e4a-73c8-49d0-9571-c762791557af\"]/div/div[2]/div/div/div/div/div/div[3]/div/div/div/div[1]")
	WebElement ny_loc;
	@FindBy(xpath="//*[@id=\"vpc_WebPart.WorldClockWebPart.internal.60655e4a-73c8-49d0-9571-c762791557af\"]/div/div[2]/div/div/div/div/div/div[3]/div/div/div/div[2]/div[1]")
	WebElement ny_time;
	@FindBy(xpath="//*[@id=\"vpc_WebPart.WorldClockWebPart.internal.60655e4a-73c8-49d0-9571-c762791557af\"]/div/div[2]/div/div/div/div/div/div[3]/div/div/div/div[2]/div[2]/div[2]") 
	WebElement ny_date;
	@FindBy(xpath="//*[@id=\"vpc_WebPart.WorldClockWebPart.internal.60655e4a-73c8-49d0-9571-c762791557af\"]/div/div[2]/div/div/div/div/div/div[3]/div/div/div/div[2]/div[2]/div[1]") 
	WebElement ny_india_gap;
 
	
	//getting all time dates
	public boolean checkclockbox(){
		boolean present=Title_clock.isDisplayed();
		return present;
	}
	//India Clock
	public boolean checkindiaclock() {
		boolean bangtitle=india_loc.isDisplayed();	
		return bangtitle;
	}
	public String checkindiatime() {
		return india_time.getText();
	}
	public String chechindiadate() {
		return day_date.getText();
	}
	//LONDON CLOCK
	public boolean checklonclock() {
		boolean lontitle=lon_loc.isDisplayed();
		return lontitle;
	}
	public void checklontime() {
		lon_time.getText();
	}
	public void checklondate() {
		lon_date.getText();
	}
	public void checklongaptime() {
		lon_ind_gap.getText();
	}
	//NY CLOCK
	public boolean nyclock() {
		boolean nytitle=ny_loc.isDisplayed();
		return nytitle;
	}
	public void checknytime() {
		ny_time.getText();
	}
	public void checknydate() {
		ny_date.getText();
	}
	public void checknyindiagaptime() {
		ny_india_gap.getText();
	}
}


