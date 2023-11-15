package automation.roomOccupancy;


import io.cucumber.java.After;
import pages.RoomsPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.And;


import utility.CucumberHelper;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import io.cucumber.java.Before;

public class RoomOccupancyStepDefinition {
    CucumberHelper helper=new CucumberHelper();
    RoomsPage roomsPage;

    @Before
    public void setUp()
    {
    	helper.createDriver();
    	helper.openApplication();
    }
    @Given("^the user enters the premium room count \"([^\"]*)\" economy room count \"([^\"]*)\"$")
    public void the_user_enters_the_premium_room_count_economy_room_count(String premiumRoomCount, String economyRoomCount) throws InterruptedException
    {
    	roomsPage=new RoomsPage(helper.driver);
    	roomsPage.enterRoomsCount(premiumRoomCount, economyRoomCount);
    }


    @And("^clicks calculate occupancy button$")
    public void clicks_calculate_occupancy_button()  throws InterruptedException{
        roomsPage.clickCalculate();
    }


    @Then("^the count of free rooms \"([^\"]*)\" \"([^\"]*)\" along with their usage \"([^\"]*)\" \"([^\"]*)\" should be displayed$")
    public void the_count_of_free_rooms_along_with_their_usage_should_be_displayed(String freePremiumRooms,String freeEconomyRooms,String usagePremium,String usageEconomy) throws InterruptedException
    {
        String resultRoomsAndAmount[]=roomsPage.getRoomsAndAmount();
        Assert.assertTrue("Incorrect Free Premium room count",resultRoomsAndAmount[0].equals(freePremiumRooms));
        Assert.assertTrue("Incorrect Free Economy room count",resultRoomsAndAmount[1].equals(freeEconomyRooms));
        Assert.assertTrue("Incorrect Premium Usage Values",resultRoomsAndAmount[2].equals(usagePremium));
        Assert.assertTrue("Incorrect Economy usage values",resultRoomsAndAmount[3].equals(usageEconomy));
       
    }
   
    @After
    public void tearDown(){

    	helper.driver.close();
    }
}
    