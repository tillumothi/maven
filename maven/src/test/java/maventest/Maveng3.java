package maventest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Maveng3 {
	WebDriver driver=new FirefoxDriver();
	@BeforeTest
	public void BT(){
		System.out.println("git test starts");
	}
	@Test
	public void init11(){
		System.out.println("geb");
	}
	@Test
	public void init1(){
		System.out.println("gebra");
	}
	@Test
	public void init(){
		System.out.println("giraffe");
	}
  @Test
  public void TestingGIT() {
	  //WebDriver driver=new FirefoxDriver();
	  driver.get("https://www.google.co.uk/");
	  System.out.println("GIT HUB CHECKING");
  }
  @Test
  public void TestingGIT1() {
	  //WebDriver driver=new FirefoxDriver();
	  driver.get("https://www.google.co.uk/");
	  System.out.println("GIT checking");
	  }
  @Test
  public void test(){
	  System.out.println("checking");
  }
  @AfterTest
  public void AT(){
	  driver.close();
	  System.out.println("vvvv");
  }
}
