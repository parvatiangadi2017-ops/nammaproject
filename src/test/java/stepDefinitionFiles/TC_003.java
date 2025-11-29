package stepDefinitionFiles;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import allpages.Loginpage;
import allpages.Regpage;
import allpages.Search;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC_003 {
	
	WebDriver driver;
	Regpage r;
	Loginpage lf;
	Search sp;
	
	@Given("User has logged inn")
	public void user_has_logged_inn() throws InterruptedException {
		driver=new ChromeDriver();
	     driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
	     driver.manage().window().maximize();
	    
	     
	     Thread.sleep(5000);
	     
	     lf = new Loginpage (driver);
	     r = new Regpage(driver);
	      sp=new Search (driver);
	 }
	    
	

	@When("User logs in")
	public void user_logs_in() {
		sp. search();
	    	}

	@When("User enters a valid product name in the search boxx")
	public void user_enters_a_valid_product_name_in_the_search_boxx() {
		 sp.clicksearch();
	   
	}

	@When("User clicks on search buttonss")
	public void user_clicks_on_search_buttonss() {
	   sp.validatetext();
	    
	}

	@Then("User should see the searched product displayedd")
	public void user_should_see_the_searched_product_displayedd() {
	    Assert.assertEquals(driver.getTitle(), "Search - mac");
	    
	}


}
