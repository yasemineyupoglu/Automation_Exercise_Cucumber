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

