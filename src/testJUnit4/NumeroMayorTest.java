package testJUnit4;

import com.misiontic.NumeroMayor;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumeroMayorTest {

    @Test
    public void testGetGreater(){
        NumeroMayor numeroMayor = new NumeroMayor();
        int result = numeroMayor.getGreater(4, 5);
        assertEquals(5, result);
    }
}
