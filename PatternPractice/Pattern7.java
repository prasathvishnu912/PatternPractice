package pattern.problems;

import java.util.Scanner;

public class Pattern7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int n = scanner.nextInt();
		
		for(int i=0;i<n;i++) {
			String star;
			if(i==0) {
				 star = "*";
		    }
			else {
				star = "*"+" ".repeat(i)+"*";
			}
			System.out.println(star);
		}
		for(int i=n-1;i>0;i--) {
			String star;
			if(i==1) {
				 star = "*";
		    }
			else {
				star = "*"+" ".repeat(i-1)+"*";
			}
			System.out.println(star);
		}

	}

}
