package uk.co.bbc.training.tdd;

import java.sql.Time;

public class TimeToText {

	public String stringFromTime(Time time) {
		// TODO Auto-generated method stub
		if (time.getHours() == 0 && time.getMinutes() == 0)
			return "midnight";
		else if (time.getHours() == 1 && time.getMinutes() ==0) {
			return "1AM";
		}
		else
			return null;
	}

}
