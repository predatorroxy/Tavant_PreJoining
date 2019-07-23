package day1.MarksValidator;

public class MarkValidator 
	{
		public static boolean isPass(int mark) 
		{
			if(mark >= 40)
				return true;
			return false;
		}
	
		public static String markGrade(int mark) 
		{
			if (isPass(mark)) 
			{
				if (mark >= 90)
					return "Grade A";
				if (mark >= 75)
					return "Grade B";
				if (mark >= 60)
					return "Grade C";
				return "Grade D";
			}
			return "Fail";
		}
	
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(markGrade(95));	
	}
}