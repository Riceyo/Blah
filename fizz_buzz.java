
public class FizzBuzz // seeing how I approach the fizz buzz test
{
	public static String Fizz(int num) // modularise riiight...
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
	public static String Buzz(int num) // modularise riiight...
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
			// System.out.println(loop + " " + Fizz(loop) + Buzz(loop)); // didn't realise number shouldn't be shown if fizz or buzz
			String print = "";
			print = Fizz(loop);
			print = print + Buzz(loop);
			if (print.equals(""))
			{
				System.out.println(loop);
			}
			else
			{
				System.out.println(print);
			}
		}
	}
}
