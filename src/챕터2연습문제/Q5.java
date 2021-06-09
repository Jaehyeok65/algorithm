package 챕터2연습문제;

import java.util.Scanner;


public class Q5 {
	
	static void recopy(int[] a , int[] b)
	{
		if(a.length == b.length)
		{
			reverse(b);
			for(int i = 0; i < a.length; i++)
			{
				a[i] = b[i];
			}
		}
		else
		{
			System.out.print("배열의 길이가 일치하지 않아 복사할 수 없습니다.");
		}
		
	}
	static void reverse(int[] a)
	{
		int t[] = new int[a.length];
		for(int i = 0; i < a.length; i++)
		{
			t[i] = a[i]; //배열 t에다가 a를 복사
		}
		for(int i = 0; i < a.length/2; i++) // if a.length = 5 0,1,2까지 복사,3,4
		{
			a[i] = t[a.length-i-1]; // 0 1 2까지 복사 완료
		}
		for(int i = a.length-1; i > a.length/2; i--)
		{
			a[i] = t[a.length-i-1];
		}
	}

	public static void main(String[] args) {
		int a[] = {1,2,3,4,5};
		int b[] = {7,8,9,10,11};
		for(int i = 0; i < a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		recopy(a,b);
		for(int i = 0; i < a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		// TODO Auto-generated method stub

	}

}
