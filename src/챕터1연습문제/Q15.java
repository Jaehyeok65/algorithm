package 챕터1연습문제;

import java.util.Scanner;


public class Q15 {
	Scanner sc = new Scanner(System.in);
	
	static void triangleLB(int n)
	{
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("몇 단 삼각형입니까? " );
			n = sc.nextInt();
		} while( n <= 0 );
			for(int i = 1; i <= n; i++)
			{
				for(int j = 1; j <= i; j++)
					System.out.print("*");
				System.out.println();
			}
	}
	
	static void triangleLU(int n)
	{
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("몇 단 삼각형입니까? ");
			n = sc.nextInt();
		} while ( n <= 0);
		for(int i = n; i > 0; i--)
		{
			for(int j = i; j > 0; j--)
			{
				System.out.print("*");
			}
			System.out.println();
			
		}
	}
	
	static void triangleRU(int n)
	{
		int k = 0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("몇 단 삼각형입니까? ");
			n = sc.nextInt();
		} while( n <= 0);
		for(int i = n; i > 0; i--)
		{
			k=0;
			for(int j = i; j > 0; j--)
			{
				System.out.print("*");
			}
			System.out.println();
			while(k <= n-i)
			{
				System.out.print(" ");
				k++;
			}
		}
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("오른쪽 위가 직각인 이등변 삼각형을 출력합니다.");
		int n = 0;
		triangleRU(n);
		
		
		// TODO Auto-generated method stub

	}

}
