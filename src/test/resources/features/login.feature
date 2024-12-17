
Feature: Login Feature
  In Order to perform successful login
  As a User
  I have to enter correct username and password

  @smoke @author_Payal
  Scenario: User should navigate to login page successfully
    Given I am on homepage
    When I click on login link
    Then I should see the "Welcome, Please Sign In!" message display

  @sanity
  Scenario: Verify the error message with invalid login credentials
    Given I am on homepage
    When I click on login link
    And I Enter EmailId "xyz133@yahoo.com"
    And I Enter Password "nee444"
    And I click on the Login Button
    Then I should see the Error message

  @regression
  Scenario: Verify that user should login successfully with valid credentials
    Given I am on homepage
    When I click on login link
    And I Enter EmailId "xyz133@yahoo.com"
    And I Enter Password "xyz333@"
    And I click on the Login Button
    Then I should see that the LogOut link is displayed

  @regression
  Scenario: Verify That User Should LogOut SuccessFully
    Given I click on login link
    And I Enter EmailId "xyz133@yahoo.com"
    And I Enter Password "xyz333@"
    And I click on the Login Button
    And I click on the Logout Button
    Then I should see that Login link is displayed


