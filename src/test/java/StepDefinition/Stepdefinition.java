package StepDefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import Pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class Stepdefinition {
	
	
	WebDriver driver;
	public LoginPage loginpg;
	@Given("User launch chrome browser")
	public void user_launch_chrome_browser() {
		ChromeOptions options= new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sumit\\Desktop\\soft\\chrome\\chromedriver.exe");
        driver=new ChromeDriver(options);
        loginpg=new LoginPage(driver);

	}


	@When("user opens URL {string}")
	public void user_opens_URL(String url) {
		
		 driver.get(url);
	   
	    
	}

	@When("User enter email as {string} and Password as {string}")
	public void user_enter_email_as_and_Password_as(String email, String password) {
		
	        loginpg.LoginApplication(email,password);
	  
	}

	@When("click on login")
	public void click_on_login() {

	        loginpg.loginbutton();

	    
	   
	}

	@Then("page title should be {string}")
	public void page_title_should_be(String expectedtitle) {
		String actualtitle=driver.getTitle();
	      Assert.assertEquals(actualtitle,expectedtitle);
	    
	   
	}

	@Then("close the browser")
	public void close_the_browser() {
		driver.quit();
	   
	    
	}

    }

