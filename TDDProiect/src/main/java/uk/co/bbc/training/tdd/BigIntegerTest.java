package uk.co.bbc.training.tdd;

import static org.junit.Assert.*;

import java.math.BigInteger;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BigIntegerTest {

	

	@Test(expected=ArithmeticException.class)
	public void testBigIntegerDivideByZeroThrowsException() {
		BigInteger deci = BigInteger.valueOf(10);	
		BigInteger result = deci.divide(BigInteger.ZERO);
	}

	
	@Test(expected=ArithmeticException.class)
	public void testIntDivideByZeroThrowsException() {
		int result =  10 / 0;
	}
}
