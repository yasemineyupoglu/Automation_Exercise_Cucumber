package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class ProductWebElement {
    public ProductWebElement(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //TC12_add_products_in_cart
    @FindBy(xpath = "(//div/div/div/div/a[text()='Add to cart'])[1]")
    public WebElement firstProductAddToCart;

    @FindBy(xpath = "//div/div/button[text()='Continue Shopping']")
    public WebElement continueShoppingButton;

    @FindBy(xpath = "(//div/div/div/div/a[text()='Add to cart'])[3]")
    public WebElement secondProductAddToCart;

    @FindBy(xpath = "//div/div/div/div/p/a/u[text()='View Cart']")
    public WebElement viewCartButton;

    @FindBy(xpath = "//div/table/tbody/tr")
    public List<WebElement> cartTable;

    @FindBy(xpath = "//td[@class='cart_quantity']/button[text()]")
    public List<WebElement> quantityTableSize;

    @FindBy(xpath = "//p[@class='cart_total_price']")
    public List<WebElement> totalTableSize;

    //TC13_verify_product_quantity_in_cart
    @FindBy(xpath = "(//div/ul/li/a[text()='View Product'])[1]")
    public WebElement viewProduct;

    @FindBy(xpath = "//input[@id='quantity']")
    public WebElement quantitySelect;

    @FindBy(xpath = "//button[@class='btn btn-default cart']")
    public WebElement addToCartButton;
}
