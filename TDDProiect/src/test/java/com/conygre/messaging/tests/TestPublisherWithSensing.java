package com.conygre.messaging.tests;

import com.conygre.messaging.Publisher;
import com.conygre.messaging.Subscriber;


public class TestPublisherWithSensing extends junit.framework.TestCase {

	
	// fixtures
	private Publisher pub;
	private MySubscriber sub;
	private Subscriber subscriber1;
	
	@Override
	public void setUp()
	{
			pub = new Publisher();
			sub = new MySubscriber();
			subscriber1 = new Subscriber();
			
			pub.add(subscriber1);
	}
	
	
	public void testPublisherGotSubscriberUsingSensing()
	{	
		pub.add(sub);
		assertTrue(pub.getSubscribers().contains(sub));	
	}
	
	public void testSubscriberGotAMessageSuccessfullyUsingSubclass()
	{
		pub.add(sub);
		String m = "Test Message";
		pub.publish(m);
		assertEquals(sub.getMessage(), m);
		
	}
	
	public void testSubscriberGotAMessageThroughSensingSubscriberMessageList()
	{
		pub.add(subscriber1);
		String m = "Test Message";
		pub.publish(m);
		assertTrue(subscriber1.getMessageList().contains( m));
		
	}

	
	private  class MySubscriber extends Subscriber
	{
		private String message;
		
		
		public String getMessage()
		{
			return message;
		}
		
		@Override
		public void receiveMessage(String message)
		{
			super.receiveMessage(message);
			this.message = message;
			
		}
		
	}
	
	
}
