package Method;

import java.util.Scanner;

public class Even_odd {
	public static void m1 (int a) {
		
		String str=(a%2==0)?"even":"odd";
		System.out.println(str);}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Number");
		int n=sc.nextInt();
		
		m1(n);
		
		
		
		
	}
	}


