package pattern.problems;

import java.util.Scanner;

public class Pattern14 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int n = scanner.nextInt();
		
		for(int i=1; i<=n; i++) {
			String star;
			if(i==n) {
				star = "*".repeat(2*n);
			}
			else {
				star = "*".repeat(i)+" ".repeat(2*n-2*i)+"*".repeat(i);
			}
			System.out.println(star);
		}
		for(int i=n-1; i>0; i--) {
			String star;
			if(i==n) {
				star = "*".repeat(2*n);
			}
			else {
				star = "*".repeat(i)+" ".repeat(2*n-2*i)+"*".repeat(i);
			}
			System.out.println(star);
		}
	}

}
