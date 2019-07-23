package day1.SumOfNumber;

public class SumOfNumbers 
{
	public static int sumOfEvenNumbers(int start, int end) 
	{
		int sum = 0;
		for (int i = start; i <= end; i++) 
		{
			if(i%2 == 0) 
			{
				sum = sum + i;
			}
		}
		return sum;
	}
	
	public static int sumOfOddNumbers(int start, int end) 
	{
		int sum = 0;
		for (int j = start; j <= end; j++) 
		{
			if(j%2 != 0) 
			{
				sum = sum + j;
			}
		}
		return sum;
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("Sum of Even Numbers in range(1,10) is"+ sumOfEvenNumbers(1, 10));
		System.out.println("Sum of Odd Numbers in range(1,10) is"+ sumOfOddNumbers(1, 10));
	}
}