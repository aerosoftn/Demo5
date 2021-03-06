package pkg1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchTest{
	WebDriver driver;
	@Test
	public void openGoogle() {
		System.out.println("opening chrome driver");
		
	WebDriverManager.chromedriver().setup();
	
		driver=new ChromeDriver();
	
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		System.out.println("opening site");
		driver.get("https://www.google.com/");
		System.out.println("Page title is : "+driver.getTitle());
	}
	@Test
	public void openStackOverFlow() {
		System.out.println("opening chrome driver");
		
	WebDriverManager.chromedriver().setup();
	
		driver=new ChromeDriver();
	
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		System.out.println("opening site");
		driver.get("https://stackoverflow.com/");
		System.out.println("Page title is : "+driver.getTitle());
	}
	
	@AfterMethod
	public void tearDown() {
		driver.close();
	}
}