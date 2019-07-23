package day1.helloworld;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import day1.helloworld.helloworld;
public class HelloWorldTest{
	@Test
	void test() 
	{
		String str=HelloWorld.getMessage();
		String exp="Hello world";
		assertEquals(exp,str);
	}
}