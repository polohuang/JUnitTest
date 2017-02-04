package org.paul.test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.paul.PrimeNumberChecker;

@RunWith(Parameterized.class)
public class ParameterizedTest {
	private int inputNumber;
	private Boolean expectedResult;
	private PrimeNumberChecker primeNumberChecker;

	@Before
	public void init() {
		primeNumberChecker = new PrimeNumberChecker();
	}
	
	public ParameterizedTest(int inputNumber, Boolean expectedResult) {
		this.inputNumber = inputNumber;
		this.expectedResult = expectedResult;
	}
	
	@Parameterized.Parameters
	public static Collection primeNumbers() {
		return Arrays.asList(new Object[][] {
				{ 2, true },
	    	    { 6, false },
	    	    { 19, true },
	    	    { 22, true },
	    	    { 23, true }
	    });
	}
	
	@Test
	public void testPrimeNumberChecker() {
		System.out.println("Parameterized Number is : " + inputNumber);
		assertEquals(expectedResult, primeNumberChecker.validate(inputNumber));
   }
}
