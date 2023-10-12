package com.first.junitprgram;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class MyCounterTest extends junit.framework.TestCase{
	MyCounter mm = new MyCounter();
	
	@Test
	public void testIncrement() {
		System.out.println("Start");
		assertTrue(mm.increment()==1);
		assertTrue(mm.increment()==2);
		assertTrue(mm.increment()==3);
		System.out.println("End");
	}

}
