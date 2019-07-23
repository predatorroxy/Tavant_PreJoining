package day1.MarksSwitch;

public class MarkValidatorSwitch 
{
	public static boolean isPass(int mark) 
	{
		if(mark >= 40)
			return true;
		return false;
	}
	
	public static String markGrade(int mark) 
	{
		switch(mark/10) 
		{
			case 9:
				return "Grade A";
			case 7:
				return "Grade B";
			case 6:
				return "Grade C";
			default:
				return "Grade D";
		}
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println(markGrade(69));	
	}
}
