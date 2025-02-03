package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import pages.ProductWebElement;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ProductSD {

    ProductWebElement element = new ProductWebElement();

    //TC12_add_products_in_cart
    @Given("hover over first product and click add to cart")
    public void hoverOverFirstProductAndClickAddToCart() {
        ReusableMethods.sleep(1000);
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

        js.executeScript("window.scrollBy(0, 400);");
        element.firstProductAddToCart.click();
    }

    @And("click continue shopping button")
    public void clickContinueShoppingButton() {
        ReusableMethods.sleep(1000);
        element.continueShoppingButton.click();
    }

    @And("hover over second product and click add to cart")
    public void hoverOverSecondProductAndClickAddToCart() {
        ReusableMethods.sleep(1000);
        element.secondProductAddToCart.click();
    }

    @And("click view cart button")
    public void clickViewCartButton() {
        ReusableMethods.sleep(1000);
        element.viewCartButton.click();
    }

    @And("verify both products are added to cart")
    public void verifyBothProductsAreAddedToCart() {
        ReusableMethods.sleep(1000);

        try {
            List<WebElement> products = element.cartTable;
            System.out.println("List of products on the page: " + products.size());
        } catch (Exception e) {
            System.out.println("No products found.");
        }
    }

    @And("verify total quantity")
    public void verifyTotalQuantity() {
        List<WebElement> columnValues = element.quantityTableSize;

        int total = 0;

        for (WebElement cell : columnValues) {
            try {
                int value = Integer.parseInt(cell.getText().trim());
                total += value;
            } catch (NumberFormatException e) {
                System.out.println("Invalid amount found: " + cell.getText());
            }
        }

        System.out.println("The sum of the quantity numbers: " + total);
    }

    @Then("verify total price")
    public void verifyTotalPrice() {
        List<WebElement> columnValues = element.totalTableSize;

        int total = 0;

        Pattern pattern = Pattern.compile("\\d+");

        for (WebElement cell : columnValues) {
            String text = cell.getText();
            Matcher matcher = pattern.matcher(text);

            while (matcher.find()) {
                total += Integer.parseInt(matcher.group());
            }
        }

        System.out.println("The sum of the numbers is: " + total);
    }

    //TC13_verify_product_quantity_in_cart
    @And("click view product")
    public void clickViewProduct() {
        element.viewProduct.click();
    }

    @And("increase quantity to {string}")
    public void increaseQuantityTo(String str) {
        ReusableMethods.sleep(1000);
        element.quantitySelect.clear();
        element.quantitySelect.sendKeys(str);
    }

    @And("click add to cart button")
    public void clickAddToCartButton() {
        element.addToCartButton.click();
    }

    //TC17_remove_product_from_cart
    @And("click x button corresponding to particular product")
    public void clickXButtonCorrespondingToParticularProduct() {
        ReusableMethods.sleep(1000);
        element.xCloseButton.click();
    }

    @Then("verify that product is removed from the cart")
    public void verifyThatProductIsRemovedFromTheCart() {
        if (element.cartIsEmptyText.isDisplayed()) {
            System.out.println("Cart is empty text is visible");
        } else {
            System.out.println("Cart is empty text is not visible");
        }
    }

    //TC18_view_category_products
    @And("verify that categories are visible on left side bar")
    public void verifyThatCategoriesAreVisibleOnLeftSideBar() {
        ReusableMethods.sleep(1000);

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

        js.executeScript("window.scrollBy(0, 400);");

        if (element.categoryLeftSideBar.isDisplayed()) {
            System.out.println("Categories are visible");
        } else {
            System.out.println("Categories are not visible");
        }
    }

    @And("click on women category")
    public void clickOnWomenCategory() {
        element.categoryWomenSelect.click();
    }

    @And("click on any category link under women category")
    public void clickOnAnyCategoryLinkUnderWomenCategory() {
        ReusableMethods.sleep(1000);
        element.categoryWomenOneSelect.click();
    }

    @And("verify that category page is displayed and confirm text women tops products")
    public void verifyThatCategoryPageIsDisplayedAndConfirmTextWomenTopsProducts() {
        ReusableMethods.sleep(1000);

        if (element.categoryTitleVisible.isDisplayed()) {
            System.out.println("Category title is visible");
        } else {
            System.out.println("Category title is not visible");
        }
    }

    @And("on left side bar, click on any sub-category link of men category")
    public void onLeftSideBarClickOnAnySubCategoryLinkOfMenCategory() {
        ReusableMethods.sleep(1000);
        element.categoryMenSelect.click();
        ReusableMethods.sleep(1000);
        element.categoryMenOneSelect.click();
    }

    @Then("verify that user is navigated to that category page")
    public void verifyThatUserIsNavigatedToThatCategoryPage() {
        ReusableMethods.sleep(1000);

        if (element.menPageTitleVisible.isDisplayed()) {
            System.out.println("Men page is visible");
        } else {
            System.out.println("Men page is not visible");
        }
    }

    //TC19_view_cart_brand_products
    @And("verify that brand are visible on left side bar")
    public void verifyThatBrandAreVisibleOnLeftSideBar() {
        ReusableMethods.sleep(1000);

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

        js.executeScript("window.scrollBy(0, 400);");

        if (element.brandLeftSideBar.isDisplayed()) {
            System.out.println("Brands are visible");
        } else {
            System.out.println("Brands are not visible");
        }
    }

    @And("click on any brand name")
    public void clickOnAnyBrandName() {
        element.brandOneSelect.click();
    }

    @And("verify that user is navigated to brand page and brand products are displayed")
    public void verifyThatUserIsNavigatedToBrandPageAndBrandProductsAreDisplayed() {
        ReusableMethods.sleep(1000);

        if (element.brandTitleVisible.isDisplayed()) {
            System.out.println("Brand title is visible");
        } else {
            System.out.println("Brand title is not visible");
        }
    }

    @And("on left side bar, click on any other brand link")
    public void onLeftSideBarClickOnAnyOtherBrandLink() {
        ReusableMethods.sleep(1000);
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

        js.executeScript("window.scrollBy(0, 350);");

        element.brandTwoSelect.click();
    }

    @Then("verify that user is navigated to that brand page and can see products")
    public void verifyThatUserIsNavigatedToThatBrandPageAndCanSeeProducts() {
        ReusableMethods.sleep(1000);

        if (element.brandTwoPageTitleVisible.isDisplayed()) {
            System.out.println("Brand page is visible");
        } else {
            System.out.println("Brand page is not visible");
        }
    }

    //TC_21_add_review_on_product
    @And("verify write your reviews is visible")
    public void verifyWriteYourReviewsIsVisible() {
        ReusableMethods.sleep(1000);

        if (element.writeYourReviewText.isDisplayed()) {
            System.out.println("Write your review text is visible");
        } else {
            System.out.println("Write your review text is not visible");
        }
    }

    @And("enter review name {string}")
    public void enterReviewName(String str) {
        ReusableMethods.sleep(1000);
        element.reviewName.sendKeys(str);
    }

    @And("enter review email {string}")
    public void enterReviewEmail(String str) {
        element.reviewEmail.sendKeys(str);
    }

    @And("enter review {string}")
    public void enterReview(String str) {
        element.reviewTextArea.sendKeys(str);
    }

    @And("click review submit button")
    public void clickReviewSubmitButton() {
        element.submitButton.click();
    }

    @Then("verify success message thank you for your review")
    public void verifySuccessMessageThankYouForYourReview() {
        ReusableMethods.sleep(1000);

        if (element.successReviewText.isDisplayed()) {
            System.out.println("Thank you for your review text is visible");
        } else {
            System.out.println("Thank you for your review text is not visible");
        }
    }

}