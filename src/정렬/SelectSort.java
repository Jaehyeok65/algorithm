package 정렬;

import java.util.*;


public class SelectSort {
	
	public static void swap(int a, int b) {
		int temp = a;
		a = b;
		b = temp; //저장해둔 a값을 b에 대입. (사라진 a값을 대비해 저장해둔 temp값을 b에 대입)
	}
	
	public static void Sort(int a[],int n) {
		int last = a[n-1]; // 배열의 원소를 교환하기 위한 원소 지정
		int max = a[0]; // 최대값 원소 지정
		int b = 0; //최대값이 있는 배열의 위치 저장.
		int c = 0; //last값의 인덱스 저장
		for(int i = 0; i < n-1; i++)
		{
			if(a[i+1] == a[n-1]) //a[i+1]이  배열의 최대를 초과하지 않게 하기 위한 오류 방지용
				break;
			if(a[i] > a[i+1])
			{
				max = a[i]; // 배열 중 제일 큰 값을 찾아서 max 변수에 대입.
				b = i; //최대값의 인덱스 저장. 즉 a[b] == 최대값.
			}
			swap(a[b],a[n-1]);
			n = n-1;
			
		}
		
	}

	public static void main(String[] args) {
		
		int array [] = {5,4,3,2,1};
		Sort(array,5);
		for(int i = 0; i < array.length; i++)
		{
			System.out.println(array[i]);
		}
		
		
		// TODO Auto-generated method stub

	}

}
