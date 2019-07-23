package day1.Factorial;
import java.util.*;
public class Factorial {

	int num;
	int calculateFactorial(int number)
	{
		this.num=number;
		int product=1;
		for(int i=1;i<=number;i++)
		{
			product=product*i;
		}
		return product;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Calculate Factorial: Enter the Number:");
		Scanner in=new Scanner(System.in);
		int num=in.nextInt();
		Factorial f= new Factorial();
		System.out.println("Factorial  of "+num+" is "+f.calculateFactorial(num));
	}
}


