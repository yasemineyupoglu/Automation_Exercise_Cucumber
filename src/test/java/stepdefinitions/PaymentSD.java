package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.PaymentWebElement;
import utilities.ReusableMethods;

public class PaymentSD {
    PaymentWebElement element= new PaymentWebElement();

    //TC23_verify_address_details_in_checkout_page
    @And("verify that delivery address is same address filled at the time registration of account")
    public void verifyThatDeliveryAddressIsSameAddressFilledAtTheTimeRegistrationOfAccount() {
        ReusableMethods.sleep(1000);

        if (element.deliveryAddressText.isDisplayed()) {
            System.out.println("Your delivery address is visible");
        } else {
            System.out.println("Your delivery address is not visible");
        }
    }

    @Then("that the billing address is same address filled at the time registration of account")
    public void thatTheBillingAddressIsSameAddressFilledAtTheTimeRegistrationOfAccount() {
        ReusableMethods.sleep(1000);

        if (element.billingAddressText.isDisplayed()) {
            System.out.println("Your billing address is visible");
        } else {
            System.out.println("Your billing address is not visible");
        }
    }
    //TC24_download_invoice_after_purchase_order
    @And("click download invoice button")
    public void clickDownloadInvoiceButton() {
        ReusableMethods.sleep(1000);
        element.downloadInvoiceButton.click();
    }

    @Then("click continue button")
    public void clickContinueButton() {
        ReusableMethods.sleep(1000);
        element.continueButton.click();
    }
}