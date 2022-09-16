package com.demo.moodanalyser;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;


class MoodAnalyzerTest {

	@Test
	public void givenMessage_whenSad_shouldReturnSad() throws MoodAnalysisException {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer("This is a sad message");
		String mood = moodAnalyzer.analyzeMood();
		assertEquals("SAD", mood);
	}
	
	@Test
	public void givenMessage_whenNotSad_shouldReturnHappy() throws MoodAnalysisException {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer("This is a happy message");
		String mood = moodAnalyzer.analyzeMood();
		assertEquals("HAPPY", mood);
	}
	
	@Test
	public void givenMessage_whenNull_shouldThrowException() throws MoodAnalysisException {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer(null);
		String mood;
		try {
			mood = moodAnalyzer.analyzeMood();
		} catch (MoodAnalysisException e) {
			assertEquals(MoodAnalysisException.ExceptionType.ENTERED_NULL, e.type);
		}
	}
	
	@Test
	public void givenMessage_whenEmpty_shouldThrowException() {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer(" ");
		String mood = null;
		try {
			mood = moodAnalyzer.analyzeMood();
		} catch (MoodAnalysisException e) {
			assertEquals(MoodAnalysisException.ExceptionType.ENTERED_EMPTY, e.type);
		}	
	}
}
