package testing;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ FirstAndLastOfSentencesTest.class, MiddleOfNumbersTest.class,
		MiddleOfSentencesTest.class, ReverseLineTest.class })
public class AllTests {

}
