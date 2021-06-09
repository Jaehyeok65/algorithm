package 챕터2연습문제;

import java.util.Scanner;


public class Q8 {
	
	static int[][] mday = {
			{31,28,31,30,31,30,31,31,30,31,30,31},
			{31,29,31,30,31,30,31,31,30,31,30,31},
	};
	
	static int isLeap(int year) {
		return(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;
	}
	
	static int dayofyears(int y, int m , int d)
	{
		while(true)
		{

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
