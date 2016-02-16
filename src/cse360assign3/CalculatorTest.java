package cse360assign3;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testCalculator() {
		Calculator tester = new Calculator();
		assertNotNull(tester);
	}

	@Test
	public void testGetTotal() {
		Calculator tester = new Calculator();
		assertEquals(0, tester.getTotal());
	}

	@Test
	public void testAdd() {
		Calculator tester = new Calculator();
		tester.add(5);
		assertEquals(5, tester.getTotal());
	}

	@Test
	public void testSubtract() {
		Calculator tester = new Calculator();
		tester.add(5);
		tester.subtract(3);
		assertEquals(2, tester.getTotal());
	}

	@Test
	public void testMultiply() {
		Calculator tester = new Calculator();
		tester.multiply(7);
		assertEquals(0, tester.getTotal());
		tester.add(2);
		tester.multiply(3);
		assertEquals(6, tester.getTotal());
	}

	@Test
	public void testDivide() {
		Calculator tester = new Calculator();
		tester.add(9);
		tester.divide(3);
		assertEquals(3, tester.getTotal());
	}

	@Test
	public void testDivideZero() {
		Calculator tester = new Calculator();
		tester.add(9);
		tester.divide(0);
		assertEquals(0, tester.getTotal());
	}
	
	@Test
	public void testGetHistory() {
		Calculator tester = new Calculator();
		assertEquals("", tester.getHistory());
	}

}
