package com.demo.moodanalyser;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;


class MoodAnalyzerTest {

	@Test
	public void givenMessage_whenSad_shouldReturnSad() {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
		String mood = moodAnalyzer.analyzeMood("This is a sad message");
		assertEquals("SAD", mood);
	}
	
	@Test
	public void givenMessage_whenNotSad_shouldReturnHappy() {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
		String mood = moodAnalyzer.analyzeMood("This is a happy message");
		assertEquals("HAPPY", mood);
	}
}
