package Util;

import io.cucumber.java.*;
import io.cucumber.java.tr.Ama;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;


import java.util.Properties;

public class Hooks {

   static WebDriver driver;
    Properties properties;
    @Before
    public void before() {
       String browser = Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest().getParameter("browser");
        properties = ConfigReader.initialize_Properties();
        driver = DriverFactory.initialize_Driver("Chrome");
    }

    @After
    public void after() {
        driver.quit();
    }
}