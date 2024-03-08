package core_java;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		

				Scanner sc = new Scanner(System.in);
				
				System.out.println("enter your option");
				System.out.println("1.Add");
				System.out.println("2.Sub");
				System.out.println("3.Mul");
				System.out.println("4.Div");
				
				int option  = sc.nextInt();
				
				switch (option) {

				case 1: {
					System.out.println("enter your number1");
					int a = sc.nextInt();
					System.out.println("enter your number2");
					int b = sc.nextInt();
					
					System.out.println(a+b);
				}
					break;

				case 2: {
					System.out.println("case 2-----");
				}
					break;

				case 3: {
					System.out.println("enter your number1");
					int a = sc.nextInt();
					System.out.println("enter your number2");
					int b = sc.nextInt();
					
					System.out.println(a*b);
				}
					break;

				case 4: {

				}
					break;
				default: {
						System.out.println("invalid option ..please select valid option");
				}
					break;
				}
			}
		
	}


