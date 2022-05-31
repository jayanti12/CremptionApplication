package TestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test2 {
	@Test(priority=-1)
	public void chats() {
		Reporter.log("Chats",true);
	}
	@Test(priority=-1,invocationCount=5)
	public void calls() {
		Reporter.log("calls",true);
	}
	@Test
	public void settings() {
		Reporter.log("setting",true);
		
	}

}
