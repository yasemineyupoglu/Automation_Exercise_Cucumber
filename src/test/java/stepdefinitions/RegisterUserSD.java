package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.RegisterWebElement;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class RegisterUserSD {

    RegisterWebElement element = new RegisterWebElement();

    //TC01_register_user
    @Given("launch browser and navigate to url")
    public void launchBrowserAndNavigateToUrl() {
        Driver.getDriver().get(ConfigurationReader.getProperty("website_url"));
    }

    @And("click on signup login button")
    public void clickOnSignupLoginButton() {
        ReusableMethods.sleep(1000);
        element.signupLoginButton.click();
    }

    @And("verify new user signup is visible")
    public void verifyNewUserSignupIsVisible() {
        ReusableMethods.sleep(1000);

        if(element.newUserSignupText.isDisplayed()){
            System.out.println("New user signup is visible");
        }
        else {
            System.out.println("New user signup is not visible");
        }
        /*
        String message;
        if (element.newUserSignupText.isDisplayed()){
            message = "New user signup is visible";
        }
        else {
            message = "New user signup is not visible";
        }
        JOptionPane.showMessageDialog(null,message, "Elemental State", JOptionPane.INFORMATION_MESSAGE);
        */
    }
    @And("enter name {string}")
    public void enterName(String str) {
        element.userName.sendKeys(str);
    }

    @And("enter email address {string}")
    public void enterEmailAddress(String str) {
        element.userEmail.sendKeys(str);
    }

    @And("click signup button")
    public void clickSignupButton() {
        element.signupButton.click();
    }

    @And("verify that enter account information is visible")
    public void verifyThatEnterAccountInformationIsVisible() {
        ReusableMethods.sleep(1000);

        if(element.accountInformationText.isDisplayed()){
            System.out.println("Enter account information is visible");
        }
        else {
            System.out.println("Enter account information is not visible");
        }
    }

    @And("select title")
    public void selectTitle() {
        element.titleGenderSelect.click();
    }

    @And("enter password {string}")
    public void enterPassword(String str) {
        element.userPassword.sendKeys(str);
    }

    @And("select date of birth")
    public void selectDateOfBirth() {
        element.birthDay.click();
        element.birthMonth.click();
        element.birthYear.click();
    }

    @And("select checkbox sign up for our newsletter")
    public void selectCheckboxSignUpForOurNewsletter() {
        ReusableMethods.sleep(1000);
        element.newsletterCheck.click();
    }

    @And("select checkbox receive special offers from our partners")
    public void selectCheckboxReceiveSpecialOffersFromOurPartners() {
        ReusableMethods.sleep(1000);
        element.partnerCheck.click();
    }

    @And("enter first name {string}")
    public void enterFirstName(String str) {
        element.userFirstName.sendKeys(str);
    }

    @And("enter last name {string}")
    public void enterLastName(String str) {
        element.userLastName.sendKeys(str);
    }

    @And("enter company {string}")
    public void enterCompany(String str) {
        element.userCompany.sendKeys(str);
    }

    @And("enter address {string}")
    public void enterAddress(String str) {
        element.userAddress1.sendKeys(str);
    }

    @And("enter addressTwo {string}")
    public void enterAddressTwo(String str) {
        element.userAddress2.sendKeys(str);
    }

    @And("select country")
    public void selectCountry() {
        element.userCountry.click();
    }

    @And("enter state {string}")
    public void enterState(String str) {
        element.userState.sendKeys(str);
    }

    @And("enter city {string}")
    public void enterCity(String str) {
        element.userCity.sendKeys(str);
    }

    @And("enter zipcode {string}")
    public void enterZipcode(String str) {
        element.userZipcode.sendKeys(str);
    }

    @And("enter mobile number {string}")
    public void enterMobileNumber(String str) {
        element.userMobileNumber.sendKeys(str);
    }

    @Then("click create account button")
    public void clickCreateAccountButton() {
        element.createAccountButton.click();
    }

    //TC05_register_user_with_existing_email
    @Then("verify error email address already exist is visible")
    public void verifyErrorEmailAddressAlreadyExistIsVisible() {
        if(element.existingEmailText.isDisplayed()){
            System.out.println("Email Address already exist!");
        }
        else {
            System.out.println("You can register");
        }
    }
}