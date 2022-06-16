package week1.day2.assignments;

public class MyCar {

	public static void main(String[] args) {
		Car obj = new Car();
		boolean applyGear = obj.applyGear();
		System.out.println(applyGear);
		System.out.println(obj.applyBreak());
		System.out.println(obj.applyAccelerate());

	}

}
