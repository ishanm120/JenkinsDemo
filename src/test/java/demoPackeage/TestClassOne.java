package demoPackeage;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

import basePackage.BaseClass;

public class TestClassOne extends BaseClass{
	
	
	@Test
	public void test1() {
		System.out.println("Test 1 run successfully");
	}
	
	@Test
	public void test2() {
		System.out.println("Test 2 run successfully");
	}
	
	@Test
	public void test3() {
		System.out.println("Test 3 run successfully");
	}
	
	@Test
	public void test4() {
		System.out.println("Test 4 run successfully");
	}
	
	@Test
	public void test5() {
		System.out.println("Test 5 run successfully");
	}
	
	@Test
	public void test6() {
		System.out.println("Test 6 run successfully");
	}
	@Test
	public void test7() {
		System.out.println("Test 7 run successfully");
	}
	@Test
	public void test8() {
		System.out.println("Test 8 run successfully");
	}
	@Test
	public void test9() {
		System.out.println("Test 9 run successfully");
	}
	@Test
	public void test10() {
		System.out.println("Test 10 run successfully but got failed");
		assertEquals(true, false);
	}
	@Test
	public void test11() {
		System.out.println("Test 11 run successfully");
		assertEquals(true, true);
	}

}
