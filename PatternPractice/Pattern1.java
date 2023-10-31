package pattern.problems;

import java.util.Scanner;

public class Pattern1 {
	public static void main(String[] args) { 
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int n = scanner.nextInt();
		
		int centSC = n-3;
		for(int i=0; i<n; i++) {
			String leftSpace = " ".repeat(i);
			String star;
			if(i==0) {
				star = "*".repeat(n);
			}
			else if(i==n-1) {
				star = "*";
			}
			else {
				String centerSpace = " ".repeat(centSC);
				star = "*" + centerSpace+"*";
				centSC--;
			}
			System.out.println(leftSpace+star);
		}
	}

}
