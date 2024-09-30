package module6;

import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		System.out.println("entre five numbers");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		//display method
		System.out.println("=============");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		//second method enhanced for loop
		
		System.out.println("=============");
		for(int temp :arr)
		{       //v   //array
			System.out.println(temp);
		}

	}

}
