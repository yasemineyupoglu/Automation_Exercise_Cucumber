package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import pages.GeneralPagesWebElement;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

public class GeneralPagesSD {

    GeneralPagesWebElement element = new GeneralPagesWebElement();

    //TC06_contact_us_pages
    @Given("click on contact us button")
    public void clickOnContactUsButton() {
        ReusableMethods.sleep(1000);
        element.contactUsButton.click();
    }

    @And("verify get in touch is visible")
    public void verifyGetInTouchIsVisible() {
        ReusableMethods.sleep(1000);

        if (element.getInTouchText.isDisplayed()) {
            System.out.println("Get In Touch text is visible");
        } else {
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

        if (element.contactUsSuccessText.isDisplayed()) {
            System.out.println("Success! Your details have been submitted successfully text is visible");
        } else {
            System.out.println("Success! Your details have been submitted successfully text is not visible");
        }
    }

    //TC07_verify_test_cases_page
    @And("click on test cases button")
    public void clickOnTestCasesButton() {
        ReusableMethods.sleep(1000);
        element.testCasesPage.click();
    }

    @Then("verify test cases is visible")
    public void verifyTestCasesIsVisible() {
        ReusableMethods.sleep(1000);

        if (element.testCasesText.isDisplayed()) {
            System.out.println("Test cases pages is visible");
        } else {
            System.out.println("Test cases pages is not visible");
        }
    }

    //TC08_verify_products_page
    @And("click on products button")
    public void clickOnProductsButton() {
        ReusableMethods.sleep(1000);
        element.productsPage.click();
    }

    @Then("verify products is visible")
    public void verifyProductsIsVisible() {
        ReusableMethods.sleep(1000);

        if (element.allProductsText.isDisplayed()) {
            System.out.println("All Products text is visible");
        } else {
            System.out.println("All Products text is not visible");
        }
    }

    //TC09_verify_search_products_page
    @And("enter {string} in search input and click search button")
    public void enterInSearchInputAndClickSearchButton(String str) {
        element.searchProducts.sendKeys(str);
        element.searchProductsButton.click();
    }

    @And("verify searched products is visible")
    public void verifySearchedProductsIsVisible() {
        ReusableMethods.sleep(1000);

        if (element.searchProductsText.isDisplayed()) {
            System.out.println("Search Products text is visible");
        } else {
            System.out.println("Search Products text is not visible");
        }
    }

    @Then("verify all the products related to search are visible")
    public void verifyAllTheProductsRelatedToSearchAreVisible() {
        try {
            List<WebElement> products = element.searchProductsAllSize;
            System.out.println("List of products on the page: " + products.size());
        } catch (Exception e) {
            System.out.println("No products found.");
        }
    }
    //TC10_verify_subscription_in_home_page
    @And("scroll down to footer")
    public void scrollDownToFooter() {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
    }

    @And("verify text subscription")
    public void verifyTextSubscription() {
        ReusableMethods.sleep(1000);

        if (element.homePageSubscriptionText.isDisplayed()) {
            System.out.println("Subscription text is visible");
        } else {
            System.out.println("Subscription text is not visible");
        }
    }

    @And("enter {string} in input and click arrow button")
    public void enterInInputAndClickArrowButton(String str) {
        element.homePageSubscription.sendKeys(str);
        element.homePageSubscriptionButton.click();
    }

    @Then("verify success message you have been successfully subscribed is visible")
    public void verifySuccessMessageYouHaveBeenSuccessfullySubscribedIsVisible() {
        ReusableMethods.sleep(1000);

        if (element.homePageSubscriptionSuccessText.isDisplayed()) {
            System.out.println("Success subscription text is visible");
        } else {
            System.out.println("Success subscription text is not visible");
        }
    }

    //TC11_verify_subscription_in_cart_page
    @And("click cart button")
    public void clickCartButton() {
        element.cartPage.click();
    }
}