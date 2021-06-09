package 챕터1;

import java.util.Scanner;


public class SumWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		int n;
		System.out.println("1부터 n까지의 합을 구합니다. ");
		System.out.print("n의 값 : ");
		n = sc.nextInt();
		for(int i = 1; i <= n; i++)
		{
			sum += i;
		}
		System.out.println("1부터 "+n+"까지의 합은 "+sum+"입니다.");
		
		// TODO Auto-generated method stub

	}

}
