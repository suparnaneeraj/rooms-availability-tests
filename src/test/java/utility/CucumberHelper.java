package utility;


import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class CucumberHelper{
	 public  WebDriver driver=null;
	 final private String url="http://localhost:3002/";
	
	public void CreateWebDriver()
	{
		try { 
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
	public void openApplication()
	{
		driver.get(url);
	}
	public WebDriver getDriver()
	{
		return this.driver;
	}
	public void setDriver(WebDriver driver)
	
	{
		this.driver=driver;
	}
	

}
