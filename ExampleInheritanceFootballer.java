
public class ExampleInheritanceFootballer { // parent class, super class, inheritance can be chained, child will get great great great parents methods etc	
	public ExampleInheritanceFootballer() { // constructors are not inherited but can be called by the child / subclasses via "super()" in their constructor, cannot be hidden or overridden
		System.out.println("=== Footballer Constructor ==="); // even though the constructors are not inherited, the default constructor will always run, "super()" will always run
	}
	public ExampleInheritanceFootballer(int x) { // constructor expecting an integer parameter passed
		System.out.println("=== Footballer Parameter Constructor ===");
	}
	public String testInherit = "### Footballer Inherited ###"; // data member will be inherited
	public void Select() { // we will override this inherited method in the child classes / subclasses
		System.out.println("~~~ Unknown Player Selected ~~~");
	}
	public void Run() { // method will be inherited
		System.out.println("Run Method");
	}
	public void Pass() { // method will be inherited
		System.out.println("Pass Method");
	}
	public void Shoot() { // method will be inherited
		System.out.println("Shoot Method");
	}
	private void PrivateTest() { // this method cannot be inherited due to the private access modifier
		System.out.println("Test");
	}
	public void Position(String x) {
		System.out.println("Position " + x);
	}
}
