
public class ExampleInterfaceCarCall {
	public static void main(String args[]) {
		ExampleInterfaceCar VWGolfGTI = new ExampleInterfaceCarVWGolfGTI(); // create object from the class constructor and assign it reference variable of the interface
		VWGolfGTI.getNoughtToSixtyMilesPerHour();
		VWGolfGTI.getBrakeHorsepower();
		VWGolfGTI.getMilesPerGallon();
		VWGolfGTI.getPrice();
		// VWGolfGTI.getEmissions(); // this method from the class cannot be used as it's not declared in the interface, we have no reference to it, security
		ExampleInterfaceCar AudiS3 = new ExampleInterfaceCarAudiS3(); // create another object from a different class constructor but again assign it reference variable of the same interface
		AudiS3.getNoughtToSixtyMilesPerHour();
		AudiS3.getBrakeHorsepower();
		AudiS3.getMilesPerGallon();
		AudiS3.getPrice();
		ExampleInterfaceCarVWGolfGTI ObjRefVWGolfGTI = new ExampleInterfaceCarVWGolfGTI(); // create object from the class constructor but now assign it reference variable of the class
		ObjRefVWGolfGTI.getNoughtToSixtyMilesPerHour();
		ObjRefVWGolfGTI.getBrakeHorsepower();
		ObjRefVWGolfGTI.getMilesPerGallon();
		ObjRefVWGolfGTI.getPrice();
		ObjRefVWGolfGTI.getEmissions(); // this method is now available as we have reference to it
	}
}
