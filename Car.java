package week1.day2.assignments;

public class Car {

	public static void main(String[] args) {
		Car obj = new Car();
		System.out.println(obj.applyBreak());
		boolean applyGear = obj.applyGear();
		System.out.println(applyGear);
		System.out.println(obj.switchOnAc());
		System.out.println(obj.applyAccelerate());
		
	}
	public boolean applyBreak()
	{
		return true;
	}
	boolean applyGear()
	{
		return false;
	
	}
	private boolean switchOnAc()
	{
		return false;
	}
    public boolean applyAccelerate()
    {
    	return true;
    	
    }
}
