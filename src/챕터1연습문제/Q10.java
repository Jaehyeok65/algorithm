package 챕터1연습문제;

import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a;
		int b;
		System.out.print("a의 값 : ");
		a = sc.nextInt();
		do {
			System.out.print("b의 값 : ");
			b = sc.nextInt();
			if(b <= a)
				System.out.println("a보다 큰 값을 입력하세요!");
		} while( b <= a);
		System.out.println(b+" - "+a+"의 값은 "+(b-a)+"입니다.");
		
		
		// TODO Auto-generated method stub

	}

}
