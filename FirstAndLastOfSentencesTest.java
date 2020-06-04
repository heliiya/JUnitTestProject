package testing;

import static org.junit.Assert.*;
import main.Main;

import org.junit.Test;

public class FirstAndLastOfSentencesTest {

	@Test
	public void test() {
		String firstAndLastOfSentences = Main.firstAndLastOfSentences("hi my best friend");
		assertEquals("hi friend", firstAndLastOfSentences.trim());
		
		firstAndLastOfSentences = Main.firstAndLastOfSentences("hello");
		assertEquals("hello", firstAndLastOfSentences.trim());
	}

}
