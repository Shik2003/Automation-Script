# Automation-Script
//Project on LMS, Automation Script.

//import org.dom4j.rule.PriorityTest;

//import org.openqa.selenium.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
//import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Login extends Home {
	
	private WebDriver driver;
	public static String baseUrl="https://www.hcltss-lms.com/login/index.php";
	public static Boolean username = false; 
	public static Boolean password = false; 
	public static Boolean button = false; 
	public static Boolean Hyperlink = false;
	public static Boolean Hyperlink1 = false;
	
		
	@BeforeClass
	public void setUp() throws Exception {
	System.setProperty("webdriver.chrome.driver", "C:\\Eclipse\\Selenium Jars\\msedgedriver.exe");
	driver = new ChromeDriver();
	driver.get(baseUrl);
	}
	
	
	
	@Test  
	public void testweb() throws Exception {
		
	username= driver.findElement(By.id("username")).isDisplayed();
	System.out.println(username);
	password = driver.findElement(By.id("password")).isDisplayed();
	System.out.println(password);
	button = driver.findElement(By.id("loginbtn")).isDisplayed();
	System.out.println(button);
	
	Hyperlink = driver.findElement(By.linkText("Forgotten your username or password?")).isDisplayed();
	System.out.println(Hyperlink);
	
	Hyperlink1 = driver.findElement(By.linkText("Data retention summary")).isDisplayed();
	System.out.println(Hyperlink1);

	
	}
	@Test
	public void testweb1() throws Exception{
	
		driver.findElement(By.id("username")).sendKeys("LTTB0721124");
		driver.findElement(By.id("password")).sendKeys("Jan2019$");
		driver.findElement(By.id("loginbtn")).click();
		driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[2]/div/nav/div[1]/a/img")).click();
		driver.findElement(By.xpath("//*[@id=\"action-menu-toggle-0\"]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/nav[1]/ul[1]/li[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[6]")).click();
//		driver.close();

	}
	
	@Test
	public void testweb2() throws Exception {
		
		
		driver.findElement(By.id("username")).sendKeys("LTTB0721124");
		driver.findElement(By.id("password")).sendKeys("Jan2019");
		driver.findElement(By.id("loginbtn")).click();
		driver.navigate().refresh();
	//	driver.close();
		
	}
	@Test
	public void testweb3() throws Exception{
		driver.navigate().refresh();
		driver.findElement(By.id("username")).sendKeys("LTTB0721177");
		driver.findElement(By.id("password")).sendKeys("Vaibhav#@2611");
		driver.findElement(By.id("loginbtn")).click();
//		driver.navigate().back();
//		driver.getWindowHandle();
//		driver.findElement(By.id("single_button6213cad2675692")).click();
//		driver.get(baseUrl);
		driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[2]/div/nav/div[1]/a/img")).click();
		driver.findElement(By.xpath("//*[@id=\"action-menu-toggle-0\"]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/nav[1]/ul[1]/li[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[6]")).click();
	//	driver.close();
	}
	@Test
	public void testweb4() throws Exception{
		
		driver.findElement(By.id("username")).sendKeys("LTTB0721177");
		driver.findElement(By.id("password")).sendKeys("Vaibhav#@261");
		driver.findElement(By.id("loginbtn")).click();
		driver.navigate().refresh();
		//driver.close();
	}
	
	@AfterClass
	public void tearDown() throws Exception{	
		this.driver.close();
	}
	
	
	
	

}
