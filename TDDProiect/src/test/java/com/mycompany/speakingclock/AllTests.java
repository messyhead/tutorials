package com.mycompany.speakingclock;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import junit.framework.Test;
import junit.framework.TestSuite;

@RunWith(Suite.class)
@SuiteClasses({
	SpeakingClockTests2.class,
	SpeakingClockTests.class,
})
public class AllTests {

}
