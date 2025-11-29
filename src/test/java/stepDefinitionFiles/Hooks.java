package stepDefinitionFiles;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {


    public static WebDriver driver;

	@Before
    public void setUp() {
        System.out.println("===== Scenario Started =====");
    }

    @After
    public void tearDown(Scenario scenario) throws IOException {
        if (scenario.isFailed()) {
            // Take screenshot
            TakesScreenshot ts = (TakesScreenshot) TC_001.driver;
            byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);

            // Attach screenshot to Cucumber Report
            scenario.attach(screenshot, "image/png", "Test Failure Screenshot");

            // Save screenshot to folder
            File screenshotFile = ts.getScreenshotAs(OutputType.FILE);
            File targetFile = new File("C:\\Users\\Admin\\eclipse-workspace\\Penta\\screenshots\\bug1.png");
            Files.copy(screenshotFile.toPath(), targetFile.toPath());

            System.out.println("Screenshot saved: " + targetFile.getAbsolutePath());
        }

       /* if (TC_001.driver != null) {
            TC_001.driver.quit();
        } */
    }
}
