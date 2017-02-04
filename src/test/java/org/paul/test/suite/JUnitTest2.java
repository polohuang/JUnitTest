package org.paul.test.suite;

import static org.junit.Assert.*;

import org.junit.Test;

public class JUnitTest2 {
   String message = "Robert";	
   MessageUtil messageUtil = new MessageUtil(message);
 
   @Test
   public void testSalutationMessage() {
      System.out.println("Inside testSalutationMessage()");
      message = "Hi!" + "Robert";
      assertEquals(message,messageUtil.printMessage());
   }
}
