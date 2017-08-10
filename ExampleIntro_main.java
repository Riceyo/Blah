
// class - blueprint for an object, contains global/instance variables (data members, data, values, states) and methods (instructions, behaviours)
// class modifiers can only be public, final, abstract
// however inner classes can have other modifiers

// access modifier public - anyone can access
// access modifier protected - subclasses can access regardless of package
// access modifier default (no modifier) - only the package can access
// access modifier private - only the class can access

// non access modifier static - variable - exists independently from object, only single copy exists regardless of number of objects created
// non access modifier static - method - exists independently from object, has no reference to objects variables, must be passed in via parameters
// non access modifier final - variable - value cannot be changed
// non access modifier final - method - cannot be overridden
// non access modifier final - class - cannot be inherited
// non access modifier abstract - method - declared not defined (no body), must be implemented if inherited
// non access modifier abstract - class - must be inherited, cannot be made an object alone

// void - no return type (procedure)

public class ExampleIntro_Main
{
	public static void main(String[] args) // main method, application entry point, must be public static for the jvm to see it and invoke it, string array parameter is for command line arguments
	{
		String localvariable1 = "localvariable1"; // create variable (type name)
		String localvariable2 = "localvariable2"; // local variable as created inside a method, can only be accessed inside this method
		String localvariable3 = "localvariable3";  
		ExampleIntro referencevariable; // create reference variable of the type class in stack memory
		referencevariable = new ExampleIntro(); // create new instance of class (object) inside heap memory via the class constructor, links to the reference variable in the stack memory
		referencevariable.method1(localvariable1); // call method from the object passing it string parameter
		referencevariable.method2(localvariable1, localvariable2); // call method from the object passing it two string parameters
		referencevariable.method3(localvariable1, localvariable2, localvariable3); // call method from the object passing it three string parameters
		referencevariable.method4(); // call method from the object, passing it nothing
		referencevariable.method5(); // call method from the object, passing it nothing
		System.out.println(referencevariable.IfElseOddOrEven(101)); // print what this function method returns when called with this parameter
		System.out.println(referencevariable.IfElseOddOrEven(102)); // print what this function method returns when called with a different parameter
		referencevariable.ForLoop(1, 3); // call this method and pass it two parameters
		referencevariable.WhileLoop(101, 103); // call this method and pass it two parameters
	}
}
