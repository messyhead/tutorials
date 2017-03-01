package com.conygre.messaging.tests;

//import org.jmock.integration.junit3.MockObjectTestCase;
import org.jmock.Expectations;
import org.jmock.Sequence;
import org.jmock.integration.junit4.JUnit4Mockery;
import org.junit.Before;


import com.conygre.messaging.ISubscriber;
import com.conygre.messaging.Publisher;
import com.mycompany.speakingclock.Time;
import org.junit.Test;



public class TestPublisher { //extends MockObjectTestCase {
	
	JUnit4Mockery mockery  = new JUnit4Mockery();
	
	
	// the mock subscriber
	private ISubscriber subscriber;  
	// the object to be tested
	private Publisher publisher;
	// add the mock to the object to be tested
	private String message = "message";
	
	@Before
	public void setUp()
	{
		// create the mock subscriber
		subscriber = mockery.mock(ISubscriber.class);
		// create the object under test
		publisher = new Publisher();
		publisher.add(subscriber);
	}
	@Test
	public void testOneSubscriberReceivesAMessage() {
		//final Sequence sequence = mockery.sequence("receiveMessages");
		mockery.checking(new Expectations(){{
			
		    one (subscriber).receiveMessage(message);
		    //inSequence(sequence);
		}});	
		// now we invoke the method that when run  
		// should meet the expectation
		publisher.publish(message);
		//publisher.add(subscriber);
	}

}
