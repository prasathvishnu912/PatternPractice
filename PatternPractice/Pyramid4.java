package pattern.problems;

import java.util.Scanner;

public class Pyramid4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int n = scanner.nextInt();
		
		for(int i=0; i<n; i++) {
			String s = "";
			String leftSpace = " ".repeat(n-i-1);
			for(int j=i; j>=0; j--) {
				s+=(n-j);
			}
			for(int k=1; k<=i; k++) {
				s+=(n-k);
			}
			System.out.println(leftSpace+s);
		}

	}

}
