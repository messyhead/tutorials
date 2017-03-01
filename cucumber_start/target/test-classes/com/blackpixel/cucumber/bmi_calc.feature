
Feature: As a patient I want to calculate my BMI online so I can track my weight

@BMI_Calculator
Scenario: Calculate BMI from height in cm and weight in kg
When "173" and "100" are entered into the calculator
And Calculate BMI button is clicked
Then the BMI should be "33.4"

@BMI_Calculator @Examples_Table
Scenario Outline: Calculating BMIs from height in cm and weight in kg
When <cm> and <kg> are entered into the calculator
And Calculate BMI button is clicked
Then the BMI should be <bmi>

Examples:
|cm|kg|bmi|
|"173"|"100"|"33.4"|
|"160"|"49"|"19.1"|
|"163"|"48"|"18.1"|
