Feature: Product

  @product_in_cart
  Scenario: TC12_add_products_in_cart
    Given launch browser and navigate to url
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
    Given launch browser and navigate to url
    And click view product
    And increase quantity to "<quantity>"
    And click add to cart button
    And click view cart button
    And verify total quantity
    Then verify total price

    Examples:
      | quantity |
      | 4        |
