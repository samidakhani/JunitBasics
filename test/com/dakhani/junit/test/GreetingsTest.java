package com.dakhani.junit.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.dakhani.junit.source.Greetings;
import com.dakhani.junit.source.GreetingsImpl;

public class GreetingsTest {

	private Greetings greetings;
	
	@BeforeClass
	public static void setUpClass(){
		System.out.println("setUpClass");
	}
	
	@Before
	public void setUp(){
		System.out.println("setUp");
		greetings = new GreetingsImpl();
	}
	
	@Test
	public void testSayHello() {
		System.out.println("testSayHello");
		String actual = greetings.sayHello("Junit");
		assertEquals("Hello Junit", actual);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testNullParameter(){
		System.out.println("testNullParameter");
		greetings.sayHello(null);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testEmptyParameter(){
		System.out.println("testEmptyParameter");
		greetings.sayHello("");
	}

	@After
	public void tearDown(){
		System.out.println("tearDown");
		greetings = null;
	}
	
	@AfterClass
	public static void tearDownClass(){
		System.out.println("tearDownClass");
	}
}
