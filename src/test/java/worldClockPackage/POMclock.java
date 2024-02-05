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
	@FindBy(xpath="(//*[@id=\"CaptionElementView\"])[3]")
	WebElement Title_clock;
	//Bangalore, India (IST)
	@FindBy(xpath="(//*[@data-automation-id=\"clock-card-location\"])[1]") 
	WebElement india_loc;
	@FindBy(xpath="//*[@id=\"vpc_WebPart.WorldClockWebPart.internal.60655e4a-73c8-49d0-9571-c762791557af\"]/div/div[2]/div/div/div/div/div/div[1]/div/div/div/div[2]/div[1]")
	WebElement india_time;
	@FindBy(xpath="//*[@id=\"vpc_WebPart.WorldClockWebPart.internal.60655e4a-73c8-49d0-9571-c762791557af\"]/div/div[2]/div/div/div/div/div/div[1]/div/div/div/div[2]/div[2]/div[2]")
	WebElement day_date;
	//london 
	@FindBy(xpath="(//*[@data-automation-id='clock-card-location'])[2]")
	WebElement lon_loc;
	@FindBy(xpath="//*[@id=\"vpc_WebPart.WorldClockWebPart.internal.60655e4a-73c8-49d0-9571-c762791557af\"]/div/div[2]/div/div/div/div/div/div[2]/div/div/div/div[2]/div[1]")
	WebElement lon_time;
	@FindBy(xpath="//*[@id=\"vpc_WebPart.WorldClockWebPart.internal.60655e4a-73c8-49d0-9571-c762791557af\"]/div/div[2]/div/div/div/div/div/div[2]/div/div/div/div[2]/div[2]/div[2]")
	WebElement lon_date;
	@FindBy(xpath="//*[@id=\"vpc_WebPart.WorldClockWebPart.internal.60655e4a-73c8-49d0-9571-c762791557af\"]/div/div[2]/div/div/div/div/div/div[2]/div/div/div/div[2]/div[2]/div[1]")
	WebElement lon_ind_gap;
	//NY
	@FindBy(xpath="(//*[@data-automation-id='clock-card-location'])[3]")
	WebElement ny_loc;
	@FindBy(xpath="//*[@id=\"vpc_WebPart.WorldClockWebPart.internal.60655e4a-73c8-49d0-9571-c762791557af\"]/div/div[2]/div/div/div/div/div/div[3]/div/div/div/div[2]/div[1]")
	WebElement ny_time;
	@FindBy(xpath="//*[@id=\"vpc_WebPart.WorldClockWebPart.internal.60655e4a-73c8-49d0-9571-c762791557af\"]/div/div[2]/div/div/div/div/div/div[3]/div/div/div/div[2]/div[2]/div[2]") 
	WebElement ny_date;
	@FindBy(xpath="//*[@id=\"vpc_WebPart.WorldClockWebPart.internal.60655e4a-73c8-49d0-9571-c762791557af\"]/div/div[2]/div/div/div/div/div/div[3]/div/div/div/div[2]/div[2]/div[1]") 
	WebElement ny_india_gap;
 
	
	//getting all time dates
	public String checkclockbox(){
		String present=Title_clock.getText();
		return present;
	}
	//India Clock
	public String checkindiaclock() {
		String bangtitle=india_loc.getText();	
		return bangtitle;
	}
	public String checkindiatime() {
		return india_time.getText();
	}
	public String chechindiadate() {
		return day_date.getText();
	}
	//LONDON CLOCK
	public String checklonclock() {
		String lontitle=lon_loc.getText();
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
	public String nyclock() {
		String nytitle=ny_loc.getText();
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


