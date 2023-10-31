package pattern.problems;

import java.util.Scanner;

public class Pyramid5 {
 
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int n = scanner.nextInt();
		
		for(int i=1; i<=n; i++) {
			String s = "";
			String leftSpace = " ".repeat(n-i);
			for(int j=1; j<=i; j++) {
				s+=j;
			}
			for(int k=i-1; k>0; k--) {
				s+=k;
			}
			System.out.println(leftSpace+s);
		}

	}

}
