package calc;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;



public class AdditionTest {

	@Test
	public void testSum() {
		int a=30;
		int b=20;
		int c=doSum(a,b);
		assertEquals(50,c);
	}

	public int doSum(int a, int b) {
		return a+b;
	}

}
