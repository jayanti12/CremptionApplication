package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test9 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		 WebElement ele=driver.findElement(By.id("keepLoggedInLabel"));
		if(ele.isSelected())
		{
			System.out.println("element is selected");
		}else
		{
			System.out.println("element is not selected");
		}
		driver.close();
		}
	}


