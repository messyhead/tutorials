package com.mycompany.speakingclock;

public interface IClock {

	public static class ClockException extends Exception {}
	
	Time getTime() throws ClockException;
}
