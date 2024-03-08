package Mar_3_Array;

public class Even_odd {

	public static void main(String[] args) {
		int array[] = {10,13,14,19,20,30};
		for (int i=0;i<array.length;i++) {
			
			int n=array[i];
			if(n%2==0) {
				System.out.println("even="+n);
				
			}
			else {
				System.out.println("odd="+n);
			}
		}
	}

}
