
public class ExamplePolymorphismSwingSword_main {
	// method overloading - methods with same name but different signatures (parameters passed)
	// method overriding - inherit method and override it, parent and child have method with same name and signature, child overrides the parents, see inheritance example
	public static void main(String args[]) {
		ExamplePolymorphismSwingSword player = new ExamplePolymorphismSwingSword();
		player.SwingSword(); // call the method expecting no parameters
		player.SwingSword("lightning"); // call the method expecting a string parameter
		player.SwingSword("fire"); // call the method expecting a string parameter
		player.SwingSword("poison"); // call the method expecting a string parameter
		player.SwingSword(0); // call the method expecting an integer parameter
		player.SwingSword(10); // call the method expecting an integer parameter
		player.SwingSword(-10); // call the method expecting an integer parameter
		player.SwingSword("lightning", 10); // call the method expecting a string and an integer parameter
		player.SwingSword("lightning", 15); // call the method expecting a string and an integer parameter
		player.SwingSword("poison", -5); // call the method expecting a string and an integer parameter
	}
}
