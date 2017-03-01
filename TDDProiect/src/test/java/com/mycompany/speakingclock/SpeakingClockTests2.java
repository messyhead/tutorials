package com.mycompany.speakingclock;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import junit.framework.TestCase;

import org.hamcrest.core.IsEqual;
import org.jmock.Expectations;
import org.jmock.Mockery;
import org.jmock.Sequence;
import org.jmock.integration.junit4.JMock;
import org.jmock.integration.junit4.JUnit4Mockery;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.mycompany.speakingclock.IClock.ClockException;

@SuppressWarnings("deprecation")
@RunWith(JMock.class)
public class SpeakingClockTests2 extends TestCase {

	private Mockery context = new JUnit4Mockery();// {{
	//	setImposteriser(ClassImposteriser.INSTANCE);
	//}};
	
	private SpeakingClock speakingClock;

	private IClock mockClock;
	private SpeakingClockEngine mockEngine;
	private ISpeechSynthesizer mockSynth;

	@Before
	public void setUp() {
		mockClock = context.mock(IClock.class);
		mockEngine = context.mock(SpeakingClockEngine.class);
		mockSynth = context.mock(ISpeechSynthesizer.class);
		speakingClock = new SpeakingClock(mockClock, mockEngine, mockSynth);
	}

	@After
	public void tearDown() {
		speakingClock = null;
	}

	@Test
	public void tellTheTimeHappyCase() throws Exception {
		final Sequence sequence = context.sequence("tellTheTime");
		context.checking(new Expectations(){{
			Time time = new Time(1,0,Time.AM);
			String timeTranslated = "any old time";
			
			one(mockClock).getTime();
			inSequence(sequence);
			will(returnValue(time));
			
			one(mockEngine).translate(time);
			inSequence(sequence);
			will(returnValue(timeTranslated));

			one(mockSynth).speak(timeTranslated);
			inSequence(sequence);
		}});
		
		speakingClock.tellTheTime();
	}

	@Ignore
	@Test
	public void tellTheTimeWhenClockThrowsException() throws Exception {
		context.checking(new Expectations(){{
			one(mockClock).getTime();
			will(throwException(new ClockException()));
			
			one(mockSynth).speak("Sorry, time server down");
		}});
		
		speakingClock.tellTheTime();
	}

	@Test(expected=RuntimeException.class)
	public void tellTheTimeWhenClockThrowsException2() throws Exception {
		context.checking(new Expectations(){{
			one(mockClock).getTime();
			will(throwException(new ClockException()));
			
			never(mockSynth);
		}});
		
		speakingClock.tellTheTime();
	}

}
