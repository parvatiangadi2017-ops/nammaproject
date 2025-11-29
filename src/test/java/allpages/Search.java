package allpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Search {

	WebDriver driver;
	 
	 public Search(WebDriver driver)
	 {
	  this.driver=driver;
	 }
	 
	 By s = By.xpath("//input[@placeholder='Search']");
	 By c=By.xpath("//i[@class='fa fa-search']");
	 By v=By.xpath("//h1[normalize-space()='Search - samsung']");
	 
	 
	 public void search()
	 {
	  driver.findElement(s).sendKeys("samsung");
	 }
	 
	 public void clicksearch()
	 {
	  driver.findElement(c).click();

	 }
	 
	 public boolean validatetext()
	 {
	 return driver.findElement(v).isDisplayed();
	 }
	 
}
