# Automation-Script
Project on LMS, Automation Script.
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.Alert;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainHyperlink1 {
	private WebDriver driver;
	public static String baseUrl = "https://www.hcltss-lms.com/login/index.php";
	@BeforeClass
	public void setup() throws Exception{
		System.setProperty("webdriver.chrome.driver", "C:\\Eclipse\\Selenium Jars\\msedgedriver.exe");
		driver = new ChromeDriver();
	    driver.get(baseUrl);
	}
	
	@Test
	public void testweb12() throws Exception{
		
		
		driver.findElement(By.id("username")).sendKeys("LTTB0721124");
		driver.findElement(By.id("password")).sendKeys("Jan2019$");
		driver.findElement(By.id("loginbtn")).click();
		
		Set<String> LearnerLanding3 = driver.getWindowHandles();
		Iterator<String> i3 = LearnerLanding3.iterator();
//        String mainwindow3 = i3.next();

		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/section/div/div/div/div[3]/div/div[2]/div/div[1]/div[2]/a")).click();
		String mainwindow3 = i3.next();

		String Quiz = i3.next();
		driver.switchTo().window(Quiz);
		
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
		
		
//		boolean Firstdiv =driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[2]/section/aside/section[1]/div/div")).isDisplayed();
//		System.out.println(Firstdiv);
//		
//		boolean Seconddiv = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[2]/section/aside/section[1]/div/div/ul")).isDisplayed();
//		System.out.println(Seconddiv);
//		
//		boolean Firstlist =driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[2]/section/aside/section[1]/div/div/ul/li[1]")).isDisplayed();
//		System.out.println(Firstlist);
//		
//		driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[2]/section/aside/section[1]/div/div/ul/li[2]")).isDisplayed();
//		driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[2]/section/aside/section[1]/div/div/ul/li[2]/a")).click();
//		driver.navigate().back();
//		
//        driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[2]/section/aside/section[1]/div/div/ul/li[3]")).isDisplayed();
//		driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[2]/section/aside/section[1]/div/div/ul/li[3]/a")).click();
//		driver.navigate().back();
		
		
		driver.switchTo().window(mainwindow3);
	}
	@AfterClass
	public void tearDown() throws Exception{
		this.driver.close();
	}

}
