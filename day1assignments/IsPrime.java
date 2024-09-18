package day1assignments;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int prime=10;
		for (int i=2; i<prime; i++) {
			if(prime%i==0) 
				{	
			System.out.println("its not a prime number:"+prime);
		}
			
			return;
		}
		System.out.println("it's a prime number:"+prime);

	}

}
