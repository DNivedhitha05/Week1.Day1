package week1.day1;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int input = 13;
		boolean flag = false ;


		for ( int i=2; i < input/2 ; i++) {
			
			int rem=input%i;

			if (rem==0);
			flag = true ;


			break;
		}
		if (flag) 
		{
			System.out.println("its a Prime number ");

		}
		else

		{
			System.out.println("Its Not a prime number");
		}
	}


}


