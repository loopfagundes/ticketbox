package br.com.dbserver.steps;

import br.com.dbserver.pageobjects.TicketBoxPageObject;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TicketBoxStep {
    private final WebDriver driver;
    private final TicketBoxPageObject ticketBoxPageObject;

    public TicketBoxStep(WebDriver _driver) {
        driver = _driver;
        ticketBoxPageObject = new TicketBoxPageObject(_driver);
    }

    public TicketBoxStep validatePage() {
        Assert.assertEquals(ticketBoxPageObject.validateTicketBoxPageLabel().getText(), "TICKETBOX");
        return this;
    }
}