Feature: The clock can speak any time that is given


  Scenario: Speak the exact hour
    Given the time is 12.00
    When I ask the clock the time
    Then the clock says "12 o'clock"