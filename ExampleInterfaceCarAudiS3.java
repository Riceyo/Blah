
public class ExampleInterfaceCarAudiS3 implements ExampleInterfaceCar {
	String carName = "Audi S3";
	@Override
	public void getNoughtToSixtyMilesPerHour() {
		System.out.println(carName + " - 4.9 s");
	}
	@Override
	public void getBrakeHorsepower() {
		System.out.println(carName + " - 300 BHP");
	}
	@Override
	public void getMilesPerGallon() {
		System.out.println(carName + " - 23 MPG");
	}
	@Override
	public void getPrice() {
		System.out.println(carName + " - £33,500");
	}
}
