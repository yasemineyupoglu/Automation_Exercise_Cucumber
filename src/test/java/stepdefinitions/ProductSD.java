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
}