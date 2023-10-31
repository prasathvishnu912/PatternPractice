package pattern.problems;

import java.util.Scanner;

public class Pattern6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int n = scanner.nextInt();
		for(int i=0; i<n; i++) {
			String leftSpace = " ".repeat(n-i-1);
			String star;
			if(i==0||i==n-1) {
				star = "*".repeat(n);
			}
			else {
				star = "*"+" ".repeat(n-2)+"*";
			}
			System.out.println(leftSpace+star);
		}

	}

}
