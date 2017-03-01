package uk.co.bbc.training.tdd;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestMyArrayList {
	
	@Test
	public void testThatMyArrayListAllowsAddingItems() {
		MyArrayList list = new MyArrayList();
		list.add(20);
		assertTrue(list.contains(20));
	}
	

}
