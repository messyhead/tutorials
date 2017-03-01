package com.mycompany.speakingclock;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import junit.framework.TestCase;

import org.hamcrest.core.IsEqual;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.mycompany.speakingclock.Time.AmPm;

@RunWith(Parameterized.class)
public class SpeakingClockEngineParameterizedTests extends TestCase {
	private SpeakingClockEngine engine;
	
	private int hours;
	private int minutes;
	private AmPm amPm;
	private String result;

	@Before
	public void setUp() {
		engine = new SpeakingClockEngineImpl();
	}

	@Parameters
	public static Collection data() {
		return Arrays.asList(
			new Object[][]{
				{12,0,Time.AM, "midnight"},
				{12,0,Time.PM, "noon"},
				{1,0,Time.AM, "one o'clock in the morning"},
				{2,0,Time.PM, "two o'clock in the afternoon"},
				{5,0,Time.PM, "five o'clock in the afternoon"},
				{6,0,Time.PM, "six o'clock in the evening"},
			}
		);
	}

	public SpeakingClockEngineParameterizedTests(int hours, int minutes, Time.AmPm amPm, String result) {
		this.hours = hours;
		this.minutes = minutes;
		this.amPm = amPm;
		this.result = result;
	}
	
	@Test
	public void shouldTranslateCorrectly() {
		assertThat(
			engine.translate(new Time(this.hours,this.minutes,this.amPm)), is(result));
	}



}
