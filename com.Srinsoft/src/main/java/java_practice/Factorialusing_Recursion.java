package java_practice;

public class Factorialusing_Recursion {

	static int factorial(int n) {
		if(n==1)
			return 1;
		else 
			return(n* factorial(n-1));// recursion factorial(n-1);
	}
	
	
	public static void main(String[] args) {
		System.out.println(factorial(5));
	}

	
	
}
