package com.conygre.messaging.tests;

import com.conygre.messaging.Publisher;
import com.conygre.messaging.Subscriber;


public class TestSubscriberMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Publisher pub = new Publisher();
		
		TestSubscriberMain main = new TestSubscriberMain();
		
		MySubscriber sub = main.new MySubscriber();
		
		
		Subscriber subscriber1 = new Subscriber();
		
		pub.add(subscriber1);
		pub.add(sub);
		String m = "Test Message";
		pub.publish(m);
		System.out.println(sub.getMessage().equals(m));
	}
	
	private class MySubscriber extends Subscriber
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
