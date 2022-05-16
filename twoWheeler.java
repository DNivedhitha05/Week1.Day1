package week1.day1;

public class twoWheeler {
	
	int noOfWheels = 2;
	short noOfMirrors = 2;
	long chassisNumber= 9876543210l;
	boolean isPunctured = false;
	String bikeName = "Vespa";
	double runningKM = 1030.20 ;
	
		
  public static void main(String[] args) {
		// TODO Auto-generated method stub
	  twoWheeler bike = new twoWheeler();
	  System.out.println("No of Wheels="+ bike.noOfWheels);
	  System.out.println("No of Mirros=" +bike.noOfMirrors);
	  System.out.println("Number="+bike.chassisNumber);
	  System.out.println("Is Bike Punctured="+bike.isPunctured);
	  System.out.println("Bike Name="+bike.bikeName);
	  System.out.println("KM="+bike.runningKM);
	  
	 

	}

}
