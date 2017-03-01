import org.junit.Test;
import uk.gov.ros.speaking.clock.SpeakingClockEngine;

import java.time.LocalTime;

import static org.junit.Assert.*;

public class TestSpeakingClockEngine {

    private SpeakingClockEngine engine = new SpeakingClockEngine();

    @Test
    public void check12AmIsMidnight() {
        String actualTime = engine.convert(LocalTime.of(0,0));
        assertEquals("midnight", actualTime);
        System.out.println(actualTime + "\n");
    }

    @Test
    public void check12PmIsNoon() {
        String actualTime = engine.convert(LocalTime.of(12,0));
        assertEquals("noon", actualTime);
        System.out.println(actualTime + "\n");
    }

    @Test
    public void checkEachHour() {
        String actualTime = engine.convert(LocalTime.of(1,0));
        assertEquals("one o'clock", actualTime);
        System.out.println(actualTime + "\n");
    }
}
