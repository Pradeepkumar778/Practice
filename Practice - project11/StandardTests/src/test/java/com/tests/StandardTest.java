package com.tests;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StandardTest {
	Sample sam = new Sample();
	
	@BeforeAll
	public static void initprocess()
	{
		System.out.println("Before Class");
	}
	
	@AfterAll
	public static void endprocess()
	{
		System.out.println("After Class");
	}
	
	@BeforeEach
	public void init()
	{
		System.out.println("Before");
	}
	
	@AfterEach
	public void endObject()
	{
		System.out.println("After");
	}
	
	@Test
	public void testPosAddition() {
		System.out.println("pos");
		int expected = 50;
		int actual = sam.Addition(20, 30);
		
		Assertions.assertEquals(expected , actual);
	}
	
	@Test
	public void testmultiplication() {
		System.out.println("Multiplication");
		int expected = 25;
		int actual = sam.multiplication(5, 5);
		
		Assertions.assertEquals(expected , actual);
	}

	
}
