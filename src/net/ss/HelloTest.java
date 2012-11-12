package net.ss;

import junit.framework.TestCase;

public class HelloTest extends TestCase {
	public void testGetMessage()throws Exception{
		HelloWorld hello = new HelloWorld();
		assertEquals("Hello World",hello.getMessage());
	}
	public void testGetMessageWithName()throws Exception{
		HelloWorld hello = new HelloWorld();
		assertEquals("Hello Steave",hello.getMessage());
	}
	
	public void testGetMessageWithNameOther()throws Exception{
		HelloWorld hello = new HelloWorld();
		assertEquals("Hello Jobs",hello.getMessage());
	}
	
	public void testGetMessageWithNull()throws Exception{
		HelloWorld hello = new HelloWorld();
		assertEquals("Hello World",hello.getMessage(null));
	}
}
