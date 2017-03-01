package uk.co.bbc.training.tdd2;

import java.sql.Time;

public class SpeakingClock {

	public String speak(Time time) {
		// TODO Auto-generated method stub
		if (time.getHours() == 0 && time.getMinutes() == 0)
			return "midnight";
		else if (time.getHours() == 12 && time.getMinutes() == 0)
			return "midday";
		else 
			return null;
	}

}
