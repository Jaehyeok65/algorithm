package 챕터1연습문제;
import java.util.Scanner;

public class Q11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n;
		do {
			System.out.print("양의 정수를 입력하세요 : ");
			n = sc.nextInt();
		} while ( n <= 0);
		
		int no = 0; //자릿수 선언
		
		while(n>0)
		{
			n /= 10;
			no++;
		}
		System.out.println("n의 자릿수는 "+no+"입니다.");
		// TODO Auto-generated method stub

	}

}
