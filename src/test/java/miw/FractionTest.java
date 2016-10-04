package miw;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FractionTest {

	private Fraction f1,f2;
	
	@Before
	public void before()
	{
		f1 = new Fraction(3,6);
		f2 = new Fraction(6,3);
	}
	
	@Test
	public void testFractionIntInt() {
		assertEquals(3, f1.getNumerator());
		assertEquals(6, f1.getDenominator());
		assertEquals(6, f2.getNumerator());
		assertEquals(3, f2.getDenominator());
	}
	
	@Test
	public void testisPropiaFraction1() {
		assertTrue(f1.getNumerator() < f1.getDenominator());
	}
	
	@Test
	public void testisImpropiaFraction2() {
		assertTrue(f2.getNumerator() > f2.getDenominator());
	}
	@Test
	public void division() {
		assertEquals(0.25 , f1.division(f2.getNumerator(), f2.getDenominator()),10e-5);
	}

}
