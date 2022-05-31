package Dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement dropdown=driver.findElement(By.id("searchDropdownBox"));
		Select s=new Select(dropdown);
		Thread.sleep(3000);
		s.selectByIndex(5);
		Thread.sleep(3000);
		s.selectByValue("search-alias=kitchen-intl-ship");
		Thread.sleep(3000);
		s.selectByVisibleText("Digital Music");
		System.out.println(s.isMultiple());
		List<WebElement>alloption=s.getOptions();
		System.out.println(alloption.size());
		for(WebElement b:alloption) {
			System.out.println(b.getText()); 
			
		}
		driver.close();
		
		

	}

}
