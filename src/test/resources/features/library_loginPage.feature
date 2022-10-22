Feature: User is able to log in to the app with valid credentials

  Background: User is on the login page
    Given User goes to the log in page of the app

  @task2
  Scenario: User is able to log in with valid credentials for librarian accounts
    When  User passes valid librarian email address
    And User passes valid librarian password
    And User clicks on Sign in button
    Then User should see the dashboard

  @task2
  Scenario: User is able to log in with valid credentials for student accounts
    When  User passes valid student email address
    And User passes valid student password
    And User clicks on Sign in button
    Then  User should see the dashboard