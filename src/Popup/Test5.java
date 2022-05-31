package Popup;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Test5 {
	public static void main(String[] args) throws AWTException {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("---disable--notifications");
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://www.olx.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		
		FirefoxOptions options= new FirefoxOptions();
		options.addArguments("---disable---notifications");
		WebDriver driver1=new FirefoxDriver (options);
	
		
		
		driver1.manage().window().maximize();
		driver1.get("https://www.olx.in/");
		driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}

}
