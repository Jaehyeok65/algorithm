package 챕터2연습문제;

import java.util.Scanner;


public class Q2 {
	
	static void swap(int a[] , int idx1, int idx2)
	{
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a[] = new int[6];
		for(int i = 0; i < a.length; i++)
		{
			a[i] = sc.nextInt();
		}
		for(int i = 0; i < a.length / 2; i++)
		{
			System.out.println("a["+i+"]과(와) a["+(a.length-i-1)+"]를 교환합니다.");
			swap(a,i,a.length-i-1);
			for(int j = 0; j < a.length; j++)
			{
				System.out.print(a[j]+" ");
			}
			System.out.println();
		}
		System.out.println("역순 정렬을 마쳤습니다.");
		
		// TODO Auto-generated method stub

	}

}
