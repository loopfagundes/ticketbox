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

    public WebElement firstNameTextField() {
        return waitElement.toBeClickable(By.id("first-name"));
    }

    public WebElement lastNameTextField() {
        return waitElement.toBeClickable(By.id("last-name"));
    }

    public WebElement emailTextField() {
        return waitElement.toBeClickable(By.id("email"));
    }

    public WebElement friendCheckBox() {
        return waitElement.toBeClickable(By.id("friend"));
    }

    public WebElement specialRequestTextField() {
        return waitElement.toBeClickable(By.id("requests"));
    }

    public WebElement iAgreeCheckBox() {
        return waitElement.toBeClickable(By.id("agree"));
    }

    public WebElement signatureTextField() {
        return waitElement.toBeClickable(By.id("signature"));
    }

    public WebElement confirmTicketsButton() {
        return waitElement.toBeClickable(By.className("active"));
    }

    public WebElement validateTicketSuccessfullyOrderLabel() {
        return waitElement.visibilityOf(By.cssSelector("#app > div > p"));
    }
}