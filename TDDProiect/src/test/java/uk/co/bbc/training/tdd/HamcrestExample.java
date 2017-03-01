package uk.co.bbc.training.tdd;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import static org.hamcrest.Matchers.greaterThan;

import static org.hamcrest.Matchers.lessThan;

public class HamcrestExample {
	
	@Test()
	public void shouldBeAbleToAddTwoPositiveNumbers() {
		Calculator calculator = new Calculator();
		assertThat(calculator.add(2,2), equalTo(4)); 
	}	

	@Test
	public void threeIsGreaterThanTwoAndLessThanFour() {
		assertThat(3, is(greaterThan(2)));
		assertThat(3, is(lessThan(4)));
	}
	
	
}
