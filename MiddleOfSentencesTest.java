package testing;

import static org.junit.Assert.*;
import main.Main;

import org.junit.Test;

public class MiddleOfSentencesTest {

	@Test
	public void test() {
		String middleOfSentences = Main.middleOfSentences("hello my friend, how are you?, are yuo ok?");
		assertEquals("how are you?", middleOfSentences.trim());
	}

}
