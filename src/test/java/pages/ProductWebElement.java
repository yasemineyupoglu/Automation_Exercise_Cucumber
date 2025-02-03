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

    //TC17_remove_product_from_cart
    @FindBy(xpath = "//a[@class='cart_quantity_delete']")
    public WebElement xCloseButton;

    @FindBy(xpath = "//a[@class='cart_quantity_delete']")
    public WebElement cartIsEmptyText;

    //TC18_view_category_products
    @FindBy(xpath = "//div/h2[text()='Category']")
    public WebElement categoryLeftSideBar;

    @FindBy(xpath = "//a[@href='#Women']")
    public WebElement categoryWomenSelect;

    @FindBy(xpath = "//a[@href='/category_products/1']")
    public WebElement categoryWomenOneSelect;

    @FindBy(xpath = "//h2[@class = 'title text-center']")
    public WebElement categoryTitleVisible;

    @FindBy(xpath = "//a[@href='#Men']")
    public WebElement categoryMenSelect;

    @FindBy(xpath = "//a[@href='/category_products/3']")
    public WebElement categoryMenOneSelect;

    @FindBy(xpath = "//h2[text()='Men - Tshirts Products']")
    public WebElement menPageTitleVisible;

    //TC19_view_cart_brand_products
    @FindBy(xpath = "//div/h2[text()='Brands']")
    public WebElement brandLeftSideBar;

    @FindBy(xpath = "//a[@href='/brand_products/Polo']")
    public WebElement brandOneSelect;

    @FindBy(xpath = "//h2[@class = 'title text-center']")
    public WebElement brandTitleVisible;

    @FindBy(xpath = "//a[@href='/brand_products/H&M']")
    public WebElement brandTwoSelect;

    @FindBy(xpath = "//h2[text()='Brand - H&M Products']")
    public WebElement brandTwoPageTitleVisible;

    //TC_21_add_review_on_product
    @FindBy(xpath = "//a[@href='#reviews']")
    public WebElement writeYourReviewText;

    @FindBy(xpath = "//input[@id='name']")
    public WebElement reviewName;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement reviewEmail;

    @FindBy(xpath = "//textarea[@id='review']")
    public WebElement reviewTextArea;

    @FindBy(xpath = "//button[@id='button-review']")
    public WebElement submitButton;

    @FindBy(xpath = "//span[text()='Thank you for your review.']")
    public WebElement successReviewText;
}
