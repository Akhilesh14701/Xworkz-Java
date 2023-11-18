package DailyProblems;

import java.util.Scanner;

public class NumberDivisibleBy3and5 {

	public static void main(String[] args) {
		int n;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the number N: ");
		n=s.nextInt();
		System.out.println("Numbers is divisible by 3 or 5");
		for(int i=0;i<=n;i++) {
			if((i%3==0)||(i%5==0)) {
				System.out.println(i);
			}
		}
		s.close();
	}
}
