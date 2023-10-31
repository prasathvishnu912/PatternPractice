package pattern.problems;

import java.util.Scanner;

public class Pyramid7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int n = scanner.nextInt();
		
		for(int i=1; i<=n; i++) {
			String star="";
			for(int j=1; j<=i; j++) {
				star += j+" "; 
			}
			System.out.println(" ".repeat(n-i)+star);
		}

	}

}
