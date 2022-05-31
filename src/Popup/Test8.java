package Popup;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test8 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http:/www.actimind.com/contract.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

}
