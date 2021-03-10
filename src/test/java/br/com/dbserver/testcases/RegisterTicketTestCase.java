package br.com.dbserver.testcases;

import br.com.dbserver.steps.TicketBoxStep;
import br.com.dbserver.utils.BaseTest;
import br.com.dbserver.utils.Property;
import br.com.dbserver.webdrivers.DriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class RegisterTicketTestCase extends BaseTest {

    @Test
    public void registerUserSuceessfully() {
        WebDriver driver = DriverManager.getDriver();
        driver.get(Property.get("url"));
        TicketBoxStep ticketBoxStep = new TicketBoxStep(driver);
        ticketBoxStep
                .validatePage();
    }
}