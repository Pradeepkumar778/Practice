package com.tests;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class NestedTests {
	Calculator cal = new Calculator();
	
	@Nested
	class addPositiveNumber
	{
		@Test
		public void addSmallPositiveNumbers() 
		{
			int sum = cal.add(5, 5);
			System.out.println(sum);
		}
		
		@Test
		public void addBigPositiveNumbers() 
		{
			int sum = cal.add(1500, 500);
			System.out.println(sum);
		}
	}
	
	@Nested
	class addNegativeNumber
	{
		@Test
		public void addSmallNegativeNumbers() 
		{
			int sum = cal.add(-5, -5);
			System.out.println(sum);
		}
		
		@Test
		public void addBigNegativeNumbers() 
		{
			int sum = cal.add(-1500, -500);
			System.out.println(sum);
		}
	}
}
