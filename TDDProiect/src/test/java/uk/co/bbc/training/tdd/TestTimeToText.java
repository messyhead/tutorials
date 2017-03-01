package uk.co.bbc.training.tdd;

import org.junit.runners.*;
import org.junit.runners.Parameterized.Parameters;

import static org.junit.Assert.*;

import java.sql.Time;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(Parameterized.class)
public class TestTimeToText {
	
	private Time time;
	private String timeText;
	
	public TestTimeToText(int t, String s) {
		time = new Time(t,0,0);
		timeText = s;
	}
	
	@Parameters
	public static Collection getParameters() {
		return Arrays.asList(new Object[][] {
				{0,"midnight"},
				{1, "1AM" },
				{2, "2AM"},
				{3, "3AM"},
				{4, "4AM"}
		});
	}
	
	private TimeToText ttt = null;
	
	@Before
	public void setup() {
		ttt = new TimeToText();
	}
	
	@Test
	public void testThatClockCanDoHours() {
		String result = ttt.stringFromTime(time);
		assertEquals(timeText, result );
	}
	
	
}
