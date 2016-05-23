package kolokwium.a.pl.edu.us.awpto;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

import org.junit.Test;

public class NumberPrinterTest
{
	@Test
    public void test() {
		private NumberPrinter tester = mock(NumberPrinter.class);
		
		when(tester.printNumbers(anyInt()))
		.thenThrow(new Exception());
    }
}