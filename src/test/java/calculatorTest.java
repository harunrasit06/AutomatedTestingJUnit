import CalculatorProject.Calculator;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;


public class calculatorTest {
	Calculator calc;
	@Before
	public void setUp() {
		calc = new Calculator();
	}
	
	@Test
	public void addTwoNumbers() {
		assertEquals(20, calc.add(10, 10));
	}
	
	@Test
	public void addThreeNumbers() {
		assertEquals(30, calc.add(10, 10, 10));
	}
	
	@Test
	public void subtractThreeNumbers() {
		assertEquals(0, calc.subtract(20, 10, 10));
	}
	
	@Test
	public void subtractTwoNumbers() {
		assertEquals(0, calc.subtract(10, 10));
	}
	
	

}
