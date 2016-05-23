package kolokwium.a.pl.edu.us.awpto;

import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.Collection;
 
import org.junit.Test;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runner.RunWith;

@RunWith(Parameterized.class)
public class FizzBuzzTest
{
	@Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {     
                 { 1,  "1"}, { 3, "Fizz" }, { 5, "Buzz" }, { 15, "FizzBuzz" }
           });
    }

    private int fInput;

    private String fExpected;

    public FizzBuzzTest(int input, String expected) {
        fInput= input;
        fExpected= expected;
    }
    
	
	@Test
    public void test() {
		FizzBuzz tester = new FizzBuzz();
        assertEquals("",fExpected, tester.calculate(fInput));
    }
}