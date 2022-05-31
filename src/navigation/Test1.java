package navigation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://skillrary.com/");
		Thread.sleep(3000);
		driver.navigate().to("https://www.facebook.com/");
		
		//back
		driver.navigate().back();
		
		//forward
		driver.navigate().forward();
		
		//refresh
		driver.navigate().refresh();
		
	}

}
