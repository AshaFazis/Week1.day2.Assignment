package week1.day2.assignments;

public class TwoWheeler {
	int noOfWheels = 4;
	short noOfMirrors = 2;
	long chassisNumber = 8945623;
	boolean isPunctured = false;
	String BikeName = "TVS Ntorq";
	double runningKM = 350.00;
	
	public static void main(String[] args) {
		
		TwoWheeler obj = new TwoWheeler();
		System.out.println("Number of wheels in car is:" + "" + obj.noOfWheels);
		System.out.println("Number of mirros in car is:" + "" + obj.noOfMirrors);
		System.out.println("Chassis Number:" + "" + obj.chassisNumber);
		System.out.println("Is the car punctured:" + "" + obj.isPunctured);
		System.out.println("Name of the Bike is:" + ""+ obj.BikeName);
		System.out.println("Kilometre bike can run is:" + "" + obj.runningKM);
		
	}
	

}
