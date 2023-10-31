package pattern.problems;

import java.util.Scanner;

public class Pyramid1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int n = scanner.nextInt();
		
		for(int i=1; i<=n; i++) {
			String star="";
			for(int j=1; j<i+1; j++) {
				star += i+" "; 
			}
			System.out.println(" ".repeat(n-i)+star);
		}

	}

}
