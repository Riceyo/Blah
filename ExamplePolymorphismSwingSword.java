
public class ExamplePolymorphismSwingSword {
	public void SwingSword() { // method with no parameter passed
		System.out.println("You swing your sword");
	}
	public void SwingSword(String x) { // method with string parameter passed
		System.out.println("You swing your sword with " + x + " effect");
	}
	public void SwingSword(int x) { // method with integer parameter passed
		if (x == 0)
			this.SwingSword(); // if the integer passed is zero, just run the no parameter method
		if (x > 0)
			System.out.println("You swing your sword with " + x + "% buff"); // if positive integer passed do this
		if (x < 0)
			System.out.println("You swing your sword with " + x + "% debuff"); // if negative integer passed do this
	}
	public void SwingSword(String x, int y) { // method with string and integer parameter passed
		this.SwingSword(x); // pass the string to the method expecting a string
		this.SwingSword(y); // pass the integer to the method expecting an integer
	}
}
