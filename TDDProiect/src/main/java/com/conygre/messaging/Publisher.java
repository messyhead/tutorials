package com.conygre.messaging;

import java.util.ArrayList;
import java.util.Collection;

public class Publisher {

	private ArrayList<ISubscriber> subscriberList = new ArrayList<ISubscriber>();

	// publish a message to all recipients
	public void publish(String message) {
		for (ISubscriber s : subscriberList) {
			s.receiveMessage(message);
		}
	}

	// allows you to add additional subscribers
	public void add(ISubscriber sub) {
		subscriberList.add(sub);
	}

	public Collection<ISubscriber> getSubscribers() {
		return subscriberList;
	}

}
