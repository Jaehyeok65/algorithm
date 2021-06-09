package 챕터1연습문제;


import java.util.Scanner;

public class SumFor1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		System.out.print("n의 값을 입력하시오 : ");
		int n = sc.nextInt();
		for(int i = 1; i <=n; i++)
		{
			sum += i;
		}
		for(int i = 1; i <= n; i++)
		{
			if( i < n)
			{
			System.out.print(i + " + ");
			}
			else
			{
				System.out.print(i + " = ");
			}
		}
		System.out.print(sum);
		// TODO Auto-generated method stub

	}

}
