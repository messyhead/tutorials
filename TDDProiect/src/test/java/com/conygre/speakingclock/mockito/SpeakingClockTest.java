package com.conygre.speakingclock.mockito;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;


import com.mycompany.speakingclock.IClock;
import com.mycompany.speakingclock.ISpeechSynthesizer;
import com.mycompany.speakingclock.SpeakingClock;
import com.mycompany.speakingclock.SpeakingClockEngine;
import com.mycompany.speakingclock.Time;

import static org.mockito.Mockito.*;

public class SpeakingClockTest {
	
	// class under test
	private SpeakingClock speakingClock;

	// mocks
	private IClock mockClock;
	private SpeakingClockEngine mockEngine;
	private ISpeechSynthesizer mockSynth;

	@Before
	public void setUp() {
		mockClock = mock(IClock.class);
		mockEngine = mock(SpeakingClockEngine.class);
		mockSynth = mock(ISpeechSynthesizer.class);
		speakingClock = new SpeakingClock(mockClock, mockEngine, mockSynth);
	}

	@After
	public void tearDown() {
		speakingClock = null;
	}

	@Test
	public void tellTheTimeHappyCase() throws Exception {
		
		speakingClock.tellTheTime();
		verify(mockClock, times(1)).getTime();
		
		verify(mockSynth).speak(anyString());
		verify(mockEngine).translate(any(Time.class));
	}

	

}
//InOrder inOrder = inOrder(mockClock, mockEngine, mockSynth);
//
//inOrder.verify(mockClock).getTime();
//inOrder.verify(mockEngine.translate(any(Time.class)));
//inOrder.verify(mockSynth).speak(anyString());