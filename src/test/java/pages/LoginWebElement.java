package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LoginWebElement {

    public LoginWebElement(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //TC02_correct_login_user
    @FindBy(xpath = "//div//div//h2[text()='Login to your account']")
    public WebElement loginYourAccountText;

    @FindBy(xpath = "//button[@data-qa='login-button']")
    public WebElement loginButton;

    @FindBy(xpath = "//input[@data-qa='login-email']")
    public WebElement loginEmail;

    @FindBy(xpath = "//input[@data-qa='login-password']")
    public WebElement loginPassword;

    @FindBy(xpath = "//div/div/ul/li/a[text()=' Logged in as ']")
    public WebElement accountLoginText;

    //TC03_incorrect_login_user
    @FindBy(xpath = "//div/form/p[text()='Your email or password is incorrect!']")
    public WebElement accountIncorrectLoginText;

    //TC04_logout_user
    @FindBy(xpath = "//div//div/ul/li/a[text()=' Logout']")
    public WebElement logoutButton;
}
