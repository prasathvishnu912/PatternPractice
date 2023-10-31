package pattern.problems;

import java.util.Scanner;

public class Pattern9 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int n = scanner.nextInt();
		int centerSC = 1;
		for(int i=0; i<n;i++) {
			String leftSpace = " ".repeat(n-i-1);
			String star;
			if(i==0)
				star = leftSpace+"*";
			else {
				star = leftSpace+"*"+" ".repeat(centerSC)+"*";
				centerSC+=2;
			}
			System.out.println(star);
		}
		centerSC -=4;
		for(int i=n-1; i>0;i--) {
			String leftSpace = " ".repeat(n-i);
			String star;
			if(i==1)
				star = leftSpace+"*";
			else {
				star = leftSpace+"*"+" ".repeat(centerSC)+"*";
				centerSC-=2;
			}
			System.out.println(star);
		}

	}

}
