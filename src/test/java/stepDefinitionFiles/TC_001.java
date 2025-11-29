package stepDefinitionFiles;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import allpages.Regpage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC_001 {

public static WebDriver driver;
Regpage r;

@Given("User has opened the browser and launched the application")
public void user_has_opened_the_browser_and_launched_the_application() {
   
	driver = new ChromeDriver();
	   Hooks.driver = driver;

	  driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
	  driver.manage().window().maximize();
	  
	   r = new Regpage(driver);
	 }


@When("User enters valid first name")
public void user_enters_valid_first_name() {
   
	r.firstname();
}

@And("User enters valid last name")
public void user_enters_valid_last_name() {
   r.lastname();
}

@And("User enters valid E-mail")
public void user_enters_valid_e_mail() {
   r.Email();
}

@And("User enters Telephone")
public void user_enters_telephone() {
   r.Telephone();
}

@And("User enters password")
public void user_enters_password() {
    r.Password();
}

@And("User enters password confirm")
public void user_enters_password_confirm() {
    r.ConfirmPassword();
}

@And("User clicks on radio button no")
public void user_clicks_on_radio_button_no() {
    r.radiobutton();
}

@And("User clicks on privacy policy checkbox")
public void user_clicks_on_privacy_policy_checkbox() {
    r.checkbox();
}

@And("User clicks on continue button")
public void user_clicks_on_continue_button() {
    r.continuebutton();
}

@Then("User should be registered")
public void user_should_be_registered() {
    
	Assert.assertEquals(driver.getTitle(), "Your Account Has Been Created!");
}


}
