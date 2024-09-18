package day2assignments;

public class FindTheMissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = {1,4,3,2,8,6,7};
		int n = data.length+1;
		int sum=(n*(n+1))/2;
		for (int i = 0; i < data.length; i++) {
			sum= sum-data[i];
			
		}
		System.out.println("the missing number is:"+sum);
			
	}

}
