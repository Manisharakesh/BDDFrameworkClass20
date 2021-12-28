Feature: nopcommerce register

  Background:
Given User Open the browser and Enter Url
  Scenario: nopcommerce registration page

    Then User  click on register button
    Then User enter  FirstName
    Then User  enter LastName
    Then User enter Date of birth
    Then User enter Month of birth
    And  User enter year of birth
    Then User enter email
    And User enter password
    And User enter ConfirmPassword
    Then User Click on register
    Then User is on HomePage




