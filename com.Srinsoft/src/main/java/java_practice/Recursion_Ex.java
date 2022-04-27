package java_practice;

public class Recursion_Ex {
	static int count=0;
	static void p() {
		count ++;
		if (count<=5) {
			System.out.println("hello"+count);
		p();
		}
	}
public static void main(String[] args) {
p();
}


/*static void p() {
	count ++;
	if (count<=5) {
		System.out.println("hello"+count);
	p();
	}*/
	
//}
}
