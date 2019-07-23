package day1.Temperature;
public class temp 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println(convertToCelcius(34)+" Celsius");
		System.out.println(convertToFarenheit(96)+" Farenheit");
	}

	public static double convertToFarenheit(double celcius) 
	{
		double temp1 = 9 * (celcius / 5) + 32;
		return temp1;
	}
	
	public static double convertToCelcius(double farenheit) 
	{
		double temp2 = (farenheit - 32)*5/9;
		return temp2;
	}
}


