package Amazon_project;
import java.time.Duration;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

//homepage

public class AmazonApplication {
	
	static WebDriver driver =null;

	
	public static void main(String[] args) throws InterruptedException {
		
		setUp();
		driver.close();
	    
	}
	
	public static void setUp() {
		
		String siteUrl = "https://www.amazon.in";
		String driverPath = "drivers/windows/chromedriver.exe";

		System.setProperty("webdriver.chromedriver.driver", driverPath);

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get(siteUrl);
		
		String exptitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
	    String acttitle = driver.getTitle();
	    
	    if(exptitle.equals(acttitle)) {
	    	   System.out.println("Amazon setup was successfully");
	       }else
	       {
	    	   System.out.println("Amazon Setup was not done");
	       }
	    
	}
	
}