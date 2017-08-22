
public class ExampleIntro
{
	String instancevariable = "instancevariable"; // instance variable as inside a class but outside a method, can be accessed anywhere in this class
	public static String staticvariable = "staticvariable"; // static variable ("class variable"), only single copy exists, independent of object, can be accessed via dot notation
	public ExampleIntro() // default no-argument constructor, always runs once when creating object (even if not written), construct object from the class
	{
		System.out.println("default constructor");
	}
	public void method1(String parameter1) // begin method definition, method with no return type that expects a string value to be passed to it
	{
		System.out.println("method1 " + parameter1); // method body, prints to console including the parameter passed to the method
	}
	public void method2(String parameter1, String parameter2) // method with no return type that expects two string values to be passed to it
	{
		System.out.println("method2 " + parameter1 + parameter2);
	}
	public void method3(String parameter1, String parameter2, String parameter3) // method with no return type that expects three string values to be passed to it
	{
		System.out.println("method3 " + parameter1 + parameter2 + parameter3);
	}
	public void method4() // method that doesn't expect any parameters to be passed to it
	{
		System.out.println("method4 " + instancevariable); // method body uses the instance variable
	}
	public void method5() // method that doesn't expect any parameters to be passed to it
	{
		System.out.println("method5 " + staticvariable); // method body uses the static variable
	}
	public String IfElseOddOrEven(int num) // function method as there's a return type (string), expects an integer passed into it
	{
		if (num % 2 == 0) // if this statement is true...
		{
			return "Even"; // return the function as this string
		}
		else // if the statement was false...
		{
			return "Odd"; // return the function as this string
		}			
	}
	public void ForLoop(int from, int to)
	{
		int loop; // method local integer variable to count the loops
		// start the loop from the first (from) parameter passed
		// run the code as long as this condition isn't met (current loop less then second parameter passed (to))
		// increment the loop count by one each loop
		for(loop = from; loop <= to; loop++) 
			System.out.println(loop); // print the value of the current loop variable
	}
	public void WhileLoop(int from, int to)
	{
		int loop; // method local integer variable to count the loops
		loop = from; // set the loop count integer to the first (from) parameter passed 
		while(loop <= to) // keep looping as long as this condition is met (current loop less then second parameter passed (to))
		{
			System.out.println(loop); // print the value of the current loop variable
			loop++; // increment the loop count by one each loop
		}
	}
}
