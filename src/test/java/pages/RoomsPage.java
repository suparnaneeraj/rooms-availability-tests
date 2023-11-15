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
		premiumRooms.clear();
		premiumRooms.sendKeys(premiumRoomCount);
		economyRooms.clear();
		economyRooms.sendKeys(economyRoomCount);
	}
	
	public void clickCalculate() {
		calculateOccupancy.click();
	}
	
	public String[] getRoomsAndAmount()
	{
		String text=roomsAndAmountText.getText();
		String[] resultArrayRoomsAmount=extractValues(text);
		return resultArrayRoomsAmount;
		
	}
	public String[] extractValues(String text)
	{
		String textWithoutNewline=text.replace("\n",":");
		String arrayRoomsAndAmount[]=new String[4];
		String arrayValues[]=textWithoutNewline.split(":");
		int j=0;
		for(int i=1;i<arrayValues.length;i+=2) {
			arrayRoomsAndAmount[j]=arrayValues[i].trim();
			j++;
		}
		for(int i=0;i<arrayRoomsAndAmount.length;i++) {
			System.out.println(arrayRoomsAndAmount[i]);
		}
		return arrayRoomsAndAmount;

	}
}
	
	