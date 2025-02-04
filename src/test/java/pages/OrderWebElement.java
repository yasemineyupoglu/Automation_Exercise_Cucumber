package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class OrderWebElement {

    public OrderWebElement(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //TC14_place_order_register_while_checkout
    @FindBy(xpath = "//div/a[text()='Proceed To Checkout']")
    public WebElement proceedToCheckoutButton;

    @FindBy(xpath = "//p/a/u[text()='Register / Login']")
    public WebElement registerLoginText;

    @FindBy(xpath = "//div/a[text()='Continue']")
    public WebElement continueAccountButton;

    @FindBy(xpath = "//div/h2[text()='Address Details']")
    public WebElement addressDetailsText;

    @FindBy(xpath = "//textarea[@name='message']")
    public WebElement orderCommentTextArea;

    @FindBy(xpath = "//div/a[text()='Place Order']")
    public WebElement placeOrderButton;

    @FindBy(xpath = "//input[@name='name_on_card']")
    public WebElement nameOnCard;

    @FindBy(xpath = "//input[@name='card_number']")
    public WebElement cardNumber;

    @FindBy(xpath = "//input[@name='cvc']")
    public WebElement cvc;

    @FindBy(xpath = "//input[@name='expiry_month']")
    public WebElement expirationDateMonth;

    @FindBy(xpath = "//input[@name='expiry_year']")
    public WebElement expirationDateYear;

    @FindBy(xpath = "//button[@id='submit']")
    public WebElement payAndConfirmOrderButton;

    @FindBy(xpath = "//p[text()='Congratulations! Your order has been confirmed!']")
    public WebElement placedCongratulationsText;
}
