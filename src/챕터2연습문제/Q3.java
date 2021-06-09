package 챕터2연습문제;

import java.util.Scanner;
import java.util.Random;

public class Q3 {
	
	static int sumOf(int[] a)
	{
		int sum = 0;
		for(int i = 0; i < a.length; i++)
		{
			sum += a[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		System.out.print("배열의 길이를 입력하세요 : ");
		int num = sc.nextInt();
		int a[] = new int[num];
		for (int i = 0; i < a.length; i++)
		{
			a[i] = rand.nextInt(100);
		}
		for(int i = 0; i < a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println("배열의 모든 요소의 합 : "+sumOf(a));
		
		// TODO Auto-generated method stub

	}

}
