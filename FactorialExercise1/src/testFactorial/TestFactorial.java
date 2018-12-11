package testFactorial;

import static org.junit.Assert.*;

import org.junit.Test;

import factorialQuestions.FactorialExercises;


public class TestFactorial {

	@Test
	public void testFactorial() {
	int Sum = FactorialExercises.findFactorial(Sum);
	assertEquals("Not a Factorial", 3628800, Sum);	
	
	}
}
