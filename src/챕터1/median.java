package 챕터1;

import java.util.Scanner;


public class median {
	
	static int med3(int a , int b, int c) //세 값 중 중앙값을 구하기.
	{
		int med = 0;
		if (a >= b && a <= c)
			med = a;
		else if(a >= c && a <= b)
			med = a;
		if (b >= a && b <= c)
			med = b;
		else if (b >= c && b <= a)
			med = b;
		if (c >= a && c <= a)
			med = c;
		else if (c >= b && c <= a)
			med= c;
		
		return med;
		
		
	}

	public static void main(String[] args) {
		System.out.println("중앙 값 구하기 : " + med3(3,2,1));
		
		// TODO Auto-generated method stub

	}

}
