package 챕터2연습문제;


import java.util.Scanner;


public class Q4 {
	
	static void copy(int[] a , int [] b)
	{
		if (a.length == b.length)
		{
			for(int i = 0; i < a.length; i++)
			{
				a[i] = b[i];
			}
		}
		else
		{
			System.out.print("오류");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int [] a = {1,2,3,4,5};
		int [] b = {7,8,9,10,11};
		for(int i = 0; i < a.length; i++)
		{
			System.out.print(a[i] + " ");
		}
		System.out.println();
		for(int i = 0; i < b.length; i++)
		{
			System.out.print(b[i]+ " ");
		}
		System.out.println();
		copy(a,b);
		System.out.println("복사 후  : ");
		for(int i = 0; i < a.length; i++)
		{
			System.out.print(a[i]+ " ");
		}
		System.out.println();
		for(int i = 0; i < b.length; i++)
		{
			System.out.print(b[i]+ " ");
		}
		
		
		// TODO Auto-generated method stub

	}

}
