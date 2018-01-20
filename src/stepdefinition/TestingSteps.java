package stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestingSteps {
	
	static WebDriver driver;
	
@Given("^User is on Home page$")
public void user_is_on_Home_page()  {
    // Write code here that turns the phrase above into concrete actions
	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\workspace\\Chrome1\\chromedriver.exe");	
	driver = new ChromeDriver();
	String baseURL = "http://www.gmail.com/";
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);	
	driver.get(baseURL);
    
}

@Given("^some other precondition$")
public void some_other_precondition() {
    // Write code here that turns the phrase above into concrete actions
    
}

@When("^User enters user name and password$")
public void user_enters_user_name_and_password()  {
    // Write code here that turns the phrase above into concrete actions
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
	
    
}

@When("^some other action$")
public void some_other_action()  {
    // Write code here that turns the phrase above into concrete actions
    
}

@When("^yet another action$")
public void yet_another_action() {
    // Write code here that turns the phrase above into concrete actions
    
}

@Then("^He can visit pratice page$")
public void he_can_visit_pratice_page()  {
    // Write code here that turns the phrase above into concrete actions
	WebElement goButton = driver.findElement(By.id("passwordNext"));
	goButton.click();
	
	driver.findElement(By.xpath("//*[@id=\"gb\"]/div[1]/div[1]/div[2]/div[5]/div[1]/a/span")).click();
	driver.findElement(By.linkText("Sign out")).click();
	System.out.println("Login Successful");
}

@Then("^check more outcomes$")
public void check_more_outcomes() {
    // Write code here that turns the phrase above into concrete actions
    
}

@Given("^I want to write a step with name(\\d+)$")
public void i_want_to_write_a_step_with_name(int arg1) {
    // Write code here that turns the phrase above into concrete actions
    
}

@When("^I check for the (\\d+) in step$")
public void i_check_for_the_in_step(int arg1) {
    // Write code here that turns the phrase above into concrete actions
    
}

@Then("^I verify the success in step$")
public void i_verify_the_success_in_step() {
    // Write code here that turns the phrase above into concrete actions
    
}

@Then("^I verify the Fail in step$")
public void i_verify_the_Fail_in_step() {
    // Write code here that turns the phrase above into concrete actions
    
}


	
}
