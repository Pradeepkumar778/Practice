package com.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;


public class RepeatedTests {
	
	  @Test
      @RepeatedTest(5)
      public void addNumber() {
          Calculator calculator = new Calculator();
          int sum = calculator.add(5, 5);
          assertEquals(10,sum);
          System.out.println("addnumber testcase executed");
      }
}
