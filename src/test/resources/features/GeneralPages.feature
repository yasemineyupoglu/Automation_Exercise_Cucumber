Feature: General Pages

  @contact_us_pages
  Scenario Outline: TC06_contact_us_pages
    Given launch browser and navigate to url
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
      Given launch browser and navigate to url
      And click on test cases button
      Then verify test cases is visible