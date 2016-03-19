
public class Fibonacci {

	public static void main(String[] args) {
		int A = 0;
		int B = 1;
		int C = A + B;
		
		for (int i = 0; i < 12; i++) {
		System.out.println(A);
		C = A + B;
		A = B;
		B = C;
		 
		}
		
	}
}
