package uk.co.bbc.training.tdd;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class TestString {

	private String stringLiteral1,stringLiteral2, createdStringLiteral3, nullString;
	
	
	@BeforeClass
	public static void beforeClass() {
		// set up your db
		System.out.println("running beforeclass");
	}
	
	@Before
	public void setup() {
		stringLiteral1 = "hello";
		stringLiteral2 = "hello";
		createdStringLiteral3 = new String("hello");
		System.out.println("running before");
	}
	
	@After
	public void tearDown() {
		System.out.println("in after");
		stringLiteral1 = null;
		stringLiteral2 = null;
		createdStringLiteral3 = null;
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("The end");
	}

	@Test
	public void testThatDoubleEqualsComparisonReturnsTrueWithLiterals() {
		System.out.println("in a test");
		assertTrue(stringLiteral1 == stringLiteral2);
	}
	
	@Test
	public void testThatDoubleEqualsWithANewStringReturnsFalse() {
		System.out.println("in a test again");
		assertFalse(stringLiteral1 == createdStringLiteral3);
	}
	
	@Ignore("Not needed now")
	@Test(expected=ArrayIndexOutOfBoundsException.class)
	public void testThatCallingAMethodOnANullStringThrowsANullPointer() {
		nullString.charAt(3);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
