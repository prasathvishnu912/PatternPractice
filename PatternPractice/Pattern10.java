package pattern.problems;

import java.util.Scanner;

public class Pattern10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int n = scanner.nextInt();
		int spaceCount = 0;
		for(int i=0; i<n; i++) {
			int starCount = n-spaceCount/2;
			String star = "*".repeat(starCount)+" ".repeat(spaceCount)+"*".repeat(starCount);
			System.out.println(star);
			spaceCount+=2;
		}
		spaceCount -=4;
		for(int i=0; i<n-1; i++) {
			int starCount = n-spaceCount/2;
			String star = "*".repeat(starCount)+" ".repeat(spaceCount)+"*".repeat(starCount);
			System.out.println(star);
			spaceCount-=2;
		}


	}

}
