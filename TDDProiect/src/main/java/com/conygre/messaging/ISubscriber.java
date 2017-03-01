package com.conygre.messaging;


// will be mocking one of these. No real classes exist yet.
public interface ISubscriber {

	void receiveMessage(String message);
	
}
