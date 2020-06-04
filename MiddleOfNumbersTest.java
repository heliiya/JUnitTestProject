package testing;

import static org.junit.Assert.*;

import java.util.ArrayList;

import main.Main;

import org.junit.Test;

public class MiddleOfNumbersTest {

	@Test
	public void test() {
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(4);
		numbers.add(7);
		numbers.add(3);
		numbers.add(5);
		numbers.add(9);
		numbers.add(1);
		numbers.add(2);
		int middleOfNumbers = Main.middleOfNumbers(numbers);
		assertEquals(middleOfNumbers, 4);
	}

}
