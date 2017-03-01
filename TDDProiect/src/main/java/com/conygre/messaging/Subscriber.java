package com.conygre.messaging;

import java.util.ArrayList;
import java.util.Collection;

public class Subscriber implements ISubscriber {

	private ArrayList<String> messageList = new ArrayList<String>();
	
	public Collection<String> getMessageList()
	{
		return messageList;
	}
	
	
	@Override
	public void receiveMessage(String message) {
		// TODO Auto-generated method stub
		System.out.println("Got a message with the text " + message);
		messageList.add(message);

	}

}
