package 챕터1;

import java.util.Scanner;


public class Max3m {
	static int max3(int a , int b, int c) {
		int max = a;
		if(b > max)
			max = b;
		if(c > max)
			max = c;
		
		return max;
	}
	

	public static void main(String[] args) {
		System.out.println("max3(3,2,1) = " + max3(3,2,1));
		System.out.println("max3(3,2,2) = " + max3(3,2,2));
		
		
		
		// TODO Auto-generated method stub

	}

}
