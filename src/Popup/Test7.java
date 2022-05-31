package Popup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Test7 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.busonlineticket.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//a[text()=' Bus']")).click();
		driver.findElement(By.xpath("//i[@class=\"fa fa-calendar-alt\"]")).click();
		driver.findElement(By.xpath("//a[text()='14']")).click();

	}

}
