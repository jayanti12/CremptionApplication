package Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		WebElement ele=driver.findElement(By.xpath("//a[text()='Selenium Training']"));
		Thread.sleep(3000);
		Actions s=new Actions(driver);
		s.doubleClick(ele).perform();
		
		
		

	}

}
