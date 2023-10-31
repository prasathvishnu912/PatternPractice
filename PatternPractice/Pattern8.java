package pattern.problems;

import java.util.Scanner;

public class Pattern8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int n = scanner.nextInt();
		
		for(int i=0;i<n;i++) {
			String star;
			String leftSpace = " ".repeat(n-i-1);
			if(i==0) {
				 star = leftSpace+"*";
		    }
			else {
				star = leftSpace+"*"+" ".repeat(i-1)+"*";
			}
			System.out.println(star);
		}
		for(int i=n-1;i>0;i--) {
			String star;
			String leftSpace = " ".repeat(n-i);
			if(i==1) {
				 star = leftSpace+"*";
		    }
			else {
				star = leftSpace+"*"+" ".repeat(i-2)+"*";
			}
			System.out.println(star);
		}
	}

}
