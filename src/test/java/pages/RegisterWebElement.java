package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class RegisterWebElement {

    public RegisterWebElement(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div//div//ul//li//a[text()=' Signup / Login']")
    public WebElement signupLoginButton;

    @FindBy(xpath = "//div//div//h2[text()='New User Signup!']")
    public WebElement newUserSignupText;

    @FindBy(xpath = "//input[@data-qa='signup-name']")
    public WebElement userName;

    @FindBy(xpath = "//input[@data-qa='signup-email']")
    public WebElement userEmail;

    @FindBy(xpath = "//button[@data-qa='signup-button']")
    public WebElement signupButton;

    @FindBy(xpath = "//div//div//h2//b[text()='Enter Account Information']")
    public WebElement accountInformationText;

    @FindBy(id = "id_gender2")
    public WebElement titleGenderSelect;

    @FindBy(id = "password")
    public WebElement userPassword;

    @FindBy(xpath = "//select[@data-qa='days']//option[7]")
    public WebElement birthDay;

    @FindBy(xpath = "//select[@data-qa='months']//option[9]")
    public WebElement birthMonth;

    @FindBy(xpath = "//select[@data-qa='years']//option[25]")
    public WebElement birthYear;

    @FindBy(id = "newsletter")
    public WebElement newsletterCheck;

    @FindBy(id = "optin")
    public WebElement partnerCheck;

    @FindBy(id = "first_name")
    public WebElement userFirstName;

    @FindBy(id = "last_name")
    public WebElement userLastName;

    @FindBy(id = "company")
    public WebElement userCompany;

    @FindBy(id = "address1")
    public WebElement userAddress1;

    @FindBy(id = "address2")
    public WebElement userAddress2;

    @FindBy(xpath = "//select[@data-qa='country']//option[1]")
    public WebElement userCountry;

    @FindBy(id = "state")
    public WebElement userState;

    @FindBy(id = "city")
    public WebElement userCity;

    @FindBy(id = "zipcode")
    public WebElement userZipcode;

    @FindBy(id = "mobile_number")
    public WebElement userMobileNumber;

    @FindBy(xpath = "//button[@data-qa='create-account']")
    public WebElement createAccountButton;

    @FindBy(xpath = "//div/div/form/p[text()='Email Address already exist!']")
    public WebElement existingEmailText;
}
