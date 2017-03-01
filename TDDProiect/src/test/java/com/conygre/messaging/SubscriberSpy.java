package com.conygre.messaging;

import java.util.ArrayList;
import java.util.List;

public class SubscriberSpy implements ISubscriber {

	
	private List<String> messages = new ArrayList<String>();
	
	public void receiveMessage(String message) {
		// TODO Auto-generated method stub
		messages.add(message);
	}
	
	public List<String> getMessages() {
		return messages;
	}

}
