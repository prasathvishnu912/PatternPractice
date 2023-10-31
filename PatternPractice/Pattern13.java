package pattern.problems;

import java.util.Scanner;

public class Pattern13 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int n = scanner.nextInt();
		int centerSC = n;
		for(int i=0; i<n; i++) {
			String leftSpace = " ".repeat(i);
			String star = "";
			if(i==0) {
				star = "* ".repeat(n);
			}
			else if(i==n-1) {
				star = "* ";
			}
			else {
				star = "*"+" ".repeat(centerSC)+"*";
				centerSC-=2;
			}
			System.out.println(leftSpace+star);
		}
		centerSC +=2;
		for(int j=n-1;j>0 ; j--) {
			String leftSpace = " ".repeat(j-1);
			String star = "";
			if(j==1) {
				star = "* ".repeat(n);
			}
			else {
				star = "*"+" ".repeat(centerSC)+"*";
				centerSC+=2;
			}
			System.out.println(leftSpace+star);
		}

	}

}
