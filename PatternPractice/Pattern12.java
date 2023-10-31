package pattern.problems;

import java.util.Scanner;

public class Pattern12 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int n = scanner.nextInt();
		
		for(int i=0; i<n; i++) {
			if(i==0 || i==n-1) {
				System.out.println("*".repeat(n));
			}
			else {
				System.out.println("*"+" ".repeat(n-2)+"*");
			}
		}
		
	}

}
