package core_java;

public class WhileLoop3 {

	public static void main(String[] args) {
		int a = 1;
		int b=0;
		

		while (a <= 10) {

			if (a % 2 == 0)
				b=b+a;
		}

			++a;

		}
	System.out.println(b);

	}
