@product
Feature: Product

  Background:
    Given launch browser and navigate to url

  @product_in_cart
  Scenario: TC12_add_products_in_cart
    And click on products button
    And hover over first product and click add to cart
    And click continue shopping button
    And hover over second product and click add to cart
    And click view cart button
    And verify both products are added to cart
    And verify total quantity
    Then verify total price


  @product_quantity_in_cart
  Scenario Outline: TC13_verify_product_quantity_in_cart
    And click view product
    And increase quantity to "<quantity>"
    And click add to cart button
    And click view cart button
    And verify total quantity
    Then verify total price

    Examples:
      | quantity |
      | 4        |


  @remove_product_from_cart
  Scenario: TC17_remove_product_from_cart
    And click on products button
    And hover over first product and click add to cart
    And click view cart button
    And verify both products are added to cart
    And click x button corresponding to particular product
    Then verify that product is removed from the cart


  @view_category_products
  Scenario: TC18_view_category_products
    And verify that categories are visible on left side bar
    And click on women category
    And click on any category link under women category
    And verify that category page is displayed and confirm text women tops products
    And on left side bar, click on any sub-category link of men category
    Then verify that user is navigated to that category page


  @view_cart_brand_products
  Scenario: TC19_view_cart_brand_products
    And click on products button
    And verify that brand are visible on left side bar
    And click on any brand name
    And verify that user is navigated to brand page and brand products are displayed
    And on left side bar, click on any other brand link
    Then verify that user is navigated to that brand page and can see products


  @add_review_on_product
  Scenario Outline: TC_21_add_review_on_product
    And click on products button
    And verify products is visible
    And click view product
    And verify write your reviews is visible
    And enter review name "<review name>"
    And enter review email "<review email>"
    And enter review "<review>"
    And click review submit button
    Then verify success message thank you for your review

    Examples:
      | review name | review email         | review      |
      | Test Y      | testy006@hotmail.com | Test Review |


  @add_to_cart_from_recommended_items
  Scenario: TC22_add_to_cart_from_recommended_items
    And scroll to bottom of page
    And verify recommended items are visible
    And click on add to cart on recommended product
    And click on view cart button
    Then verify that product is displayed in cart page


