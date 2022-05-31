package screenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//step:1 typcasting
		TakesScreenshot ts=(TakesScreenshot) driver;
		
		//step:2 access the method and store in RAM
		File ram=ts.getScreenshotAs(OutputType.FILE);
		
		//step:3  specify the location
		File dest=new File(".//photo/amazon.png");
		
		//step:4 copy paste from ram to dest location
		FileUtils.copyFile(ram,dest);
		
		driver.close();
		
	}

}
