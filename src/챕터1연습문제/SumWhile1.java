package 챕터1연습문제;


import java.util.Scanner;

public class SumWhile1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int n;
		int i = 1;
		System.out.println("while문이 종료될 때 변수 i 값을 출력하세요.");
		System.out.print("n의 값 : ");
		n = sc.nextInt();
		while(i <= n)
		{
			sum += i++;
		}
		System.out.println("i의 값 : "+i);
		System.out.println("sum의 값 : "+sum);

		// TODO Auto-generated method stub

	}

}
