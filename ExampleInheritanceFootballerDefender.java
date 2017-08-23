
public class ExampleInheritanceFootballerDefender extends ExampleInheritanceFootballer { // inherit ("extends") footballer class, this is a child / subclass of the footballer class
	// all the data members and methods from the parent class are now available to this child class
	// this class can also have it's own data members and methods
	@Override
	public void Select() { // override the parents method (polymorphism)
		System.out.println(testInherit);
		System.out.println("~~~ Defender Selected ~~~");
		//super.Select(); // even though this method has been overridden, we can still access the parents original via "super"
	}
}
