package allpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Regpage {

	WebDriver driver;

    public Regpage(WebDriver driver) {
        this.driver = driver;
    }

    By fn = By.id("input-firstname");
    By ln = By.id("input-lastname");
    By eid = By.id("input-email");
    By tel = By.id("input-telephone");
    By pass = By.id("input-password");
    By pass1 = By.id("input-confirm");
    By rb = By.xpath("//input[@value='0']");
    By cb = By.xpath("//input[@name='agree']");
    By cont = By.xpath("//input[@value='Continue']");

    public void firstname() {
        driver.findElement(fn).sendKeys("Shiva");
    }

    public void lastname() {
        driver.findElement(ln).sendKeys("Kumar");
    }

    public void Email() {
        driver.findElement(eid).sendKeys("shiva_" + System.currentTimeMillis() + "@gmail.com");
    }

    public void Telephone() {
        driver.findElement(tel).sendKeys("8105195472");
    }

    public void Password() {
        driver.findElement(pass).sendKeys("shiva@123");
    }

    public void ConfirmPassword() {
        driver.findElement(pass1).sendKeys("shiva@12");
    }

    public void radiobutton() {
        driver.findElement(rb).click();
    }

    public void checkbox() {
        driver.findElement(cb).click();
    }

    public void continuebutton() {
        driver.findElement(cont).click();
    }
}
