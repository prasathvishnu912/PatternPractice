package pattern.problems;

import java.util.Scanner;

public class Pyramid6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int n = scanner.nextInt();
		
		for(int i=1; i<=n; i++) {
			String star="";
			for(int j=0; j<i; j++) {
				star += "* "; 
			}
			System.out.println(" ".repeat(n-i)+star);
		}

	}

}
