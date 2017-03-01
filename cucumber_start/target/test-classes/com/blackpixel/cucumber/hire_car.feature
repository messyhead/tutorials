@HireCar
Feature: As a foreign business person I want to hire a car so that I
  can drive places when I am away on business


  Scenario: Hire a car model that is available
    Given a Ford Focus is available
    When I select a Ford Focus
    Then I should be informed that it is available