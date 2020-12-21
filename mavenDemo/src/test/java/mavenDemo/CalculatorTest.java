package mavenDemo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {
	
	@Test
	public void additionTest() {
		Calculator c=new Calculator();
		int actualResult=c.add(10, 20);
		int expectedResult=30;
		assertEquals(expectedResult,actualResult);
	}
	@Test
	public void subtractTest() {
		Calculator c=new Calculator();
		int actualResult=c.sub(10, 20);
		int expectedResult=-10;
		assertEquals(expectedResult,actualResult);
	}

}