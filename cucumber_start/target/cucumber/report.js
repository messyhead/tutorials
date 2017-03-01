$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("com/blackpixel/cucumber/deposit.feature");
formatter.feature({
  "line": 2,
  "name": "As a User I want to deposit money into my account",
  "description": "",
  "id": "as-a-user-i-want-to-deposit-money-into-my-account",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@UserAccounts"
    }
  ]
});
formatter.before({
  "duration": 138178,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Depositing money into User\u0027s account should add money to the User\u0027s current balance",
  "description": "",
  "id": "as-a-user-i-want-to-deposit-money-into-my-account;depositing-money-into-user\u0027s-account-should-add-money-to-the-user\u0027s-current-balance",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "a User has no money in their account",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "£100 is deposited into the account",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "the balance should be £100",
  "keyword": "Then "
});
formatter.match({
  "location": "DepositStep.a_User_has_no_money_in_their_current_account()"
});
formatter.result({
  "duration": 100899155,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "100",
      "offset": 1
    }
  ],
  "location": "DepositStep.£_is_deposited_into_the_account(int)"
});
formatter.result({
  "duration": 2267732,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "100",
      "offset": 23
    }
  ],
  "location": "DepositStep.the_balance_should_be_£(int)"
});
formatter.result({
  "duration": 178404,
  "status": "passed"
});
formatter.before({
  "duration": 85141,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "Depositing money into User\u0027s account should add money to the User\u0027s current balance",
  "description": "",
  "id": "as-a-user-i-want-to-deposit-money-into-my-account;depositing-money-into-user\u0027s-account-should-add-money-to-the-user\u0027s-current-balance",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 11,
  "name": "a User has no money in their account",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "£50 is deposited into the account",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "the balance should be £50",
  "keyword": "Then "
});
formatter.match({
  "location": "DepositStep.a_User_has_no_money_in_their_current_account()"
});
formatter.result({
  "duration": 26192,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "50",
      "offset": 1
    }
  ],
  "location": "DepositStep.£_is_deposited_into_the_account(int)"
});
formatter.result({
  "duration": 109196,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "50",
      "offset": 23
    }
  ],
  "location": "DepositStep.the_balance_should_be_£(int)"
});
formatter.result({
  "duration": 127092,
  "status": "passed"
});
formatter.uri("com/blackpixel/cucumber/hire_car.feature");
formatter.feature({
  "line": 2,
  "name": "As a foreign business person I want to hire a car so that I",
  "description": "can drive places when I am away on business",
  "id": "as-a-foreign-business-person-i-want-to-hire-a-car-so-that-i",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@HireCar"
    }
  ]
});
formatter.scenario({
  "line": 6,
  "name": "Hire a car model that is available",
  "description": "",
  "id": "as-a-foreign-business-person-i-want-to-hire-a-car-so-that-i;hire-a-car-model-that-is-available",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "a Ford Focus is available",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I select a Ford Focus",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I should be informed that it is available",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});