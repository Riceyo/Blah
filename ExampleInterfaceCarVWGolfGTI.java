
public class ExampleInterfaceCarVWGolfGTI implements ExampleInterfaceCar { // multiple interfaces can be implemented, comma separated
	String carName = "Volkswagen Golf GTI";
	@Override
	public void getNoughtToSixtyMilesPerHour() {
		System.out.println(carName + " - 6.4 s");
	}
	@Override
	public void getBrakeHorsepower() {
		System.out.println(carName + " - 200 BHP");
	}
	@Override
	public void getMilesPerGallon() {
		System.out.println(carName + " - 25 MPG");
	}
	@Override
	public void getPrice() {
		System.out.println(carName + " - £28,000");
	}
	public void getEmissions() { // this method cannot be used when creating object from this classes constructor and assigning it reference variable of the interface as it's not declared in the interface
		System.out.println(carName + " - 0 CO2");
	}
}