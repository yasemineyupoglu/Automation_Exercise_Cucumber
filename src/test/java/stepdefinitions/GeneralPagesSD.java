package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Alert;
import pages.GeneralPagesWebElement;
import utilities.Driver;
import utilities.ReusableMethods;

public class GeneralPagesSD {

    GeneralPagesWebElement element = new GeneralPagesWebElement();

    @Given("click on contact us button")
    public void clickOnContactUsButton() {
        ReusableMethods.sleep(1000);
        element.contactUsButton.click();
    }

    @And("verify get in touch is visible")
    public void verifyGetInTouchIsVisible() {
        ReusableMethods.sleep(1000);

        if(element.getInTouchText.isDisplayed()){
            System.out.println("Get In Touch text is visible");
        }
        else {
            System.out.println("Get In Touch text is not visible");
        }
    }

    @And("enter contact name {string}")
    public void enterContactName(String str) {
        element.contactName.sendKeys(str);
    }

    @And("enter contact email {string}")
    public void enterContactEmail(String str) {
        element.contactEmail.sendKeys(str);
    }

    @And("enter contact subject {string}")
    public void enterContactSubject(String str) {
        element.contactSubject.sendKeys(str);
    }

    @And("enter contact message {string}")
    public void enterContactMessage(String str) {
        element.contactMessage.sendKeys(str);
    }

    @And("upload file {string}")
    public void uploadFile(String str) {
        element.contactFileSelect.sendKeys(str);
    }

    @And("click submit button")
    public void clickSubmitButton() {
        element.submitButton.click();
    }

    @And("click ok button")
    public void clickOkButton() {
        try {
            Alert alert = Driver.getDriver().switchTo().alert();
            System.out.println("Alert Message: " + alert.getText());
            alert.accept();

            System.out.println("Alert closed.");
        } catch (Exception e) {
            System.out.println("No alerts found.");
        }
    }

    @Then("verify success message success your details have been submitted successfully is visible")
    public void verifySuccessMessageSuccessYourDetailsHaveBeenSubmittedSuccessfullyIsVisible() {
        ReusableMethods.sleep(1000);

        if(element.contactUsSuccessText.isDisplayed()){
            System.out.println("Success! Your details have been submitted successfully text is visible");
        }
        else {
            System.out.println("Success! Your details have been submitted successfully text is not visible");
        }
    }
}
