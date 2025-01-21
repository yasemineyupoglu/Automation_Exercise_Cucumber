Feature: Login User

  @correct_login_user
  Scenario Outline: TC02_correct_login_user
    Given launch browser and navigate to url
    And click on signup login button
    And verify login to your account is visible
    And enter login email address "<login email address>"
    And enter login password "<login password>"
    And click login button
    Then verify that logged in as username is visible

    Examples:
      | login email address  | login password |
      | testy006@hotmail.com | test12345      |


 @incorrect_login_user
 Scenario Outline: TC03_incorrect_login_user
   Given launch browser and navigate to url
   And click on signup login button
   And verify login to your account is visible
   And enter login email address "<login email address>"
   And enter login password "<login password>"
   And click login button
   Then verify error your email or password is incorrect is visible

   Examples:
     | login email address  | login password |
     | testy006@hotmail.com | test123456     |