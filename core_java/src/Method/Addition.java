package Method;

import java.util.Scanner;

public class Addition {
public static void m1 (int a,int b) {
		
		System.out.println(a+"+"+b+"="+(a+b));
}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Number 1");
		int n=sc.nextInt();
		System.out.println("Enter Your Number2");
		int m=sc.nextInt();
		
		m1(n,m);
		

}}

