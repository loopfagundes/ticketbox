package br.com.dbserver.steps;

import br.com.dbserver.pageobjects.TicketBoxPageObject;
import br.com.dbserver.utils.GeneratorFaker;
import br.com.dbserver.utils.Screenshot;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.service.ExtentTestManager;
import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;

public class TicketBoxStep {
    private final WebDriver driver;
    private final Faker faker;
    private final GeneratorFaker generatorFaker;
    private final TicketBoxPageObject ticketBoxPageObject;

    public TicketBoxStep(WebDriver _driver) {
        driver = _driver;
        faker = new Faker();
        generatorFaker = new GeneratorFaker();
        ticketBoxPageObject = new TicketBoxPageObject(_driver);
    }

    public TicketBoxStep registerNewUser() {
        String firstName = faker.name().firstName();
        String lastName = faker.name().lastName();
        String signature = firstName + " " + lastName;
        ticketBoxPageObject.firstNameTextField().sendKeys(firstName);
        ticketBoxPageObject.lastNameTextField().sendKeys(lastName);
        ticketBoxPageObject.emailTextField().sendKeys(generatorFaker.getEmail());
        ticketBoxPageObject.friendCheckBox().click();
        ticketBoxPageObject.specialRequestTextField().sendKeys(generatorFaker.getSpecialRequests());
        ticketBoxPageObject.iAgreeCheckBox().click();
        ticketBoxPageObject.signatureTextField().sendKeys(signature);
        ticketBoxPageObject.confirmTicketsButton().click();
        if (ticketBoxPageObject.validateTicketSuccessfullyOrderLabel().getText().equals("Ticket(s) successfully ordered.")) {
            ExtentTestManager.getTest().log(Status.PASS, "Registrou com sucesso!", Screenshot.capture());
        } else {
            ExtentTestManager.getTest().log(Status.FAIL, "Nao é possivel registrar.", Screenshot.capture());
        }
        return this;
    }
}