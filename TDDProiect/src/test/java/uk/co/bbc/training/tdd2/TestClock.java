package uk.co.bbc.training.tdd2;

import static org.junit.Assert.*;

import java.sql.Time;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestClock {

	
	private SpeakingClock clock;
	
	@Before 
	public void setup() {
		clock = new SpeakingClock();
	}
	

	@Test
	public void testThatSpeakingClockCanDoMidnight() {
		String expectedResult = "midnight";
		String result = clock.speak(new Time(0, 0, 0));
		assertEquals(expectedResult, result);
	}

	@Test
	public void testThatSpeakingClockCanDoMidday() {
		String expectedResult = "midday";
		String result = clock.speak(new Time(12,0,0));
		assertEquals(expectedResult, result);
	}
	
}
