
public class ExampleInheritanceFootballerGoalkeeper extends ExampleInheritanceFootballer { // inherit ("extends") footballer class, this is a child / subclass of the footballer class
	// all the data members and methods from the parent class are now available to this child class
	// this class can also have it's own data members and methods
	@Override
	public void Select() { // override the parents method (polymorphism)
		System.out.println(testInherit);
		System.out.println("~~~ Goalkeeper Selected ~~~");
	}
	public void Save() { // this class has a specific method only relevant to it
		System.out.println("Save Method");
	}
	public void RunSave() { // this class also has it's own method which reuses the other specific method it has via "this", and calls a method from the parent via "super"
		System.out.print("* ");
		super.Run(); // call a parents method via "super"
		System.out.print("* ");
		this.Save(); // call this classes other method via "this"
	}
	public ExampleInheritanceFootballerGoalkeeper() { // constructor will run first
		super(0); // call the parents constructor via "super", must be the first thing we do in this constructor
		System.out.println("=== Goalkeeper Constructor ===");
	}
}
