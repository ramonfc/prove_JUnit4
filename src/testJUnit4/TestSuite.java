package testJUnit4;

import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;
import org.junit.runners.Suite;



@RunWith(value = Suite.class)
@SuiteClasses({FactorialTest.class, NumeroMayorTest.class})
public class TestSuite {

}
