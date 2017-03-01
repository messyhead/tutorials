package com.blackpixel.cucumber;

import static org.junit.Assert.assertTrue;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

public class DepositStep {
	
	private Account account;
	private User user;
	
	@Before(value="@UserAccounts")
	public void initialise(){
		if(user == null){
			user = new User();
		}
		
		if(account == null){
			account = new Account();
			user.setAccount(account);
		}
	}
	
    @Given("^a User has no money in their account$")
    public void a_User_has_no_money_in_their_current_account() {
        assertTrue("The balance is not zero.", account.getBalance() == 0);
    }
 
    @When("^£(\\d+) is deposited into the account$")
    public void £_is_deposited_into_the_account(int amount) {
        account.deposit(amount);
    }
 
    @Then("^the balance should be £(\\d+)$")
    public void the_balance_should_be_£(int expectedBalance) {
    	int currentBalance = account.getBalance();
        assertTrue("The expected balance was £100, but actually was: " + currentBalance, currentBalance == expectedBalance);
    }
 
}

