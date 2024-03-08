package Method_Overloading;

public class Addition_ {
	public int add(int a, int b) {

		return a+b;

	}

	public int add(int a, int b, int c) {
		return a+b+c;

	}

	public static void main(String[] args) {
		Addition_ add=new Addition_();
		add.add(30, 40);
		add.add(25,56,67);
		System.out.println(add.add(30, 40));
		System.out.println(add.add(25, 56, 67));
		
	}

}
