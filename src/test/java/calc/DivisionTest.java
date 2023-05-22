package calc;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class DivisionTest {

	@Test
	public void testDiv() {
		double a=30;
		double b=2;
		double c=doDiv(a,b);
		assertEquals(15,c);
	}

	public double doDiv(double a, double b) {
		return a/b;
	}


}
