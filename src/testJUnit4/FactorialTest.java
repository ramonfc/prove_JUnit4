package testJUnit4;

import com.misiontic.Factorial;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(value = Parameterized.class)
public class FactorialTest {

    private long  expectedValue;
    private int number;
    public FactorialTest(int number, long expectedValue){
       this.number = number;
       this.expectedValue = expectedValue;
    }
    @Parameterized.Parameters
    public static  Iterable<Object[]> getParameters(){
        List<Object[]> obj = new ArrayList<>();
        obj.add(new Object[]{3,6});
        obj.add(new Object[]{4,24});
        obj.add(new Object[]{5,120});
        return obj;
    }

    @Test
    public void testCalculateFactorial(){
          Factorial factorial = new Factorial();
          //long expectedValues[] = {6, 24, 120};
          //int arguments[] = {3, 4, 5};
          //for(int i = 0; i<arguments.length; i++){
             // assertEquals(expectedValues[i], factorial.calculateFactorial(arguments[i]));
          //}
        assertEquals(expectedValue, factorial.calculateFactorial(number));

    }
}
