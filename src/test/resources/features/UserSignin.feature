@LoginFeature
Feature: Title of your feature
  I want to use this template for my feature file

  @signin
  Scenario Outline: Sigin with valid credential
    Given navigate to application
    Then click on signin link
    And enter an email address as"<EmailAddress>"
    And enter password as"<Password>"
    Then click on signin button

    Examples: 
      | EmailAddress  | Password |
      | abcde@exe.com |    12345 |
