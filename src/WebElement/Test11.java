package WebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test11 {


	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 WebElement user=driver.findElement(By.xpath("//a[text()='Create New Account']"));
		 if(user.isSelected()) {
			 System.out.println("element is pass");
		 }
		 else
		 {
			 System.out.println("element is not pass");
		 }
		 
		 }
		
		

	}


