package core_java;

public class Predecrement {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		int c=3;
		
		int A = a++ + ++b + --c+ ++a +b--;
		
		System.out.println(A);
		System.out.println(b);
		System.out.println(c);
		
		
	}

}
