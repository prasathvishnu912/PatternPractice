package pattern.problems;

import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int n = scanner.nextInt();
		int centerSC = 1;
		for(int i=0; i<n; i++) {
			String leftSpace = " ".repeat((n-1)-i);
			String star;
			if(i==0) {
				star = "*";
			}
			else if(i==n-1) {
				star = "*".repeat(2*n-1);
			}
			else {
				star = "*"+" ".repeat(centerSC)+"*";
				centerSC+=2;
			}
			System.out.println(leftSpace+star);
		}

	}

}
