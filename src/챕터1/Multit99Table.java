package 챕터1;

import java.util.Scanner;

public class Multit99Table {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("-----곱셉표----- ");
		
		for(int i = 1; i <= 9; i++)
		{
			for(int j =1; j <=9; j++)
			{
				System.out.printf("%3d",i*j);
			}
			System.out.println();
		}
		// TODO Auto-generated method stub

	}

}
