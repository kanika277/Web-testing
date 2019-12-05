@Parent
Feature: Parent Login into the application

    Scenario: the User should login as Parent
      Given user opens the application
      When User clicks on SignIn button
      And User fills invalid username and password
      And User fills valid username and password
      Then User Should enter Parent dashboard