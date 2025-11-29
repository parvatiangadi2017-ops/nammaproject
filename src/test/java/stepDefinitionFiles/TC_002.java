package stepDefinitionFiles;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import allpages.Loginpage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC_002 {
	WebDriver driver;
	Loginpage lf ;


@Given("User launches the browser and opens the login page")
public void user_launches_the_browser_and_opens_the_login_page() throws InterruptedException {
	driver =new ChromeDriver();
	  driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
	     driver.manage().window().maximize();
	     Thread.sleep(5000);
	      lf = new Loginpage (driver);
	     
	 }

    


@When("User enters a valid Email ID")
public void user_enters_a_valid_email_id() {
	 lf.enterEmail();
   
}

@When("User enters a valid Password")
public void user_enters_a_valid_password() {
	  lf.enterPassword(null);
    
}

@When("User clicks on the Login button")
public void user_clicks_on_the_login_button() {
	 lf.clickLoginBtn();
   
}

@Then("User should be logged in successfully")
public void user_should_be_logged_in_successfully() {
	Assert.assertEquals(driver.getTitle(), "My Account");
}


}
