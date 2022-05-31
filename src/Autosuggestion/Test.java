package Autosuggestion;




import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys("dres");
		
		Thread.sleep(3000);
		List <WebElement>ele=driver.findElements(By.xpath("//li[@class='desktop-suggestion null']"));
		
		System.out.println(ele.size());
		for(WebElement a:ele) {
			System.out.println(a.getText());
		}
		driver.close();
		
		
	}

}
