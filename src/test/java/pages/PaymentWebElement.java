package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PaymentWebElement {
    public PaymentWebElement(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //TC23_verify_address_details_in_checkout_page
    @FindBy(xpath = "//ul[@id='address_delivery']//li[text()='Mrs. Yasemin Eyupoglu']")
    public WebElement deliveryAddressText;

    @FindBy(xpath = "//ul[@id='address_invoice']//li[text()='Mrs. Yasemin Eyupoglu']")
    public WebElement billingAddressText;

    //TC24_download_invoice_after_purchase_order
    @FindBy(xpath = "//a[text()='Download Invoice']")
    public WebElement downloadInvoiceButton;

    @FindBy(xpath = "//a[text()='Continue']")
    public WebElement continueButton;
}
