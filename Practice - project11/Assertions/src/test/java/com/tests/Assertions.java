package com.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class Assertions {

	@Test
	public void assertTest1() {
		int a = 10;
		int b = 20;
		int sum = a+b;
		
		assertEquals(30,sum);
		assertNotEquals(20,sum);
		assertTrue(40>sum);
		assertFalse(40<sum);
		
	}
	
	@Test
	public void assertTest2() {
		
		String str1 = null;
		String str2 = "Pradeep";
		
		assertNull(str1);
		assertNotNull(str2);
		assertSame(str1,str1);
		assertNotSame(str1 , str2);
		   
	}
}
