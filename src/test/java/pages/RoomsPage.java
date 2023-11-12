package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class RoomsPage{
	@FindBy(xpath = "//p[contains(text(),'Premium Rooms')]/parent::div/input")
	WebElement premiumRooms;
	@FindBy(xpath = "//p[contains(text(),'Economy Rooms')]/parent::div/input")
	WebElement economyRooms;
	@FindBy(xpath = "//button[text()='Calculate Occupancy']")
	WebElement calculateOccupancy;
	@FindBy(xpath = "//div[@class='main']/div")
	WebElement roomsAndAmountText;
	
	public RoomsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void enterRoomsCount(String premiumRoomCount,String economyRoomCount) {
		premiumRooms.sendKeys(premiumRoomCount);
		economyRooms.sendKeys(economyRoomCount);
	}
	
	public void clickCalculate() {
		calculateOccupancy.click();
	}
	
	public void getRoomsAndAmount()
	{
		String text=roomsAndAmountText.getText();
		//System.out.println(text);
	}
	
}
	
	