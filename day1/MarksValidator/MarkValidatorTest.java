package day1.MarksValidator;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MarkValidatorTest {
	@Test
	void test() 
	{
		boolean result;
		String grade;
		MarkValidator mv=new MarkValidator();
		result=mv.isPass(85);
		grade=mv.markGrade(85);
		assertEquals(true,result);
		assertEquals("Grade B",grade);
	}

}