package Popup;

import java.awt.AWTException;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;


import com.google.common.graph.ElementOrder.Type;

public class Test4 {
	public static void main(String[] args) throws AWTException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/download/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Object windowType;
		// new tab
		driver.switchTo().newWindow(WindowType.TAB);
		
		//new window
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.amazon.com//");
		String parent=driver.getWindowHandle();
		System.out.println(parent);
		Set<String> child=driver.getWindowHandles();
		System.out.println(child);
		driver.quit();
		
		
		
		
		
		
	}
	

}
