package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class GeneralPagesWebElement {
    public GeneralPagesWebElement(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //TC06_contact_us_pages
    @FindBy(xpath = "//div//div/ul/li/a[text()=' Contact us']")
    public WebElement contactUsButton;

    @FindBy(xpath = "//div/div/h2[text()='Get In Touch']")
    public WebElement getInTouchText;

    @FindBy(xpath = "//input[@data-qa='name']")
    public WebElement contactName;

    @FindBy(xpath = "//input[@data-qa='email']")
    public WebElement contactEmail;

    @FindBy(xpath = "//input[@data-qa='subject']")
    public WebElement contactSubject;

    @FindBy(xpath = "//textarea[@data-qa='message']")
    public WebElement contactMessage;

    @FindBy(xpath = "//input[@name='upload_file']")
    public WebElement contactFileSelect;

    @FindBy(xpath = "//input[@data-qa='submit-button']")
    public WebElement submitButton;

    @FindBy(xpath = "//div[@class='status alert alert-success']")
    public WebElement contactUsSuccessText;

    //TC07_verify_test_cases_page
    @FindBy(xpath = "//div/div/ul/li/a[text()=' Test Cases']")
    public WebElement testCasesPage;

    @FindBy(xpath = "//div/div/h2/b[text()='Test Cases']")
    public WebElement testCasesText;

    //TC08_verify_products_page
    @FindBy(xpath = "//div/div/ul/li/a[text()=' Products']")
    public WebElement productsPage;

    @FindBy(xpath = "//div/div/h2[text()='All Products']")
    public WebElement allProductsText;

    //TC09_verify_search_products_page
    @FindBy(xpath = "//input[@id='search_product']")
    public WebElement searchProducts;

    @FindBy(xpath = "//button[@id='submit_search']")
    public WebElement searchProductsButton;

    @FindBy(xpath = "//div/div/h2[text()='Searched Products']")
    public WebElement searchProductsText;

    @FindBy(xpath = "//div/div[@class='product-image-wrapper']")
    public List<WebElement> searchProductsAllSize;

    //TC10_verify_subscription_in_home_page
    @FindBy(xpath = "//div/div/h2[text()='Subscription']")
    public WebElement homePageSubscriptionText;

    @FindBy(id = "susbscribe_email")
    public WebElement homePageSubscription;

    @FindBy(xpath = "//button[@id='subscribe']")
    public WebElement homePageSubscriptionButton;

    @FindBy(xpath = "//div/div[text()='You have been successfully subscribed!']")
    public WebElement homePageSubscriptionSuccessText;

    //TC11_verify_subscription_in_cart_page
    @FindBy(xpath = "//div/div/ul/li/a[text()=' Cart']")
    public WebElement cartPage;
}
