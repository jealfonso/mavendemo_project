package com.mavendemo;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import com.learnmaven.mavendemo.*;

public class AppTest extends TestCase {
	
	public AppTest( String testName ) {
		
		super (testName);
	}
	
	public static Test suite() {
		
		return new TestSuite( AppTest.class );
		
	}
	
	public void testAdd() {
		
		assertEquals(10, new Calculator().add(5, 5) );
		
	}

	public void testSubtract() {
		
		assertEquals(10, new Calculator().subtract(20, 10) );
		
	}
	
	public void testMultiply() {
		
		assertEquals(10, new Calculator().multiply(5, 2) );
		
	}

	public void testDivide() {
		
		assertEquals(10.0, new Calculator().divide(100, 10) );
		
	}
	
}
