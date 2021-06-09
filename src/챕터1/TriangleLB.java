package 챕터1;

import java.util.Scanner;


public class TriangleLB {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("왼쪽 아래가 직각인 이등변 삼각형을 출력합니다.");
		System.out.print("몇 단 삼각형입니까? : ");
		int n = sc.nextInt();
		int i = 1;
		int j;
		while(i <= n)
		{
			j = 1;
			while(j <= i)
			{
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}
		
		
		// TODO Auto-generated method stub

	}

}
