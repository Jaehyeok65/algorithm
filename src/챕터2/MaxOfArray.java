package 챕터2;

import java.util.Scanner;


public class MaxOfArray {
	
	Scanner sc = new Scanner(System.in);
	
	static int maxOf(int [] a)
	{
		Scanner sc = new Scanner(System.in);
		int max = a[0];
		for(int i = 0; i < a.length; i++)
		{
			if(max < a[i])
				max = a[i];
		}
		return max;
		
		
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("키의 최댓값을 구합니다.");
		System.out.print("사람 수 : ");
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i = 0; i < a.length; i++)
		{
			System.out.print("height["+i+"] : ");
			a[i] = sc.nextInt();
		}
		System.out.println("최댓값은  "+maxOf(a)+"입니다.");
		
		// TODO Auto-generated method stub

	}

}
