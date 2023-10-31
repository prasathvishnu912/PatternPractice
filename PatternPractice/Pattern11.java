package pattern.problems;

import java.util.Scanner;

public class Pattern11 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int n = scanner.nextInt();
		
		
		for(int i=0; i<n; i++) {
			System.out.println("*".repeat(n));	
		}
	}

}
