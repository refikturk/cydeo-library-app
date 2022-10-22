@parameterization
Feature: User is able to log in to the app with valid credentials with paramaters

  Background: User is on the login page
    Given User goes to the log in page of the app
  @librarian @employee @task3
  Scenario: User is able to log in with valid credentials for librarian accounts parameters
    When  User passes valid librarian "email adress"
    And User passes valid librarian password "password"
    And User clicks on Sign in button
    Then User should see the dashboard

  @student @task3
  Scenario: User is able to log in with valid credentials for student accounts parameters
    When  User passes valid student "email adress"
    And User passes valid student password "password"
    And User clicks on Sign in button
    Then  User should see the dashboard

  @singleStep @task4
  Scenario:  Login as librarian in same line
    When I login using "librarian1@library" and "qU9mrvur"
    And User clicks on Sign in button
    Then User should see the dashboard
    Then  There should be 1239 users on the page