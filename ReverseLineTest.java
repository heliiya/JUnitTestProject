package testing;

import static org.junit.Assert.*;
import main.Main;

import org.junit.Test;

public class ReverseLineTest {

	@Test
	public void test() {
		String reverseLine = Main.reverseLine("hello my friend");
		assertEquals("friend my hello", reverseLine.trim());
	}

}
