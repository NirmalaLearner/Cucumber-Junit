package Step_defnitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class Steps {
	
	WebDriver driver;

	@Given("Iam able to navigate onto the login page")
	public void iam_able_to_navigate_onto_the_login_page() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\NirmalaArjunan\\Music\\Files\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
	}
	
	@When("I enter the username as {string}")
	public void i_enter_the_username_as(String string) {
		driver.findElement(By.id("txtUsername")).sendKeys(string);   
	}
	
	@When("I enter the password as {string}")
	public void i_enter_the_password_as(String string) {
	    driver.findElement(By.id("txtPassword")).sendKeys(string);
	}
	
	@When("I click on the login button")
	public void i_click_on_the_login_button() {
		driver.findElement(By.id("btnLogin")).click();    
	}
	
	@Then("I should see the username as {string}")
	public void i_should_see_the_username_as(String string) throws InterruptedException {
		String successLoginName = driver.findElement(By.id("welcome")).getText();
		String actualData = "string";
		Assert.assertEquals(successLoginName, actualData);
		System.out.println("Login Successful");
		Thread.sleep(3000);
	}
		
}
