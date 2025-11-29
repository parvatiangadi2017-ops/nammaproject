package allpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage {

	WebDriver driver;
	 
	 public Loginpage(WebDriver driver)
	 {
	  this.driver=driver;
	 }
	 
	 // Locators
	  By email = By.id("input-email");
	  By password = By.id("input-password");
	  By loginBtn = By.xpath("//input[@value='Login']");
	  By myAccountText = By.xpath("//h2[text()='My Account']");

	  // Action Methods
	  public void enterEmail() {
	   driver.findElement(email).sendKeys("shivakumar_123@pentagonspace.in");
	  }

	  public void enterPassword(String pwd) {
	   driver.findElement(password).sendKeys("shiva@123");
	  }

	  public void clickLoginBtn() {
	   driver.findElement(loginBtn).click();
	  }

	  public boolean isLoginSuccessful() {
	   return driver.findElement(myAccountText).isDisplayed();
	   
	  }
	
}
