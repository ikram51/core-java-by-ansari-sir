package Method;

import java.util.Scanner;

public class Reverse_2 {
	public static int reverse(int a) {
		int rem=0,rev=0;
		while(a!=0) {
			rem=a%10;
			rev=rev*10+rem;
			a/=10;
		}
		return rev;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter number");
		int a = scanner.nextInt();
		
		int rev=reverse(a);
		
		rev=rev*20/100;
		
		System.out.println(rev);
	}

}
