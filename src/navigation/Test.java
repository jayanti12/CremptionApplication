package navigation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
	public static void main(String[] args) {
		
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://skillrary.com/");
	//back
	driver.navigate().back();
	
	//forward
	driver.navigate().forward();
	
	//refresh
	driver.navigate().refresh();
	}
	

}
