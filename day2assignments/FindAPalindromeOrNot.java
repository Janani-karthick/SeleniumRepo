package day2assignments;

public class FindAPalindromeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input,sum=0,output;    
		int n=111;
		output=n;    
		  while(n>0){    
		   input=n%10;   
		   sum=(sum*10)+input;    
		   n=n/10;    
		  }
		   if(output==sum)    
			   System.out.println("Input:"+output+"-> Output: It is a Palindrome (because the number reads the same backward and forward)");    
			  else    
			   System.out.println("Input:"+output+"->It is not a Palindrome (since the reversed number is not the same as original)");    
		    
		

	}

}
