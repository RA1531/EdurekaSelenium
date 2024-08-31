#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

 @regression
 Feature: Basic Login Page validation
  This feature file is used for login validation

  @positive
  Scenario: Valid username and valid password test
    
    Given I am on the login page
    When I enter username as "dan@gmail.com" and password as "test1234"
    Then I should successfully be logged in
    
   @negative
   
   Scenario Outline: Invalid username and password test
    
    Given I am on the login page
    When I enter username as "<username>" and password as "<password>"
    Then Login error message should be displayed

    Examples: 
      
      | username              | password        |
      | invalid-dan@gmail.com | test123         | # invalid username and valid password
      | dan@gmail.com         | invalid-test123 | # valid username and invalid password
      | invalid-dan@gmail.com | invalid-test123 | # invalid username and invalid password
      |                       | test123         | # blank username and valid password
      | dan@gmail.com         |                 | # valid usernamd and blank password
      |                       |                 | # blank username and blank password