package calc;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class MultiplicationTest {

	@Test
	public void testMultiplication() {
		int a=30;
		int b=20;
		int c=doMulti(a,b);
		assertEquals(600,c);
	}

	public int doMulti(int a, int b) {
		return a*b;
	}



}