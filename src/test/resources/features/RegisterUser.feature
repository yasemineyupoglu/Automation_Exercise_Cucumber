@register
Feature: Register User

  Background:
    Given launch browser and navigate to url
    And click on signup login button
    And verify new user signup is visible

  @register_user
  Scenario Outline: TC01_register_user
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
    Then click create account button

    Examples:
      | name    | email address        | password | first name | last name | company | address | address2 | state  | city   | zipcode | mobile number |
      | Yasemin | testy006@hotmail.com | test1234 | Yasemin    | Test      | ABC     | Ankara  | Ankara   | Turkey | Ankara | 06000   | 05000000000   |


  @existing_register_email
    Scenario Outline: TC05_register_user_with_existing_email
      And enter name "<name>"
      And enter email address "<email address>"
      And click signup button
      Then verify error email address already exist is visible

      Examples:
        | name    | email address        |
        | Yasemin | testy006@hotmail.com |