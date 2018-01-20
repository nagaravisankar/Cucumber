package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class SeleniumLoginTest {

	WebDriver driver;
	String baseURL; 
	
@BeforeClass

public void setUp() {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\workspace\\Chrome1\\chromedriver.exe");	
		driver = new ChromeDriver();
		String baseURL = "http://www.gmail.com/";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);	
		driver.get(baseURL);
}

@Test		

public void testlogin() {
		
		
		/*WebElement signupLink = driver.findElement(By.id("identifierId"));
		signupLink.click();
		
		WebElement loginLink = driver.findElement(By.id("signUpDialogswitchDialogLink"));
		loginLink.click();*/
		
		WebElement emailField = driver.findElement(By.xpath("//*[@id=\"identifierId\"]"));
		emailField.sendKeys("ravibe.eie@gmail.com");
		
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/content/span")).click();
		
		
		WebElement passwordField = driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input"));
		passwordField.sendKeys("munnabae");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement goButton = driver.findElement(By.id("passwordNext"));
		goButton.click();
		
		driver.findElement(By.xpath("//*[@id=\"gb\"]/div[1]/div[1]/div[2]/div[5]/div[1]/a/span")).click();
		driver.findElement(By.linkText("Sign out")).click();
		
// With recent webdriver and FF update, there might be issues in clicking the goButton.
// If you also encouter the issues, please comment the above code for goButton and un-comment the below code
		
//		WebElement goButton =driver.findElement(By.xpath("//button[@id='memberLoginDialogsubmitButton']"));
//		Actions action = new Actions(driver);
//		action.moveToElement(goButton).click().perform();
		
//		Thread.sleep(3000);
}
@AfterClass	
public void cleanUp() {

	//	WebElement practicePage = driver.findElement(By.id("DrpDwnMn06bg"));
	//	practicePage.click();
		System.out.println("Login Successful");
	}
}