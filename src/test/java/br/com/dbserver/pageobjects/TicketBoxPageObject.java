package br.com.dbserver.pageobjects;

import br.com.dbserver.utils.WaitElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TicketBoxPageObject {
    private final WebDriver driver;
    private final WaitElement waitElement;

    public TicketBoxPageObject(WebDriver _driver) {
        driver = _driver;
        waitElement = new WaitElement(_driver);
    }

    public WebElement validateTicketBoxPageLabel() {
        return waitElement.visibilityOf(By.cssSelector("#app > header > h1"));
    }
}