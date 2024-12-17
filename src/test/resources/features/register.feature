Feature: Register
  In order to perform successful registration
  As a User
  I have to enter correct firstname, lastname, email and password

  Background: I am on homepage

  @smoke @author_Payal
  Scenario: Verify User Should Navigate To Register Page Successfully
    When I click on the Register Link
    Then I should see the "Register" text

  @sanity
  Scenario: Verify That FirstName LastName Email Password And ConfirmPassword Fields Are Mandatory
    When I click on the Register Link
    And I click on the Register Button
    And I should see the error message "First name is required."
    And I should see the error message "Last name is required."
    And I should see the error message "Email is required."
    And I should see the error message "Password is required."
    Then And I should see the error message "Password is required."

  @regression
  Scenario: Verify That User Should Create Account Successfully
    When I click on the Register Link
    And I select gender "Female"
    And I enter the first name "Juli"
    And  I enter the last name "Norin"
    And I enter email "aaaaaa233@yahoo.com"
    And I enter password "Aaaa333@"
    And I enter Confirm Password "Aaaa333@"
    And I click on the Register Button
    Then I should see the message "Your registration completed"