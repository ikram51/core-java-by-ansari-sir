package Feb29;

public class PrimeNumber {

	public static void main(String[] args) {
		int check=0;
		int num=5;
		for (int i=1; i<=num; i++)
		{
			if(num%i==0) {
				check++;
				
			}
		}
		if(check==2) {
			System.out.println("prime number");
		}
		else {
			System.out.println("Not A Prime Number");
		}
	}

}
