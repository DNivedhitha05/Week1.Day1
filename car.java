package week1.day1;

public class car {
	
	public void applyBreak() {
		System.out.println("Break applied");
	}
	
	public void applyGear(){
		System.out.println("Gear is working");
	}
	public void switchonAc() {
		System.out.println("Turn on the AC");
	}
	public void applyAcclerate() {
		System.out.println("Speed increased");
	}
	
	public static void main(String[] args) {
		car vechile = new car();
		vechile.applyBreak();
		vechile.applyGear();
		vechile.switchonAc();
		vechile.applyAcclerate();
		
	}
}
