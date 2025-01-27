package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.LoginWebElement;
import utilities.ReusableMethods;

public class LoginUserSD {

    LoginWebElement element = new LoginWebElement();

    //TC02_correct_login_user
    @And("verify login to your account is visible")
    public void verifyLoginToYourAccountIsVisible() {
        ReusableMethods.sleep(1000);

        if(element.loginYourAccountText.isDisplayed()){
            System.out.println("Login to your account is visible");
        }
        else {
            System.out.println("Login to your account is not visible");
        }
    }

    @And("click login button")
    public void clickLoginButton() {
        element.loginButton.click();
    }

    @And("enter login email address {string}")
    public void enterLoginEmailAddress(String str) {
        element.loginEmail.sendKeys(str);
    }

    @And("enter login password {string}")
    public void enterLoginPassword(String str) {
        element.loginPassword.sendKeys(str);
    }

    @Then("verify that logged in as username is visible")
    public void verifyThatLoggedInAsUsernameIsVisible() {
        ReusableMethods.sleep(1000);

        if(element.accountLoginText.isDisplayed()){
            System.out.println("Successfully logged into account");
        }
        else {
            System.out.println("The account was not successfully logged in");
        }
    }

    //TC03_incorrect_login_user
    @Then("verify error your email or password is incorrect is visible")
    public void verifyErrorYourEmailOrPasswordIsIncorrectIsVisible() {
        ReusableMethods.sleep(1000);

        if(element.accountIncorrectLoginText.isDisplayed()){
            System.out.println("Your email or password is incorrect!");
        }
        else {
            System.out.println("Your email or password is correct!");
        }
    }

    //TC04_logout_user
    @Then("click logout button")
    public void clickLogoutButton() {
        element.logoutButton.click();
    }
}
