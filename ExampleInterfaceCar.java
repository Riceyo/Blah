
// interface has no code, can declare methods but not define methods
// interface has no constructor, so cannot create object from just the interface
// all interface methods must be overridden when implemented from another class
public interface ExampleInterfaceCar {
	public void getNoughtToSixtyMilesPerHour(); // no method body
	public void getBrakeHorsepower(); // no method body
	public void getMilesPerGallon(); // no method body
	public void getPrice(); // no method body
}