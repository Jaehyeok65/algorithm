package 챕터1;
import java.util.Scanner;

public class Max3 {
	
	public static void swap(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int [] arr = {30,20,40,50};
		int pivot = 10;
		
		System.out.print("스왑전 " );
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
		for(int i = 0; i < arr.length-1; i++)
		{
			if(arr[i] > arr[i+1])
				swap(arr[i],arr[i+1]);
		}
		System.out.println("");
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
		
		
		// TODO Auto-generated method stub

	}

}
