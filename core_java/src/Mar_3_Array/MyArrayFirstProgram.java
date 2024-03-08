package Mar_3_Array;

public class MyArrayFirstProgram {

	public static void main(String[] args) {
		int a[] =new int [5];
		
		a[0]=123;
		a[1]=543;
		a[2]=666;
		a[3]=555;
		a[4]=321;
		
		int size=a.length;
		
		for(int i=0;i<size;i++) {
			System.out.println(a[i]);
		}
		
	}

}
