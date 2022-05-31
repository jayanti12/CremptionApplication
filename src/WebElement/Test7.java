package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test7 {

	private static String spacing;

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("phone");
		driver.findElement(By.id("nav-search-submit-button")).submit();
		
		
		
		

	}

}
