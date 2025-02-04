@payment_pages
Feature: Payment Pages

  Background:
    Given launch browser and navigate to url

  @verify_address_details_in_checkout_page
  Scenario Outline: TC23_verify_address_details_in_checkout_page
    And click on signup login button
    And enter login email address "<login email address>"
    And enter login password "<login password>"
    And click login button
    And verify that logged in as username is visible
    And hover over first product and click add to cart
    And click view cart button
    And verify that product is displayed in cart page
    And click proceed to checkout button
    And verify that delivery address is same address filled at the time registration of account
    Then that the billing address is same address filled at the time registration of account

    Examples:
      | login email address  | login password |
      | testy006@hotmail.com | test1234       |


  @download_invoice_after_purchase_order
  Scenario Outline: TC24_download_invoice_after_purchase_order
    And hover over first product and click add to cart
    And click view cart button
    And click cart button
    And verify that product is displayed in cart page
    And click proceed to checkout button
    And click register login text
    And enter login email address "<login email address>"
    And enter login password "<login password>"
    And click login button
    And verify that logged in as username is visible
    And click cart button
    And click proceed to checkout button
    And verify address details and review your order
    And enter "<order description>" in comment text area
    And click place order button
    And enter payment name on card "<name on card>"
    And enter payment card number "<card number>"
    And enter payment cvc "<cvc>"
    And enter payment expiration date "<expiration date month>" and "<expiration date year>"
    And click pay and confirm order button
    And verify order placed congratulations is visible
    And click download invoice button
    Then click continue button

    Examples:
      | login email address  | login password | order description | name on card | card number | cvc | expiration date month | expiration date year |
      | testy006@hotmail.com | test1234       | test123           | 0000         | 0000        | 000 | 00                    | 00                   |