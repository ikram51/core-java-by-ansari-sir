package Method;

public class Reverse {
	public static int reverse(int a) {
	int rem=0,rev=0;
	
	
		while (a!=0) {
			rem=a%10;
			rev=rev*10+rem;
			a/=10;
			
		}
		return rev;
		
	}

	public static void main(String[] args) {
		System.out.println(reverse(321));
		
	}

}
