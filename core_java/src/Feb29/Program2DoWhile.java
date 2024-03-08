package Feb29;

import java.util.Scanner;

public class Program2DoWhile {

	public static void main(String[] args) {
		
			Scanner scanner = new Scanner(System.in);
			System.out.println("enter number");
			int num = scanner.nextInt();
			int p = num/2;
			int sum = 0;
			System.out.println(p);
			for(int i=1;i<=p;i++) {
				if(num%i==0) {
					sum=sum+i;
				}
			}
			if(sum==num) {
				System.out.println("perfect");
			}else {
				System.out.println("not a perfects");
			}
		}
	
	}


