package Popup;

import java.time.Duration;
import java.time.temporal.TemporalAmount;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//*[@data-cy='outsideModel']")).click();
		
		driver.findElement(By.xpath("//*[@for='departure']")).click();
		Thread.sleep(3000);
		WebElement ele = driver.findElements(By.xpath("//p[text()='12'])[2]")).get(1);
		System.out.println(ele.getText());
		ele.click();

	}

}
