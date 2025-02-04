package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.OrderWebElement;
import utilities.ReusableMethods;

public class OrderSD {
    OrderWebElement element = new OrderWebElement();

    //TC14_place_order_register_while_checkout
    @And("click proceed to checkout button")
    public void clickProceedToCheckoutButton() {
        ReusableMethods.sleep(1000);
        element.proceedToCheckoutButton.click();
    }

    @And("click register login text")
    public void clickRegisterLoginText() {
        ReusableMethods.sleep(1000);
        element.registerLoginText.click();
    }

    @And("click continue account")
    public void clickContinueAccount() {
        ReusableMethods.sleep(1000);
        element.continueAccountButton.click();
    }

    @And("verify address details and review your order")
    public void verifyAddressDetailsAndReviewYourOrder() {
        ReusableMethods.sleep(1000);

        if (element.addressDetailsText.isDisplayed()) {
            System.out.println("Address details text is visible");
        } else {
            System.out.println("Address details text is not visible");
        }
    }

    @And("enter {string} in comment text area")
    public void enterInCommentTextArea(String str) {
        ReusableMethods.sleep(1000);
        element.orderCommentTextArea.sendKeys(str);
    }

    @And("click place order button")
    public void clickPlaceOrderButton() {
        element.placeOrderButton.click();
    }

    @And("enter payment name on card {string}")
    public void enterPaymentNameOnCard(String str) {
        ReusableMethods.sleep(1000);
        element.nameOnCard.sendKeys(str);
    }

    @And("enter payment card number {string}")
    public void enterPaymentCardNumber(String str) {
        element.cardNumber.sendKeys(str);
    }

    @And("enter payment cvc {string}")
    public void enterPaymentCvc(String str) {
        element.cvc.sendKeys(str);
    }

    @And("enter payment expiration date {string} and {string}")
    public void enterPaymentExpirationDateAnd(String str1, String str2) {
        element.expirationDateMonth.sendKeys(str1);
        element.expirationDateYear.sendKeys(str2);
    }

    @And("click pay and confirm order button")
    public void clickPayAndConfirmOrderButton() {
        element.payAndConfirmOrderButton.click();
    }

    @Then("verify order placed congratulations is visible")
    public void verifyOrderPlacedCongratulationsIsVisible() {
        ReusableMethods.sleep(1000);

        if (element.placedCongratulationsText.isDisplayed()) {
            System.out.println("Congratulations! Your order has been confirmed text is visible");
        } else {
            System.out.println("Congratulations! Your order has been confirmed text is not visible");
        }
    }
}