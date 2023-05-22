package calc;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SubtractionTest {

	@Test
	public void testSubtraction() {
		int a=30;
		int b=20;
		int c=doSub(a,b);
		assertEquals(10,c);
	}

	public int doSub(int a, int b) {
		return a-b;
	}

}