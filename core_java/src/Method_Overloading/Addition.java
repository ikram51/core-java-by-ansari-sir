package Method_Overloading;

import java.util.Scanner;

public class Addition {
	public static int c;

	public int add(int a, int b) {
		return a + b;
	}

	public int add(int a, int b, int c) {
		return a + b + c;
	}

	public static void main(String[] args) {
		Addition addition = new Addition();
		Scanner scanner = new Scanner(System.in);
		System.out.println("1.AddTwoNumber\n2.AddThreeNumber");
		System.out.println("enter your option ");
		int ch = scanner.nextInt();
		switch (ch) {

		case 1: {
			System.out.println("enter your number1");
			int a = scanner.nextInt();
			System.out.println("enter your number2");
			int b = scanner.nextInt();
			System.out.println(addition.add(a, b));
		}
			break;

		case 2: {
			System.out.println("enter your number1");
			int a = scanner.nextInt();
			System.out.println("enter your number2");
			int b = scanner.nextInt();
			System.out.println("enter your number3");
			int c = scanner.nextInt();
			System.out.println(addition.add(a, b, c));
		}
			break;
		}
	}
}


