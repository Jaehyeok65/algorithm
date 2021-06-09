package 챕터1연습문제;

import java.util.Scanner;

public class GousSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int initial;
		int last;
		System.out.print("구하고자 하는 값의 초기값과 마지막값을 입력하시오 : ");
		initial = sc.nextInt();
		last = sc.nextInt();
		double med = (double)last/2;
		double sum;
		int x;
		x = initial + last;
		sum = x * med;
		System.out.println(initial+"부터 "+last+"까지의 합 : " + (int)sum);
		// TODO Auto-generated method stub

	}

}
