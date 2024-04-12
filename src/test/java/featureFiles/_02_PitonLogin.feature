# Scenario: Login Module
# Test Case 1 - User should see login form if not authenticated. Login Form
#               should contain username password and login button
# Test Case 2 – User should see validation errors if click the login button without
#               fill the login form
# Test Case 3 – User should navigate to the dashboard and see welcome
#               message if authenticate successfully
#automationtest
#123456789
Feature: Login Module

  Background:
    Given Navigate to Piton


  Scenario: Test Case 1 - Login Element Control
    When  The login form should appear

  @Regression
  Scenario: Test Case 2 – User should see validation errors
    When Click the login button
    And Validation errors should be displayed

  Scenario: Test Case 3 – Control panel login must be and verified
    When Enter the username "automationtest" and password "123456789" then clik the login button

  Scenario Outline:Test Case 3 – Control panel login
    When Enter the username and password then clik the login button
      | <UserName> | <LoginName>    | <ClickButton> |
      | <Password> | <PasswordName> | <ClickButton> |



    Examples:
      | UserName | LoginName      | Password | PasswordName | ClickButton |
      | UserName | Password       | Password | 1qeqwe       | loginButton |
      | UserName | tt123@         | Password | qweqwe123    | loginButton |
      | UserName | automationtest | Password | 123456789    | loginButton |