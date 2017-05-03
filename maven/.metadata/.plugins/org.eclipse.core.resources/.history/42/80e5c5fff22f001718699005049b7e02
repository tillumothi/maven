package maventest;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.google.common.base.Predicate;

public class TestMaven {
  String filePath="./src/main/resources/maven.properties";
  WebDriver driver;
  Properties prop;
 
  FileInputStream fis;
  @BeforeTest
  public void init() throws IOException{
	  File file=new File(filePath);
	 fis=new FileInputStream(file);
	 prop=new Properties();
	  prop.load(fis);
	
  }
	@Test
  public void gcreddy() {
		driver=new FirefoxDriver();
		 driver.get(prop.getProperty("Url"));
		 driver.manage().window().maximize();
		 /*driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.findElement(By.xpath(prop.getProperty("Firstpro"))).click();
		 driver.findElement(By.xpath(prop.getProperty("Addtocart"))).click();
		 driver.findElement(By.xpath(prop.getProperty("Checkout"))).click();*/
		 }
	@Test
	public void wordpress(){
		
		driver.get(prop.getProperty("wordurl"));
		
		//driver.manage().timeouts().pageLoadTimeout(1000, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		try {
			WebDriverWait wait=new WebDriverWait(driver, 100);
			driver.findElement(By.xpath(prop.getProperty("txtuser"))).sendKeys("admin");
			driver.findElement(By.xpath(prop.getProperty("txtpass"))).sendKeys("pass123");
			driver.findElement(By.xpath(prop.getProperty("loginbutt"))).click();
			Thread.sleep(2000);
		String s=	driver.getTitle();
		System.out.println(s);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.getMessage();
		}
		
		}
	@AfterTest
	public void At(){
		driver.close();
		
	}
}
