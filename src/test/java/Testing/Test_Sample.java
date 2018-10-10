package Testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Test_Sample {
	
	public WebDriver driver;
	public int iBroType = 1;
	public String sURL = "https:\\google.com";
	
	public void Launch_browser(){
		switch (iBroType) {
		case 1:
			System.out.println("User Option is : "+iBroType+" , So Invoking Chrome Browser");
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\acer\\Downloads\\drivers\\Chrome Driver\\chromedriver.exe");
			driver = new ChromeDriver();
			break;
		case 2:
			System.out.println("User Option is : "+iBroType+" , So Invoking FF Browser");
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\acer\\Downloads\\drivers\\Chrome Driver\\chromedriver.exe");
			driver = new FirefoxDriver();
			break;
		case 3:
			System.out.println("User Option is : "+iBroType+" , So Invoking IE Browser");
			System.setProperty("webdriver.ie.driver", "C:\\Users\\acer\\Downloads\\drivers\\Chrome Driver\\chromedriver.exe");
			driver = new InternetExplorerDriver();
			break;
		case 4:
			System.out.println("User Option is : "+iBroType+" , So Invoking Headless Browser");
			driver = new HtmlUnitDriver();
			break;
		default:
			System.out.println("User Option is wrong: "+iBroType+" , So Invoking Default Chrome Browser");
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\acer\\Downloads\\drivers\\Chrome Driver\\chromedriver.exe");
			driver = new ChromeDriver();
			break;
		}
	}
	
	public void Browser_setting() {
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
	}
	
	public void navigate_URL() {
		driver.get(sURL);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	}


}
