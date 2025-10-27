@dummyFeatures
Feature: dummy feature

  Rule: without login
    Scenario: open test case
    this scenario opens test case page and validate
      Given I am on Ecommerce application
      When I click on "Test Cases"
      Then "Test Cases" opens

