package com.junit.lifecycleprogram;

//import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class MyTest {

	@BeforeAll
	public static void method1() {
		System.out.println("Before all");
	}
	@Test
	public  void test() {
		System.out.println("Normal test  method");
	}

	@Test
	public  void method2() {
		System.out.println("Normal method all");
	}

}
