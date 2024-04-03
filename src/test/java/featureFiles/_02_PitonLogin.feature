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

  Scenario: Test Case 1 - Login Element Control
    Given Navigate to Piton
    When  The login form should appear

  @Smoke @Regression
  Scenario: Test Case 2 – User should see validation errors
    Given  Navigate to Piton
    When Click the login button