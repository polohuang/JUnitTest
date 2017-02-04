package org.paul.test.suite;

import static org.junit.Assert.*;

import org.junit.Test;

public class JUnitTest1 {
	String message = "Robert";	
	MessageUtil messageUtil = new MessageUtil(message);
   
	@Test
	public void testPrintMessage() {	
		System.out.println("Inside testPrintMessage()");    
		assertEquals(message, messageUtil.printMessage());     
    }
}
