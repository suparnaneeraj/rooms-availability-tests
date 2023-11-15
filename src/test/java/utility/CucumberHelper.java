package utility;

import java.time.Duration;
import java.util.HashMap;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CucumberHelper extends TestConfig {
	public WebDriver driver = null;
	public HashMap<String, String> dataProperties = new HashMap<String, String>();

	public CucumberHelper() {
		dataProperties = getPropertiesAsMap();
	}

	public void createDriver() {
		try {
			switch (dataProperties.get("browser")) {
				case "chrome":
					WebDriverManager.chromedriver().setup();
					driver = new ChromeDriver();
					driver.manage().window().maximize();
					driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
					break;

				case "firefox":
					WebDriverManager.firefoxdriver().setup();
					driver = new FirefoxDriver();
					break;

				case "edge":
					WebDriverManager.edgedriver().setup();
					driver = new EdgeDriver();
					break;

			}
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void openApplication() {
		driver.get(dataProperties.get("url"));
	}

	

}
