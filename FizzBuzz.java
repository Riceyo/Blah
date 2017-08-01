
public class FizzBuzz
{
	public static String Fizz(int num)
	{
		if (num % 3 == 0)
		{
			return "Fizz";
		}
		else
		{
			return "";
		}
	}
	public static String Buzz(int num)
	{
		if (num % 5 == 0)
		{
			return "Buzz";
		}
		else
		{
			return "";
		}
	}	
	public static void main(String args[])
	{
		int loop;
		for (loop = 1; loop < 101; loop++)
		{
			System.out.println(loop + " " + Fizz(loop) + Buzz(loop));
		}
	}
}
