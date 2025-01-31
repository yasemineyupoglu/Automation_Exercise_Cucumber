@general_pages
Feature: General Pages

  Background:
    Given launch browser and navigate to url

  @contact_us_pages
  Scenario Outline: TC06_contact_us_pages
    And click on contact us button
    And verify get in touch is visible
    And enter contact name "<contact name>"
    And enter contact email "<contact email>"
    And enter contact subject "<contact subject>"
    And enter contact message "<contact message>"
    And upload file "<contact file>"
    And click submit button
    And click ok button
    Then verify success message success your details have been submitted successfully is visible

    Examples:
      | contact name | contact email        | contact subject | contact message      | contact file                                                                          |
      | Test         | testy006@hotmail.com | Test            | for testing purposes | C:\Users\YaseminEYUPOGLU\Yasemin\Dosyalarım\Proje\Selenium_Cucumber_Ornekler\test.txt |


  @test_cases_pages
  Scenario: TC07_verify_test_cases_page
    And click on test cases button
    Then verify test cases is visible


  @products_pages
  Scenario: TC08_verify_products_page
    And click on products button
    Then verify products is visible


  @search_products_pages
  Scenario Outline: TC09_verify_search_products_page
    And click on products button
    And verify products is visible
    And enter "<product name>" in search input and click search button
    And verify searched products is visible
    Then verify all the products related to search are visible

    Examples:
      | product name |
      | top          |


  @subscription_in_home_page
  Scenario Outline: TC10_verify_subscription_in_home_page
    And scroll down to footer
    And verify text subscription
    And enter "<email address>" in input and click arrow button
    Then verify success message you have been successfully subscribed is visible

    Examples:
      | email address |
      | testy006@hotmail.com |


  @subscription_in_cart_page
  Scenario Outline: TC11_verify_subscription_in_cart_page
    And click cart button
    And scroll down to footer
    And verify text subscription
    And enter "<email address>" in input and click arrow button
    Then verify success message you have been successfully subscribed is visible

    Examples:
      | email address |
      | testy006@hotmail.com |

