package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
     public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.facebook.com");
		 
		 driver.findElement(By.linkText("Forgotten password?")).click();
		 driver.findElement(By.id("identify_email")).sendKeys("1234543");
		 driver.findElement(By.id("did_submit")).click();
	}

}
