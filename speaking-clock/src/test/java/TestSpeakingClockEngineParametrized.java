import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import uk.gov.ros.speaking.clock.SpeakingClockEngine;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class TestSpeakingClockEngineParametrized {

    private String expectedResult;
    private LocalTime time;


    @Parameterized.Parameters(name = "{index}: Time was {0} -> expected {1}")
    public static Collection data() {
        return Arrays.asList(new Object[][]{
                {LocalTime.of(0, 0), "midnight"},
                {LocalTime.of(12, 0), "noon"},
                {LocalTime.of(1, 0), "one o'clock"},
                {LocalTime.of(10, 45), "a quarter to eleven"},
                {LocalTime.of(9, 15), "a quarter past nine"},
                {LocalTime.of(7, 30), "half past seven"},
                {LocalTime.of(0, 15), "a quarter past midnight"},
                {LocalTime.of(0, 45), "a quarter to one"},
                {LocalTime.of(12, 45), "a quarter to one"},
                {LocalTime.of(12, 15), "a quarter past noon"}
        });
    }

    public TestSpeakingClockEngineParametrized(LocalTime time, String expectedResult) {
        this.expectedResult = expectedResult;
        this.time = time;
    }

    private SpeakingClockEngine engine = new SpeakingClockEngine();

    @Test
    public void testTime() {
        String actualTime = engine.convert(time);
        assertEquals(expectedResult, actualTime);
        System.out.println("Actual time was: " + actualTime + "\n");
    }
}
