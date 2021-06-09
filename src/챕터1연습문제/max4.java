package 챕터1연습문제;

import java.util.Scanner;


public class max4 {
	
	static int max41(int a, int b, int c , int d)
	{
		int max = a;
		if(b > max)
			max = b;
		if (c > max)
			max = c;
		if (d > max)
			max = d;
		
		return max;
	}
	
	static int min3(int a , int b , int c)
	{
		int min = a;
		if(min > b)
			min = b;
		if(min > c)
			min = c;
		
		return min;
	}
	
	static int min4(int a, int b, int c, int d)
	{
		int min = a;
		if(min > b)
			min = b;
		if(min > c)
			min = c;
		if(min > d)
			min = d;
		
		return min;
	}

	public static void main(String[] args) {
		System.out.println("최댓값 : " + max41(1,2,3,4));
		System.out.println("최솟값 : " + min3(1,2,3));
		System.out.println("최솟값 : " + min4(1,2,3,4));
		// TODO Auto-generated method stub

	}

}
