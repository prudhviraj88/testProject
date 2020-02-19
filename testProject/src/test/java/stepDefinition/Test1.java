package stepDefinition;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Test1 
{
	WebDriver driver;
	@Given("land on the page")
	public void land_on_the_page() {
		   System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");

		File pathBinary = new File("C:/Users/prudhviraj.meesala/AppData/Local/Mozilla Firefox/firefox.exe");
		FirefoxBinary firefoxBinary = new FirefoxBinary(pathBinary);   
		DesiredCapabilities desired = DesiredCapabilities.firefox();
		FirefoxOptions options = new FirefoxOptions();
		desired.setCapability(FirefoxOptions.FIREFOX_OPTIONS, options.setBinary(firefoxBinary));      
	   driver = new FirefoxDriver(options);
	   
	   driver.get("https://accounts.lambdatest.com/login");
	   
	   
	}

	@When("enter the wrong credentials")
	public void enter_the_wrong_credentials() {
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("prud@asd.com");
		driver.findElement(By.xpath("//input[@id='userpassword']")).sendKeys("password");
		driver.findElement(By.xpath("//input[@id='userpassword']")).sendKeys("password");
		driver.findElement(By.xpath("//button[@class='btn btn-dark submit-btn']")).sendKeys("password");


	}

	@Then("Show validation message")
	public void show_validation_message() {
		System.out.println("success message");
		
	}


}
