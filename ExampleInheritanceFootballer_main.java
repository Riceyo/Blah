
public class ExampleInheritanceFootballer_main {
	public static void main(String[] args) {
		ExampleInheritanceFootballerDefender cb = new ExampleInheritanceFootballerDefender(); // create object from a class that's inheriting data members and methods from another class
		cb.Select(); // call overridden inherited method
		cb.Position("Centre Back"); // call inherited method passing it a parameter
		cb.Run(); // call inherited method
		cb.Pass(); // call inherited method
		cb.Shoot(); // call inherited method
		ExampleInheritanceFootballerDefender lb = new ExampleInheritanceFootballerDefender(); // create another object but give it a different reference variable
		lb.Select(); // call overridden inherited method
		cb.Position("Left Back"); // call inherited method passing it a parameter
		lb.Run(); // call inherited method
		lb.Pass(); // call inherited method
		lb.Shoot(); // call inherited method
		ExampleInheritanceFootballerGoalkeeper gk = new ExampleInheritanceFootballerGoalkeeper(); // create another object from a different class that's inheriting from the same class as the other objects
		gk.Select(); // call overridden inherited method
		cb.Position("Goalkeeper"); // call inherited method passing it a parameter
		gk.Run(); // call inherited method
		gk.Pass(); // call inherited method
		gk.Shoot(); // call inherited method
		gk.Save(); // call non-inherited method
		gk.RunSave(); // call non-inherited method
		//gk.PrivateTest(); // this method cannot be used as it has not been inherited due to the access modifier being private, we have no visibility of it
	}
}