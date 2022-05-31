package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tesr10 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		 WebElement search=driver.findElement(By.id("gh-btn"));
		 if(search.isEnabled()) {
			 System.out.println("element is passed");
		 }
		 else
		 {
			 System.out.println("element is not pass");
		 }
		 driver.close();
		
		
		

	}

}
