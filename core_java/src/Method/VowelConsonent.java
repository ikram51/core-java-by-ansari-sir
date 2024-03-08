package Method;

import java.util.Scanner;

public class VowelConsonent {
public static boolean vowelConsonant(char c) {
		
		if(c=='a'||c=='A'||c=='a'||c=='e'||c=='E'||c=='i'||c=='I'||c=='o'||c=='O'||c=='u'||c=='U') {
			return true;
		}else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter character to check vowel and consonant");
		char a = scanner.next().charAt(0);
		boolean b=vowelConsonant('B');
		
		if(b) {
			System.out.println("vowel");
		}else {
			System.out.println("consonant");
		}
	}

}
