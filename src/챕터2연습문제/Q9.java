package 챕터2연습문제;

import java.util.Scanner;


public class Q9 {
	
	static int[][] mdays = {
			{31,28,31,30,31,30,31,31,30,31,30,31},
			{31,29,31,30,31,30,31,31,30,31,30,31},
	} ;
	
	static int isLeap(int year) {
		return (year %4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;
	}
	
	static int leftDayOfyear(int y, int m, int d)
	{
		int day = d;
		
		for(int i = 1; i < m; i++)
			day += mdays[isLeap(y)][i-1];
		
		int leftday = allday(y) - day;
		return leftday;
		
	}
	static int allday(int y) {
		int alldays = 0;
		
		for(int i = 1; i < 13; i++)
		{
			alldays += mdays[isLeap(y)][i-1];
		}
		return alldays;
	}
			
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int retry;
		
		System.out.println("그 해 남은 일수를 구합니다.");
		
		do {
			System.out.print("년 : "); int year = sc.nextInt();
			System.out.print("월 : "); int month = sc.nextInt();
			System.out.print("일 : "); int day = sc.nextInt();
			
			System.out.printf("그 해 남은 일수는 %d입니다. \n", leftDayOfyear(year,month,day));
			
			System.out.print("한 번 더 할까요? ");
			retry = sc.nextInt();
			
		}while(retry == 1);
		// TODO Auto-generated method stub

	}

}
