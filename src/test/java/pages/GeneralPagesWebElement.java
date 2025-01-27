package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class GeneralPagesWebElement {
    public GeneralPagesWebElement(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

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

}
