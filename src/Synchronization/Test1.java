package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test1 {
	

	private static ExpectedConditions ExceptedConditions;

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement username=driver.findElement(By.name("username"));
		wait.until(ExpectedConditions.visibilityOf(username)).sendKeys("admin");
		
		
		WebElement button=driver.findElement(By.xpath("(//div[contains(@class,' qF0y9')])[3]"));
		wait.until(ExceptedConditions.elementToBeClickable(button)).click();
		
		String title=driver.getTitle();
		wait.until(ExceptedConditions.titleContains("insta"));
		
	}

}
