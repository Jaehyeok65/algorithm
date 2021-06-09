package 챕터1연습문제;


import java.util.Scanner;


public class methodSum {
	
	static int sumof(int a , int b)
	{
		int sum = 0;
		for(int i = a; i <= b; i++)
		{
			sum += i;
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("구하고자하는 초기값과 마지막값을 입력하시오 : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(sumof(a,b));
		// TODO Auto-generated method stub

	}

}
