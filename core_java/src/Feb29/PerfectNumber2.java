package Feb29;

import java.util.Scanner;

public class PerfectNumber2 {

	public static void main(String[] args) {
		System.out.println("Enter a Number");
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int num = sc.nextInt();
		int p = num / 2;
		for (int i = 1; i <= p; i++) {

			sum = sum + i;

		}
		if (sum == num) {
			System.out.println("perfect number");
		} else {
			System.out.println("not perfect number");
		}
	}
	}


