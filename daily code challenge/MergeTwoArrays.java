package DailyProblems;

import java.util.Scanner;

public class MergeTwoArrays {

	public static void main(String[] args) {
		int m,n;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter 1st array length");
		m=s.nextInt();
		
		int a[]=new int[m];
		System.out.println("Enter the 1st array elements");
		for (int i=0 ;i<m;i++) {
			a[i]=s.nextInt();
		}
		
		System.out.println("Enter 2nd array length");
		n=s.nextInt();
		
		int b[]=new int[n];
		System.out.println("Enter the 2nd array elements");
		for (int i=0 ;i<n;i++) {
			b[i]=s.nextInt();
		}
		
		int c[]=new int[m+n];
		for (int i=0;i<m;i++) {
			c[i]=a[i];
		}
		for(int i=m;i<m+n;i++) {
			c[i]=b[i-m];
		}
		System.out.println("merged array list");
		for(int i=0;i<m+n;i++) {
			System.out.println(c[i]);
		}
		s.close();
	}

}
