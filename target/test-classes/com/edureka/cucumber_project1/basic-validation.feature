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
 Feature: Facebook Login
  This feature file is used to validate the basic validation

  @positive
  Scenario: Page title validation
    
    Given I am on the Facebook login page
    Then The page title should be dispalyed

  @positive
  Scenario: Facebook URL validation
    
    Given I am on the login page
    Then The URL should be displayed
