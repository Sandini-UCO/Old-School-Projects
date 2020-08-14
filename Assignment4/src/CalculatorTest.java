import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    Calculator calculator= new Calculator();

    @Test
    public void testAdd(){
        //Initial Assertion
        assertTrue(calculator.add(0,0)==0);
        //Multiple Tests
        int j =0;
        for(int i=0; i < 10; i++){
            assertTrue(calculator.add(i,j)==i+j);
            j++;
        }
    }

    @Test
    public void testSubtract(){
        //Initial Assertion
        assertTrue(calculator.subtract(1,1)==0);
        //Multiple Tests
        int j = 10;
        for(int i=0; i < 10; i++){
            assertTrue(calculator.subtract(j,i)==j-i);
            j--;
        }
    }
}
