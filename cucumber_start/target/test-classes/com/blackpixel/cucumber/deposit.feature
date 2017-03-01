@UserAccounts
Feature: As a User I want to deposit money into my account


Scenario: Depositing money into User's account should add money to the User's current balance
Given a User has no money in their account
When £100 is deposited into the account
Then the balance should be £100

Scenario: Depositing money into User's account should add money to the User's current balance
Given a User has no money in their account
When £50 is deposited into the account
Then the balance should be £50