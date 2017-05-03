package maventest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Maveng2 {
	WebDriver driver=new FirefoxDriver();
	@BeforeTest
	public void BT(){
		System.out.println("git test starts");
	}
  @Test
  public void TestingGIT() {
	  //WebDriver driver=new FirefoxDriver();
	  driver.get("https://www.google.co.uk/");
	  System.out.println("GIT HUB CHECKING");
  }
  @AfterTest
  public void AT(){
	  driver.close();
	  System.out.println("vvvv");
  }
}
