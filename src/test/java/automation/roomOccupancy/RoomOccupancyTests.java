package automation.roomOccupancy;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "features/bookingFeature.feature" ,
        glue={"automation.roomOccupancy"} ,
        plugin = {"pretty", "html:target/cucumber/report.html"}
)

public class RoomOccupancyTests {
}
