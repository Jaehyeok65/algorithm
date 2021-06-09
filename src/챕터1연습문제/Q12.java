package 챕터1연습문제;

import java.util.Scanner;


public class Q12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print(" ");
		System.out.print("|");
		for(int i = 1; i <= 9; i++)
		{
			System.out.printf("%3d", i);
		}
		System.out.println();
		System.out.print("-+-------------------------");
		System.out.println();
		for(int i =1; i<= 9; i++)
		{
			System.out.print(i+" |");
			for(int j =1; j <= 9; j++)
			{
				System.out.printf("%3d", i*j);
			}
			System.out.println();
		}
		// TODO Auto-generated method stub

	}

}
