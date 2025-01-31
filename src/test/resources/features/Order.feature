@order
Feature: Order Page

  Background:
    Given launch browser and navigate to url

  @order_register_while_checkout
  Scenario Outline: TC14_place_order_register_while_checkout
    And hover over first product and click add to cart
    And click continue shopping button
    And click cart button
    And click proceed to checkout button
    And click register login text
    And enter name "<name>"
    And enter email address "<email address>"
    And click signup button
    And verify that enter account information is visible
    And select title
    And enter password "<password>"
    And select date of birth
    And select checkbox sign up for our newsletter
    And select checkbox receive special offers from our partners
    And enter first name "<first name>"
    And enter last name "<last name>"
    And enter company "<company>"
    And enter address "<address>"
    And enter addressTwo "<address2>"
    And select country
    And enter state "<state>"
    And enter city "<city>"
    And enter zipcode "<zipcode>"
    And enter mobile number "<mobile number>"
    And click create account button
    And click continue account
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
    Then verify order placed congratulations is visible

    Examples:
      | name    | email address         | password | first name | last name | company | address | address2 | state  | city   | zipcode | mobile number | order description | name on card | card number | cvc | expiration date month | expiration date year |
      | Yasemin | testy0125@hotmail.com | test1234 | Yasemin    | Test      | ABC     | Ankara  | Ankara   | Turkey | Ankara | 06000   | 05000000000   | test123           | 0000         | 0000        | 000 | 00                    | 00                   |


  @order_register_before_checkout
  Scenario Outline: TC15_place_order_register_before_checkout
    And click on signup login button
    And enter name "<name>"
    And enter email address "<email address>"
    And click signup button
    And verify that enter account information is visible
    And select title
    And enter password "<password>"
    And select date of birth
    And select checkbox sign up for our newsletter
    And select checkbox receive special offers from our partners
    And enter first name "<first name>"
    And enter last name "<last name>"
    And enter company "<company>"
    And enter address "<address>"
    And enter addressTwo "<address2>"
    And select country
    And enter state "<state>"
    And enter city "<city>"
    And enter zipcode "<zipcode>"
    And enter mobile number "<mobile number>"
    And click create account button
    And click continue account
    And verify that logged in as username is visible
    And hover over first product and click add to cart
    And click continue shopping button
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
    Then verify order placed congratulations is visible

    Examples:
      | name    | email address           | password | first name | last name | company | address | address2 | state  | city   | zipcode | mobile number | order description | name on card | card number | cvc | expiration date month | expiration date year |
      | Yasemin | testy012129@hotmail.com | test1234 | Yasemin    | Test      | ABC     | Ankara  | Ankara   | Turkey | Ankara | 06000   | 05000000000   | test123           | 0000         | 0000        | 000 | 00                    | 00                   |


  @order_login_before_checkout
  Scenario Outline: TC16_place_order_login_before_checkout
    And click on signup login button
    And enter login email address "<login email address>"
    And enter login password "<login password>"
    And click login button
    Then verify that logged in as username is visible
    And hover over first product and click add to cart
    And click continue shopping button
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
    Then verify order placed congratulations is visible

    Examples:
      | login email address  | login password | order description | name on card | card number | cvc | expiration date month | expiration date year |
      | testy006@hotmail.com | test1234       | test123           | 0000         | 0000        | 000 | 00                    | 00                   |
