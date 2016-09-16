package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyInteger_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testisEven() {
		MyInteger i = new MyInteger(4);
		MyInteger j = new MyInteger(5);
		assertTrue(i.isEven());
		assertTrue(!j.isEven());
		assertFalse(j.isEven());
		
	}
	@Test
	public void testisOdd(){
		MyInteger k = new MyInteger(5);
		MyInteger o = new MyInteger(8);
		assertTrue(k.isOdd());
		assertTrue(!o.isOdd());
		assertFalse(o.isOdd());
		
		
	}
	@Test
	public void testisPrime(){
		MyInteger k = new MyInteger(19);
		MyInteger o = new MyInteger(64);
		assertTrue(k.isPrime());
		assertTrue(!o.isPrime());
		assertFalse(o.isPrime());
		
		
	}
	@Test
	public void testisEvenstatic(){
		assertTrue(MyInteger.isEven(4));
		assertTrue(!MyInteger.isEven(5));
		assertFalse(MyInteger.isEven(5));
		
		
	}
	
	@Test
	public void testisOddstatic(){
		assertTrue(MyInteger.isOdd(7));
		assertTrue(!MyInteger.isOdd(8));
		assertFalse(MyInteger.isOdd(8));
		
		
	}
	
	@Test
	public void testisPrimestatic(){
		assertTrue(MyInteger.isPrime(17));
		assertTrue(!MyInteger.isPrime(36));
		assertFalse(MyInteger.isPrime(36));
		
		
	}
	
	@Test
	public void testisEvenstatic2(){
		MyInteger i = new MyInteger(4);
		MyInteger f = new MyInteger(9);
		assertTrue(MyInteger.isEven(i));
		assertTrue(!MyInteger.isEven(f));
		assertFalse(MyInteger.isEven(f));
	}
	
	@Test
	public void testisOddstatic2(){
		MyInteger i = new MyInteger(11);
		MyInteger f = new MyInteger(16);
		assertTrue(MyInteger.isOdd(i));
		assertTrue(!MyInteger.isOdd(f));
		assertFalse(MyInteger.isOdd(f));
	}
	
	@Test
	public void testisPrimestatic2(){
		MyInteger i = new MyInteger(13);
		MyInteger f = new MyInteger(81);
		assertTrue(MyInteger.isPrime(i));
		assertTrue(!MyInteger.isPrime(f));
		assertFalse(MyInteger.isPrime(f));
	}
	
	@Test
	public void testequals(){
		MyInteger i = new MyInteger(7);
		assertEquals(true,i.equals(7));
		assertEquals(false, i.equals(19));
		
		
	}
	
	@Test
	public void testEquals(){
		MyInteger f = new MyInteger(29);
		MyInteger i = new MyInteger(29);
		MyInteger k = new MyInteger(38);
		assertEquals(true,i.equals(f));
		assertEquals(false, k.equals(f));
		
		
		
	}
	
	
}
