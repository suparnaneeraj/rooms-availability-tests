package automation.roomOccupancy;


import io.cucumber.java.After;
import pages.RoomsPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.And;


import utility.CucumberHelper;
import io.cucumber.java.en.Then;
import io.cucumber.java.Before;

public class RoomOccupancyStepDefinition {
    CucumberHelper helper=new CucumberHelper();
    RoomsPage roomsPage;

    @Before
    public void setUp()
    {
    	helper.CreateWebDriver();
    	helper.openApplication();
    }
    @Given("^the user enters the premium room count \"([^\"]*)\" economy room count \"([^\"]*)\"$")
    public void the_user_enters_the_premium_room_count_economy_room_count(String premiumRoomCount, String economyRoomCount) throws InterruptedException
    {
    	roomsPage=new RoomsPage(helper.getDriver());
    	roomsPage.enterRoomsCount(premiumRoomCount, economyRoomCount);
    }


    @And("^clicks calculate occupancy button$")
    public void clicks_calculate_occupancy_button()  throws InterruptedException{
        roomsPage.clickCalculate();
    }


    @Then("^the number of premium rooms occupied \"([^\"]*)\" along with the amount earned \"([^\"]*)\" should be displayed$")
    public void the_number_of_premium_rooms_occupied_along_with_the_amount_earned_should_be_displayed(String premiumRoomOccupied,String premiumAmount) throws InterruptedException
    {
        roomsPage.getRoomsAndAmount();
    }
    @And("^the number of economy rooms occupied \"([^\"]*)\" along with the amount earned \"([^\"]*)\" should be displayed$")
    public void the_number_of_economy_rooms_occupied_along_with_the_amount_earned_should_be_displayed(String economyRoomOccupied,String economyAmount) throws InterruptedException
    {
       //to do 
    }
    @After
    public void tearDown(){

    	helper.getDriver().close();
    }
}
    