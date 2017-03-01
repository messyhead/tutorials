package uk.gov.ros.speaking.clock;

import java.time.LocalTime;
import java.util.HashMap;

public class SpeakingClockEngine {

    private HashMap<Integer, String> hrs = new HashMap<>();
    private HashMap<Integer, String> quarters = new HashMap<>();


    public String convert(LocalTime time) {
        hrs.put(0, "midnight");
        hrs.put(1, "one");
        hrs.put(2, "two");
        hrs.put(3, "three");
        hrs.put(4, "four");
        hrs.put(5, "five");
        hrs.put(6, "six");
        hrs.put(7, "seven");
        hrs.put(8, "eight");
        hrs.put(9, "nine");
        hrs.put(10, "ten");
        hrs.put(11, "eleven");
        hrs.put(12, "noon");

        quarters.put(15, "a quarter past");
        quarters.put(30, "half past");
        quarters.put(45, "a quarter to");

        String hour;
        String minute;

        int hr = time.getHour();
        int min = time.getMinute();
        hour = hrs.get(hr);
        minute = quarters.get(min);

        if (hr == 12 && min == 0) {
            return hour;
        } else if (hr == 0 && min == 0) {
            return hour;
        } else if (hour != null && min == 0) {
            return hour + " o'clock";
        } if (time.getMinute() == 15) {
            return minute + " " + hour;
        } else if (min == 30) {
            return minute + " " + hour;
        } else if (min == 45) {
            String newhour = hrs.get(hr+1);
            return minute + " " + newhour;
        }
        return null;
    }
}
