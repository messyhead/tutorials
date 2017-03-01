package com.mycompany.speakingclock;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import junit.framework.TestCase;

import org.hamcrest.core.IsEqual;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SpeakingClockEngineTests  {

	private SpeakingClockEngine engine;

	@Before
	public void setUp() {
		engine = new SpeakingClockEngineImpl();
	}

	@After
	public void tearDown() {
		engine = null;
	}

	/**
	 * Should convert correctly.
	 *
	 */
	@Test
	public void midnight() {
		assertThat(engine.translate(new Time(12,0,Time.AM)), is("midnight"));
	}

	@Test
	public void noon() {
		assertThat(engine.translate(new Time(12,0,Time.PM)), is("noon"));
	}

	@Test
	public void oneOClockInTheMorning() {
		assertThat(engine.translate(new Time(1,0,Time.AM)), is("one o'clock in the morning"));
	}

	@Test
	public void twoOClockInTheMorning() {
		assertThat(engine.translate(new Time(2,0,Time.AM)), is("two o'clock in the morning"));
	}

	@Test
	public void twoOClockInTheAfternoon() {
		assertThat(engine.translate(new Time(2,0,Time.PM)), is("two o'clock in the afternoon"));
	}

	@Test
	public void fiveOClockInTheAfternoon() {
		assertThat(engine.translate(new Time(5,0,Time.PM)), is("five o'clock in the afternoon"));
	}

	@Test
	public void sixOClockInTheEvening() {
		assertThat(engine.translate(new Time(6,0,Time.PM)), is("six o'clock in the evening"));
	}


}
