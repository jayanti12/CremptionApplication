package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test13 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@class='gb_A']")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//span[text()='Calendar']")).click();
	}

}
